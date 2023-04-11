package io.k8s.api.apps.v1;

import io.k8s.api.apps.v1.daemonsetupdatestrategy.Type;

/**
 * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 */
public class DaemonSetUpdateStrategy {
  public RollingUpdateDaemonSet rollingUpdate;

  public Type type;

  public DaemonSetUpdateStrategy rollingUpdate(RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

  /**
   * Type of daemon set update. Can be &#34;RollingUpdate&#34; or &#34;OnDelete&#34;. Default is RollingUpdate.
   *
   * Possible enum values:
   *  - `&#34;OnDelete&#34;` Replace the old daemons only when it&#39;s killed
   *  - `&#34;RollingUpdate&#34;` Replace the old daemons by new ones using rolling update i.e replace them on each node one after the other.
   */
  public DaemonSetUpdateStrategy type(Type type) {
    this.type = type;
    return this;
  }
}
