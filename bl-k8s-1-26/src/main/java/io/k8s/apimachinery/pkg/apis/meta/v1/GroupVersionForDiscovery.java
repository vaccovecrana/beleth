
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * GroupVersion contains the "group/version" and "version" string of a version. It is made a struct to keep extensibility.
 * 
 */
public class GroupVersionForDiscovery {

    /**
     * groupVersion specifies the API group and version in the form "group/version"
     * (Required)
     * 
     */
    public String groupVersion;
    /**
     * version specifies the version in the form of "version". This is to save the clients the trouble of splitting the GroupVersion.
     * (Required)
     * 
     */
    public String version;

    public GroupVersionForDiscovery withGroupVersion(String groupVersion) {
        this.groupVersion = groupVersion;
        return this;
    }

    public GroupVersionForDiscovery withVersion(String version) {
        this.version = version;
        return this;
    }

}
