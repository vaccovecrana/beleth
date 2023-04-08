
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;


/**
 * ServiceList holds a list of services.
 * 
 */
public class ServiceList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * List of services
     * (Required)
     * 
     */
    public List<Service> items;
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

    public ServiceList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ServiceList withItems(List<Service> items) {
        this.items = items;
        return this;
    }

    public ServiceList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ServiceList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
