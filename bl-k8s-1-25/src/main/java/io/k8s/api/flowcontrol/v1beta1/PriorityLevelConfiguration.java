package io.k8s.api.flowcontrol.v1beta1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * PriorityLevelConfiguration represents the configuration of a priority level.
 */
public class PriorityLevelConfiguration {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public PriorityLevelConfigurationSpec spec;

  public PriorityLevelConfigurationStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PriorityLevelConfiguration apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PriorityLevelConfiguration kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PriorityLevelConfiguration metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PriorityLevelConfiguration spec(PriorityLevelConfigurationSpec spec) {
    this.spec = spec;
    return this;
  }

  public PriorityLevelConfiguration status(PriorityLevelConfigurationStatus status) {
    this.status = status;
    return this;
  }
}
