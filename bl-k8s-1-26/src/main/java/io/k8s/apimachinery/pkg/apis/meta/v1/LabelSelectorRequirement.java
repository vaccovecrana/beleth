
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 * 
 */
public class LabelSelectorRequirement {

    /**
     * key is the label key that the selector applies to.
     * (Required)
     * 
     */
    public String key;
    /**
     * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     * (Required)
     * 
     */
    public String operator;
    /**
     * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    public List<String> values;

    public LabelSelectorRequirement withKey(String key) {
        this.key = key;
        return this;
    }

    public LabelSelectorRequirement withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public LabelSelectorRequirement withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
