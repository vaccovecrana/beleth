package io.vacco.beleth.rt;

import io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Labels;
import io.vacco.beleth.xform.BlDocumentContext;
import org.buildobjects.process.*;
import org.slf4j.*;
import java.util.*;

public class BlKubeUtil {

  private static final Logger log = LoggerFactory.getLogger(BlKubeUtil.class);

  public static final String kubectl = "kubectl";

  public static final String
    kMetadata = "metadata",
    kLabels = "labels",
    kBl = "beleth.io",
    kBlId = "beleth.io/id";

  @SuppressWarnings({"rawtypes"})
  public static String idOf(Object obj) {
    if (obj instanceof Map) {
      var o0 = (Map) obj;
      var o1 = (Map) o0.get(kMetadata);
      if (o1 != null) {
        var o2 = (Map) o1.get(kLabels);
        if (o2 != null) {
          var id = o2.get(kBlId);
          return (String) id;
        }
      }
    }
    return null;
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  public static void injectMeta(Object manifest, String labelKey, String labelValue) {
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

  public static BlKubeRes initTx(Object manifest, BlDocumentContext ctx) {
    var objCopy = ctx.fromJson(ctx.toJson(manifest), manifest.getClass());
    var blId = Integer.toHexString(ctx.toJson(objCopy).hashCode());
    injectMeta(objCopy, "beleth.io", "true");
    injectMeta(objCopy, "beleth.io/id", blId);
    return BlKubeRes
      .of(manifest, blId, ctx.toJson(objCopy))
      .withType(manifest.getClass().getSimpleName());
  }

  public static ProcResult runCmd(ProcBuilder p) {
    p.withNoTimeout();
    log.info("Running [{}]", p.getCommandLine());
    var res = p.run();
    if (log.isDebugEnabled()) {
      log.debug("[{}] {} {}", res.getExitValue(), res.getOutputString(), res.getErrorString());
    }
    return res;
  }

  public static void pause(long ms) {
    try {
      Thread.sleep(ms);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
