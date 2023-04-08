
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.Map;

public class PortStatus {

    /**
     * Error is to record the problem with the service port The format of the error shall comply with the following rules: - built-in error values shall be specified in this file and those shall use
     *   CamelCase names
     * - cloud provider specific error values must have names that comply with the
     *   format foo.example.com/CamelCase.
     * 
     */
    public String error;
    /**
     * Port is the port number of the service port of which status is recorded here
     * (Required)
     * 
     */
    public Integer port;
    /**
     * Protocol is the protocol of the service port of which status is recorded here The supported values are: "TCP", "UDP", "SCTP"
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * (Required)
     * 
     */
    public PortStatus.Protocol protocol;

    public PortStatus withError(String error) {
        this.error = error;
        return this;
    }

    public PortStatus withPort(Integer port) {
        this.port = port;
        return this;
    }

    public PortStatus withProtocol(PortStatus.Protocol protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * Protocol is the protocol of the service port of which status is recorded here The supported values are: "TCP", "UDP", "SCTP"
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
        private final static Map<String, PortStatus.Protocol> CONSTANTS = new HashMap<String, PortStatus.Protocol>();

        static {
            for (PortStatus.Protocol c: values()) {
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

        public static PortStatus.Protocol fromValue(String value) {
            PortStatus.Protocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
