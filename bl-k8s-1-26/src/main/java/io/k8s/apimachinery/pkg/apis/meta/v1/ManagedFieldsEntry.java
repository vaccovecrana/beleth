package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
public class ManagedFieldsEntry {
  public String apiVersion;

  public String fieldsType;

  public FieldsV1 fieldsV1;

  public String manager;

  public String operation;

  public String subresource;

  public String time;

  /**
   * APIVersion defines the version of this resource that this field set applies to. The format is &#34;group/version&#34; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   */
  public ManagedFieldsEntry apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: &#34;FieldsV1&#34;
   */
  public ManagedFieldsEntry fieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
    return this;
  }

  public ManagedFieldsEntry fieldsV1(FieldsV1 fieldsV1) {
    this.fieldsV1 = fieldsV1;
    return this;
  }

  /**
   * Manager is an identifier of the workflow managing these fields.
   */
  public ManagedFieldsEntry manager(String manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   */
  public ManagedFieldsEntry operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
   */
  public ManagedFieldsEntry subresource(String subresource) {
    this.subresource = subresource;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ManagedFieldsEntry time(String time) {
    this.time = time;
    return this;
  }
}
