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
    var res = runCmd(null, pb);
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
      var res0 = runCmd(null, new ProcBuilder(kubectl, args).ignoreExitStatus());
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

  public BlKubeRes apply(Object manifest, String packageName) {
    var tx = initTx(manifest, ctx, packageName);
    var jsi = new ByteArrayInputStream(tx.json.getBytes());
    var pb = new ProcBuilder(kubectl, "apply", "-f", "-").withInputStream(jsi);
    return tx.withResult(runCmd(manifest.getClass().getSimpleName(), pb));
  }

  public BlKubeRes diff(BlKubeRes tx) {
    var pb = new ProcBuilder(kubectl, "diff", "-f", "-")
      .withInputStream(new ByteArrayInputStream(tx.json.getBytes()))
      .ignoreExitStatus();
    var pr = runCmd(tx.manifest.getClass().getSimpleName(), pb);
    int sc = pr.getExitValue();
    if (sc > 1) {
      var msg = String.join("\n", pr.getOutputString(), pr.getErrorString());
      throw new IllegalStateException(msg);
    }
    return tx.withResult(pr);
  }

  public BlKubeRes check(BlKubeRes tx) {
    var diffTx = diff(tx);
    return diffTx.withSynced(diffTx.result.getOutputString().trim().isEmpty());
  }

  public ProcResult delete(BlKubeRes res) {
    var lbValue = format("%s=%s", kBlId, res.blId);
    var pb = new ProcBuilder(
      kubectl, "delete", res.type, "-l", lbValue, "--all-namespaces"
    ).ignoreExitStatus();
    return runCmd(res.blId, pb);
  }

}
