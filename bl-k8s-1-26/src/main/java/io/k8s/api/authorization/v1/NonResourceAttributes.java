
package io.k8s.api.authorization.v1;



/**
 * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
 * 
 */
public class NonResourceAttributes {

    /**
     * Path is the URL path of the request
     * 
     */
    public String path;
    /**
     * Verb is the standard HTTP verb
     * 
     */
    public String verb;

    public NonResourceAttributes withPath(String path) {
        this.path = path;
        return this;
    }

    public NonResourceAttributes withVerb(String verb) {
        this.verb = verb;
        return this;
    }

}
