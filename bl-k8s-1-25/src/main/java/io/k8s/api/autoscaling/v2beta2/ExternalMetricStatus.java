
package io.k8s.api.autoscaling.v2beta2;



/**
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 * 
 */
public class ExternalMetricStatus {

    /**
     * MetricValueStatus holds the current value for a metric
     * (Required)
     * 
     */
    public MetricValueStatus current;
    /**
     * MetricIdentifier defines the name and optionally selector for a metric
     * (Required)
     * 
     */
    public MetricIdentifier metric;

    public ExternalMetricStatus withCurrent(MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public ExternalMetricStatus withMetric(MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

}
