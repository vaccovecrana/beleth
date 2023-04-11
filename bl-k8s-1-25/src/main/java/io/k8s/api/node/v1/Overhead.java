package io.k8s.api.node.v1;

import io.k8s.api.node.v1.overhead.PodFixed;

/**
 * Overhead structure represents the resource overhead associated with running a pod.
 */
public class Overhead {
  public PodFixed podFixed;

  /**
   * PodFixed represents the fixed resource overhead associated with running a pod.
   */
  public Overhead podFixed(PodFixed podFixed) {
    this.podFixed = podFixed;
    return this;
  }
}
