package io.k8s.api.resource.v1alpha2;

import java.lang.String;
import java.util.List;

/**
 * NamedResourcesStringSlice contains a slice of strings.
 */
public class NamedResourcesStringSlice {
  public List<String> strings;

  /**
   * Strings is the slice of strings.
   */
  public NamedResourcesStringSlice strings(List<String> strings) {
    this.strings = strings;
    return this;
  }

  public static NamedResourcesStringSlice namedResourcesStringSlice() {
    return new NamedResourcesStringSlice();
  }
}
