
package io.k8s.api.core.v1;

import java.util.List;


/**
 * ResourceRequirements describes the compute resource requirements.
 * 
 */
public class ResourceRequirements {

    /**
     * Claims lists the names of resources, defined in spec.resourceClaims, that are used by this container.
     * 
     * This is an alpha field and requires enabling the DynamicResourceAllocation feature gate.
     * 
     * This field is immutable. It can only be set for containers.
     * 
     */
    public List<ResourceClaim> claims;
    /**
     * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    public Limits limits;
    /**
     * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
     * 
     */
    public Requests requests;

    public ResourceRequirements withClaims(List<ResourceClaim> claims) {
        this.claims = claims;
        return this;
    }

    public ResourceRequirements withLimits(Limits limits) {
        this.limits = limits;
        return this;
    }

    public ResourceRequirements withRequests(Requests requests) {
        this.requests = requests;
        return this;
    }

}
