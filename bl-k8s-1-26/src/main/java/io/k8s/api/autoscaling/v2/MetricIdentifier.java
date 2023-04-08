
package io.k8s.api.autoscaling.v2;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * MetricIdentifier defines the name and optionally selector for a metric
 * 
 */
public class MetricIdentifier {

    /**
     * name is the name of the given metric
     * (Required)
     * 
     */
    public String name;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector selector;

    public MetricIdentifier withName(String name) {
        this.name = name;
        return this;
    }

    public MetricIdentifier withSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

}
