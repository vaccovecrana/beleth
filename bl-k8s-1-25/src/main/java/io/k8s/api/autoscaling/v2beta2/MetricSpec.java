
package io.k8s.api.autoscaling.v2beta2;



/**
 * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
 * 
 */
public class MetricSpec {

    /**
     * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
     * 
     */
    public ContainerResourceMetricSource containerResource;
    /**
     * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    public ExternalMetricSource external;
    /**
     * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public ObjectMetricSource object;
    /**
     * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
     * 
     */
    public PodsMetricSource pods;
    /**
     * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
     * 
     */
    public ResourceMetricSource resource;
    /**
     * type is the type of metric source.  It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * (Required)
     * 
     */
    public String type;

    public MetricSpec withContainerResource(ContainerResourceMetricSource containerResource) {
        this.containerResource = containerResource;
        return this;
    }

    public MetricSpec withExternal(ExternalMetricSource external) {
        this.external = external;
        return this;
    }

    public MetricSpec withObject(ObjectMetricSource object) {
        this.object = object;
        return this;
    }

    public MetricSpec withPods(PodsMetricSource pods) {
        this.pods = pods;
        return this;
    }

    public MetricSpec withResource(ResourceMetricSource resource) {
        this.resource = resource;
        return this;
    }

    public MetricSpec withType(String type) {
        this.type = type;
        return this;
    }

}
