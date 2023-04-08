
package io.k8s.api.core.v1;



/**
 * ResourceClaim references one entry in PodSpec.ResourceClaims.
 * 
 */
public class ResourceClaim {

    /**
     * Name must match the name of one entry in pod.spec.resourceClaims of the Pod where this field is used. It makes that resource available inside a container.
     * (Required)
     * 
     */
    public String name;

    public ResourceClaim withName(String name) {
        this.name = name;
        return this;
    }

}
