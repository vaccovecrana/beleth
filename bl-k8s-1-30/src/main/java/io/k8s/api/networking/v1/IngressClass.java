package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * IngressClass represents the class of the Ingress, referenced by the Ingress Spec. The `ingressclass.kubernetes.io/is-default-class` annotation can be used to indicate that an IngressClass should be considered default. When a single IngressClass resource has this annotation set to true, new Ingress resources without a class specified will be assigned this default class.
 */
public class IngressClass {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public IngressClassSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public IngressClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public IngressClass kind(String kind) {
    this.kind = kind;
    return this;
  }

  public IngressClass metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public IngressClass spec(IngressClassSpec spec) {
    this.spec = spec;
    return this;
  }
}
