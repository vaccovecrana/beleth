package io.k8s.api.networking.v1;

import java.lang.String;

/**
 * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
 */
public class HTTPIngressPath {
  public IngressBackend backend;

  public String path;

  public String pathType;

  public HTTPIngressPath backend(IngressBackend backend) {
    this.backend = backend;
    return this;
  }

  /**
   * Path is matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional &#34;path&#34; part of a URL as defined by RFC 3986. Paths must begin with a &#39;/&#39; and must be present when using PathType with value &#34;Exact&#34; or &#34;Prefix&#34;.
   */
  public HTTPIngressPath path(String path) {
    this.path = path;
    return this;
  }

  /**
   * PathType determines the interpretation of the Path matching. PathType can be one of the following values: <code>*</code> Exact: Matches the URL path exactly. <code>*</code> Prefix: Matches based on a URL path prefix split by &#39;/&#39;. Matching is
   *   done on a path element by element basis. A path element refers is the
   *   list of labels in the path split by the &#39;/&#39; separator. A request is a
   *   match for path p if every p is an element-wise prefix of p of the
   *   request path. Note that if the last element of the path is a substring
   *   of the last element in request path, it is not a match (e.g. /foo/bar
   *   matches /foo/bar/baz, but does not match /foo/barbaz).
   * <code>*</code> ImplementationSpecific: Interpretation of the Path matching is up to
   *   the IngressClass. Implementations can treat this as a separate PathType
   *   or treat it identically to Prefix or Exact path types.
   * Implementations are required to support all path types.
   */
  public HTTPIngressPath pathType(String pathType) {
    this.pathType = pathType;
    return this;
  }
}
