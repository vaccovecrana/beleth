package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * ComponentStatus (and ComponentStatusList) holds the cluster validation info. Deprecated: This API is deprecated in v1.19+
 */
public class ComponentStatus {
  public String apiVersion;

  public List<ComponentCondition> conditions;

  public String kind;

  public ObjectMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ComponentStatus apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * List of component conditions observed
   */
  public ComponentStatus conditions(List<ComponentCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ComponentStatus kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ComponentStatus metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }
}
