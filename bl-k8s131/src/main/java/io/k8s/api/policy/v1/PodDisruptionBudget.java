package io.k8s.api.policy.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
 */
public class PodDisruptionBudget {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public PodDisruptionBudgetSpec spec;

  public PodDisruptionBudgetStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PodDisruptionBudget apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PodDisruptionBudget kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PodDisruptionBudget metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public PodDisruptionBudget spec(PodDisruptionBudgetSpec spec) {
    this.spec = spec;
    return this;
  }

  public PodDisruptionBudget status(PodDisruptionBudgetStatus status) {
    this.status = status;
    return this;
  }

  public static PodDisruptionBudget podDisruptionBudget() {
    return new PodDisruptionBudget();
  }
}
