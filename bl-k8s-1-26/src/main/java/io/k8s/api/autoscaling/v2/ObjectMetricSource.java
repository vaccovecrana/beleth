
package io.k8s.api.autoscaling.v2;



/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public class ObjectMetricSource {

    /**
     * CrossVersionObjectReference contains enough information to let you identify the referred resource.
     * (Required)
     * 
     */
    public CrossVersionObjectReference describedObject;
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

    public ObjectMetricSource withDescribedObject(CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
        return this;
    }

    public ObjectMetricSource withMetric(MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

    public ObjectMetricSource withTarget(MetricTarget target) {
        this.target = target;
        return this;
    }

}
