package io.k8s.api.coordination.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * LeaseCandidateList is a list of Lease objects.
 */
public class LeaseCandidateList {
  public String apiVersion;

  public List<LeaseCandidate> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public LeaseCandidateList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * items is a list of schema objects.
   */
  public LeaseCandidateList items(List<LeaseCandidate> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public LeaseCandidateList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public LeaseCandidateList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static LeaseCandidateList leaseCandidateList() {
    return new LeaseCandidateList();
  }
}
