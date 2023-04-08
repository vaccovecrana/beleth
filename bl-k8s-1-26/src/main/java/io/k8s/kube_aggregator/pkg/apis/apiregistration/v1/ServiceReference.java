
package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;



/**
 * ServiceReference holds a reference to Service.legacy.k8s.io
 * 
 */
public class ServiceReference {

    /**
     * Name is the name of the service
     * 
     */
    public String name;
    /**
     * Namespace is the namespace of the service
     * 
     */
    public String namespace;
    /**
     * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
     * 
     */
    public Integer port;

    public ServiceReference withName(String name) {
        this.name = name;
        return this;
    }

    public ServiceReference withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ServiceReference withPort(Integer port) {
        this.port = port;
        return this;
    }

}
