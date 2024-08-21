package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ImageVolumeSource represents a image volume resource.
 */
public class ImageVolumeSource {
  public String pullPolicy;

  public String reference;

  /**
   * Policy for pulling OCI objects. Possible values are: Always: the kubelet always attempts to pull the reference. Container creation will fail If the pull fails. Never: the kubelet never pulls the reference and only uses a local image or artifact. Container creation will fail if the reference isn&#39;t present. IfNotPresent: the kubelet pulls if the reference isn&#39;t already present on disk. Container creation will fail if the reference isn&#39;t present and the pull fails. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise.
   */
  public ImageVolumeSource pullPolicy(String pullPolicy) {
    this.pullPolicy = pullPolicy;
    return this;
  }

  /**
   * Required: Image or artifact reference to be used. Behaves in the same way as pod.spec.containers[<code>*</code>].image. Pull secrets will be assembled in the same way as for the container image by looking up node credentials, SA image pull secrets, and pod spec image pull secrets. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   */
  public ImageVolumeSource reference(String reference) {
    this.reference = reference;
    return this;
  }

  public static ImageVolumeSource imageVolumeSource() {
    return new ImageVolumeSource();
  }
}
