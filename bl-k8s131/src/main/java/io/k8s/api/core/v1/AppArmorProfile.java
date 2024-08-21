package io.k8s.api.core.v1;

import java.lang.String;

/**
 * AppArmorProfile defines a pod or container&#39;s AppArmor settings.
 */
public class AppArmorProfile {
  public String localhostProfile;

  public String type;

  /**
   * localhostProfile indicates a profile loaded on the node that should be used. The profile must be preconfigured on the node to work. Must match the loaded name of the profile. Must be set if and only if type is &#34;Localhost&#34;.
   */
  public AppArmorProfile localhostProfile(String localhostProfile) {
    this.localhostProfile = localhostProfile;
    return this;
  }

  /**
   * type indicates which kind of AppArmor profile will be applied. Valid options are:
   *   Localhost - a profile pre-loaded on the node.
   *   RuntimeDefault - the container runtime&#39;s default profile.
   *   Unconfined - no AppArmor enforcement.
   */
  public AppArmorProfile type(String type) {
    this.type = type;
    return this;
  }

  public static AppArmorProfile appArmorProfile() {
    return new AppArmorProfile();
  }
}
