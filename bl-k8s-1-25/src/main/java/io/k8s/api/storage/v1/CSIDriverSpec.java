package io.k8s.api.storage.v1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * CSIDriverSpec is the specification of a CSIDriver.
 */
public class CSIDriverSpec {
  public Boolean attachRequired;

  public String fsGroupPolicy;

  public Boolean podInfoOnMount;

  public Boolean requiresRepublish;

  public Boolean seLinuxMount;

  public Boolean storageCapacity;

  public List<TokenRequest> tokenRequests;

  public List<String> volumeLifecycleModes;

  /**
   * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
   *
   * This field is immutable.
   */
  public CSIDriverSpec attachRequired(Boolean attachRequired) {
    this.attachRequired = attachRequired;
    return this;
  }

  /**
   * Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details.
   *
   * This field is immutable.
   *
   * Defaults to ReadWriteOnceWithFSType, which will examine each volume to determine if Kubernetes should modify ownership and permissions of the volume. With the default policy the defined fsGroup will only be applied if a fstype is defined and the volume&#39;s access mode contains ReadWriteOnce.
   */
  public CSIDriverSpec fsGroupPolicy(String fsGroupPolicy) {
    this.fsGroupPolicy = fsGroupPolicy;
    return this;
  }

  /**
   * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. &#34;csi.storage.k8s.io/pod.name&#34;: pod.Name &#34;csi.storage.k8s.io/pod.namespace&#34;: pod.Namespace &#34;csi.storage.k8s.io/pod.uid&#34;: string(pod.UID) &#34;csi.storage.k8s.io/ephemeral&#34;: &#34;true&#34; if the volume is an ephemeral inline volume
   *                                 defined by a CSIVolumeSource, otherwise &#34;false&#34;
   *
   * &#34;csi.storage.k8s.io/ephemeral&#34; is a new feature in Kubernetes 1.16. It is only required for drivers which support both the &#34;Persistent&#34; and &#34;Ephemeral&#34; VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn&#39;t support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
   *
   * This field is immutable.
   */
  public CSIDriverSpec podInfoOnMount(Boolean podInfoOnMount) {
    this.podInfoOnMount = podInfoOnMount;
    return this;
  }

  /**
   * RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
   *
   * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
   */
  public CSIDriverSpec requiresRepublish(Boolean requiresRepublish) {
    this.requiresRepublish = requiresRepublish;
    return this;
  }

  /**
   * SELinuxMount specifies if the CSI driver supports &#34;-o context&#34; mount option.
   *
   * When &#34;true&#34;, the CSI driver must ensure that all volumes provided by this CSI driver can be mounted separately with different `-o context` options. This is typical for storage backends that provide volumes as filesystems on block devices or as independent shared volumes. Kubernetes will call NodeStage / NodePublish with &#34;-o context=xyz&#34; mount option when mounting a ReadWriteOncePod volume used in Pod that has explicitly set SELinux context. In the future, it may be expanded to other volume AccessModes. In any case, Kubernetes will ensure that the volume is mounted only with a single SELinux context.
   *
   * When &#34;false&#34;, Kubernetes won&#39;t pass any special SELinux mount options to the driver. This is typical for volumes that represent subdirectories of a bigger shared filesystem.
   *
   * Default is &#34;false&#34;.
   */
  public CSIDriverSpec seLinuxMount(Boolean seLinuxMount) {
    this.seLinuxMount = seLinuxMount;
    return this;
  }

  /**
   * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
   *
   * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
   *
   * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
   *
   * This field was immutable in Kubernetes &#60;= 1.22 and now is mutable.
   */
  public CSIDriverSpec storageCapacity(Boolean storageCapacity) {
    this.storageCapacity = storageCapacity;
    return this;
  }

  /**
   * TokenRequests indicates the CSI driver needs pods&#39; service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: &#34;csi.storage.k8s.io/serviceAccount.tokens&#34;: {
   *   &#34;&#60;audience&#62;&#34;: {
   *     &#34;token&#34;: &#60;token&#62;,
   *     &#34;expirationTimestamp&#34;: &#60;expiration timestamp in RFC3339&#62;,
   *   },
   *   ...
   * }
   *
   * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
   */
  public CSIDriverSpec tokenRequests(List<TokenRequest> tokenRequests) {
    this.tokenRequests = tokenRequests;
    return this;
  }

  /**
   * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is &#34;Persistent&#34;, which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is &#34;Ephemeral&#34;. In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future. This field is beta.
   *
   * This field is immutable.
   */
  public CSIDriverSpec volumeLifecycleModes(List<String> volumeLifecycleModes) {
    this.volumeLifecycleModes = volumeLifecycleModes;
    return this;
  }
}
