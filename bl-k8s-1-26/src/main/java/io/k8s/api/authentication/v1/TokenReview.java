
package io.k8s.api.authentication.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.
 * 
 */
public class TokenReview {

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
     * TokenReviewSpec is a description of the token authentication request.
     * (Required)
     * 
     */
    public TokenReviewSpec spec;
    /**
     * TokenReviewStatus is the result of the token authentication request.
     * 
     */
    public TokenReviewStatus status;

    public TokenReview withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public TokenReview withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public TokenReview withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public TokenReview withSpec(TokenReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    public TokenReview withStatus(TokenReviewStatus status) {
        this.status = status;
        return this;
    }

}
