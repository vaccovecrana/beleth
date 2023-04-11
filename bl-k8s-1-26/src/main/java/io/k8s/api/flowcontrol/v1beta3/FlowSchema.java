package io.k8s.api.flowcontrol.v1beta3;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * FlowSchema defines the schema of a group of flows. Note that a flow is made up of a set of inbound API requests with similar attributes and is identified by a pair of strings: the name of the FlowSchema and a &#34;flow distinguisher&#34;.
 */
public class FlowSchema {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public FlowSchemaSpec spec;

  public FlowSchemaStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public FlowSchema apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public FlowSchema kind(String kind) {
    this.kind = kind;
    return this;
  }

  public FlowSchema metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public FlowSchema spec(FlowSchemaSpec spec) {
    this.spec = spec;
    return this;
  }

  public FlowSchema status(FlowSchemaStatus status) {
    this.status = status;
    return this;
  }
}
