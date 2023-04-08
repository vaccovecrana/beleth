
package io.k8s.api.flowcontrol.v1beta3;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * FlowSchema defines the schema of a group of flows. Note that a flow is made up of a set of inbound API requests with similar attributes and is identified by a pair of strings: the name of the FlowSchema and a "flow distinguisher".
 * 
 */
public class FlowSchema {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
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
    /**
     * FlowSchemaSpec describes how the FlowSchema's specification looks like.
     * 
     */
    public FlowSchemaSpec spec;
    /**
     * FlowSchemaStatus represents the current state of a FlowSchema.
     * 
     */
    public FlowSchemaStatus status;

    public FlowSchema withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public FlowSchema withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public FlowSchema withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public FlowSchema withSpec(FlowSchemaSpec spec) {
        this.spec = spec;
        return this;
    }

    public FlowSchema withStatus(FlowSchemaStatus status) {
        this.status = status;
        return this;
    }

}
