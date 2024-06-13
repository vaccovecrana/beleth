package io.k8s.api.core.v1;

import io.k8s.api.core.v1.persistentvolumespec.Capacity;
import java.lang.String;
import java.util.List;

/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 */
public class PersistentVolumeSpec {
  public List<String> accessModes;

  public AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

  public AzureDiskVolumeSource azureDisk;

  public AzureFilePersistentVolumeSource azureFile;

  public Capacity capacity;

  public CephFSPersistentVolumeSource cephfs;

  public CinderPersistentVolumeSource cinder;

  public ObjectReference claimRef;

  public CSIPersistentVolumeSource csi;

  public FCVolumeSource fc;

  public FlexPersistentVolumeSource flexVolume;

  public FlockerVolumeSource flocker;

  public GCEPersistentDiskVolumeSource gcePersistentDisk;

  public GlusterfsPersistentVolumeSource glusterfs;

  public HostPathVolumeSource hostPath;

  public ISCSIPersistentVolumeSource iscsi;

  public LocalVolumeSource local;

  public List<String> mountOptions;

  public NFSVolumeSource nfs;

  public VolumeNodeAffinity nodeAffinity;

  public String persistentVolumeReclaimPolicy;

  public PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public PortworxVolumeSource portworxVolume;

  public QuobyteVolumeSource quobyte;

  public RBDPersistentVolumeSource rbd;

  public ScaleIOPersistentVolumeSource scaleIO;

  public String storageClassName;

  public StorageOSPersistentVolumeSource storageos;

  public String volumeAttributesClassName;

  public String volumeMode;

  public VsphereVirtualDiskVolumeSource vsphereVolume;

  /**
   * accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
   */
  public PersistentVolumeSpec accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public PersistentVolumeSpec awsElasticBlockStore(
      AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

  public PersistentVolumeSpec azureDisk(AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

  public PersistentVolumeSpec azureFile(AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

  /**
   * capacity is the description of the persistent volume&#39;s resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   */
  public PersistentVolumeSpec capacity(Capacity capacity) {
    this.capacity = capacity;
    return this;
  }

  public PersistentVolumeSpec cephfs(CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

  public PersistentVolumeSpec cinder(CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

  public PersistentVolumeSpec claimRef(ObjectReference claimRef) {
    this.claimRef = claimRef;
    return this;
  }

  public PersistentVolumeSpec csi(CSIPersistentVolumeSource csi) {
    this.csi = csi;
    return this;
  }

  public PersistentVolumeSpec fc(FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

  public PersistentVolumeSpec flexVolume(FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

  public PersistentVolumeSpec flocker(FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

  public PersistentVolumeSpec gcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

  public PersistentVolumeSpec glusterfs(GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

  public PersistentVolumeSpec hostPath(HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

  public PersistentVolumeSpec iscsi(ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

  public PersistentVolumeSpec local(LocalVolumeSource local) {
    this.local = local;
    return this;
  }

  /**
   * mountOptions is the list of mount options, e.g. [&#34;ro&#34;, &#34;soft&#34;]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
   */
  public PersistentVolumeSpec mountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
    return this;
  }

  public PersistentVolumeSpec nfs(NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

  public PersistentVolumeSpec nodeAffinity(VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

  /**
   * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
   */
  public PersistentVolumeSpec persistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return this;
  }

  public PersistentVolumeSpec photonPersistentDisk(
      PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

  public PersistentVolumeSpec portworxVolume(PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

  public PersistentVolumeSpec quobyte(QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

  public PersistentVolumeSpec rbd(RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

  public PersistentVolumeSpec scaleIO(ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

  /**
   * storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
   */
  public PersistentVolumeSpec storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

  public PersistentVolumeSpec storageos(StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

  /**
   * Name of VolumeAttributesClass to which this persistent volume belongs. Empty value is not allowed. When this field is not set, it indicates that this volume does not belong to any VolumeAttributesClass. This field is mutable and can be changed by the CSI driver after a volume has been updated successfully to a new class. For an unbound PersistentVolume, the volumeAttributesClassName will be matched with unbound PersistentVolumeClaims during the binding process. This is an alpha field and requires enabling VolumeAttributesClass feature.
   */
  public PersistentVolumeSpec volumeAttributesClassName(String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
    return this;
  }

  /**
   * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
   */
  public PersistentVolumeSpec volumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

  public PersistentVolumeSpec vsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }
}
