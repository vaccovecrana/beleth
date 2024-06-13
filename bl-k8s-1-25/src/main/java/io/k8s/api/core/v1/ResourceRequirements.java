package io.k8s.api.core.v1;

import io.k8s.api.core.v1.resourcerequirements.Limits;
import io.k8s.api.core.v1.resourcerequirements.Requests;

/**
 * ResourceRequirements describes the compute resource requirements.
 */
public class ResourceRequirements {
  public Limits limits;

  public Requests requests;

  /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   */
  public ResourceRequirements limits(Limits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   */
  public ResourceRequirements requests(Requests requests) {
    this.requests = requests;
    return this;
  }

  public static ResourceRequirements resourceRequirements() {
    return new ResourceRequirements();
  }
}
