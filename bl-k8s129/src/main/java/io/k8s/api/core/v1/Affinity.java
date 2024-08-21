package io.k8s.api.core.v1;

/**
 * Affinity is a group of affinity scheduling rules.
 */
public class Affinity {
  public NodeAffinity nodeAffinity;

  public PodAffinity podAffinity;

  public PodAntiAffinity podAntiAffinity;

  public Affinity nodeAffinity(NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

  public Affinity podAffinity(PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
    return this;
  }

  public Affinity podAntiAffinity(PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

  public static Affinity affinity() {
    return new Affinity();
  }
}
