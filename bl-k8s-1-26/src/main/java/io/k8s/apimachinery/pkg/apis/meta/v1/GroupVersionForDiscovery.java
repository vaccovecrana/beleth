package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;

/**
 * GroupVersion contains the &#34;group/version&#34; and &#34;version&#34; string of a version. It is made a struct to keep extensibility.
 */
public class GroupVersionForDiscovery {
  public String groupVersion;

  public String version;

  /**
   * groupVersion specifies the API group and version in the form &#34;group/version&#34;
   */
  public GroupVersionForDiscovery groupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return this;
  }

  /**
   * version specifies the version in the form of &#34;version&#34;. This is to save the clients the trouble of splitting the GroupVersion.
   */
  public GroupVersionForDiscovery version(String version) {
    this.version = version;
    return this;
  }
}
