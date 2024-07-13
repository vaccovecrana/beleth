package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * Adapts a ConfigMap into a projected volume.
 *
 * The contents of the target ConfigMap&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
 */
public class ConfigMapProjection {
  public List<KeyToPath> items;

  public String name;

  public Boolean optional;

  /**
   * items if unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   */
  public ConfigMapProjection items(List<KeyToPath> items) {
    this.items = items;
    return this;
  }

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public ConfigMapProjection name(String name) {
    this.name = name;
    return this;
  }

  /**
   * optional specify whether the ConfigMap or its keys must be defined
   */
  public ConfigMapProjection optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  public static ConfigMapProjection configMapProjection() {
    return new ConfigMapProjection();
  }
}
