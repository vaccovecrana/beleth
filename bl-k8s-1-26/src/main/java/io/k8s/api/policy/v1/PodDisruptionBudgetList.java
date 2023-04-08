
package io.k8s.api.policy.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;


/**
 * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
 * 
 */
public class PodDisruptionBudgetList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Items is a list of PodDisruptionBudgets
     * (Required)
     * 
     */
    public List<PodDisruptionBudget> items;
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

    public PodDisruptionBudgetList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodDisruptionBudgetList withItems(List<PodDisruptionBudget> items) {
        this.items = items;
        return this;
    }

    public PodDisruptionBudgetList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public PodDisruptionBudgetList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
