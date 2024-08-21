package io.k8s.api.core.v1;

import java.util.List;

/**
 * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
 */
public class LimitRangeSpec {
  public List<LimitRangeItem> limits;

  /**
   * Limits is the list of LimitRangeItem objects that are enforced.
   */
  public LimitRangeSpec limits(List<LimitRangeItem> limits) {
    this.limits = limits;
    return this;
  }

  public static LimitRangeSpec limitRangeSpec() {
    return new LimitRangeSpec();
  }
}
