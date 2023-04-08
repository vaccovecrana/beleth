
package io.k8s.api.core.v1;

import java.util.List;


/**
 * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
 * 
 */
public class ResourceQuotaSpec {

    /**
     * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
     */
    public Hard hard;
    /**
     * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
     * 
     */
    public ScopeSelector scopeSelector;
    /**
     * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
     * 
     */
    public List<String> scopes;

    public ResourceQuotaSpec withHard(Hard hard) {
        this.hard = hard;
        return this;
    }

    public ResourceQuotaSpec withScopeSelector(ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
        return this;
    }

    public ResourceQuotaSpec withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

}
