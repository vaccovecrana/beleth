
package io.k8s.api.networking.v1;

import java.util.List;


/**
 * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
 * 
 */
public class HTTPIngressRuleValue {

    /**
     * A collection of paths that map requests to backends.
     * (Required)
     * 
     */
    public List<HTTPIngressPath> paths;

    public HTTPIngressRuleValue withPaths(List<HTTPIngressPath> paths) {
        this.paths = paths;
        return this;
    }

}
