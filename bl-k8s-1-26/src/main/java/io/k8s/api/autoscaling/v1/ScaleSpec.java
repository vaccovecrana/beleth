
package io.k8s.api.autoscaling.v1;



/**
 * ScaleSpec describes the attributes of a scale subresource.
 * 
 */
public class ScaleSpec {

    /**
     * desired number of instances for the scaled object.
     * 
     */
    public Integer replicas;

    public ScaleSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

}
