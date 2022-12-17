
package io.k8s.api.core.v1;



/**
 * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
 * 
 * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
 * 
 */
public class ConfigMapEnvSource {

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public String name;
    /**
     * Specify whether the ConfigMap must be defined
     * 
     */
    public Boolean optional;

    public ConfigMapEnvSource withName(String name) {
        this.name = name;
        return this;
    }

    public ConfigMapEnvSource withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

}
