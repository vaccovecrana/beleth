
package io.k8s.api.autoscaling.v2beta2;



/**
 * MetricStatus describes the last-read state of a single metric.
 * 
 */
public class MetricStatus {

    /**
     * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    public ContainerResourceMetricStatus containerResource;
    /**
     * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
     * 
     */
    public ExternalMetricStatus external;
    /**
     * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public ObjectMetricStatus object;
    /**
     * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
     * 
     */
    public PodsMetricStatus pods;
    /**
     * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    public ResourceMetricStatus resource;
    /**
     * type is the type of metric source.  It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * (Required)
     * 
     */
    public String type;

    public MetricStatus withContainerResource(ContainerResourceMetricStatus containerResource) {
        this.containerResource = containerResource;
        return this;
    }

    public MetricStatus withExternal(ExternalMetricStatus external) {
        this.external = external;
        return this;
    }

    public MetricStatus withObject(ObjectMetricStatus object) {
        this.object = object;
        return this;
    }

    public MetricStatus withPods(PodsMetricStatus pods) {
        this.pods = pods;
        return this;
    }

    public MetricStatus withResource(ResourceMetricStatus resource) {
        this.resource = resource;
        return this;
    }

    public MetricStatus withType(String type) {
        this.type = type;
        return this;
    }

}
