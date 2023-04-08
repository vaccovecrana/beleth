
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
 * 
 */
public class OwnerReference {

    /**
     * API version of the referent.
     * (Required)
     * 
     */
    public String apiVersion;
    /**
     * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
     * 
     */
    public Boolean blockOwnerDeletion;
    /**
     * If true, this reference points to the managing controller.
     * 
     */
    public Boolean controller;
    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * (Required)
     * 
     */
    public String kind;
    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * (Required)
     * 
     */
    public String name;
    /**
     * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * (Required)
     * 
     */
    public String uid;

    public OwnerReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public OwnerReference withBlockOwnerDeletion(Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
        return this;
    }

    public OwnerReference withController(Boolean controller) {
        this.controller = controller;
        return this;
    }

    public OwnerReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public OwnerReference withName(String name) {
        this.name = name;
        return this;
    }

    public OwnerReference withUid(String uid) {
        this.uid = uid;
        return this;
    }

}
