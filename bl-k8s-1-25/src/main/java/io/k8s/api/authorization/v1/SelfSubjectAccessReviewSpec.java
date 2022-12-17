
package io.k8s.api.authorization.v1;



/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 * 
 */
public class SelfSubjectAccessReviewSpec {

    /**
     * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
     * 
     */
    public NonResourceAttributes nonResourceAttributes;
    /**
     * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
     * 
     */
    public ResourceAttributes resourceAttributes;

    public SelfSubjectAccessReviewSpec withNonResourceAttributes(NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        return this;
    }

    public SelfSubjectAccessReviewSpec withResourceAttributes(ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

}
