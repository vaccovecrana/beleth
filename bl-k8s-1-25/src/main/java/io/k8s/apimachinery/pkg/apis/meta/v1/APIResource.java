
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * APIResource specifies the name of a resource and whether it is namespaced.
 * 
 */
public class APIResource {

    /**
     * categories is a list of the grouped resources this resource belongs to (e.g. 'all')
     * 
     */
    public List<String> categories;
    /**
     * group is the preferred group of the resource.  Empty implies the group of the containing resource list. For subresources, this may have a different value, for example: Scale".
     * 
     */
    public String group;
    /**
     * kind is the kind for the resource (e.g. 'Foo' is the kind for a resource 'foo')
     * (Required)
     * 
     */
    public String kind;
    /**
     * name is the plural name of the resource.
     * (Required)
     * 
     */
    public String name;
    /**
     * namespaced indicates if a resource is namespaced or not.
     * (Required)
     * 
     */
    public Boolean namespaced;
    /**
     * shortNames is a list of suggested short names of the resource.
     * 
     */
    public List<String> shortNames;
    /**
     * singularName is the singular name of the resource.  This allows clients to handle plural and singular opaquely. The singularName is more correct for reporting status on a single item and both singular and plural are allowed from the kubectl CLI interface.
     * (Required)
     * 
     */
    public String singularName;
    /**
     * The hash value of the storage version, the version this resource is converted to when written to the data store. Value must be treated as opaque by clients. Only equality comparison on the value is valid. This is an alpha feature and may change or be removed in the future. The field is populated by the apiserver only if the StorageVersionHash feature gate is enabled. This field will remain optional even if it graduates.
     * 
     */
    public String storageVersionHash;
    /**
     * verbs is a list of supported kube verbs (this includes get, list, watch, create, update, patch, delete, deletecollection, and proxy)
     * (Required)
     * 
     */
    public List<String> verbs;
    /**
     * version is the preferred version of the resource.  Empty implies the version of the containing resource list For subresources, this may have a different value, for example: v1 (while inside a v1beta1 version of the core resource's group)".
     * 
     */
    public String version;

    public APIResource withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public APIResource withGroup(String group) {
        this.group = group;
        return this;
    }

    public APIResource withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public APIResource withName(String name) {
        this.name = name;
        return this;
    }

    public APIResource withNamespaced(Boolean namespaced) {
        this.namespaced = namespaced;
        return this;
    }

    public APIResource withShortNames(List<String> shortNames) {
        this.shortNames = shortNames;
        return this;
    }

    public APIResource withSingularName(String singularName) {
        this.singularName = singularName;
        return this;
    }

    public APIResource withStorageVersionHash(String storageVersionHash) {
        this.storageVersionHash = storageVersionHash;
        return this;
    }

    public APIResource withVerbs(List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

    public APIResource withVersion(String version) {
        this.version = version;
        return this;
    }

}
