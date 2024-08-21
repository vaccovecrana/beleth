package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 */
public class StatefulSetUpdateStrategy {
  public RollingUpdateStatefulSetStrategy rollingUpdate;

  public String type;

  public StatefulSetUpdateStrategy rollingUpdate(RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

  /**
   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
   */
  public StatefulSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }

  public static StatefulSetUpdateStrategy statefulSetUpdateStrategy() {
    return new StatefulSetUpdateStrategy();
  }
}
