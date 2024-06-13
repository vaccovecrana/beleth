package io.k8s.api.core.v1;

import java.lang.String;

/**
 * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
 */
public class SecretReference {
  public String name;

  public String namespace;

  /**
   * name is unique within a namespace to reference a secret resource.
   */
  public SecretReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * namespace defines the space within which the secret name must be unique.
   */
  public SecretReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  public static SecretReference secretReference() {
    return new SecretReference();
  }
}
