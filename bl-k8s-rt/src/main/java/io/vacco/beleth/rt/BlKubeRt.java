package io.vacco.beleth.rt;

import io.k8s.api.core.v1.Namespace;
import java.util.*;
import java.util.function.*;

import static io.vacco.beleth.rt.BlKubeUtil.initTx;

public class BlKubeRt {

  private final List<Object> manifests = new ArrayList<>();
  private final BlKubeCtl ctl = new BlKubeCtl();

  public BlKubeRt add(Object manifest) {
    this.manifests.add(Objects.requireNonNull(manifest));
    return this;
  }

  private void delete(Map<String, List<BlKubeRes>> resourceIdx, String packageName, Predicate<BlKubeRes> condition) {
    for (var e : resourceIdx.entrySet()) {
      for (var res : e.getValue()) {
        if (res.blId.startsWith(packageName) && condition.test(res)) {
          ctl.delete(res);
        }
      }
    }
  }

  private void delete(Map<String, List<BlKubeRes>> resourceIdx, String packageName) {
    delete(resourceIdx, packageName, res ->
      !(res.type.equals("persistentvolumeclaims")
        || res.type.equals("persistentvolumes")
        || res.type.equals("namespaces")
      )
    );
    delete(resourceIdx, packageName, res ->
      !(res.type.equals("persistentvolumes")
        || res.type.equals("namespaces"))
    );
    delete(resourceIdx, packageName, res ->
      !(res.type.equals("namespaces"))
    );
    delete(resourceIdx, packageName, res -> // pesky bee...
      res.type.equals("namespaces")
    );
  }

  private void commit(BlKubeRes res, String packageName) {
    if (!ctl.check(res).synced) {
      ctl.apply(res.manifest, packageName);
    }
  }

  public void commit(String packageName) {
    var txIdx = new LinkedHashMap<String, BlKubeRes>();

    for (Object manifest : manifests) {
      var tx = initTx(manifest, ctl.ctx, packageName);
      if (txIdx.containsKey(tx.blId)) {
        throw new IllegalStateException("Duplicate resource definition - " + tx);
      } else {
        txIdx.put(tx.blId, tx);
      }
    }
    for (var res : txIdx.values()) {
      if (res.manifest instanceof Namespace) {
        commit(res, packageName);
      }
    }
    for (var res : txIdx.values()) {
      if (!(res.manifest instanceof Namespace)) {
        commit(res, packageName);
      }
    }

    var resIdx = ctl.resourceIndex(true);
    resIdx.putAll(ctl.resourceIndex(false));
    resIdx.keySet().removeAll(txIdx.keySet());
    delete(resIdx, packageName);
  }

  public void deleteAll(String packageName) {
    var resIdx = ctl.resourceIndex(true);
    resIdx.putAll(ctl.resourceIndex(false));
    delete(resIdx, packageName);
  }

}
