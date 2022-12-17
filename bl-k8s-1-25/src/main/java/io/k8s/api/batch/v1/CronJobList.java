
package io.k8s.api.batch.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;


/**
 * CronJobList is a collection of cron jobs.
 * 
 */
public class CronJobList {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * items is the list of CronJobs.
     * (Required)
     * 
     */
    public List<CronJob> items;
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

    public CronJobList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CronJobList withItems(List<CronJob> items) {
        this.items = items;
        return this;
    }

    public CronJobList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public CronJobList withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
