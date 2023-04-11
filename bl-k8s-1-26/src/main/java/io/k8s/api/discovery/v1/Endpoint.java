package io.k8s.api.discovery.v1;

import io.k8s.api.core.v1.ObjectReference;
import io.k8s.api.discovery.v1.endpoint.DeprecatedTopology;
import java.lang.String;
import java.util.List;

/**
 * Endpoint represents a single logical &#34;backend&#34; implementing a service.
 */
public class Endpoint {
  public List<String> addresses;

  public EndpointConditions conditions;

  public DeprecatedTopology deprecatedTopology;

  public EndpointHints hints;

  public String hostname;

  public String nodeName;

  public ObjectReference targetRef;

  public String zone;

  /**
   * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
   */
  public Endpoint addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Endpoint conditions(EndpointConditions conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
   */
  public Endpoint deprecatedTopology(DeprecatedTopology deprecatedTopology) {
    this.deprecatedTopology = deprecatedTopology;
    return this;
  }

  public Endpoint hints(EndpointHints hints) {
    this.hints = hints;
    return this;
  }

  /**
   * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
   */
  public Endpoint hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
   */
  public Endpoint nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  public Endpoint targetRef(ObjectReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }

  /**
   * zone is the name of the Zone this endpoint exists in.
   */
  public Endpoint zone(String zone) {
    this.zone = zone;
    return this;
  }
}
