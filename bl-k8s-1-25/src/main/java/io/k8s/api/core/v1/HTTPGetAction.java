package io.k8s.api.core.v1;

import io.k8s.api.core.v1.httpgetaction.Scheme;
import java.lang.String;
import java.util.List;

/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 */
public class HTTPGetAction {
  public String host;

  public List<HTTPHeader> httpHeaders;

  public String path;

  public String port;

  public Scheme scheme;

  /**
   * Host name to connect to, defaults to the pod IP. You probably want to set &#34;Host&#34; in httpHeaders instead.
   */
  public HTTPGetAction host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   */
  public HTTPGetAction httpHeaders(List<HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  /**
   * Path to access on the HTTP server.
   */
  public HTTPGetAction path(String path) {
    this.path = path;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public HTTPGetAction port(String port) {
    this.port = port;
    return this;
  }

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   *
   * Possible enum values:
   *  - `&#34;HTTP&#34;` means that the scheme used will be http://
   *  - `&#34;HTTPS&#34;` means that the scheme used will be https://
   */
  public HTTPGetAction scheme(Scheme scheme) {
    this.scheme = scheme;
    return this;
  }
}
