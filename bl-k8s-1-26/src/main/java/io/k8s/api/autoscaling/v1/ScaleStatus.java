
package io.k8s.api.autoscaling.v1;



/**
 * ScaleStatus represents the current status of a scale subresource.
 * 
 */
public class ScaleStatus {

    /**
     * actual number of observed instances of the scaled object.
     * (Required)
     * 
     */
    public Integer replicas;
    /**
     * label query over pods that should match the replicas count. This is same as the label selector but in the string format to avoid introspection by clients. The string will be in the same format as the query-param syntax. More info about label selectors: http://kubernetes.io/docs/user-guide/labels#label-selectors
     * 
     */
    public String selector;

    public ScaleStatus withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public ScaleStatus withSelector(String selector) {
        this.selector = selector;
        return this;
    }

}
