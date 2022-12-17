
package io.k8s.api.core.v1;



/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public class EnvVarSource {

    /**
     * Selects a key from a ConfigMap.
     * 
     */
    public ConfigMapKeySelector configMapKeyRef;
    /**
     * ObjectFieldSelector selects an APIVersioned field of an object.
     * 
     */
    public ObjectFieldSelector fieldRef;
    /**
     * ResourceFieldSelector represents container resources (cpu, memory) and their output format
     * 
     */
    public ResourceFieldSelector resourceFieldRef;
    /**
     * SecretKeySelector selects a key of a Secret.
     * 
     */
    public SecretKeySelector secretKeyRef;

    public EnvVarSource withConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        return this;
    }

    public EnvVarSource withFieldRef(ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    public EnvVarSource withResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
        return this;
    }

    public EnvVarSource withSecretKeyRef(SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
        return this;
    }

}
