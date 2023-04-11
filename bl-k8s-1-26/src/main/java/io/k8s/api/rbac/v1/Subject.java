package io.k8s.api.rbac.v1;

import java.lang.String;

/**
 * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 */
public class Subject {
  public String apiGroup;

  public String kind;

  public String name;

  public String namespace;

  /**
   * APIGroup holds the API group of the referenced subject. Defaults to &#34;&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io&#34; for User and Group subjects.
   */
  public Subject apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
   */
  public Subject kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the object being referenced.
   */
  public Subject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
   */
  public Subject namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
}
