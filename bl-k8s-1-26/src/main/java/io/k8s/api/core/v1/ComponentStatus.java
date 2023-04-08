
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * ComponentStatus (and ComponentStatusList) holds the cluster validation info. Deprecated: This API is deprecated in v1.19+
 * 
 */
public class ComponentStatus {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * List of component conditions observed
     * 
     */
    public List<ComponentCondition> conditions;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;

    public ComponentStatus withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ComponentStatus withConditions(List<ComponentCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ComponentStatus withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ComponentStatus withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
