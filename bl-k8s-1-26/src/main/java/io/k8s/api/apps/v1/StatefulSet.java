
package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
 *   - Network: A single stable DNS and hostname.
 *   - Storage: As many VolumeClaims as requested.
 * 
 * The StatefulSet guarantees that a given network identity will always map to the same storage identity.
 * 
 */
public class StatefulSet {

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
     * A StatefulSetSpec is the specification of a StatefulSet.
     * 
     */
    public StatefulSetSpec spec;
    /**
     * StatefulSetStatus represents the current state of a StatefulSet.
     * 
     */
    public StatefulSetStatus status;

    public StatefulSet withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public StatefulSet withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public StatefulSet withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public StatefulSet withSpec(StatefulSetSpec spec) {
        this.spec = spec;
        return this;
    }

    public StatefulSet withStatus(StatefulSetStatus status) {
        this.status = status;
        return this;
    }

}
