
package io.k8s.api.autoscaling.v2;



/**
 * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
 * 
 */
public class ResourceMetricStatus {

    /**
     * MetricValueStatus holds the current value for a metric
     * (Required)
     * 
     */
    public MetricValueStatus current;
    /**
     * Name is the name of the resource in question.
     * (Required)
     * 
     */
    public String name;

    public ResourceMetricStatus withCurrent(MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public ResourceMetricStatus withName(String name) {
        this.name = name;
        return this;
    }

}
