
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;


/**
 * ReplicationControllerList is a collection of replication controllers.
 * 
 */
public class ReplicationControllerList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * List of replication controllers. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
     * (Required)
     * 
     */
    public List<ReplicationController> items;
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

    public ReplicationControllerList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ReplicationControllerList withItems(List<ReplicationController> items) {
        this.items = items;
        return this;
    }

    public ReplicationControllerList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ReplicationControllerList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
