package io.k8s.api.flowcontrol.v1beta1;

import java.lang.String;

/**
 * PriorityLevelConfigurationReference contains information that points to the &#34;request-priority&#34; being used.
 */
public class PriorityLevelConfigurationReference {
  public String name;

  /**
   * `name` is the name of the priority level configuration being referenced Required.
   */
  public PriorityLevelConfigurationReference name(String name) {
    this.name = name;
    return this;
  }
}
