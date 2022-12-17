
package io.k8s.api.core.v1;



/**
 * Sysctl defines a kernel parameter to be set
 * 
 */
public class Sysctl {

    /**
     * Name of a property to set
     * (Required)
     * 
     */
    public String name;
    /**
     * Value of a property to set
     * (Required)
     * 
     */
    public String value;

    public Sysctl withName(String name) {
        this.name = name;
        return this;
    }

    public Sysctl withValue(String value) {
        this.value = value;
        return this;
    }

}
