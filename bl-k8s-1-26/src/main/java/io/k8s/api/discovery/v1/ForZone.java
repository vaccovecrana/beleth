
package io.k8s.api.discovery.v1;



/**
 * ForZone provides information about which zones should consume this endpoint.
 * 
 */
public class ForZone {

    /**
     * name represents the name of the zone.
     * (Required)
     * 
     */
    public String name;

    public ForZone withName(String name) {
        this.name = name;
        return this;
    }

}
