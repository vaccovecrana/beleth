
package io.k8s.api.networking.v1;



/**
 * IngressServiceBackend references a Kubernetes Service as a Backend.
 * 
 */
public class IngressServiceBackend {

    /**
     * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
     * (Required)
     * 
     */
    public String name;
    /**
     * ServiceBackendPort is the service port being referenced.
     * 
     */
    public ServiceBackendPort port;

    public IngressServiceBackend withName(String name) {
        this.name = name;
        return this;
    }

    public IngressServiceBackend withPort(ServiceBackendPort port) {
        this.port = port;
        return this;
    }

}
