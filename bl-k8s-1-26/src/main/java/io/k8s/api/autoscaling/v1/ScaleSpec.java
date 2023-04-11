package io.k8s.api.autoscaling.v1;

import java.lang.Long;

/**
 * ScaleSpec describes the attributes of a scale subresource.
 */
public class ScaleSpec {
  public Long replicas;

  /**
   * desired number of instances for the scaled object.
   */
  public ScaleSpec replicas(Long replicas) {
    this.replicas = replicas;
    return this;
  }
}
