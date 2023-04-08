
package io.k8s.api.authentication.v1;



/**
 * BoundObjectReference is a reference to an object that a token is bound to.
 * 
 */
public class BoundObjectReference {

    /**
     * API version of the referent.
     * 
     */
    public String apiVersion;
    /**
     * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
     * 
     */
    public String kind;
    /**
     * Name of the referent.
     * 
     */
    public String name;
    /**
     * UID of the referent.
     * 
     */
    public String uid;

    public BoundObjectReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public BoundObjectReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public BoundObjectReference withName(String name) {
        this.name = name;
        return this;
    }

    public BoundObjectReference withUid(String uid) {
        this.uid = uid;
        return this;
    }

}
