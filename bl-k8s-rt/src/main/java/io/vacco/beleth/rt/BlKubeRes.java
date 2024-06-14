package io.vacco.beleth.rt;

import org.buildobjects.process.ProcResult;
import java.util.Objects;

public class BlKubeRes {

  public Object manifest;
  public String blId, json, type;
  public ProcResult result;
  public boolean synced;

  public BlKubeRes withResult(ProcResult result) {
    this.result = Objects.requireNonNull(result);
    return this;
  }

  public BlKubeRes withSynced(boolean synced) {
    this.synced = synced;
    return this;
  }

  public BlKubeRes withType(String type) {
    this.type = Objects.requireNonNull(type);
    return this;
  }

  public static BlKubeRes of(Object manifest, String blId, String json) {
    var res = new BlKubeRes();
    res.manifest = Objects.requireNonNull(manifest);
    res.blId = Objects.requireNonNull(blId);
    res.json = Objects.requireNonNull(json);
    return res;
  }

  public static BlKubeRes of(String blId, String type) {
    var res = new BlKubeRes();
    res.blId = Objects.requireNonNull(blId);
    res.type = Objects.requireNonNull(type);
    return res;
  }

  @Override public String toString() {
    return String.format("[%s, %s, %s]", blId, type, synced);
  }
}
