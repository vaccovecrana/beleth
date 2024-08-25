package io.vacco.beleth.rt.schema;

import java.util.Objects;

public class BlResourcePair {

  public BlResource manifest0, manifest1;

  public static BlResourcePair of(BlResource manifest0, BlResource manifest1) {
    var p = new BlResourcePair();
    p.manifest0 = Objects.requireNonNull(manifest0);
    p.manifest1 = Objects.requireNonNull(manifest1);
    return p;
  }

}
