package io.k8s.api.core.v1;

/**
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 */
public class VolumeNodeAffinity {
  public NodeSelector required;

  public VolumeNodeAffinity required(NodeSelector required) {
    this.required = required;
    return this;
  }
}
