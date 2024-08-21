package io.k8s.api.discovery.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 */
public class EndpointSlice {
  public String addressType;

  public String apiVersion;

  public List<Endpoint> endpoints;

  public String kind;

  public ObjectMeta metadata;

  public List<EndpointPort> ports;

  /**
   * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: <code>*</code> IPv4: Represents an IPv4 Address. <code>*</code> IPv6: Represents an IPv6 Address. <code>*</code> FQDN: Represents a Fully Qualified Domain Name.
   */
  public EndpointSlice addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public EndpointSlice apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
   */
  public EndpointSlice endpoints(List<Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public EndpointSlice kind(String kind) {
    this.kind = kind;
    return this;
  }

  public EndpointSlice metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates &#34;all ports&#34;. Each slice may include a maximum of 100 ports.
   */
  public EndpointSlice ports(List<EndpointPort> ports) {
    this.ports = ports;
    return this;
  }

  public static EndpointSlice endpointSlice() {
    return new EndpointSlice();
  }
}
