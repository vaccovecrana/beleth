package io.k8s.api.core.v1;

import io.k8s.api.core.v1.resourcequotaspec.Hard;
import java.lang.String;
import java.util.List;

/**
 * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
 */
public class ResourceQuotaSpec {
  public Hard hard;

  public ScopeSelector scopeSelector;

  public List<String> scopes;

  /**
   * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
   */
  public ResourceQuotaSpec hard(Hard hard) {
    this.hard = hard;
    return this;
  }

  public ResourceQuotaSpec scopeSelector(ScopeSelector scopeSelector) {
    this.scopeSelector = scopeSelector;
    return this;
  }

  /**
   * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
   */
  public ResourceQuotaSpec scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public static ResourceQuotaSpec resourceQuotaSpec() {
    return new ResourceQuotaSpec();
  }
}
