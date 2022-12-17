
package io.k8s.api.core.v1;



/**
 * ObjectReference contains enough information to let you inspect or modify the referred object.
 * 
 */
public class ObjectReference {

    /**
     * API version of the referent.
     * 
     */
    public String apiVersion;
    /**
     * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: "spec.containers{name}" (where "name" refers to the name of the container that triggered the event) or if no container name is specified "spec.containers[2]" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object.
     * 
     */
    public String fieldPath;
    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public String name;
    /**
     * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
     * 
     */
    public String namespace;
    /**
     * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    public String resourceVersion;
    /**
     * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
     * 
     */
    public String uid;

    public ObjectReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ObjectReference withFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

    public ObjectReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ObjectReference withName(String name) {
        this.name = name;
        return this;
    }

    public ObjectReference withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ObjectReference withResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ObjectReference withUid(String uid) {
        this.uid = uid;
        return this;
    }

}
