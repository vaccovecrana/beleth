
package io.k8s.api.autoscaling.v2;



/**
 * CrossVersionObjectReference contains enough information to let you identify the referred resource.
 * 
 */
public class CrossVersionObjectReference {

    /**
     * API version of the referent
     * 
     */
    public String apiVersion;
    /**
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * (Required)
     * 
     */
    public String kind;
    /**
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * (Required)
     * 
     */
    public String name;

    public CrossVersionObjectReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CrossVersionObjectReference withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public CrossVersionObjectReference withName(String name) {
        this.name = name;
        return this;
    }

}
