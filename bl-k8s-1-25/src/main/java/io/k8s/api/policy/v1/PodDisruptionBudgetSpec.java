
package io.k8s.api.policy.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 * 
 */
public class PodDisruptionBudgetSpec {

    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String maxUnavailable;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String minAvailable;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector selector;

    public PodDisruptionBudgetSpec withMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    public PodDisruptionBudgetSpec withMinAvailable(String minAvailable) {
        this.minAvailable = minAvailable;
        return this;
    }

    public PodDisruptionBudgetSpec withSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

}
