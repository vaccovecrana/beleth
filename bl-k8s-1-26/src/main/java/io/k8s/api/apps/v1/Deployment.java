
package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Deployment enables declarative updates for Pods and ReplicaSets.
 * 
 */
public class Deployment {

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
     * DeploymentSpec is the specification of the desired behavior of the Deployment.
     * 
     */
    public DeploymentSpec spec;
    /**
     * DeploymentStatus is the most recently observed status of the Deployment.
     * 
     */
    public DeploymentStatus status;

    public Deployment withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Deployment withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Deployment withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Deployment withSpec(DeploymentSpec spec) {
        this.spec = spec;
        return this;
    }

    public Deployment withStatus(DeploymentStatus status) {
        this.status = status;
        return this;
    }

}
