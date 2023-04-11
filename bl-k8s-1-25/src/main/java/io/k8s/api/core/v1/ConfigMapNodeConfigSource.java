package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node. This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
 */
public class ConfigMapNodeConfigSource {
  public String kubeletConfigKey;

  public String name;

  public String namespace;

  public String resourceVersion;

  public String uid;

  /**
   * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
   */
  public ConfigMapNodeConfigSource kubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
    return this;
  }

  /**
   * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
   */
  public ConfigMapNodeConfigSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
   */
  public ConfigMapNodeConfigSource namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   */
  public ConfigMapNodeConfigSource resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   */
  public ConfigMapNodeConfigSource uid(String uid) {
    this.uid = uid;
    return this;
  }
}
