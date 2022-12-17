
package io.k8s.api.autoscaling.v2beta2;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which automatically manages the replica count of any resource implementing the scale subresource based on the metrics specified.
 * 
 */
public class HorizontalPodAutoscaler {

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
     * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
     * 
     */
    public HorizontalPodAutoscalerSpec spec;
    /**
     * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
     * 
     */
    public HorizontalPodAutoscalerStatus status;

    public HorizontalPodAutoscaler withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public HorizontalPodAutoscaler withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public HorizontalPodAutoscaler withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public HorizontalPodAutoscaler withSpec(HorizontalPodAutoscalerSpec spec) {
        this.spec = spec;
        return this;
    }

    public HorizontalPodAutoscaler withStatus(HorizontalPodAutoscalerStatus status) {
        this.status = status;
        return this;
    }

}
