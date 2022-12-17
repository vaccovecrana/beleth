
package io.k8s.api.core.v1;



/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 * 
 */
public class Volume {

    /**
     * Represents a Persistent Disk resource in AWS.
     * 
     * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
     * 
     */
    public AWSElasticBlockStoreVolumeSource awsElasticBlockStore;
    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     * 
     */
    public AzureDiskVolumeSource azureDisk;
    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    public AzureFileVolumeSource azureFile;
    /**
     * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public CephFSVolumeSource cephfs;
    /**
     * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
     * 
     */
    public CinderVolumeSource cinder;
    /**
     * Adapts a ConfigMap into a volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
     * 
     */
    public ConfigMapVolumeSource configMap;
    /**
     * Represents a source location of a volume to mount, managed by an external CSI driver
     * 
     */
    public CSIVolumeSource csi;
    /**
     * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
     * 
     */
    public DownwardAPIVolumeSource downwardAPI;
    /**
     * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
     * 
     */
    public EmptyDirVolumeSource emptyDir;
    /**
     * Represents an ephemeral volume that is handled by a normal storage driver.
     * 
     */
    public EphemeralVolumeSource ephemeral;
    /**
     * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
     * 
     */
    public FCVolumeSource fc;
    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    public FlexVolumeSource flexVolume;
    /**
     * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public FlockerVolumeSource flocker;
    /**
     * Represents a Persistent Disk resource in Google Compute Engine.
     * 
     * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
     * 
     */
    public GCEPersistentDiskVolumeSource gcePersistentDisk;
    /**
     * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
     * 
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     * 
     */
    public GitRepoVolumeSource gitRepo;
    /**
     * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public GlusterfsVolumeSource glusterfs;
    /**
     * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public HostPathVolumeSource hostPath;
    /**
     * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
     * 
     */
    public ISCSIVolumeSource iscsi;
    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * (Required)
     * 
     */
    public String name;
    /**
     * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public NFSVolumeSource nfs;
    /**
     * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
     * 
     */
    public PersistentVolumeClaimVolumeSource persistentVolumeClaim;
    /**
     * Represents a Photon Controller persistent disk resource.
     * 
     */
    public PhotonPersistentDiskVolumeSource photonPersistentDisk;
    /**
     * PortworxVolumeSource represents a Portworx volume resource.
     * 
     */
    public PortworxVolumeSource portworxVolume;
    /**
     * Represents a projected volume source
     * 
     */
    public ProjectedVolumeSource projected;
    /**
     * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public QuobyteVolumeSource quobyte;
    /**
     * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
     * 
     */
    public RBDVolumeSource rbd;
    /**
     * ScaleIOVolumeSource represents a persistent ScaleIO volume
     * 
     */
    public ScaleIOVolumeSource scaleIO;
    /**
     * Adapts a Secret into a volume.
     * 
     * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
     * 
     */
    public SecretVolumeSource secret;
    /**
     * Represents a StorageOS persistent volume resource.
     * 
     */
    public StorageOSVolumeSource storageos;
    /**
     * Represents a vSphere volume resource.
     * 
     */
    public VsphereVirtualDiskVolumeSource vsphereVolume;

    public Volume withAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
        return this;
    }

    public Volume withAzureDisk(AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
        return this;
    }

    public Volume withAzureFile(AzureFileVolumeSource azureFile) {
        this.azureFile = azureFile;
        return this;
    }

    public Volume withCephfs(CephFSVolumeSource cephfs) {
        this.cephfs = cephfs;
        return this;
    }

    public Volume withCinder(CinderVolumeSource cinder) {
        this.cinder = cinder;
        return this;
    }

    public Volume withConfigMap(ConfigMapVolumeSource configMap) {
        this.configMap = configMap;
        return this;
    }

    public Volume withCsi(CSIVolumeSource csi) {
        this.csi = csi;
        return this;
    }

    public Volume withDownwardAPI(DownwardAPIVolumeSource downwardAPI) {
        this.downwardAPI = downwardAPI;
        return this;
    }

    public Volume withEmptyDir(EmptyDirVolumeSource emptyDir) {
        this.emptyDir = emptyDir;
        return this;
    }

    public Volume withEphemeral(EphemeralVolumeSource ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }

    public Volume withFc(FCVolumeSource fc) {
        this.fc = fc;
        return this;
    }

    public Volume withFlexVolume(FlexVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
        return this;
    }

    public Volume withFlocker(FlockerVolumeSource flocker) {
        this.flocker = flocker;
        return this;
    }

    public Volume withGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
        return this;
    }

    public Volume withGitRepo(GitRepoVolumeSource gitRepo) {
        this.gitRepo = gitRepo;
        return this;
    }

    public Volume withGlusterfs(GlusterfsVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
        return this;
    }

    public Volume withHostPath(HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    public Volume withIscsi(ISCSIVolumeSource iscsi) {
        this.iscsi = iscsi;
        return this;
    }

    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    public Volume withNfs(NFSVolumeSource nfs) {
        this.nfs = nfs;
        return this;
    }

    public Volume withPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
        return this;
    }

    public Volume withPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
        return this;
    }

    public Volume withPortworxVolume(PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
        return this;
    }

    public Volume withProjected(ProjectedVolumeSource projected) {
        this.projected = projected;
        return this;
    }

    public Volume withQuobyte(QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
        return this;
    }

    public Volume withRbd(RBDVolumeSource rbd) {
        this.rbd = rbd;
        return this;
    }

    public Volume withScaleIO(ScaleIOVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
        return this;
    }

    public Volume withSecret(SecretVolumeSource secret) {
        this.secret = secret;
        return this;
    }

    public Volume withStorageos(StorageOSVolumeSource storageos) {
        this.storageos = storageos;
        return this;
    }

    public Volume withVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
        return this;
    }

}
