
package io.k8s.api.core.v1;



/**
 * ResourceQuotaStatus defines the enforced hard limits and observed use.
 * 
 */
public class ResourceQuotaStatus {

    /**
     * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
     */
    public Hard__1 hard;
    /**
     * Used is the current observed total usage of the resource in the namespace.
     * 
     */
    public Used used;

    public ResourceQuotaStatus withHard(Hard__1 hard) {
        this.hard = hard;
        return this;
    }

    public ResourceQuotaStatus withUsed(Used used) {
        this.used = used;
        return this;
    }

}
