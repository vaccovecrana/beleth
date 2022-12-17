
package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace. Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions checking.
 * 
 */
public class LocalSubjectAccessReview {

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
     * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
     * (Required)
     * 
     */
    public SubjectAccessReviewSpec spec;
    /**
     * SubjectAccessReviewStatus
     * 
     */
    public SubjectAccessReviewStatus status;

    public LocalSubjectAccessReview withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public LocalSubjectAccessReview withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public LocalSubjectAccessReview withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public LocalSubjectAccessReview withSpec(SubjectAccessReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public LocalSubjectAccessReview withStatus(SubjectAccessReviewStatus status) {
        this.status = status;
        return this;
    }

}
