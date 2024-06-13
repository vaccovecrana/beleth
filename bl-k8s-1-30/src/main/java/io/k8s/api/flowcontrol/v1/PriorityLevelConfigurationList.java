package io.k8s.api.flowcontrol.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.
 */
public class PriorityLevelConfigurationList {
  public String apiVersion;

  public List<PriorityLevelConfiguration> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PriorityLevelConfigurationList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * `items` is a list of request-priorities.
   */
  public PriorityLevelConfigurationList items(List<PriorityLevelConfiguration> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PriorityLevelConfigurationList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PriorityLevelConfigurationList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static PriorityLevelConfigurationList priorityLevelConfigurationList() {
    return new PriorityLevelConfigurationList();
  }
}
