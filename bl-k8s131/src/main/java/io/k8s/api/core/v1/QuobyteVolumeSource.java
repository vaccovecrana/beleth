package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 */
public class QuobyteVolumeSource {
  public String group;

  public Boolean readOnly;

  public String registry;

  public String tenant;

  public String user;

  public String volume;

  /**
   * group to map volume access to Default is no group
   */
  public QuobyteVolumeSource group(String group) {
    this.group = group;
    return this;
  }

  /**
   * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
   */
  public QuobyteVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
   */
  public QuobyteVolumeSource registry(String registry) {
    this.registry = registry;
    return this;
  }

  /**
   * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
   */
  public QuobyteVolumeSource tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

  /**
   * user to map volume access to Defaults to serivceaccount user
   */
  public QuobyteVolumeSource user(String user) {
    this.user = user;
    return this;
  }

  /**
   * volume is a string that references an already created Quobyte volume by name.
   */
  public QuobyteVolumeSource volume(String volume) {
    this.volume = volume;
    return this;
  }

  public static QuobyteVolumeSource quobyteVolumeSource() {
    return new QuobyteVolumeSource();
  }
}
