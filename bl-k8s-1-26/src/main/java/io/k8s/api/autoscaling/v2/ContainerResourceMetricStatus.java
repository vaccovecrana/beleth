
package io.k8s.api.autoscaling.v2;



/**
 * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
 * 
 */
public class ContainerResourceMetricStatus {

    /**
     * Container is the name of the container in the pods of the scaling target
     * (Required)
     * 
     */
    public String container;
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

    public ContainerResourceMetricStatus withContainer(String container) {
        this.container = container;
        return this;
    }

    public ContainerResourceMetricStatus withCurrent(MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public ContainerResourceMetricStatus withName(String name) {
        this.name = name;
        return this;
    }

}
