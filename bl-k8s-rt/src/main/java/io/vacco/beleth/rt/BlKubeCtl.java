package io.vacco.beleth.rt;

import io.vacco.beleth.xform.BlDocumentContext;
import org.buildobjects.process.*;
import java.io.ByteArrayInputStream;
import java.util.*;

import static io.vacco.beleth.rt.BlKubeUtil.*;
import static java.lang.String.format;

public class BlKubeCtl {

  public final BlDocumentContext ctx = new BlDocumentContext();

  private Set<String> listResources(boolean nameSpaced) {
    var pb = new ProcBuilder(kubectl, "api-resources", "--verbs=list", "--namespaced=" + nameSpaced, "-o", "name");
    var res = runCmd(pb);
    return new TreeSet<>(
      Arrays.asList(res.getOutputString().split(System.getProperty("line.separator")))
    );
  }

  public Map<String, List<BlKubeRes>> resourceIndex(boolean nameSpaced) {
    var out = new TreeMap<String, List<BlKubeRes>>();
    for (var resType : listResources(nameSpaced)) {
      var args = Arrays
        .stream(new String[] { "get", resType, nameSpaced ? "--all-namespaces" : "", "-l", kBl, "-o", "json" })
        .filter(s -> !s.isEmpty())
        .toArray(String[]::new);
      var res0 = runCmd(new ProcBuilder(kubectl, args).ignoreExitStatus());
      var idx = ctx.fromJson(res0.getOutputString(), Map.class);
      if (idx != null) {
        var items = (List<?>) idx.get("items");
        if (items != null && !items.isEmpty()) {
          for (var item : items) {
            var blId = idOf(item);
            if (blId != null) {
              out.computeIfAbsent(blId, k -> new ArrayList<>()).add(BlKubeRes.of(blId, resType));
            }
          }
        }
      }
    }
    return out;
  }

  public BlKubeRes apply(Object manifest) {
    var tx = initTx(manifest, ctx);
    var jsi = new ByteArrayInputStream(tx.json.getBytes());
    var pb = new ProcBuilder(kubectl, "apply", "-f", "-").withInputStream(jsi);
    return tx.withResult(runCmd(pb));
  }

  public BlKubeRes diff(Object manifest) {
    var tx = initTx(manifest, ctx);
    var pb = new ProcBuilder(kubectl, "diff", "-f", "-")
      .withInputStream(new ByteArrayInputStream(tx.json.getBytes()))
      .ignoreExitStatus();
    var pr = runCmd(pb);
    int sc = pr.getExitValue();
    if (sc > 1) {
      var msg = String.join("\n", pr.getOutputString(), pr.getErrorString());
      throw new IllegalStateException(msg);
    }
    return tx.withResult(pr);
  }

  public BlKubeRes isSynced(Object manifest) {
    var diffTx = diff(manifest);
    return diffTx.withSynced(diffTx.result.getOutputString().trim().isEmpty());
  }

  public BlKubeRes sync(Object manifest) {
    var syncTx = isSynced(manifest);
    if (syncTx.synced) {
      return syncTx;
    }
    return apply(manifest);
  }

  public ProcResult delete(BlKubeRes res) {
    var lbValue = format("%s=%s", kBlId, res.blId);
    var pb = new ProcBuilder(
      kubectl, "delete", res.type, "-l", lbValue, "--all-namespaces"
    ).ignoreExitStatus();
    return runCmd(pb);
  }

}
