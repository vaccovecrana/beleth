package io.k8s.api.core.v1;

import io.k8s.api.core.v1.resourcequotastatus.Hard;
import io.k8s.api.core.v1.resourcequotastatus.Used;

/**
 * ResourceQuotaStatus defines the enforced hard limits and observed use.
 */
public class ResourceQuotaStatus {
  public Hard hard;

  public Used used;

  /**
   * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
   */
  public ResourceQuotaStatus hard(Hard hard) {
    this.hard = hard;
    return this;
  }

  /**
   * Used is the current observed total usage of the resource in the namespace.
   */
  public ResourceQuotaStatus used(Used used) {
    this.used = used;
    return this;
  }
}
