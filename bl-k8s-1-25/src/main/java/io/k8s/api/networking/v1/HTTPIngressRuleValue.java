package io.k8s.api.networking.v1;

import java.util.List;

/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://&#60;host&#62;/&#60;path&#62;?&#60;searchpart&#62; -&#62; backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last &#39;/&#39; and before the first &#39;?&#39; or &#39;#&#39;.
 */
public class HTTPIngressRuleValue {
  public List<HTTPIngressPath> paths;

  /**
   * A collection of paths that map requests to backends.
   */
  public HTTPIngressRuleValue paths(List<HTTPIngressPath> paths) {
    this.paths = paths;
    return this;
  }
}
