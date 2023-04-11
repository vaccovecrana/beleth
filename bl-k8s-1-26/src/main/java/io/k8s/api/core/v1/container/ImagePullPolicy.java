package io.k8s.api.core.v1.container;

/**
 * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
 *
 * Possible enum values:
 *  - `&#34;Always&#34;` means that kubelet always attempts to pull the latest image. Container will fail If the pull fails.
 *  - `&#34;IfNotPresent&#34;` means that kubelet pulls if the image isn&#39;t present on disk. Container will fail if the image isn&#39;t present and the pull fails.
 *  - `&#34;Never&#34;` means that kubelet never pulls an image, but only uses a local image. Container will fail if the image isn&#39;t present
 */
public enum ImagePullPolicy {
  Always,

  IfNotPresent,

  Never
}
