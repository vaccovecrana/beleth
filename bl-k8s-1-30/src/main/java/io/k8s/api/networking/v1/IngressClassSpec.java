package io.k8s.api.networking.v1;

import java.lang.String;

/**
 * IngressClassSpec provides information about the class of an Ingress.
 */
public class IngressClassSpec {
  public String controller;

  public IngressClassParametersReference parameters;

  /**
   * controller refers to the name of the controller that should handle this class. This allows for different &#34;flavors&#34; that are controlled by the same controller. For example, you may have different parameters for the same implementing controller. This should be specified as a domain-prefixed path no more than 250 characters in length, e.g. &#34;acme.io/ingress-controller&#34;. This field is immutable.
   */
  public IngressClassSpec controller(String controller) {
    this.controller = controller;
    return this;
  }

  public IngressClassSpec parameters(IngressClassParametersReference parameters) {
    this.parameters = parameters;
    return this;
  }
}
