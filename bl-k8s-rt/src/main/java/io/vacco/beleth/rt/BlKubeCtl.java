package io.vacco.beleth.rt;

import io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Labels;
import io.vacco.beleth.xform.BlDocumentContext;
import org.buildobjects.process.*;
import org.slf4j.*;
import java.io.ByteArrayInputStream;
import java.util.*;

import static io.vacco.beleth.rt.BlCmd.*;

public class BlKubeCtl {

  private static final Logger log = LoggerFactory.getLogger(BlKubeCtl.class);

  public static final String kubectl = "kubectl";

  public static final String
    kMetadata = "metadata",
    kLabels = "labels";

  public final BlDocumentContext ctx = new BlDocumentContext();

  public Set<String> listApiResourceTypes() {
    var pb = new ProcBuilder(kubectl, "api-resources", "--verbs=list", "--namespaced", "-o", "name");
    var res = runCmd(pb);
    var resNames = res.getOutputString().split(System.getProperty("line.separator"));
    var resSet = new TreeSet<>(Arrays.asList(resNames));
    resSet.add("namespaces");
    return resSet;
  }

  // TODO this method takes a K8S resource type, and lists all resources matching the beleth managed label.
  public void listResources(String type) {
    // kubectl get namespaces --all-namespaces -l beleth.io=true -o json
    var res = runCmd(new ProcBuilder(kubectl, "get", type, "--all-namespaces", "-o", "json"));
    var out = res.getOutputString();
    System.out.println("lol");
  }

  public void listAllResources() {
    var resources = listApiResourceTypes();
    for (var rt : resources) {
      listResources(rt);
    }
  }

  @SuppressWarnings({"uncheked", "rawtypes"})
  public void injectMeta(Object manifest, String labelKey, String labelValue) {
    try {
      if (manifest instanceof Map) {
        var m = (Map) manifest;
        var meta = (Map) m.get(kMetadata);
        var labels = (Map) meta.computeIfAbsent(kLabels, k -> new LinkedHashMap<>());
        labels.put(labelKey, labelValue);
      } else {
        var mt = manifest.getClass().getField(kMetadata).get(manifest);
        var lf = mt.getClass().getField(kLabels);
        var lb = lf.get(mt);
        if (lb == null) {
          lb = new Labels();
          lf.set(mt, lb);
        }
        ((Labels) lb).put(labelKey, labelValue);
      }
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  public ProcResult apply(Object manifest) {
    injectMeta(manifest, "beleth.io", "true");
    injectMeta(manifest, "beleth.io/id", UUID.randomUUID().toString());
    var json = ctx.toJson(manifest);
    var jsi = new ByteArrayInputStream(json.getBytes());
    var pb = new ProcBuilder(kubectl, "apply", "-f", "-").withInputStream(jsi);
    return runCmd(pb);
  }

  public String diff(Object manifest) {
    var json = ctx.toJson(manifest);
    var pb = new ProcBuilder(kubectl, "diff", "-f", "-")
      .withInputStream(new ByteArrayInputStream(json.getBytes()))
      .ignoreExitStatus();
    var pr = runCmd(pb);
    int sc = pr.getExitValue();
    if (sc > 1) {
      var msg = String.join("\n", pr.getOutputString(), pr.getErrorString());
      throw new IllegalStateException(msg);
    }
    return pr.getOutputString();
  }

  public boolean isSynced(Object manifest) {
    var diff = diff(manifest);
    return diff.trim().length() == 0;
  }

  public Optional<ProcResult> sync(Object manifest) {
    if (!isSynced(manifest)) {
      return Optional.of(apply(manifest));
    }
    return Optional.empty();
  }

  // TODO we really need to turn this into some sort of command log
  //   where entries are resources labeled as managed by Beleth.
  //   But that may not be enough to keep track of Helm chart installations
  //   though.

  public ProcResult delete(Object manifest) {
    var json = ctx.toJson(manifest);
    var pb = new ProcBuilder(kubectl, "delete", "-f", "-")
      .withInputStream(new ByteArrayInputStream(json.getBytes()))
      .ignoreExitStatus();
    return runCmd(pb);
  }

}
