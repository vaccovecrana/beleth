
package io.k8s.api.autoscaling.v2;



/**
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 * 
 */
public class PodsMetricStatus {

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

    public PodsMetricStatus withCurrent(MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public PodsMetricStatus withMetric(MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

}
