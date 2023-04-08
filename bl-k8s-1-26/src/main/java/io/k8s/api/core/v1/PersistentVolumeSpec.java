
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 * 
 */
public class PersistentVolumeSpec {

    /**
     * accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
     * 
     */
    public List<String> accessModes;
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
    public AzureFilePersistentVolumeSource azureFile;
    /**
     * capacity is the description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     * 
     */
    public Capacity__2 capacity;
    /**
     * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public CephFSPersistentVolumeSource cephfs;
    /**
     * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
     * 
     */
    public CinderPersistentVolumeSource cinder;
    /**
     * ObjectReference contains enough information to let you inspect or modify the referred object.
     * 
     */
    public ObjectReference claimRef;
    /**
     * Represents storage that is managed by an external CSI volume driver (Beta feature)
     * 
     */
    public CSIPersistentVolumeSource csi;
    /**
     * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
     * 
     */
    public FCVolumeSource fc;
    /**
     * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    public FlexPersistentVolumeSource flexVolume;
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
     * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public GlusterfsPersistentVolumeSource glusterfs;
    /**
     * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public HostPathVolumeSource hostPath;
    /**
     * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
     * 
     */
    public ISCSIPersistentVolumeSource iscsi;
    /**
     * Local represents directly-attached storage with node affinity (Beta feature)
     * 
     */
    public LocalVolumeSource local;
    /**
     * mountOptions is the list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
     * 
     */
    public List<String> mountOptions;
    /**
     * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public NFSVolumeSource nfs;
    /**
     * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
     * 
     */
    public VolumeNodeAffinity nodeAffinity;
    /**
     * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
     * 
     * Possible enum values:
     *  - `"Delete"` means the volume will be deleted from Kubernetes on release from its claim. The volume plugin must support Deletion.
     *  - `"Recycle"` means the volume will be recycled back into the pool of unbound persistent volumes on release from its claim. The volume plugin must support Recycling.
     *  - `"Retain"` means the volume will be left in its current phase (Released) for manual reclamation by the administrator. The default policy is Retain.
     * 
     */
    public PersistentVolumeSpec.PersistentVolumeReclaimPolicy persistentVolumeReclaimPolicy;
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
     * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public QuobyteVolumeSource quobyte;
    /**
     * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
     * 
     */
    public RBDPersistentVolumeSource rbd;
    /**
     * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
     * 
     */
    public ScaleIOPersistentVolumeSource scaleIO;
    /**
     * storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
     * 
     */
    public String storageClassName;
    /**
     * Represents a StorageOS persistent volume resource.
     * 
     */
    public StorageOSPersistentVolumeSource storageos;
    /**
     * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
     * 
     */
    public String volumeMode;
    /**
     * Represents a vSphere volume resource.
     * 
     */
    public VsphereVirtualDiskVolumeSource vsphereVolume;

    public PersistentVolumeSpec withAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeSpec withAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
        return this;
    }

    public PersistentVolumeSpec withAzureDisk(AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
        return this;
    }

    public PersistentVolumeSpec withAzureFile(AzureFilePersistentVolumeSource azureFile) {
        this.azureFile = azureFile;
        return this;
    }

    public PersistentVolumeSpec withCapacity(Capacity__2 capacity) {
        this.capacity = capacity;
        return this;
    }

    public PersistentVolumeSpec withCephfs(CephFSPersistentVolumeSource cephfs) {
        this.cephfs = cephfs;
        return this;
    }

    public PersistentVolumeSpec withCinder(CinderPersistentVolumeSource cinder) {
        this.cinder = cinder;
        return this;
    }

    public PersistentVolumeSpec withClaimRef(ObjectReference claimRef) {
        this.claimRef = claimRef;
        return this;
    }

    public PersistentVolumeSpec withCsi(CSIPersistentVolumeSource csi) {
        this.csi = csi;
        return this;
    }

    public PersistentVolumeSpec withFc(FCVolumeSource fc) {
        this.fc = fc;
        return this;
    }

    public PersistentVolumeSpec withFlexVolume(FlexPersistentVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
        return this;
    }

    public PersistentVolumeSpec withFlocker(FlockerVolumeSource flocker) {
        this.flocker = flocker;
        return this;
    }

    public PersistentVolumeSpec withGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
        return this;
    }

    public PersistentVolumeSpec withGlusterfs(GlusterfsPersistentVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
        return this;
    }

    public PersistentVolumeSpec withHostPath(HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    public PersistentVolumeSpec withIscsi(ISCSIPersistentVolumeSource iscsi) {
        this.iscsi = iscsi;
        return this;
    }

    public PersistentVolumeSpec withLocal(LocalVolumeSource local) {
        this.local = local;
        return this;
    }

    public PersistentVolumeSpec withMountOptions(List<String> mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    public PersistentVolumeSpec withNfs(NFSVolumeSource nfs) {
        this.nfs = nfs;
        return this;
    }

    public PersistentVolumeSpec withNodeAffinity(VolumeNodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public PersistentVolumeSpec withPersistentVolumeReclaimPolicy(PersistentVolumeSpec.PersistentVolumeReclaimPolicy persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
        return this;
    }

    public PersistentVolumeSpec withPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
        return this;
    }

    public PersistentVolumeSpec withPortworxVolume(PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
        return this;
    }

    public PersistentVolumeSpec withQuobyte(QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
        return this;
    }

    public PersistentVolumeSpec withRbd(RBDPersistentVolumeSource rbd) {
        this.rbd = rbd;
        return this;
    }

    public PersistentVolumeSpec withScaleIO(ScaleIOPersistentVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
        return this;
    }

    public PersistentVolumeSpec withStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    public PersistentVolumeSpec withStorageos(StorageOSPersistentVolumeSource storageos) {
        this.storageos = storageos;
        return this;
    }

    public PersistentVolumeSpec withVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
        return this;
    }

    public PersistentVolumeSpec withVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
        return this;
    }


    /**
     * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
     * 
     * Possible enum values:
     *  - `"Delete"` means the volume will be deleted from Kubernetes on release from its claim. The volume plugin must support Deletion.
     *  - `"Recycle"` means the volume will be recycled back into the pool of unbound persistent volumes on release from its claim. The volume plugin must support Recycling.
     *  - `"Retain"` means the volume will be left in its current phase (Released) for manual reclamation by the administrator. The default policy is Retain.
     * 
     */
    public enum PersistentVolumeReclaimPolicy {

        DELETE("Delete"),
        RECYCLE("Recycle"),
        RETAIN("Retain");
        private final String value;
        private final static Map<String, PersistentVolumeSpec.PersistentVolumeReclaimPolicy> CONSTANTS = new HashMap<String, PersistentVolumeSpec.PersistentVolumeReclaimPolicy>();

        static {
            for (PersistentVolumeSpec.PersistentVolumeReclaimPolicy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PersistentVolumeReclaimPolicy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PersistentVolumeSpec.PersistentVolumeReclaimPolicy fromValue(String value) {
            PersistentVolumeSpec.PersistentVolumeReclaimPolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
