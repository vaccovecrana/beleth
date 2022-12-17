
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.
 * 
 */
public class APIResourceList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * groupVersion is the group and version this APIResourceList is for.
     * (Required)
     * 
     */
    public String groupVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * resources contains the name of the resources and if they are namespaced.
     * (Required)
     * 
     */
    public List<APIResource> resources;

    public APIResourceList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIResourceList withGroupVersion(String groupVersion) {
        this.groupVersion = groupVersion;
        return this;
    }

    public APIResourceList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public APIResourceList withResources(List<APIResource> resources) {
        this.resources = resources;
        return this;
    }

}
