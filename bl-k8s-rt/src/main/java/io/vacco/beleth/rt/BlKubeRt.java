package io.vacco.beleth.rt;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
      !(res.type.equals("persistentvolumes") || res.type.equals("namespaces"))
    );
    delete(resourceIdx, packageName, res ->
      !(res.type.equals("namespaces"))
    );
    delete(resourceIdx, packageName, res -> // pesky bee...
      res.type.equals("namespaces")
    );
  }

  public void commit(String packageName) {
    var txIdx = manifests.stream()
      .map(obj -> ctl.sync(obj, packageName))
      .collect(Collectors.toMap(tx -> tx.blId, Function.identity()));
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
