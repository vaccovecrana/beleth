package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
 *   - Network: A single stable DNS and hostname.
 *   - Storage: As many VolumeClaims as requested.
 *
 * The StatefulSet guarantees that a given network identity will always map to the same storage identity.
 */
public class StatefulSet {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public StatefulSetSpec spec;

  public StatefulSetStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public StatefulSet apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public StatefulSet kind(String kind) {
    this.kind = kind;
    return this;
  }

  public StatefulSet metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public StatefulSet spec(StatefulSetSpec spec) {
    this.spec = spec;
    return this;
  }

  public StatefulSet status(StatefulSetStatus status) {
    this.status = status;
    return this;
  }
}
