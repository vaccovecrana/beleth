
package io.k8s.api.core.v1;



/**
 * Selects a key from a ConfigMap.
 * 
 */
public class ConfigMapKeySelector {

    /**
     * The key to select.
     * (Required)
     * 
     */
    public String key;
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public String name;
    /**
     * Specify whether the ConfigMap or its key must be defined
     * 
     */
    public Boolean optional;

    public ConfigMapKeySelector withKey(String key) {
        this.key = key;
        return this;
    }

    public ConfigMapKeySelector withName(String name) {
        this.name = name;
        return this;
    }

    public ConfigMapKeySelector withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

}
