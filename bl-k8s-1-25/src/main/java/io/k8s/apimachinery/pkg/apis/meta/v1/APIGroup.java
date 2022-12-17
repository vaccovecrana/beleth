
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * APIGroup contains the name, the supported versions, and the preferred version of a group.
 * 
 */
public class APIGroup {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * name is the name of the group.
     * (Required)
     * 
     */
    public String name;
    /**
     * GroupVersion contains the "group/version" and "version" string of a version. It is made a struct to keep extensibility.
     * 
     */
    public GroupVersionForDiscovery preferredVersion;
    /**
     * a map of client CIDR to server address that is serving this group. This is to help clients reach servers in the most network-efficient way possible. Clients can use the appropriate server address as per the CIDR that they match. In case of multiple matches, clients should use the longest matching CIDR. The server returns only those CIDRs that it thinks that the client can match. For example: the master will return an internal IP CIDR only, if the client reaches the server using an internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
     * 
     */
    public List<ServerAddressByClientCIDR> serverAddressByClientCIDRs;
    /**
     * versions are the versions supported in this group.
     * (Required)
     * 
     */
    public List<GroupVersionForDiscovery> versions;

    public APIGroup withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIGroup withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public APIGroup withName(String name) {
        this.name = name;
        return this;
    }

    public APIGroup withPreferredVersion(GroupVersionForDiscovery preferredVersion) {
        this.preferredVersion = preferredVersion;
        return this;
    }

    public APIGroup withServerAddressByClientCIDRs(List<ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
        return this;
    }

    public APIGroup withVersions(List<GroupVersionForDiscovery> versions) {
        this.versions = versions;
        return this;
    }

}
