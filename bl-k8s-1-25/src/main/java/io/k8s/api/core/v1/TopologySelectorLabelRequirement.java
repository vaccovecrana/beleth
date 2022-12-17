
package io.k8s.api.core.v1;

import java.util.List;


/**
 * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
 * 
 */
public class TopologySelectorLabelRequirement {

    /**
     * The label key that the selector applies to.
     * (Required)
     * 
     */
    public String key;
    /**
     * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
     * (Required)
     * 
     */
    public List<String> values;

    public TopologySelectorLabelRequirement withKey(String key) {
        this.key = key;
        return this;
    }

    public TopologySelectorLabelRequirement withValues(List<String> values) {
        this.values = values;
        return this;
    }

}
