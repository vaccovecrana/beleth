
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 * 
 */
public class HTTPGetAction {

    /**
     * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
     * 
     */
    public String host;
    /**
     * Custom headers to set in the request. HTTP allows repeated headers.
     * 
     */
    public List<HTTPHeader> httpHeaders;
    /**
     * Path to access on the HTTP server.
     * 
     */
    public String path;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * (Required)
     * 
     */
    public String port;
    /**
     * Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     * Possible enum values:
     *  - `"HTTP"` means that the scheme used will be http://
     *  - `"HTTPS"` means that the scheme used will be https://
     * 
     */
    public HTTPGetAction.Scheme scheme;

    public HTTPGetAction withHost(String host) {
        this.host = host;
        return this;
    }

    public HTTPGetAction withHttpHeaders(List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public HTTPGetAction withPath(String path) {
        this.path = path;
        return this;
    }

    public HTTPGetAction withPort(String port) {
        this.port = port;
        return this;
    }

    public HTTPGetAction withScheme(HTTPGetAction.Scheme scheme) {
        this.scheme = scheme;
        return this;
    }


    /**
     * Scheme to use for connecting to the host. Defaults to HTTP.
     * 
     * Possible enum values:
     *  - `"HTTP"` means that the scheme used will be http://
     *  - `"HTTPS"` means that the scheme used will be https://
     * 
     */
    public enum Scheme {

        HTTP("HTTP"),
        HTTPS("HTTPS");
        private final String value;
        private final static Map<String, HTTPGetAction.Scheme> CONSTANTS = new HashMap<String, HTTPGetAction.Scheme>();

        static {
            for (HTTPGetAction.Scheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Scheme(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static HTTPGetAction.Scheme fromValue(String value) {
            HTTPGetAction.Scheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
