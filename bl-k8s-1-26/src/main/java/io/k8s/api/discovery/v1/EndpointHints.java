
package io.k8s.api.discovery.v1;

import java.util.List;


/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 * 
 */
public class EndpointHints {

    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
     * 
     */
    public List<ForZone> forZones;

    public EndpointHints withForZones(List<ForZone> forZones) {
        this.forZones = forZones;
        return this;
    }

}
