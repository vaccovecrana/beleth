package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ObjectReference contains enough information to let you inspect or modify the referred object.
 */
public class ObjectReference {
  public String apiVersion;

  public String fieldPath;

  public String kind;

  public String name;

  public String namespace;

  public String resourceVersion;

  public String uid;

  /**
   * API version of the referent.
   */
  public ObjectReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: &#34;spec.containers{name}&#34; (where &#34;name&#34; refers to the name of the container that triggered the event) or if no container name is specified &#34;spec.containers[2]&#34; (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
   */
  public ObjectReference fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public ObjectReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
   */
  public ObjectReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   */
  public ObjectReference resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
   */
  public ObjectReference uid(String uid) {
    this.uid = uid;
    return this;
  }
}
