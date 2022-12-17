
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 * 
 */
public class ManagedFieldsEntry {

    /**
     * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     * 
     */
    public String apiVersion;
    /**
     * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
     * 
     */
    public String fieldsType;
    /**
     * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.
     * 
     * Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.
     * 
     * The exact format is defined in sigs.k8s.io/structured-merge-diff
     * 
     */
    public FieldsV1 fieldsV1;
    /**
     * Manager is an identifier of the workflow managing these fields.
     * 
     */
    public String manager;
    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
     * 
     */
    public String operation;
    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     * 
     */
    public String subresource;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String time;

    public ManagedFieldsEntry withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ManagedFieldsEntry withFieldsType(String fieldsType) {
        this.fieldsType = fieldsType;
        return this;
    }

    public ManagedFieldsEntry withFieldsV1(FieldsV1 fieldsV1) {
        this.fieldsV1 = fieldsV1;
        return this;
    }

    public ManagedFieldsEntry withManager(String manager) {
        this.manager = manager;
        return this;
    }

    public ManagedFieldsEntry withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public ManagedFieldsEntry withSubresource(String subresource) {
        this.subresource = subresource;
        return this;
    }

    public ManagedFieldsEntry withTime(String time) {
        this.time = time;
        return this;
    }

}
