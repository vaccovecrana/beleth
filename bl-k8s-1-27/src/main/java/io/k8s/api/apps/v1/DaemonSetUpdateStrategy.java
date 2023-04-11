package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 */
public class DaemonSetUpdateStrategy {
  public RollingUpdateDaemonSet rollingUpdate;

  public String type;

  public DaemonSetUpdateStrategy rollingUpdate(RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

  /**
   * Type of daemon set update. Can be &#34;RollingUpdate&#34; or &#34;OnDelete&#34;. Default is RollingUpdate.
   */
  public DaemonSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }
}
