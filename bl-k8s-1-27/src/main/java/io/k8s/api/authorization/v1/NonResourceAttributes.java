package io.k8s.api.authorization.v1;

import java.lang.String;

/**
 * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
 */
public class NonResourceAttributes {
  public String path;

  public String verb;

  /**
   * Path is the URL path of the request
   */
  public NonResourceAttributes path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Verb is the standard HTTP verb
   */
  public NonResourceAttributes verb(String verb) {
    this.verb = verb;
    return this;
  }
}
