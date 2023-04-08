
package io.k8s.api.core.v1;



/**
 * SecretEnvSource selects a Secret to populate the environment variables with.
 * 
 * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
 * 
 */
public class SecretEnvSource {

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public String name;
    /**
     * Specify whether the Secret must be defined
     * 
     */
    public Boolean optional;

    public SecretEnvSource withName(String name) {
        this.name = name;
        return this;
    }

    public SecretEnvSource withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

}
