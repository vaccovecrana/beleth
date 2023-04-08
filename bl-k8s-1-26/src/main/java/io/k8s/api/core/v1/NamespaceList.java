
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;


/**
 * NamespaceList is a list of Namespaces.
 * 
 */
public class NamespaceList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Items is the list of Namespace objects in the list. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
     * (Required)
     * 
     */
    public List<Namespace> items;
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

    public NamespaceList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public NamespaceList withItems(List<Namespace> items) {
        this.items = items;
        return this;
    }

    public NamespaceList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public NamespaceList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
