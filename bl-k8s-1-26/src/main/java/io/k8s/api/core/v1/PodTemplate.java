package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * PodTemplate describes a template for creating copies of a predefined pod.
 */
public class PodTemplate {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public PodTemplateSpec template;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PodTemplate apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PodTemplate kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PodTemplate metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PodTemplate template(PodTemplateSpec template) {
    this.template = template;
    return this;
  }

  public static PodTemplate podTemplate() {
    return new PodTemplate();
  }
}
