
package io.k8s.api.discovery.v1;

import java.util.List;
import io.k8s.api.core.v1.ObjectReference;


/**
 * Endpoint represents a single logical "backend" implementing a service.
 * 
 */
public class Endpoint {

    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100. These are all assumed to be fungible and clients may choose to only use the first element. Refer to: https://issue.k8s.io/106267
     * (Required)
     * 
     */
    public List<String> addresses;
    /**
     * EndpointConditions represents the current condition of an endpoint.
     * 
     */
    public EndpointConditions conditions;
    /**
     * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    public DeprecatedTopology deprecatedTopology;
    /**
     * EndpointHints provides hints describing how an endpoint should be consumed.
     * 
     */
    public EndpointHints hints;
    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    public String hostname;
    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node.
     * 
     */
    public String nodeName;
    /**
     * ObjectReference contains enough information to let you inspect or modify the referred object.
     * 
     */
    public ObjectReference targetRef;
    /**
     * zone is the name of the Zone this endpoint exists in.
     * 
     */
    public String zone;

    public Endpoint withAddresses(List<String> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Endpoint withConditions(EndpointConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public Endpoint withDeprecatedTopology(DeprecatedTopology deprecatedTopology) {
        this.deprecatedTopology = deprecatedTopology;
        return this;
    }

    public Endpoint withHints(EndpointHints hints) {
        this.hints = hints;
        return this;
    }

    public Endpoint withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public Endpoint withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public Endpoint withTargetRef(ObjectReference targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    public Endpoint withZone(String zone) {
        this.zone = zone;
        return this;
    }

}
