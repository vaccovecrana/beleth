
package io.k8s.api.core.v1;



/**
 * EnvFromSource represents the source of a set of ConfigMaps
 * 
 */
public class EnvFromSource {

    /**
     * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
     * 
     * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
     * 
     */
    public ConfigMapEnvSource configMapRef;
    /**
     * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    public String prefix;
    /**
     * SecretEnvSource selects a Secret to populate the environment variables with.
     * 
     * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
     * 
     */
    public SecretEnvSource secretRef;

    public EnvFromSource withConfigMapRef(ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
        return this;
    }

    public EnvFromSource withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public EnvFromSource withSecretRef(SecretEnvSource secretRef) {
        this.secretRef = secretRef;
        return this;
    }

}
