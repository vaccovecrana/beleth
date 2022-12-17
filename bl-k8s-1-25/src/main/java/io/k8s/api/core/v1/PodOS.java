
package io.k8s.api.core.v1;



/**
 * PodOS defines the OS parameters of a pod.
 * 
 */
public class PodOS {

    /**
     * Name is the name of the operating system. The currently supported values are linux and windows. Additional value may be defined in future and can be one of: https://github.com/opencontainers/runtime-spec/blob/master/config.md#platform-specific-configuration Clients should expect to handle additional values and treat unrecognized values in this field as os: null
     * (Required)
     * 
     */
    public String name;

    public PodOS withName(String name) {
        this.name = name;
        return this;
    }

}
