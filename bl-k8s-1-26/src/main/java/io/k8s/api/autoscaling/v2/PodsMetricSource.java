
package io.k8s.api.autoscaling.v2;



/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 * 
 */
public class PodsMetricSource {

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

    public PodsMetricSource withMetric(MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    public PodsMetricSource withTarget(MetricTarget target) {
        this.target = target;
        return this;
    }

}
