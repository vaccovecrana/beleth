
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
 * 
 */
public class Preconditions {

    /**
     * Specifies the target ResourceVersion
     * 
     */
    public String resourceVersion;
    /**
     * Specifies the target UID.
     * 
     */
    public String uid;

    public Preconditions withResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public Preconditions withUid(String uid) {
        this.uid = uid;
        return this;
    }

}
