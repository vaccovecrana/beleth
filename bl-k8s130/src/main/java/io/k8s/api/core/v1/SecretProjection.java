package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * Adapts a secret into a projected volume.
 *
 * The contents of the target Secret&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
 */
public class SecretProjection {
  public List<KeyToPath> items;

  public String name;

  public Boolean optional;

  /**
   * items if unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   */
  public SecretProjection items(List<KeyToPath> items) {
    this.items = items;
    return this;
  }

  /**
   * Name of the referent. This field is effectively required, but due to backwards compatibility is allowed to be empty. Instances of this type with an empty value here are almost certainly wrong. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public SecretProjection name(String name) {
    this.name = name;
    return this;
  }

  /**
   * optional field specify whether the Secret or its key must be defined
   */
  public SecretProjection optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  public static SecretProjection secretProjection() {
    return new SecretProjection();
  }
}
