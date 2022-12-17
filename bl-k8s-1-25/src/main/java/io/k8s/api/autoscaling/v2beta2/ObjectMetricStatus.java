
package io.k8s.api.autoscaling.v2beta2;



/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public class ObjectMetricStatus {

    /**
     * MetricValueStatus holds the current value for a metric
     * (Required)
     * 
     */
    public MetricValueStatus current;
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

    public ObjectMetricStatus withCurrent(MetricValueStatus current) {
        this.current = current;
        return this;
    }

    public ObjectMetricStatus withDescribedObject(CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
        return this;
    }

    public ObjectMetricStatus withMetric(MetricIdentifier metric) {
        this.metric = metric;
        return this;
    }

}
