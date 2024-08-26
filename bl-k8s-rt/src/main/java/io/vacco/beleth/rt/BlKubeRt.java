package io.vacco.beleth.rt;

import io.vacco.beleth.rt.impl.BlKubeApi;
import io.vacco.beleth.rt.schema.*;
import io.vacco.beleth.xform.BlDocumentContext;
import org.slf4j.*;
import java.util.*;

import static java.lang.String.*;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;
import static io.vacco.beleth.rt.util.BlIo.pointerOnObject;
import static io.vacco.beleth.rt.util.BlResources.*;
import static io.vacco.beleth.rt.util.BlResourceTypes.*;

/**
 * Core resource management class.
 */
public class BlKubeRt {

  private static final Logger log = LoggerFactory.getLogger(BlKubeRt.class);

  public static int ApiServerTimeoutMs = 5000;

  private final BlKubeApi kubeApi;
  private final BlDocumentContext ctx = new BlDocumentContext();
  private final List<Object> manifests = new ArrayList<>();

  public BlKubeRt(String apiServerUrl, String apiToken) {
    this.kubeApi = new BlKubeApi(apiServerUrl, apiToken, ApiServerTimeoutMs);
  }

  public Set<BlResource> buildResourceSet(String packageName) {
    if (!isValidPackageName(packageName)) {
      throw new IllegalArgumentException("Invalid package name: " + packageName);
    }
    var idx = new LinkedHashSet<BlResource>();
    for (var manifest : manifests) {
      var kind = requireNonNull(pointerOnObject(manifest, "/kind")).toString().toLowerCase() + "s";
      var res = resourceOf(manifest, packageName, Integer.toHexString(ctx.toJson(manifest).hashCode()), kind);
      if (!idx.add(res)) {
        var res0 = idx.stream().filter(r -> r.id().equals(res.id())).findFirst().orElseThrow();
        var msg = format(
          "Resource%n- %s%n conflicts with resource%n- %s%n (Duplicate ids). Modify either resource metadata to be more specific.",
          res, res0
        );
        throw new IllegalArgumentException(msg);
      }
    }
    return idx;
  }

  public BlKubeRt add(Object manifest) {
    this.manifests.add(Objects.requireNonNull(manifest));
    return this;
  }

  public void commit(String packageName) {
    var local = buildResourceSet(packageName);
    var cluster = this.kubeApi.resourceSet(packageName);
    var chg = new BlChangeSet().update(local, cluster);

    chg.toAdd.sort(Comparator.comparingInt(r -> priorityOf(r.getKind())));
    chg.toUpdate.sort(Comparator.comparingInt(r -> priorityOf(r.getKind())));
    chg.toDelete.sort(Comparator.comparingInt(r -> -priorityOf(r.getKind())));

    for (var res : chg.toAdd) {
      kubeApi.create(res);
    }
    for (var res : chg.toUpdate) {
      var p = resourcePairOf(res.id(), local, cluster);
      if (!p.manifest0.getContentHash().equals(p.manifest1.getContentHash())) {
        kubeApi.update(p.manifest0);
      }
    }
    for (var res : chg.toDelete) {
      var d = cluster.stream()
        .filter(r -> !r.id().equals(res.id()))
        .filter(r -> r.getContentHash().equals(res.getContentHash()))
        .collect(toList());
      var delete = d.isEmpty() || d.stream().filter(local::contains).findFirst().isEmpty();
      if (delete) {
        kubeApi.delete(res);
      } else {
        log.info("Skipping cluster managed resource {}, derived from\n{}", res, d);
      }
    }
  }

}
