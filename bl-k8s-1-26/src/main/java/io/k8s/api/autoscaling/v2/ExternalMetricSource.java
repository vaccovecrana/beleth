
package io.k8s.api.autoscaling.v2;



/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
 * 
 */
public class ExternalMetricSource {

    /**
     * MetricIdentifier defines the name and optionally selector for a metric
     * (Required)
     * 
     */
    public MetricIdentifier metric;
    /**
     * MetricTarget defines the target value, average value, or average utilization of a specific metric
     * (Required)
     * 
     */
    public MetricTarget target;

    public ExternalMetricSource withMetric(MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    public ExternalMetricSource withTarget(MetricTarget target) {
        this.target = target;
        return this;
    }

}
