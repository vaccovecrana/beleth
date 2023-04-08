
package io.k8s.api.networking.v1;



/**
 * ServiceBackendPort is the service port being referenced.
 * 
 */
public class ServiceBackendPort {

    /**
     * Name is the name of the port on the Service. This is a mutually exclusive setting with "Number".
     * 
     */
    public String name;
    /**
     * Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name".
     * 
     */
    public Integer number;

    public ServiceBackendPort withName(String name) {
        this.name = name;
        return this;
    }

    public ServiceBackendPort withNumber(Integer number) {
        this.number = number;
        return this;
    }

}
