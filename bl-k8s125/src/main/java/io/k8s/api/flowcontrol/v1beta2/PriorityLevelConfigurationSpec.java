package io.k8s.api.flowcontrol.v1beta2;

import java.lang.String;

/**
 * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
 */
public class PriorityLevelConfigurationSpec {
  public LimitedPriorityLevelConfiguration limited;

  public String type;

  public PriorityLevelConfigurationSpec limited(LimitedPriorityLevelConfiguration limited) {
    this.limited = limited;
    return this;
  }

  /**
   * `type` indicates whether this priority level is subject to limitation on request execution.  A value of `&#34;Exempt&#34;` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `&#34;Limited&#34;` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server&#39;s limited capacity is made available exclusively to this priority level. Required.
   */
  public PriorityLevelConfigurationSpec type(String type) {
    this.type = type;
    return this;
  }

  public static PriorityLevelConfigurationSpec priorityLevelConfigurationSpec() {
    return new PriorityLevelConfigurationSpec();
  }
}
