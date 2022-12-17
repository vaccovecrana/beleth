
package io.k8s.api.flowcontrol.v1beta2;



/**
 * ServiceAccountSubject holds detailed information for service-account-kind subject.
 * 
 */
public class ServiceAccountSubject {

    /**
     * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. Required.
     * (Required)
     * 
     */
    public String name;
    /**
     * `namespace` is the namespace of matching ServiceAccount objects. Required.
     * (Required)
     * 
     */
    public String namespace;

    public ServiceAccountSubject withName(String name) {
        this.name = name;
        return this;
    }

    public ServiceAccountSubject withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
