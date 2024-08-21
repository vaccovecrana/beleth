package io.k8s.api.discovery.v1;

import java.util.List;

/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 */
public class EndpointHints {
  public List<ForZone> forZones;

  /**
   * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
   */
  public EndpointHints forZones(List<ForZone> forZones) {
    this.forZones = forZones;
    return this;
  }

  public static EndpointHints endpointHints() {
    return new EndpointHints();
  }
}
