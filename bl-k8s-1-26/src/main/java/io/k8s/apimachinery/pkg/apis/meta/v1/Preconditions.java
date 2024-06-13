package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;

/**
 * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 */
public class Preconditions {
  public String resourceVersion;

  public String uid;

  /**
   * Specifies the target ResourceVersion
   */
  public Preconditions resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Specifies the target UID.
   */
  public Preconditions uid(String uid) {
    this.uid = uid;
    return this;
  }

  public static Preconditions preconditions() {
    return new Preconditions();
  }
}
