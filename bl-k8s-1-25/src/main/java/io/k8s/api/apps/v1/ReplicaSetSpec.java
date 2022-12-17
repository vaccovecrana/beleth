
package io.k8s.api.apps.v1;

import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 * 
 */
public class ReplicaSetSpec {

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Integer minReadySeconds;
    /**
     * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    public Integer replicas;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * (Required)
     * 
     */
    public LabelSelector selector;
    /**
     * PodTemplateSpec describes the data a pod should have when created from a template
     * 
     */
    public PodTemplateSpec template;

    public ReplicaSetSpec withMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public ReplicaSetSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public ReplicaSetSpec withSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public ReplicaSetSpec withTemplate(PodTemplateSpec template) {
        this.template = template;
        return this;
    }

}
