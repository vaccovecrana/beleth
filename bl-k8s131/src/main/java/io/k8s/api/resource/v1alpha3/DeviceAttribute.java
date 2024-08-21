package io.k8s.api.resource.v1alpha3;

import com.google.gson.annotations.SerializedName;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * DeviceAttribute must have exactly one field set.
 */
public class DeviceAttribute {
  public Boolean bool;

  @SerializedName("int")
  public Long vInt;

  public String string;

  public String version;

  /**
   * BoolValue is a true/false value.
   */
  public DeviceAttribute bool(Boolean bool) {
    this.bool = bool;
    return this;
  }

  /**
   * IntValue is a number.
   */
  public DeviceAttribute vInt(Long vInt) {
    this.vInt = vInt;
    return this;
  }

  /**
   * StringValue is a string. Must not be longer than 64 characters.
   */
  public DeviceAttribute string(String string) {
    this.string = string;
    return this;
  }

  /**
   * VersionValue is a semantic version according to semver.org spec 2.0.0. Must not be longer than 64 characters.
   */
  public DeviceAttribute version(String version) {
    this.version = version;
    return this;
  }

  public static DeviceAttribute deviceAttribute() {
    return new DeviceAttribute();
  }
}
