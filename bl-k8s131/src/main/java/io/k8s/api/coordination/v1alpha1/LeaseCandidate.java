package io.k8s.api.coordination.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * LeaseCandidate defines a candidate for a Lease object. Candidates are created such that coordinated leader election will pick the best leader from the list of candidates.
 */
public class LeaseCandidate {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public LeaseCandidateSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public LeaseCandidate apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public LeaseCandidate kind(String kind) {
    this.kind = kind;
    return this;
  }

  public LeaseCandidate metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public LeaseCandidate spec(LeaseCandidateSpec spec) {
    this.spec = spec;
    return this;
  }

  public static LeaseCandidate leaseCandidate() {
    return new LeaseCandidate();
  }
}
