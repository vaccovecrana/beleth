package io.k8s.api.storage.v1;

import io.k8s.api.core.v1.TopologySelectorTerm;
import io.k8s.api.storage.v1.storageclass.Parameters;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 *
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
public class StorageClass {
  public Boolean allowVolumeExpansion;

  public List<TopologySelectorTerm> allowedTopologies;

  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public List<String> mountOptions;

  public Parameters parameters;

  public String provisioner;

  public String reclaimPolicy;

  public String volumeBindingMode;

  /**
   * allowVolumeExpansion shows whether the storage class allow volume expand.
   */
  public StorageClass allowVolumeExpansion(Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion = allowVolumeExpansion;
    return this;
  }

  /**
   * allowedTopologies restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
   */
  public StorageClass allowedTopologies(List<TopologySelectorTerm> allowedTopologies) {
    this.allowedTopologies = allowedTopologies;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public StorageClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public StorageClass kind(String kind) {
    this.kind = kind;
    return this;
  }

  public StorageClass metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * mountOptions controls the mountOptions for dynamically provisioned PersistentVolumes of this storage class. e.g. [&#34;ro&#34;, &#34;soft&#34;]. Not validated - mount of the PVs will simply fail if one is invalid.
   */
  public StorageClass mountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
    return this;
  }

  /**
   * parameters holds the parameters for the provisioner that should create volumes of this storage class.
   */
  public StorageClass parameters(Parameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * provisioner indicates the type of the provisioner.
   */
  public StorageClass provisioner(String provisioner) {
    this.provisioner = provisioner;
    return this;
  }

  /**
   * reclaimPolicy controls the reclaimPolicy for dynamically provisioned PersistentVolumes of this storage class. Defaults to Delete.
   */
  public StorageClass reclaimPolicy(String reclaimPolicy) {
    this.reclaimPolicy = reclaimPolicy;
    return this;
  }

  /**
   * volumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
   */
  public StorageClass volumeBindingMode(String volumeBindingMode) {
    this.volumeBindingMode = volumeBindingMode;
    return this;
  }
}
