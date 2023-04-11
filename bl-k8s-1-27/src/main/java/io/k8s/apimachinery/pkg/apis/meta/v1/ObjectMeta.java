package io.k8s.apimachinery.pkg.apis.meta.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Annotations;
import io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Labels;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 */
public class ObjectMeta {
  public Annotations annotations;

  public String creationTimestamp;

  public Long deletionGracePeriodSeconds;

  public String deletionTimestamp;

  public List<String> finalizers;

  public String generateName;

  public Long generation;

  public Labels labels;

  public List<ManagedFieldsEntry> managedFields;

  public String name;

  public String namespace;

  public List<OwnerReference> ownerReferences;

  public String resourceVersion;

  public String selfLink;

  public String uid;

  /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/annotations
   */
  public ObjectMeta annotations(Annotations annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ObjectMeta creationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
   */
  public ObjectMeta deletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public ObjectMeta deletionTimestamp(String deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

  /**
   * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed. Finalizers may be processed and removed in any order.  Order is NOT enforced because it introduces significant risk of stuck finalizers. finalizers is a shared field, any actor with permission can reorder it. If the finalizer list is processed in order, then this can lead to a situation in which the component responsible for the first finalizer in the list is waiting for a signal (field value, external system, or other) produced by a component responsible for a finalizer later in the list, resulting in a deadlock. Without enforced ordering finalizers are free to order amongst themselves and are not vulnerable to ordering changes in the list.
   */
  public ObjectMeta finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  /**
   * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.
   *
   * If this field is specified and the generated name exists, the server will return a 409.
   *
   * Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#idempotency
   */
  public ObjectMeta generateName(String generateName) {
    this.generateName = generateName;
    return this;
  }

  /**
   * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
   */
  public ObjectMeta generation(Long generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels
   */
  public ObjectMeta labels(Labels labels) {
    this.labels = labels;
    return this;
  }

  /**
   * ManagedFields maps workflow-id and version to the set of fields that are managed by that workflow. This is mostly for internal housekeeping, and users typically shouldn&#39;t need to set or understand this field. A workflow can be the user&#39;s name, a controller&#39;s name, or the name of a specific apply path like &#34;ci-cd&#34;. The set of fields is always in the version that the workflow used when modifying the object.
   */
  public ObjectMeta managedFields(List<ManagedFieldsEntry> managedFields) {
    this.managedFields = managedFields;
    return this;
  }

  /**
   * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#names
   */
  public ObjectMeta name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace defines the space within which each name must be unique. An empty namespace is equivalent to the &#34;default&#34; namespace, but &#34;default&#34; is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.
   *
   * Must be a DNS_LABEL. Cannot be updated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces
   */
  public ObjectMeta namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
   */
  public ObjectMeta ownerReferences(List<OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  /**
   * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.
   *
   * Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   */
  public ObjectMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
   */
  public ObjectMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.
   *
   * Populated by the system. Read-only. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names#uids
   */
  public ObjectMeta uid(String uid) {
    this.uid = uid;
    return this;
  }
}
