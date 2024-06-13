package io.k8s.api.certificates.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ClusterTrustBundle is a cluster-scoped container for X.509 trust anchors (root certificates).
 *
 * ClusterTrustBundle objects are considered to be readable by any authenticated user in the cluster, because they can be mounted by pods using the `clusterTrustBundle` projection.  All service accounts have read access to ClusterTrustBundles by default.  Users who only have namespace-level access to a cluster can read ClusterTrustBundles by impersonating a serviceaccount that they have access to.
 *
 * It can be optionally associated with a particular assigner, in which case it contains one valid set of trust anchors for that signer. Signers may have multiple associated ClusterTrustBundles; each is an independent set of trust anchors for that signer. Admission control is used to enforce that only users with permissions on the signer can create or modify the corresponding bundle.
 */
public class ClusterTrustBundle {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public ClusterTrustBundleSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ClusterTrustBundle apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ClusterTrustBundle kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ClusterTrustBundle metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ClusterTrustBundle spec(ClusterTrustBundleSpec spec) {
    this.spec = spec;
    return this;
  }

  public static ClusterTrustBundle clusterTrustBundle() {
    return new ClusterTrustBundle();
  }
}
