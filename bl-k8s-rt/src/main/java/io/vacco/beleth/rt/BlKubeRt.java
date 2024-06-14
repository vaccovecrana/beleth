package io.vacco.beleth.rt;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BlKubeRt {

  private final List<Object> manifests = new ArrayList<>();
  private final BlKubeCtl ctl = new BlKubeCtl();

  public BlKubeRt add(Object manifest) {
    this.manifests.add(Objects.requireNonNull(manifest));
    return this;
  }

  public void commit(String packageName) {
    var txIdx = manifests.stream()
      .map(obj -> ctl.sync(obj, packageName))
      .collect(Collectors.toMap(tx -> tx.blId, Function.identity()));
    var clRes = ctl.resourceIndex(true);
    clRes.putAll(ctl.resourceIndex(false));
    clRes.keySet().removeAll(txIdx.keySet());
    for (var e : clRes.entrySet()) {
      for (var res : e.getValue()) {
        if (res.blId.startsWith(packageName)) {
          ctl.delete(res);
        }
      }
    }
  }

}
