package io.k8s.api.scheduling.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 */
public class PriorityClass {
  public String apiVersion;

  public String description;

  public Boolean globalDefault;

  public String kind;

  public ObjectMeta metadata;

  public String preemptionPolicy;

  public Long value;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public PriorityClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
   */
  public PriorityClass description(String description) {
    this.description = description;
    return this;
  }

  /**
   * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
   */
  public PriorityClass globalDefault(Boolean globalDefault) {
    this.globalDefault = globalDefault;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public PriorityClass kind(String kind) {
    this.kind = kind;
    return this;
  }

  public PriorityClass metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * preemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset.
   */
  public PriorityClass preemptionPolicy(String preemptionPolicy) {
    this.preemptionPolicy = preemptionPolicy;
    return this;
  }

  /**
   * value represents the integer value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
   */
  public PriorityClass value(Long value) {
    this.value = value;
    return this;
  }

  public static PriorityClass priorityClass() {
    return new PriorityClass();
  }
}
