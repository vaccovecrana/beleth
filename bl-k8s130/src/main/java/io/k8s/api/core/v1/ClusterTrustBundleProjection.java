package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.Boolean;
import java.lang.String;

/**
 * ClusterTrustBundleProjection describes how to select a set of ClusterTrustBundle objects and project their contents into the pod filesystem.
 */
public class ClusterTrustBundleProjection {
  public LabelSelector labelSelector;

  public String name;

  public Boolean optional;

  public String path;

  public String signerName;

  public ClusterTrustBundleProjection labelSelector(LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * Select a single ClusterTrustBundle by object name.  Mutually-exclusive with signerName and labelSelector.
   */
  public ClusterTrustBundleProjection name(String name) {
    this.name = name;
    return this;
  }

  /**
   * If true, don&#39;t block pod startup if the referenced ClusterTrustBundle(s) aren&#39;t available.  If using name, then the named ClusterTrustBundle is allowed not to exist.  If using signerName, then the combination of signerName and labelSelector is allowed to match zero ClusterTrustBundles.
   */
  public ClusterTrustBundleProjection optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  /**
   * Relative path from the volume root to write the bundle.
   */
  public ClusterTrustBundleProjection path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Select all ClusterTrustBundles that match this signer name. Mutually-exclusive with name.  The contents of all selected ClusterTrustBundles will be unified and deduplicated.
   */
  public ClusterTrustBundleProjection signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  public static ClusterTrustBundleProjection clusterTrustBundleProjection() {
    return new ClusterTrustBundleProjection();
  }
}
