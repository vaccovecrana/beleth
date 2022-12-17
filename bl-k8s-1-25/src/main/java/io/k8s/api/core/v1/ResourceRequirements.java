
package io.k8s.api.core.v1;



/**
 * ResourceRequirements describes the compute resource requirements.
 * 
 */
public class ResourceRequirements {

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

    public ResourceRequirements withLimits(Limits limits) {
        this.limits = limits;
        return this;
    }

    public ResourceRequirements withRequests(Requests requests) {
        this.requests = requests;
        return this;
    }

}
