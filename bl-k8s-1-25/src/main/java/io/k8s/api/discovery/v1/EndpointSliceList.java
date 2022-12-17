
package io.k8s.api.discovery.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;


/**
 * EndpointSliceList represents a list of endpoint slices
 * 
 */
public class EndpointSliceList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * List of endpoint slices
     * (Required)
     * 
     */
    public List<EndpointSlice> items;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
     * 
     */
    public ListMeta metadata;

    public EndpointSliceList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public EndpointSliceList withItems(List<EndpointSlice> items) {
        this.items = items;
        return this;
    }

    public EndpointSliceList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public EndpointSliceList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
