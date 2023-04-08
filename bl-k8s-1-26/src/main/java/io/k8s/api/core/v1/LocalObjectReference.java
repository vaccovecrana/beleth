
package io.k8s.api.core.v1;



/**
 * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
 * 
 */
public class LocalObjectReference {

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public String name;

    public LocalObjectReference withName(String name) {
        this.name = name;
        return this;
    }

}
