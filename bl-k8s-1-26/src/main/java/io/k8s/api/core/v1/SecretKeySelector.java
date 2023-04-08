
package io.k8s.api.core.v1;



/**
 * SecretKeySelector selects a key of a Secret.
 * 
 */
public class SecretKeySelector {

    /**
     * The key of the secret to select from.  Must be a valid secret key.
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
     * Specify whether the Secret or its key must be defined
     * 
     */
    public Boolean optional;

    public SecretKeySelector withKey(String key) {
        this.key = key;
        return this;
    }

    public SecretKeySelector withName(String name) {
        this.name = name;
        return this;
    }

    public SecretKeySelector withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

}
