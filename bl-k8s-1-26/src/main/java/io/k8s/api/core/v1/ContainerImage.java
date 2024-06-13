package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * Describe a container image
 */
public class ContainerImage {
  public List<String> names;

  public Long sizeBytes;

  /**
   * Names by which this image is known. e.g. [&#34;kubernetes.example/hyperkube:v1.0.7&#34;, &#34;cloud-vendor.registry.example/cloud-vendor/hyperkube:v1.0.7&#34;]
   */
  public ContainerImage names(List<String> names) {
    this.names = names;
    return this;
  }

  /**
   * The size of the image in bytes.
   */
  public ContainerImage sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  public static ContainerImage containerImage() {
    return new ContainerImage();
  }
}
