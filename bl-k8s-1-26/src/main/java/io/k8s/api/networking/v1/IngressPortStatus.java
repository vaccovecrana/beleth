
package io.k8s.api.networking.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * IngressPortStatus represents the error condition of a service port
 * 
 */
public class IngressPortStatus {

    /**
     * Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use
     *   CamelCase names
     * - cloud provider specific error values must have names that comply with the
     *   format foo.example.com/CamelCase.
     * 
     */
    public String error;
    /**
     * Port is the port number of the ingress port.
     * (Required)
     * 
     */
    public Integer port;
    /**
     * Protocol is the protocol of the ingress port. The supported values are: "TCP", "UDP", "SCTP"
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * (Required)
     * 
     */
    public IngressPortStatus.Protocol protocol;

    public IngressPortStatus withError(String error) {
        this.error = error;
        return this;
    }

    public IngressPortStatus withPort(Integer port) {
        this.port = port;
        return this;
    }

    public IngressPortStatus withProtocol(IngressPortStatus.Protocol protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * Protocol is the protocol of the ingress port. The supported values are: "TCP", "UDP", "SCTP"
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
        private final static Map<String, IngressPortStatus.Protocol> CONSTANTS = new HashMap<String, IngressPortStatus.Protocol>();

        static {
            for (IngressPortStatus.Protocol c: values()) {
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

        public static IngressPortStatus.Protocol fromValue(String value) {
            IngressPortStatus.Protocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
