
package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;


/**
 * APIServiceList is a list of APIService objects.
 * 
 */
public class APIServiceList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Items is the list of APIService
     * (Required)
     * 
     */
    public List<APIService> items;
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

    public APIServiceList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public APIServiceList withItems(List<APIService> items) {
        this.items = items;
        return this;
    }

    public APIServiceList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public APIServiceList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
