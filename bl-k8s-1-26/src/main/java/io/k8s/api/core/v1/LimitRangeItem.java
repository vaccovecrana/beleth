package io.k8s.api.core.v1;

import com.google.gson.annotations.SerializedName;
import io.k8s.api.core.v1.limitrangeitem.Default;
import io.k8s.api.core.v1.limitrangeitem.DefaultRequest;
import io.k8s.api.core.v1.limitrangeitem.Max;
import io.k8s.api.core.v1.limitrangeitem.MaxLimitRequestRatio;
import io.k8s.api.core.v1.limitrangeitem.Min;
import java.lang.String;

/**
 * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
 */
public class LimitRangeItem {
  @SerializedName("default")
  public Default vDefault;

  public DefaultRequest defaultRequest;

  public Max max;

  public MaxLimitRequestRatio maxLimitRequestRatio;

  public Min min;

  public String type;

  /**
   * Default resource requirement limit value by resource name if resource limit is omitted.
   */
  public LimitRangeItem vDefault(Default vDefault) {
    this.vDefault = vDefault;
    return this;
  }

  /**
   * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
   */
  public LimitRangeItem defaultRequest(DefaultRequest defaultRequest) {
    this.defaultRequest = defaultRequest;
    return this;
  }

  /**
   * Max usage constraints on this kind by resource name.
   */
  public LimitRangeItem max(Max max) {
    this.max = max;
    return this;
  }

  /**
   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
   */
  public LimitRangeItem maxLimitRequestRatio(MaxLimitRequestRatio maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
    return this;
  }

  /**
   * Min usage constraints on this kind by resource name.
   */
  public LimitRangeItem min(Min min) {
    this.min = min;
    return this;
  }

  /**
   * Type of resource that this limit applies to.
   */
  public LimitRangeItem type(String type) {
    this.type = type;
    return this;
  }

  public static LimitRangeItem limitRangeItem() {
    return new LimitRangeItem();
  }
}
