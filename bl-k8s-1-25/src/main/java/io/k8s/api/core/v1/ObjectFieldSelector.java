
package io.k8s.api.core.v1;



/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 * 
 */
public class ObjectFieldSelector {

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    public String apiVersion;
    /**
     * Path of the field to select in the specified API version.
     * (Required)
     * 
     */
    public String fieldPath;

    public ObjectFieldSelector withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ObjectFieldSelector withFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

}
