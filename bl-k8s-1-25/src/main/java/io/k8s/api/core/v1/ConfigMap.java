package io.k8s.api.core.v1;

import io.k8s.api.core.v1.configmap.BinaryData;
import io.k8s.api.core.v1.configmap.Data;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;

/**
 * ConfigMap holds configuration data for pods to consume.
 */
public class ConfigMap {
  public String apiVersion;

  public BinaryData binaryData;

  public Data data;

  public Boolean immutable;

  public String kind;

  public ObjectMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ConfigMap apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * BinaryData contains the binary data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
   */
  public ConfigMap binaryData(BinaryData binaryData) {
    this.binaryData = binaryData;
    return this;
  }

  /**
   * Data contains the configuration data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
   */
  public ConfigMap data(Data data) {
    this.data = data;
    return this;
  }

  /**
   * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
   */
  public ConfigMap immutable(Boolean immutable) {
    this.immutable = immutable;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ConfigMap kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ConfigMap metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }
}
