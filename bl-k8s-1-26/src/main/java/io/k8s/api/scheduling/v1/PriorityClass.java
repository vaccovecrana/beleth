
package io.k8s.api.scheduling.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 * 
 */
public class PriorityClass {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
     */
    public String description;
    /**
     * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
     */
    public Boolean globalDefault;
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
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
     * 
     */
    public String preemptionPolicy;
    /**
     * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * (Required)
     * 
     */
    public Integer value;

    public PriorityClass withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PriorityClass withDescription(String description) {
        this.description = description;
        return this;
    }

    public PriorityClass withGlobalDefault(Boolean globalDefault) {
        this.globalDefault = globalDefault;
        return this;
    }

    public PriorityClass withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public PriorityClass withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PriorityClass withPreemptionPolicy(String preemptionPolicy) {
        this.preemptionPolicy = preemptionPolicy;
        return this;
    }

    public PriorityClass withValue(Integer value) {
        this.value = value;
        return this;
    }

}
