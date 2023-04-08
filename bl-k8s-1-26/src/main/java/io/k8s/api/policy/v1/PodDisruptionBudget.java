
package io.k8s.api.policy.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
 * 
 */
public class PodDisruptionBudget {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
     * 
     */
    public PodDisruptionBudgetSpec spec;
    /**
     * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
     * 
     */
    public PodDisruptionBudgetStatus status;

    public PodDisruptionBudget withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodDisruptionBudget withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public PodDisruptionBudget withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodDisruptionBudget withSpec(PodDisruptionBudgetSpec spec) {
        this.spec = spec;
        return this;
    }

    public PodDisruptionBudget withStatus(PodDisruptionBudgetStatus status) {
        this.status = status;
        return this;
    }

}
