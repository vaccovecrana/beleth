
package io.k8s.api.core.v1;



/**
 * HTTPHeader describes a custom header to be used in HTTP probes
 * 
 */
public class HTTPHeader {

    /**
     * The header field name
     * (Required)
     * 
     */
    public String name;
    /**
     * The header field value
     * (Required)
     * 
     */
    public String value;

    public HTTPHeader withName(String name) {
        this.name = name;
        return this;
    }

    public HTTPHeader withValue(String value) {
        this.value = value;
        return this;
    }

}
