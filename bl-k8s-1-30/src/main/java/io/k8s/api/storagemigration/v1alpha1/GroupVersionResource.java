package io.k8s.api.storagemigration.v1alpha1;

import java.lang.String;

/**
 * The names of the group, the version, and the resource.
 */
public class GroupVersionResource {
  public String group;

  public String resource;

  public String version;

  /**
   * The name of the group.
   */
  public GroupVersionResource group(String group) {
    this.group = group;
    return this;
  }

  /**
   * The name of the resource.
   */
  public GroupVersionResource resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The name of the version.
   */
  public GroupVersionResource version(String version) {
    this.version = version;
    return this;
  }
}
