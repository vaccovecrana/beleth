package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Deployment enables declarative updates for Pods and ReplicaSets.
 */
public class Deployment {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public DeploymentSpec spec;

  public DeploymentStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Deployment apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Deployment kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Deployment metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public Deployment spec(DeploymentSpec spec) {
    this.spec = spec;
    return this;
  }

  public Deployment status(DeploymentStatus status) {
    this.status = status;
    return this;
  }
}
