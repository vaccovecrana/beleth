
package io.k8s.api.node.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
 * 
 */
public class RuntimeClass {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * (Required)
     * 
     */
    public String handler;
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
     * Overhead structure represents the resource overhead associated with running a pod.
     * 
     */
    public Overhead overhead;
    /**
     * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
     * 
     */
    public Scheduling scheduling;

    public RuntimeClass withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public RuntimeClass withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    public RuntimeClass withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public RuntimeClass withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public RuntimeClass withOverhead(Overhead overhead) {
        this.overhead = overhead;
        return this;
    }

    public RuntimeClass withScheduling(Scheduling scheduling) {
        this.scheduling = scheduling;
        return this;
    }

}
