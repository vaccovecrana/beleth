package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 */
public class OwnerReference {
  public String apiVersion;

  public Boolean blockOwnerDeletion;

  public Boolean controller;

  public String kind;

  public String name;

  public String uid;

  /**
   * API version of the referent.
   */
  public OwnerReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
   */
  public OwnerReference blockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

  /**
   * If true, this reference points to the managing controller.
   */
  public OwnerReference controller(Boolean controller) {
    this.controller = controller;
    return this;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public OwnerReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names
   */
  public OwnerReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
   */
  public OwnerReference uid(String uid) {
    this.uid = uid;
    return this;
  }
}
