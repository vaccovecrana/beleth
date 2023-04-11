package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * APIResource specifies the name of a resource and whether it is namespaced.
 */
public class APIResource {
  public List<String> categories;

  public String group;

  public String kind;

  public String name;

  public Boolean namespaced;

  public List<String> shortNames;

  public String singularName;

  public String storageVersionHash;

  public List<String> verbs;

  public String version;

  /**
   * categories is a list of the grouped resources this resource belongs to (e.g. &#39;all&#39;)
   */
  public APIResource categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * group is the preferred group of the resource.  Empty implies the group of the containing resource list. For subresources, this may have a different value, for example: Scale&#34;.
   */
  public APIResource group(String group) {
    this.group = group;
    return this;
  }

  /**
   * kind is the kind for the resource (e.g. &#39;Foo&#39; is the kind for a resource &#39;foo&#39;)
   */
  public APIResource kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * name is the plural name of the resource.
   */
  public APIResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * namespaced indicates if a resource is namespaced or not.
   */
  public APIResource namespaced(Boolean namespaced) {
    this.namespaced = namespaced;
    return this;
  }

  /**
   * shortNames is a list of suggested short names of the resource.
   */
  public APIResource shortNames(List<String> shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  /**
   * singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface.
   */
  public APIResource singularName(String singularName) {
    this.singularName = singularName;
    return this;
  }

  /**
   * The hash value of the storage version, the version this resource is converted to when written to the data store. Value must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This field will remain optional even if it graduates.
   */
  public APIResource storageVersionHash(String storageVersionHash) {
    this.storageVersionHash = storageVersionHash;
    return this;
  }

  /**
   * verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy)
   */
  public APIResource verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  /**
   * version is the preferred version of the resource.  Empty implies the version of the containing resource list For subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource&#39;s group)&#34;.
   */
  public APIResource version(String version) {
    this.version = version;
    return this;
  }
}
