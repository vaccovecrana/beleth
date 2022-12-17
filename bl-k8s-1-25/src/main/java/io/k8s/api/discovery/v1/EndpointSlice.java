
package io.k8s.api.discovery.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
 * 
 */
public class EndpointSlice {

    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     * Possible enum values:
     *  - `"FQDN"` represents a FQDN.
     *  - `"IPv4"` represents an IPv4 Address.
     *  - `"IPv6"` represents an IPv6 Address.
     * (Required)
     * 
     */
    public EndpointSlice.AddressType addressType;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
     * (Required)
     * 
     */
    public List<Endpoint> endpoints;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
     * 
     */
    public List<EndpointPort> ports;

    public EndpointSlice withAddressType(EndpointSlice.AddressType addressType) {
        this.addressType = addressType;
        return this;
    }

    public EndpointSlice withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public EndpointSlice withEndpoints(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public EndpointSlice withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public EndpointSlice withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public EndpointSlice withPorts(List<EndpointPort> ports) {
        this.ports = ports;
        return this;
    }


    /**
     * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
     * 
     * Possible enum values:
     *  - `"FQDN"` represents a FQDN.
     *  - `"IPv4"` represents an IPv4 Address.
     *  - `"IPv6"` represents an IPv6 Address.
     * 
     */
    public enum AddressType {

        FQDN("FQDN"),
        I_PV_4("IPv4"),
        I_PV_6("IPv6");
        private final String value;
        private final static Map<String, EndpointSlice.AddressType> CONSTANTS = new HashMap<String, EndpointSlice.AddressType>();

        static {
            for (EndpointSlice.AddressType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddressType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static EndpointSlice.AddressType fromValue(String value) {
            EndpointSlice.AddressType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
