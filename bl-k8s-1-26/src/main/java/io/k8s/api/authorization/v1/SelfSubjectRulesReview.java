
package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a namespace. The returned list of actions may be incomplete depending on the server's authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview should be used by UIs to show/hide actions, or to quickly let an end user reason about their permissions. It should NOT Be used by external systems to drive authorization decisions as this raises confused deputy, cache lifetime/revocation, and correctness concerns. SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization decisions to the API server.
 * 
 */
public class SelfSubjectRulesReview {

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
     * SelfSubjectRulesReviewSpec defines the specification for SelfSubjectRulesReview.
     * (Required)
     * 
     */
    public SelfSubjectRulesReviewSpec spec;
    /**
     * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.
     * 
     */
    public SubjectRulesReviewStatus status;

    public SelfSubjectRulesReview withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public SelfSubjectRulesReview withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public SelfSubjectRulesReview withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public SelfSubjectRulesReview withSpec(SelfSubjectRulesReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public SelfSubjectRulesReview withStatus(SubjectRulesReviewStatus status) {
        this.status = status;
        return this;
    }

}
