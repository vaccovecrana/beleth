
package io.k8s.api.core.v1;



/**
 * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
 * 
 */
public class SecretReference {

    /**
     * name is unique within a namespace to reference a secret resource.
     * 
     */
    public String name;
    /**
     * namespace defines the space within which the secret name must be unique.
     * 
     */
    public String namespace;

    public SecretReference withName(String name) {
        this.name = name;
        return this;
    }

    public SecretReference withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
