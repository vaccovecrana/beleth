
package io.k8s.api.core.v1;



/**
 * PodResourceClaim references exactly one ResourceClaim through a ClaimSource. It adds a name to it that uniquely identifies the ResourceClaim inside the Pod. Containers that need access to the ResourceClaim reference it with this name.
 * 
 */
public class PodResourceClaim {

    /**
     * Name uniquely identifies this resource claim inside the pod. This must be a DNS_LABEL.
     * (Required)
     * 
     */
    public String name;
    /**
     * ClaimSource describes a reference to a ResourceClaim.
     * 
     * Exactly one of these fields should be set.  Consumers of this type must treat an empty object as if it has an unknown value.
     * 
     */
    public ClaimSource source;

    public PodResourceClaim withName(String name) {
        this.name = name;
        return this;
    }

    public PodResourceClaim withSource(ClaimSource source) {
        this.source = source;
        return this;
    }

}
