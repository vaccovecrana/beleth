
package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * NetworkPolicy describes what network traffic is allowed for a set of Pods
 * 
 */
public class NetworkPolicy {

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
     * NetworkPolicySpec provides the specification of a NetworkPolicy
     * 
     */
    public NetworkPolicySpec spec;
    /**
     * NetworkPolicyStatus describe the current state of the NetworkPolicy.
     * 
     */
    public NetworkPolicyStatus status;

    public NetworkPolicy withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public NetworkPolicy withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public NetworkPolicy withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public NetworkPolicy withSpec(NetworkPolicySpec spec) {
        this.spec = spec;
        return this;
    }

    public NetworkPolicy withStatus(NetworkPolicyStatus status) {
        this.status = status;
        return this;
    }

}
