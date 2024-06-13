package io.k8s.api.resource.v1alpha2;

import java.lang.Long;
import java.util.List;

/**
 * NamedResourcesIntSlice contains a slice of 64-bit integers.
 */
public class NamedResourcesIntSlice {
  public List<Long> ints;

  /**
   * Ints is the slice of 64-bit integers.
   */
  public NamedResourcesIntSlice ints(List<Long> ints) {
    this.ints = ints;
    return this;
  }

  public static NamedResourcesIntSlice namedResourcesIntSlice() {
    return new NamedResourcesIntSlice();
  }
}
