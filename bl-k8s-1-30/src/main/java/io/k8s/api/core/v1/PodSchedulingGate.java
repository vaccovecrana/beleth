package io.k8s.api.core.v1;

import java.lang.String;

/**
 * PodSchedulingGate is associated to a Pod to guard its scheduling.
 */
public class PodSchedulingGate {
  public String name;

  /**
   * Name of the scheduling gate. Each scheduling gate must have a unique name field.
   */
  public PodSchedulingGate name(String name) {
    this.name = name;
    return this;
  }

  public static PodSchedulingGate podSchedulingGate() {
    return new PodSchedulingGate();
  }
}
