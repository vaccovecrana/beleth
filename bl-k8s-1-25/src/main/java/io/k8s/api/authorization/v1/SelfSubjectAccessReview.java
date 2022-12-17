
package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means "in all namespaces".  Self is a special case, because users should always be able to check whether they can perform an action
 * 
 */
public class SelfSubjectAccessReview {

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
     * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
     * (Required)
     * 
     */
    public SelfSubjectAccessReviewSpec spec;
    /**
     * SubjectAccessReviewStatus
     * 
     */
    public SubjectAccessReviewStatus status;

    public SelfSubjectAccessReview withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public SelfSubjectAccessReview withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public SelfSubjectAccessReview withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public SelfSubjectAccessReview withSpec(SelfSubjectAccessReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public SelfSubjectAccessReview withStatus(SubjectAccessReviewStatus status) {
        this.status = status;
        return this;
    }

}
