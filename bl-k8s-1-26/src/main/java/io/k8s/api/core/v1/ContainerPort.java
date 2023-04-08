
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * ContainerPort represents a network port in a single container.
 * 
 */
public class ContainerPort {

    /**
     * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
     * (Required)
     * 
     */
    public Integer containerPort;
    /**
     * What host IP to bind the external port to.
     * 
     */
    public String hostIP;
    /**
     * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     * 
     */
    public Integer hostPort;
    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     * 
     */
    public String name;
    /**
     * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    public ContainerPort.Protocol protocol;

    public ContainerPort withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    public ContainerPort withHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    public ContainerPort withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    public ContainerPort withName(String name) {
        this.name = name;
        return this;
    }

    public ContainerPort withProtocol(ContainerPort.Protocol protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
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
        private final static Map<String, ContainerPort.Protocol> CONSTANTS = new HashMap<String, ContainerPort.Protocol>();

        static {
            for (ContainerPort.Protocol c: values()) {
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

        public static ContainerPort.Protocol fromValue(String value) {
            ContainerPort.Protocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
