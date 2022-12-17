
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
 * 
 */
public class APIGroupList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * groups is a list of APIGroup.
     * (Required)
     * 
     */
    public List<APIGroup> groups;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;

    public APIGroupList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIGroupList withGroups(List<APIGroup> groups) {
        this.groups = groups;
        return this;
    }

    public APIGroupList withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
