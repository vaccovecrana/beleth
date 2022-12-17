
package io.k8s.api.storage.v1;

import java.util.List;
import io.k8s.api.core.v1.TopologySelectorTerm;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 * 
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 * 
 */
public class StorageClass {

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
     */
    public Boolean allowVolumeExpansion;
    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    public List<TopologySelectorTerm> allowedTopologies;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    public List<String> mountOptions;
    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
     */
    public Parameters parameters;
    /**
     * Provisioner indicates the type of the provisioner.
     * (Required)
     * 
     */
    public String provisioner;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    public String reclaimPolicy;
    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    public String volumeBindingMode;

    public StorageClass withAllowVolumeExpansion(Boolean allowVolumeExpansion) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        return this;
    }

    public StorageClass withAllowedTopologies(List<TopologySelectorTerm> allowedTopologies) {
        this.allowedTopologies = allowedTopologies;
        return this;
    }

    public StorageClass withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public StorageClass withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public StorageClass withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public StorageClass withMountOptions(List<String> mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    public StorageClass withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public StorageClass withProvisioner(String provisioner) {
        this.provisioner = provisioner;
        return this;
    }

    public StorageClass withReclaimPolicy(String reclaimPolicy) {
        this.reclaimPolicy = reclaimPolicy;
        return this;
    }

    public StorageClass withVolumeBindingMode(String volumeBindingMode) {
        this.volumeBindingMode = volumeBindingMode;
        return this;
    }

}
