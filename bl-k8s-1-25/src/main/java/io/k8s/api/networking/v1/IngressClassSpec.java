
package io.k8s.api.networking.v1;



/**
 * IngressClassSpec provides information about the class of an Ingress.
 * 
 */
public class IngressClassSpec {

    /**
     * Controller refers to the name of the controller that should handle this class. This allows for different "flavors" that are controlled by the same controller. For example, you may have different Parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. "acme.io/ingress-controller". This field is immutable.
     * 
     */
    public String controller;
    /**
     * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
     * 
     */
    public IngressClassParametersReference parameters;

    public IngressClassSpec withController(String controller) {
        this.controller = controller;
        return this;
    }

    public IngressClassSpec withParameters(IngressClassParametersReference parameters) {
        this.parameters = parameters;
        return this;
    }

}
