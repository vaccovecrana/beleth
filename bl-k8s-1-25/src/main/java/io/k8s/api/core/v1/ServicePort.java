
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * ServicePort contains information on service's port.
 * 
 */
public class ServicePort {

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and https://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    public String appProtocol;
    /**
     * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
     * 
     */
    public String name;
    /**
     * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     * 
     */
    public Integer nodePort;
    /**
     * The port that will be exposed by this service.
     * (Required)
     * 
     */
    public Integer port;
    /**
     * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    public ServicePort.Protocol protocol;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String targetPort;

    public ServicePort withAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
        return this;
    }

    public ServicePort withName(String name) {
        this.name = name;
        return this;
    }

    public ServicePort withNodePort(Integer nodePort) {
        this.nodePort = nodePort;
        return this;
    }

    public ServicePort withPort(Integer port) {
        this.port = port;
        return this;
    }

    public ServicePort withProtocol(ServicePort.Protocol protocol) {
        this.protocol = protocol;
        return this;
    }

    public ServicePort withTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }


    /**
     * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    public enum Protocol {

        SCTP("SCTP"),
        TCP("TCP"),
        UDP("UDP");
        private final String value;
        private final static Map<String, ServicePort.Protocol> CONSTANTS = new HashMap<String, ServicePort.Protocol>();

        static {
            for (ServicePort.Protocol c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ServicePort.Protocol fromValue(String value) {
            ServicePort.Protocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
