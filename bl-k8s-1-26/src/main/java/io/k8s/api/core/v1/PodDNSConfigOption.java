
package io.k8s.api.core.v1;



/**
 * PodDNSConfigOption defines DNS resolver options of a pod.
 * 
 */
public class PodDNSConfigOption {

    /**
     * Required.
     * 
     */
    public String name;
    public String value;

    public PodDNSConfigOption withName(String name) {
        this.name = name;
        return this;
    }

    public PodDNSConfigOption withValue(String value) {
        this.value = value;
        return this;
    }

}
