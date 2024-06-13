package io.k8s.api.core.v1;

import io.k8s.api.core.v1.volumeresourcerequirements.Limits;
import io.k8s.api.core.v1.volumeresourcerequirements.Requests;

/**
 * VolumeResourceRequirements describes the storage resource requirements for a volume.
 */
public class VolumeResourceRequirements {
  public Limits limits;

  public Requests requests;

  /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   */
  public VolumeResourceRequirements limits(Limits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   */
  public VolumeResourceRequirements requests(Requests requests) {
    this.requests = requests;
    return this;
  }
}
