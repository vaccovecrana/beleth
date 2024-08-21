package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
public class Volume {
  public AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

  public AzureDiskVolumeSource azureDisk;

  public AzureFileVolumeSource azureFile;

  public CephFSVolumeSource cephfs;

  public CinderVolumeSource cinder;

  public ConfigMapVolumeSource configMap;

  public CSIVolumeSource csi;

  public DownwardAPIVolumeSource downwardAPI;

  public EmptyDirVolumeSource emptyDir;

  public EphemeralVolumeSource ephemeral;

  public FCVolumeSource fc;

  public FlexVolumeSource flexVolume;

  public FlockerVolumeSource flocker;

  public GCEPersistentDiskVolumeSource gcePersistentDisk;

  public GitRepoVolumeSource gitRepo;

  public GlusterfsVolumeSource glusterfs;

  public HostPathVolumeSource hostPath;

  public ImageVolumeSource image;

  public ISCSIVolumeSource iscsi;

  public String name;

  public NFSVolumeSource nfs;

  public PersistentVolumeClaimVolumeSource persistentVolumeClaim;

  public PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public PortworxVolumeSource portworxVolume;

  public ProjectedVolumeSource projected;

  public QuobyteVolumeSource quobyte;

  public RBDVolumeSource rbd;

  public ScaleIOVolumeSource scaleIO;

  public SecretVolumeSource secret;

  public StorageOSVolumeSource storageos;

  public VsphereVirtualDiskVolumeSource vsphereVolume;

  public Volume awsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

  public Volume azureDisk(AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

  public Volume azureFile(AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

  public Volume cephfs(CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

  public Volume cinder(CinderVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

  public Volume configMap(ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
    return this;
  }

  public Volume csi(CSIVolumeSource csi) {
    this.csi = csi;
    return this;
  }

  public Volume downwardAPI(DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

  public Volume emptyDir(EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
    return this;
  }

  public Volume ephemeral(EphemeralVolumeSource ephemeral) {
    this.ephemeral = ephemeral;
    return this;
  }

  public Volume fc(FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

  public Volume flexVolume(FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

  public Volume flocker(FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

  public Volume gcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

  public Volume gitRepo(GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

  public Volume glusterfs(GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

  public Volume hostPath(HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

  public Volume image(ImageVolumeSource image) {
    this.image = image;
    return this;
  }

  public Volume iscsi(ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

  /**
   * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   */
  public Volume name(String name) {
    this.name = name;
    return this;
  }

  public Volume nfs(NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

  public Volume persistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

  public Volume photonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

  public Volume portworxVolume(PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

  public Volume projected(ProjectedVolumeSource projected) {
    this.projected = projected;
    return this;
  }

  public Volume quobyte(QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

  public Volume rbd(RBDVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

  public Volume scaleIO(ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

  public Volume secret(SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

  public Volume storageos(StorageOSVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

  public Volume vsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }

  public static Volume volume() {
    return new Volume();
  }
}
