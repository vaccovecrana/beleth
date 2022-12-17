
package io.k8s.api.authorization.v1;

import java.util.List;


/**
 * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
 * 
 */
public class SubjectAccessReviewSpec {

    /**
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
     * 
     */
    public Extra extra;
    /**
     * Groups is the groups you're testing for.
     * 
     */
    public List<String> groups;
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
    /**
     * UID information about the requesting user.
     * 
     */
    public String uid;
    /**
     * User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
     * 
     */
    public String user;

    public SubjectAccessReviewSpec withExtra(Extra extra) {
        this.extra = extra;
        return this;
    }

    public SubjectAccessReviewSpec withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public SubjectAccessReviewSpec withNonResourceAttributes(NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        return this;
    }

    public SubjectAccessReviewSpec withResourceAttributes(ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

    public SubjectAccessReviewSpec withUid(String uid) {
        this.uid = uid;
        return this;
    }

    public SubjectAccessReviewSpec withUser(String user) {
        this.user = user;
        return this;
    }

}
