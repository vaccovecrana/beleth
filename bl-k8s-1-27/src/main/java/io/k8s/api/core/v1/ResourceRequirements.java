package io.k8s.api.core.v1;

import io.k8s.api.core.v1.resourcerequirements.Limits;
import io.k8s.api.core.v1.resourcerequirements.Requests;
import java.util.List;

/**
 * ResourceRequirements describes the compute resource requirements.
 */
public class ResourceRequirements {
  public List<ResourceClaim> claims;

  public Limits limits;

  public Requests requests;

  /**
   * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
   *
   * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
   *
   * This field is immutable. It can only be set for containers.
   */
  public ResourceRequirements claims(List<ResourceClaim> claims) {
    this.claims = claims;
    return this;
  }

  /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   */
  public ResourceRequirements limits(Limits limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. Requests cannot exceed Limits. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   */
  public ResourceRequirements requests(Requests requests) {
    this.requests = requests;
    return this;
  }
}
