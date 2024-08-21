package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 */
public class ObjectFieldSelector {
  public String apiVersion;

  public String fieldPath;

  /**
   * Version of the schema the FieldPath is written in terms of, defaults to &#34;v1&#34;.
   */
  public ObjectFieldSelector apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Path of the field to select in the specified API version.
   */
  public ObjectFieldSelector fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  public static ObjectFieldSelector objectFieldSelector() {
    return new ObjectFieldSelector();
  }
}
