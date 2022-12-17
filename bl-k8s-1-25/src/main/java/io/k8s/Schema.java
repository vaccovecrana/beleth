
package io.k8s;

import io.k8s.api.admissionregistration.v1.MutatingWebhook;
import io.k8s.api.admissionregistration.v1.MutatingWebhookConfiguration;
import io.k8s.api.admissionregistration.v1.MutatingWebhookConfigurationList;
import io.k8s.api.admissionregistration.v1.RuleWithOperations;
import io.k8s.api.admissionregistration.v1.ValidatingWebhook;
import io.k8s.api.admissionregistration.v1.ValidatingWebhookConfiguration;
import io.k8s.api.admissionregistration.v1.ValidatingWebhookConfigurationList;
import io.k8s.api.admissionregistration.v1.WebhookClientConfig;
import io.k8s.api.apps.v1.ControllerRevision;
import io.k8s.api.apps.v1.ControllerRevisionList;
import io.k8s.api.apps.v1.DaemonSet;
import io.k8s.api.apps.v1.DaemonSetCondition;
import io.k8s.api.apps.v1.DaemonSetList;
import io.k8s.api.apps.v1.DaemonSetSpec;
import io.k8s.api.apps.v1.DaemonSetStatus;
import io.k8s.api.apps.v1.DaemonSetUpdateStrategy;
import io.k8s.api.apps.v1.Deployment;
import io.k8s.api.apps.v1.DeploymentCondition;
import io.k8s.api.apps.v1.DeploymentList;
import io.k8s.api.apps.v1.DeploymentSpec;
import io.k8s.api.apps.v1.DeploymentStatus;
import io.k8s.api.apps.v1.DeploymentStrategy;
import io.k8s.api.apps.v1.ReplicaSet;
import io.k8s.api.apps.v1.ReplicaSetCondition;
import io.k8s.api.apps.v1.ReplicaSetList;
import io.k8s.api.apps.v1.ReplicaSetSpec;
import io.k8s.api.apps.v1.ReplicaSetStatus;
import io.k8s.api.apps.v1.RollingUpdateDaemonSet;
import io.k8s.api.apps.v1.RollingUpdateDeployment;
import io.k8s.api.apps.v1.RollingUpdateStatefulSetStrategy;
import io.k8s.api.apps.v1.StatefulSet;
import io.k8s.api.apps.v1.StatefulSetCondition;
import io.k8s.api.apps.v1.StatefulSetList;
import io.k8s.api.apps.v1.StatefulSetPersistentVolumeClaimRetentionPolicy;
import io.k8s.api.apps.v1.StatefulSetSpec;
import io.k8s.api.apps.v1.StatefulSetStatus;
import io.k8s.api.apps.v1.StatefulSetUpdateStrategy;
import io.k8s.api.authentication.v1.BoundObjectReference;
import io.k8s.api.authentication.v1.TokenRequestSpec;
import io.k8s.api.authentication.v1.TokenRequestStatus;
import io.k8s.api.authentication.v1.TokenReview;
import io.k8s.api.authentication.v1.TokenReviewSpec;
import io.k8s.api.authentication.v1.TokenReviewStatus;
import io.k8s.api.authentication.v1.UserInfo;
import io.k8s.api.authorization.v1.LocalSubjectAccessReview;
import io.k8s.api.authorization.v1.NonResourceAttributes;
import io.k8s.api.authorization.v1.NonResourceRule;
import io.k8s.api.authorization.v1.ResourceAttributes;
import io.k8s.api.authorization.v1.ResourceRule;
import io.k8s.api.authorization.v1.SelfSubjectAccessReview;
import io.k8s.api.authorization.v1.SelfSubjectAccessReviewSpec;
import io.k8s.api.authorization.v1.SelfSubjectRulesReview;
import io.k8s.api.authorization.v1.SelfSubjectRulesReviewSpec;
import io.k8s.api.authorization.v1.SubjectAccessReview;
import io.k8s.api.authorization.v1.SubjectAccessReviewSpec;
import io.k8s.api.authorization.v1.SubjectAccessReviewStatus;
import io.k8s.api.authorization.v1.SubjectRulesReviewStatus;
import io.k8s.api.autoscaling.v1.Scale;
import io.k8s.api.autoscaling.v1.ScaleSpec;
import io.k8s.api.autoscaling.v1.ScaleStatus;
import io.k8s.api.autoscaling.v2beta2.ContainerResourceMetricSource;
import io.k8s.api.autoscaling.v2beta2.ContainerResourceMetricStatus;
import io.k8s.api.autoscaling.v2beta2.CrossVersionObjectReference;
import io.k8s.api.autoscaling.v2beta2.ExternalMetricSource;
import io.k8s.api.autoscaling.v2beta2.ExternalMetricStatus;
import io.k8s.api.autoscaling.v2beta2.HPAScalingPolicy;
import io.k8s.api.autoscaling.v2beta2.HPAScalingRules;
import io.k8s.api.autoscaling.v2beta2.HorizontalPodAutoscaler;
import io.k8s.api.autoscaling.v2beta2.HorizontalPodAutoscalerBehavior;
import io.k8s.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition;
import io.k8s.api.autoscaling.v2beta2.HorizontalPodAutoscalerList;
import io.k8s.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec;
import io.k8s.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus;
import io.k8s.api.autoscaling.v2beta2.MetricIdentifier;
import io.k8s.api.autoscaling.v2beta2.MetricSpec;
import io.k8s.api.autoscaling.v2beta2.MetricStatus;
import io.k8s.api.autoscaling.v2beta2.MetricTarget;
import io.k8s.api.autoscaling.v2beta2.MetricValueStatus;
import io.k8s.api.autoscaling.v2beta2.ObjectMetricSource;
import io.k8s.api.autoscaling.v2beta2.ObjectMetricStatus;
import io.k8s.api.autoscaling.v2beta2.PodsMetricSource;
import io.k8s.api.autoscaling.v2beta2.PodsMetricStatus;
import io.k8s.api.autoscaling.v2beta2.ResourceMetricSource;
import io.k8s.api.autoscaling.v2beta2.ResourceMetricStatus;
import io.k8s.api.batch.v1.CronJob;
import io.k8s.api.batch.v1.CronJobList;
import io.k8s.api.batch.v1.CronJobSpec;
import io.k8s.api.batch.v1.CronJobStatus;
import io.k8s.api.batch.v1.Job;
import io.k8s.api.batch.v1.JobCondition;
import io.k8s.api.batch.v1.JobList;
import io.k8s.api.batch.v1.JobSpec;
import io.k8s.api.batch.v1.JobStatus;
import io.k8s.api.batch.v1.JobTemplateSpec;
import io.k8s.api.batch.v1.PodFailurePolicy;
import io.k8s.api.batch.v1.PodFailurePolicyOnExitCodesRequirement;
import io.k8s.api.batch.v1.PodFailurePolicyOnPodConditionsPattern;
import io.k8s.api.batch.v1.PodFailurePolicyRule;
import io.k8s.api.batch.v1.UncountedTerminatedPods;
import io.k8s.api.certificates.v1.CertificateSigningRequest;
import io.k8s.api.certificates.v1.CertificateSigningRequestCondition;
import io.k8s.api.certificates.v1.CertificateSigningRequestList;
import io.k8s.api.certificates.v1.CertificateSigningRequestSpec;
import io.k8s.api.certificates.v1.CertificateSigningRequestStatus;
import io.k8s.api.coordination.v1.Lease;
import io.k8s.api.coordination.v1.LeaseList;
import io.k8s.api.coordination.v1.LeaseSpec;
import io.k8s.api.core.v1.AWSElasticBlockStoreVolumeSource;
import io.k8s.api.core.v1.Affinity;
import io.k8s.api.core.v1.AttachedVolume;
import io.k8s.api.core.v1.AzureDiskVolumeSource;
import io.k8s.api.core.v1.AzureFilePersistentVolumeSource;
import io.k8s.api.core.v1.AzureFileVolumeSource;
import io.k8s.api.core.v1.Binding;
import io.k8s.api.core.v1.CSIPersistentVolumeSource;
import io.k8s.api.core.v1.CSIVolumeSource;
import io.k8s.api.core.v1.Capabilities;
import io.k8s.api.core.v1.CephFSPersistentVolumeSource;
import io.k8s.api.core.v1.CephFSVolumeSource;
import io.k8s.api.core.v1.CinderPersistentVolumeSource;
import io.k8s.api.core.v1.CinderVolumeSource;
import io.k8s.api.core.v1.ClientIPConfig;
import io.k8s.api.core.v1.ComponentCondition;
import io.k8s.api.core.v1.ComponentStatus;
import io.k8s.api.core.v1.ComponentStatusList;
import io.k8s.api.core.v1.ConfigMap;
import io.k8s.api.core.v1.ConfigMapEnvSource;
import io.k8s.api.core.v1.ConfigMapKeySelector;
import io.k8s.api.core.v1.ConfigMapList;
import io.k8s.api.core.v1.ConfigMapNodeConfigSource;
import io.k8s.api.core.v1.ConfigMapProjection;
import io.k8s.api.core.v1.ConfigMapVolumeSource;
import io.k8s.api.core.v1.Container;
import io.k8s.api.core.v1.ContainerImage;
import io.k8s.api.core.v1.ContainerPort;
import io.k8s.api.core.v1.ContainerState;
import io.k8s.api.core.v1.ContainerStateRunning;
import io.k8s.api.core.v1.ContainerStateTerminated;
import io.k8s.api.core.v1.ContainerStateWaiting;
import io.k8s.api.core.v1.ContainerStatus;
import io.k8s.api.core.v1.DaemonEndpoint;
import io.k8s.api.core.v1.DownwardAPIProjection;
import io.k8s.api.core.v1.DownwardAPIVolumeFile;
import io.k8s.api.core.v1.DownwardAPIVolumeSource;
import io.k8s.api.core.v1.EmptyDirVolumeSource;
import io.k8s.api.core.v1.EndpointAddress;
import io.k8s.api.core.v1.EndpointSubset;
import io.k8s.api.core.v1.Endpoints;
import io.k8s.api.core.v1.EndpointsList;
import io.k8s.api.core.v1.EnvFromSource;
import io.k8s.api.core.v1.EnvVar;
import io.k8s.api.core.v1.EnvVarSource;
import io.k8s.api.core.v1.EphemeralContainer;
import io.k8s.api.core.v1.EphemeralVolumeSource;
import io.k8s.api.core.v1.EventSource;
import io.k8s.api.core.v1.ExecAction;
import io.k8s.api.core.v1.FCVolumeSource;
import io.k8s.api.core.v1.FlexPersistentVolumeSource;
import io.k8s.api.core.v1.FlexVolumeSource;
import io.k8s.api.core.v1.FlockerVolumeSource;
import io.k8s.api.core.v1.GCEPersistentDiskVolumeSource;
import io.k8s.api.core.v1.GRPCAction;
import io.k8s.api.core.v1.GitRepoVolumeSource;
import io.k8s.api.core.v1.GlusterfsPersistentVolumeSource;
import io.k8s.api.core.v1.GlusterfsVolumeSource;
import io.k8s.api.core.v1.HTTPGetAction;
import io.k8s.api.core.v1.HTTPHeader;
import io.k8s.api.core.v1.HostAlias;
import io.k8s.api.core.v1.HostPathVolumeSource;
import io.k8s.api.core.v1.ISCSIPersistentVolumeSource;
import io.k8s.api.core.v1.ISCSIVolumeSource;
import io.k8s.api.core.v1.KeyToPath;
import io.k8s.api.core.v1.Lifecycle;
import io.k8s.api.core.v1.LifecycleHandler;
import io.k8s.api.core.v1.LimitRange;
import io.k8s.api.core.v1.LimitRangeItem;
import io.k8s.api.core.v1.LimitRangeList;
import io.k8s.api.core.v1.LimitRangeSpec;
import io.k8s.api.core.v1.LoadBalancerIngress;
import io.k8s.api.core.v1.LoadBalancerStatus;
import io.k8s.api.core.v1.LocalObjectReference;
import io.k8s.api.core.v1.LocalVolumeSource;
import io.k8s.api.core.v1.NFSVolumeSource;
import io.k8s.api.core.v1.Namespace;
import io.k8s.api.core.v1.NamespaceCondition;
import io.k8s.api.core.v1.NamespaceList;
import io.k8s.api.core.v1.NamespaceSpec;
import io.k8s.api.core.v1.NamespaceStatus;
import io.k8s.api.core.v1.Node;
import io.k8s.api.core.v1.NodeAddress;
import io.k8s.api.core.v1.NodeAffinity;
import io.k8s.api.core.v1.NodeCondition;
import io.k8s.api.core.v1.NodeConfigSource;
import io.k8s.api.core.v1.NodeConfigStatus;
import io.k8s.api.core.v1.NodeDaemonEndpoints;
import io.k8s.api.core.v1.NodeList;
import io.k8s.api.core.v1.NodeSelector;
import io.k8s.api.core.v1.NodeSelectorRequirement;
import io.k8s.api.core.v1.NodeSelectorTerm;
import io.k8s.api.core.v1.NodeSpec;
import io.k8s.api.core.v1.NodeStatus;
import io.k8s.api.core.v1.NodeSystemInfo;
import io.k8s.api.core.v1.ObjectFieldSelector;
import io.k8s.api.core.v1.ObjectReference;
import io.k8s.api.core.v1.PersistentVolume;
import io.k8s.api.core.v1.PersistentVolumeClaim;
import io.k8s.api.core.v1.PersistentVolumeClaimCondition;
import io.k8s.api.core.v1.PersistentVolumeClaimList;
import io.k8s.api.core.v1.PersistentVolumeClaimSpec;
import io.k8s.api.core.v1.PersistentVolumeClaimStatus;
import io.k8s.api.core.v1.PersistentVolumeClaimTemplate;
import io.k8s.api.core.v1.PersistentVolumeClaimVolumeSource;
import io.k8s.api.core.v1.PersistentVolumeList;
import io.k8s.api.core.v1.PersistentVolumeSpec;
import io.k8s.api.core.v1.PersistentVolumeStatus;
import io.k8s.api.core.v1.PhotonPersistentDiskVolumeSource;
import io.k8s.api.core.v1.Pod;
import io.k8s.api.core.v1.PodAffinity;
import io.k8s.api.core.v1.PodAffinityTerm;
import io.k8s.api.core.v1.PodAntiAffinity;
import io.k8s.api.core.v1.PodCondition;
import io.k8s.api.core.v1.PodDNSConfig;
import io.k8s.api.core.v1.PodDNSConfigOption;
import io.k8s.api.core.v1.PodIP;
import io.k8s.api.core.v1.PodList;
import io.k8s.api.core.v1.PodOS;
import io.k8s.api.core.v1.PodReadinessGate;
import io.k8s.api.core.v1.PodSecurityContext;
import io.k8s.api.core.v1.PodSpec;
import io.k8s.api.core.v1.PodStatus;
import io.k8s.api.core.v1.PodTemplate;
import io.k8s.api.core.v1.PodTemplateList;
import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.api.core.v1.PortStatus;
import io.k8s.api.core.v1.PortworxVolumeSource;
import io.k8s.api.core.v1.PreferredSchedulingTerm;
import io.k8s.api.core.v1.Probe;
import io.k8s.api.core.v1.ProjectedVolumeSource;
import io.k8s.api.core.v1.QuobyteVolumeSource;
import io.k8s.api.core.v1.RBDPersistentVolumeSource;
import io.k8s.api.core.v1.RBDVolumeSource;
import io.k8s.api.core.v1.ReplicationController;
import io.k8s.api.core.v1.ReplicationControllerCondition;
import io.k8s.api.core.v1.ReplicationControllerList;
import io.k8s.api.core.v1.ReplicationControllerSpec;
import io.k8s.api.core.v1.ReplicationControllerStatus;
import io.k8s.api.core.v1.ResourceFieldSelector;
import io.k8s.api.core.v1.ResourceQuota;
import io.k8s.api.core.v1.ResourceQuotaList;
import io.k8s.api.core.v1.ResourceQuotaSpec;
import io.k8s.api.core.v1.ResourceQuotaStatus;
import io.k8s.api.core.v1.ResourceRequirements;
import io.k8s.api.core.v1.SELinuxOptions;
import io.k8s.api.core.v1.ScaleIOPersistentVolumeSource;
import io.k8s.api.core.v1.ScaleIOVolumeSource;
import io.k8s.api.core.v1.ScopeSelector;
import io.k8s.api.core.v1.ScopedResourceSelectorRequirement;
import io.k8s.api.core.v1.SeccompProfile;
import io.k8s.api.core.v1.Secret;
import io.k8s.api.core.v1.SecretEnvSource;
import io.k8s.api.core.v1.SecretKeySelector;
import io.k8s.api.core.v1.SecretList;
import io.k8s.api.core.v1.SecretProjection;
import io.k8s.api.core.v1.SecretReference;
import io.k8s.api.core.v1.SecretVolumeSource;
import io.k8s.api.core.v1.SecurityContext;
import io.k8s.api.core.v1.Service;
import io.k8s.api.core.v1.ServiceAccount;
import io.k8s.api.core.v1.ServiceAccountList;
import io.k8s.api.core.v1.ServiceAccountTokenProjection;
import io.k8s.api.core.v1.ServiceList;
import io.k8s.api.core.v1.ServicePort;
import io.k8s.api.core.v1.ServiceSpec;
import io.k8s.api.core.v1.ServiceStatus;
import io.k8s.api.core.v1.SessionAffinityConfig;
import io.k8s.api.core.v1.StorageOSPersistentVolumeSource;
import io.k8s.api.core.v1.StorageOSVolumeSource;
import io.k8s.api.core.v1.Sysctl;
import io.k8s.api.core.v1.TCPSocketAction;
import io.k8s.api.core.v1.Taint;
import io.k8s.api.core.v1.Toleration;
import io.k8s.api.core.v1.TopologySelectorLabelRequirement;
import io.k8s.api.core.v1.TopologySelectorTerm;
import io.k8s.api.core.v1.TopologySpreadConstraint;
import io.k8s.api.core.v1.TypedLocalObjectReference;
import io.k8s.api.core.v1.Volume;
import io.k8s.api.core.v1.VolumeDevice;
import io.k8s.api.core.v1.VolumeMount;
import io.k8s.api.core.v1.VolumeNodeAffinity;
import io.k8s.api.core.v1.VolumeProjection;
import io.k8s.api.core.v1.VsphereVirtualDiskVolumeSource;
import io.k8s.api.core.v1.WeightedPodAffinityTerm;
import io.k8s.api.core.v1.WindowsSecurityContextOptions;
import io.k8s.api.discovery.v1.Endpoint;
import io.k8s.api.discovery.v1.EndpointConditions;
import io.k8s.api.discovery.v1.EndpointHints;
import io.k8s.api.discovery.v1.EndpointPort;
import io.k8s.api.discovery.v1.EndpointSlice;
import io.k8s.api.discovery.v1.EndpointSliceList;
import io.k8s.api.discovery.v1.ForZone;
import io.k8s.api.events.v1.Event;
import io.k8s.api.events.v1.EventList;
import io.k8s.api.events.v1.EventSeries;
import io.k8s.api.flowcontrol.v1beta2.FlowDistinguisherMethod;
import io.k8s.api.flowcontrol.v1beta2.FlowSchema;
import io.k8s.api.flowcontrol.v1beta2.FlowSchemaCondition;
import io.k8s.api.flowcontrol.v1beta2.FlowSchemaList;
import io.k8s.api.flowcontrol.v1beta2.FlowSchemaSpec;
import io.k8s.api.flowcontrol.v1beta2.FlowSchemaStatus;
import io.k8s.api.flowcontrol.v1beta2.GroupSubject;
import io.k8s.api.flowcontrol.v1beta2.LimitResponse;
import io.k8s.api.flowcontrol.v1beta2.LimitedPriorityLevelConfiguration;
import io.k8s.api.flowcontrol.v1beta2.NonResourcePolicyRule;
import io.k8s.api.flowcontrol.v1beta2.PolicyRulesWithSubjects;
import io.k8s.api.flowcontrol.v1beta2.PriorityLevelConfiguration;
import io.k8s.api.flowcontrol.v1beta2.PriorityLevelConfigurationCondition;
import io.k8s.api.flowcontrol.v1beta2.PriorityLevelConfigurationList;
import io.k8s.api.flowcontrol.v1beta2.PriorityLevelConfigurationReference;
import io.k8s.api.flowcontrol.v1beta2.PriorityLevelConfigurationSpec;
import io.k8s.api.flowcontrol.v1beta2.PriorityLevelConfigurationStatus;
import io.k8s.api.flowcontrol.v1beta2.QueuingConfiguration;
import io.k8s.api.flowcontrol.v1beta2.ResourcePolicyRule;
import io.k8s.api.flowcontrol.v1beta2.ServiceAccountSubject;
import io.k8s.api.flowcontrol.v1beta2.UserSubject;
import io.k8s.api.networking.v1.HTTPIngressPath;
import io.k8s.api.networking.v1.HTTPIngressRuleValue;
import io.k8s.api.networking.v1.IPBlock;
import io.k8s.api.networking.v1.Ingress;
import io.k8s.api.networking.v1.IngressBackend;
import io.k8s.api.networking.v1.IngressClass;
import io.k8s.api.networking.v1.IngressClassList;
import io.k8s.api.networking.v1.IngressClassParametersReference;
import io.k8s.api.networking.v1.IngressClassSpec;
import io.k8s.api.networking.v1.IngressList;
import io.k8s.api.networking.v1.IngressRule;
import io.k8s.api.networking.v1.IngressServiceBackend;
import io.k8s.api.networking.v1.IngressSpec;
import io.k8s.api.networking.v1.IngressStatus;
import io.k8s.api.networking.v1.IngressTLS;
import io.k8s.api.networking.v1.NetworkPolicy;
import io.k8s.api.networking.v1.NetworkPolicyEgressRule;
import io.k8s.api.networking.v1.NetworkPolicyIngressRule;
import io.k8s.api.networking.v1.NetworkPolicyList;
import io.k8s.api.networking.v1.NetworkPolicyPeer;
import io.k8s.api.networking.v1.NetworkPolicyPort;
import io.k8s.api.networking.v1.NetworkPolicySpec;
import io.k8s.api.networking.v1.NetworkPolicyStatus;
import io.k8s.api.networking.v1.ServiceBackendPort;
import io.k8s.api.node.v1.Overhead;
import io.k8s.api.node.v1.RuntimeClass;
import io.k8s.api.node.v1.RuntimeClassList;
import io.k8s.api.node.v1.Scheduling;
import io.k8s.api.policy.v1.Eviction;
import io.k8s.api.policy.v1.PodDisruptionBudget;
import io.k8s.api.policy.v1.PodDisruptionBudgetList;
import io.k8s.api.policy.v1.PodDisruptionBudgetSpec;
import io.k8s.api.policy.v1.PodDisruptionBudgetStatus;
import io.k8s.api.rbac.v1.AggregationRule;
import io.k8s.api.rbac.v1.ClusterRole;
import io.k8s.api.rbac.v1.ClusterRoleBinding;
import io.k8s.api.rbac.v1.ClusterRoleBindingList;
import io.k8s.api.rbac.v1.ClusterRoleList;
import io.k8s.api.rbac.v1.PolicyRule;
import io.k8s.api.rbac.v1.Role;
import io.k8s.api.rbac.v1.RoleBinding;
import io.k8s.api.rbac.v1.RoleBindingList;
import io.k8s.api.rbac.v1.RoleList;
import io.k8s.api.rbac.v1.RoleRef;
import io.k8s.api.rbac.v1.Subject;
import io.k8s.api.scheduling.v1.PriorityClass;
import io.k8s.api.scheduling.v1.PriorityClassList;
import io.k8s.api.storage.v1.CSIDriver;
import io.k8s.api.storage.v1.CSIDriverList;
import io.k8s.api.storage.v1.CSIDriverSpec;
import io.k8s.api.storage.v1.CSINode;
import io.k8s.api.storage.v1.CSINodeDriver;
import io.k8s.api.storage.v1.CSINodeList;
import io.k8s.api.storage.v1.CSINodeSpec;
import io.k8s.api.storage.v1.StorageClass;
import io.k8s.api.storage.v1.StorageClassList;
import io.k8s.api.storage.v1.TokenRequest;
import io.k8s.api.storage.v1.VolumeAttachment;
import io.k8s.api.storage.v1.VolumeAttachmentList;
import io.k8s.api.storage.v1.VolumeAttachmentSource;
import io.k8s.api.storage.v1.VolumeAttachmentSpec;
import io.k8s.api.storage.v1.VolumeAttachmentStatus;
import io.k8s.api.storage.v1.VolumeError;
import io.k8s.api.storage.v1.VolumeNodeResources;
import io.k8s.api.storage.v1beta1.CSIStorageCapacity;
import io.k8s.api.storage.v1beta1.CSIStorageCapacityList;
import io.k8s.apimachinery.pkg.apis.meta.v1.APIGroup;
import io.k8s.apimachinery.pkg.apis.meta.v1.APIGroupList;
import io.k8s.apimachinery.pkg.apis.meta.v1.APIResource;
import io.k8s.apimachinery.pkg.apis.meta.v1.APIResourceList;
import io.k8s.apimachinery.pkg.apis.meta.v1.APIVersions;
import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;
import io.k8s.apimachinery.pkg.apis.meta.v1.DeleteOptions;
import io.k8s.apimachinery.pkg.apis.meta.v1.FieldsV1;
import io.k8s.apimachinery.pkg.apis.meta.v1.GroupVersionForDiscovery;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelectorRequirement;
import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import io.k8s.apimachinery.pkg.apis.meta.v1.ManagedFieldsEntry;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import io.k8s.apimachinery.pkg.apis.meta.v1.OwnerReference;
import io.k8s.apimachinery.pkg.apis.meta.v1.Patch;
import io.k8s.apimachinery.pkg.apis.meta.v1.Preconditions;
import io.k8s.apimachinery.pkg.apis.meta.v1.ServerAddressByClientCIDR;
import io.k8s.apimachinery.pkg.apis.meta.v1.Status;
import io.k8s.apimachinery.pkg.apis.meta.v1.StatusCause;
import io.k8s.apimachinery.pkg.apis.meta.v1.StatusDetails;
import io.k8s.apimachinery.pkg.apis.meta.v1.WatchEvent;
import io.k8s.apimachinery.pkg.runtime.RawExtension;
import io.k8s.apimachinery.pkg.version.Info;
import io.k8s.kube_aggregator.pkg.apis.apiregistration.v1.APIService;
import io.k8s.kube_aggregator.pkg.apis.apiregistration.v1.APIServiceCondition;
import io.k8s.kube_aggregator.pkg.apis.apiregistration.v1.APIServiceList;
import io.k8s.kube_aggregator.pkg.apis.apiregistration.v1.APIServiceSpec;
import io.k8s.kube_aggregator.pkg.apis.apiregistration.v1.APIServiceStatus;
import io.k8s.kube_aggregator.pkg.apis.apiregistration.v1.ServiceReference;

public class Schema {

    /**
     * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
     * 
     */
    public MutatingWebhook mutatingWebhook;
    /**
     * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
     * 
     */
    public MutatingWebhookConfiguration mutatingWebhookConfiguration;
    /**
     * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
     * 
     */
    public MutatingWebhookConfigurationList mutatingWebhookConfigurationList;
    /**
     * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
     * 
     */
    public RuleWithOperations ruleWithOperations;
    /**
     * ServiceReference holds a reference to Service.legacy.k8s.io
     * 
     */
    public ServiceReference serviceReference;
    /**
     * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
     * 
     */
    public ValidatingWebhook validatingWebhook;
    /**
     * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
     * 
     */
    public ValidatingWebhookConfiguration validatingWebhookConfiguration;
    /**
     * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
     * 
     */
    public ValidatingWebhookConfigurationList validatingWebhookConfigurationList;
    /**
     * WebhookClientConfig contains the information to make a TLS connection with the webhook
     * 
     */
    public WebhookClientConfig webhookClientConfig;
    /**
     * ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
     * 
     */
    public ControllerRevision controllerRevision;
    /**
     * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
     * 
     */
    public ControllerRevisionList controllerRevisionList;
    /**
     * DaemonSet represents the configuration of a daemon set.
     * 
     */
    public DaemonSet daemonSet;
    /**
     * DaemonSetCondition describes the state of a DaemonSet at a certain point.
     * 
     */
    public DaemonSetCondition daemonSetCondition;
    /**
     * DaemonSetList is a collection of daemon sets.
     * 
     */
    public DaemonSetList daemonSetList;
    /**
     * DaemonSetSpec is the specification of a daemon set.
     * 
     */
    public DaemonSetSpec daemonSetSpec;
    /**
     * DaemonSetStatus represents the current status of a daemon set.
     * 
     */
    public DaemonSetStatus daemonSetStatus;
    /**
     * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
     * 
     */
    public DaemonSetUpdateStrategy daemonSetUpdateStrategy;
    /**
     * Deployment enables declarative updates for Pods and ReplicaSets.
     * 
     */
    public Deployment deployment;
    /**
     * DeploymentCondition describes the state of a deployment at a certain point.
     * 
     */
    public DeploymentCondition deploymentCondition;
    /**
     * DeploymentList is a list of Deployments.
     * 
     */
    public DeploymentList deploymentList;
    /**
     * DeploymentSpec is the specification of the desired behavior of the Deployment.
     * 
     */
    public DeploymentSpec deploymentSpec;
    /**
     * DeploymentStatus is the most recently observed status of the Deployment.
     * 
     */
    public DeploymentStatus deploymentStatus;
    /**
     * DeploymentStrategy describes how to replace existing pods with new ones.
     * 
     */
    public DeploymentStrategy deploymentStrategy;
    /**
     * ReplicaSet ensures that a specified number of pod replicas are running at any given time.
     * 
     */
    public ReplicaSet replicaSet;
    /**
     * ReplicaSetCondition describes the state of a replica set at a certain point.
     * 
     */
    public ReplicaSetCondition replicaSetCondition;
    /**
     * ReplicaSetList is a collection of ReplicaSets.
     * 
     */
    public ReplicaSetList replicaSetList;
    /**
     * ReplicaSetSpec is the specification of a ReplicaSet.
     * 
     */
    public ReplicaSetSpec replicaSetSpec;
    /**
     * ReplicaSetStatus represents the current status of a ReplicaSet.
     * 
     */
    public ReplicaSetStatus replicaSetStatus;
    /**
     * Spec to control the desired behavior of daemon set rolling update.
     * 
     */
    public RollingUpdateDaemonSet rollingUpdateDaemonSet;
    /**
     * Spec to control the desired behavior of rolling update.
     * 
     */
    public RollingUpdateDeployment rollingUpdateDeployment;
    /**
     * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
     * 
     */
    public RollingUpdateStatefulSetStrategy rollingUpdateStatefulSetStrategy;
    /**
     * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
     *   - Network: A single stable DNS and hostname.
     *   - Storage: As many VolumeClaims as requested.
     * 
     * The StatefulSet guarantees that a given network identity will always map to the same storage identity.
     * 
     */
    public StatefulSet statefulSet;
    /**
     * StatefulSetCondition describes the state of a statefulset at a certain point.
     * 
     */
    public StatefulSetCondition statefulSetCondition;
    /**
     * StatefulSetList is a collection of StatefulSets.
     * 
     */
    public StatefulSetList statefulSetList;
    /**
     * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
     * 
     */
    public StatefulSetPersistentVolumeClaimRetentionPolicy statefulSetPersistentVolumeClaimRetentionPolicy;
    /**
     * A StatefulSetSpec is the specification of a StatefulSet.
     * 
     */
    public StatefulSetSpec statefulSetSpec;
    /**
     * StatefulSetStatus represents the current state of a StatefulSet.
     * 
     */
    public StatefulSetStatus statefulSetStatus;
    /**
     * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
     * 
     */
    public StatefulSetUpdateStrategy statefulSetUpdateStrategy;
    /**
     * BoundObjectReference is a reference to an object that a token is bound to.
     * 
     */
    public BoundObjectReference boundObjectReference;
    /**
     * TokenRequest contains parameters of a service account token.
     * 
     */
    public TokenRequest tokenRequest;
    /**
     * TokenRequestSpec contains client provided parameters of a token request.
     * 
     */
    public TokenRequestSpec tokenRequestSpec;
    /**
     * TokenRequestStatus is the result of a token request.
     * 
     */
    public TokenRequestStatus tokenRequestStatus;
    /**
     * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.
     * 
     */
    public TokenReview tokenReview;
    /**
     * TokenReviewSpec is a description of the token authentication request.
     * 
     */
    public TokenReviewSpec tokenReviewSpec;
    /**
     * TokenReviewStatus is the result of the token authentication request.
     * 
     */
    public TokenReviewStatus tokenReviewStatus;
    /**
     * UserInfo holds the information about the user needed to implement the user.Info interface.
     * 
     */
    public UserInfo userInfo;
    /**
     * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a given namespace. Having a namespace scoped resource makes it much easier to grant namespace scoped policy that includes permissions checking.
     * 
     */
    public LocalSubjectAccessReview localSubjectAccessReview;
    /**
     * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
     * 
     */
    public NonResourceAttributes nonResourceAttributes;
    /**
     * NonResourceRule holds information that describes a rule for the non-resource
     * 
     */
    public NonResourceRule nonResourceRule;
    /**
     * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
     * 
     */
    public ResourceAttributes resourceAttributes;
    /**
     * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
     * 
     */
    public ResourceRule resourceRule;
    /**
     * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not filling in a spec.namespace means "in all namespaces".  Self is a special case, because users should always be able to check whether they can perform an action
     * 
     */
    public SelfSubjectAccessReview selfSubjectAccessReview;
    /**
     * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
     * 
     */
    public SelfSubjectAccessReviewSpec selfSubjectAccessReviewSpec;
    /**
     * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a namespace. The returned list of actions may be incomplete depending on the server's authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview should be used by UIs to show/hide actions, or to quickly let an end user reason about their permissions. It should NOT Be used by external systems to drive authorization decisions as this raises confused deputy, cache lifetime/revocation, and correctness concerns. SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization decisions to the API server.
     * 
     */
    public SelfSubjectRulesReview selfSubjectRulesReview;
    /**
     * SelfSubjectRulesReviewSpec defines the specification for SelfSubjectRulesReview.
     * 
     */
    public SelfSubjectRulesReviewSpec selfSubjectRulesReviewSpec;
    /**
     * SubjectAccessReview checks whether or not a user or group can perform an action.
     * 
     */
    public SubjectAccessReview subjectAccessReview;
    /**
     * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
     * 
     */
    public SubjectAccessReviewSpec subjectAccessReviewSpec;
    /**
     * SubjectAccessReviewStatus
     * 
     */
    public SubjectAccessReviewStatus subjectAccessReviewStatus;
    /**
     * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.
     * 
     */
    public SubjectRulesReviewStatus subjectRulesReviewStatus;
    /**
     * CrossVersionObjectReference contains enough information to let you identify the referred resource.
     * 
     */
    public CrossVersionObjectReference crossVersionObjectReference;
    /**
     * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which automatically manages the replica count of any resource implementing the scale subresource based on the metrics specified.
     * 
     */
    public HorizontalPodAutoscaler horizontalPodAutoscaler;
    /**
     * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
     * 
     */
    public HorizontalPodAutoscalerList horizontalPodAutoscalerList;
    /**
     * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
     * 
     */
    public HorizontalPodAutoscalerSpec horizontalPodAutoscalerSpec;
    /**
     * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
     * 
     */
    public HorizontalPodAutoscalerStatus horizontalPodAutoscalerStatus;
    /**
     * Scale represents a scaling request for a resource.
     * 
     */
    public Scale scale;
    /**
     * ScaleSpec describes the attributes of a scale subresource.
     * 
     */
    public ScaleSpec scaleSpec;
    /**
     * ScaleStatus represents the current status of a scale subresource.
     * 
     */
    public ScaleStatus scaleStatus;
    /**
     * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
     * 
     */
    public ContainerResourceMetricSource containerResourceMetricSource;
    /**
     * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    public ContainerResourceMetricStatus containerResourceMetricStatus;
    /**
     * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    public ExternalMetricSource externalMetricSource;
    /**
     * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
     * 
     */
    public ExternalMetricStatus externalMetricStatus;
    /**
     * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
     * 
     */
    public HPAScalingPolicy hPAScalingPolicy;
    /**
     * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
     * 
     */
    public HPAScalingRules hPAScalingRules;
    /**
     * HorizontalPodAutoscalerBehavior configures the scaling behavior of the target in both Up and Down directions (scaleUp and scaleDown fields respectively).
     * 
     */
    public HorizontalPodAutoscalerBehavior horizontalPodAutoscalerBehavior;
    /**
     * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
     * 
     */
    public HorizontalPodAutoscalerCondition horizontalPodAutoscalerCondition;
    /**
     * MetricIdentifier defines the name and optionally selector for a metric
     * 
     */
    public MetricIdentifier metricIdentifier;
    /**
     * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
     * 
     */
    public MetricSpec metricSpec;
    /**
     * MetricStatus describes the last-read state of a single metric.
     * 
     */
    public MetricStatus metricStatus;
    /**
     * MetricTarget defines the target value, average value, or average utilization of a specific metric
     * 
     */
    public MetricTarget metricTarget;
    /**
     * MetricValueStatus holds the current value for a metric
     * 
     */
    public MetricValueStatus metricValueStatus;
    /**
     * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public ObjectMetricSource objectMetricSource;
    /**
     * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public ObjectMetricStatus objectMetricStatus;
    /**
     * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
     * 
     */
    public PodsMetricSource podsMetricSource;
    /**
     * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
     * 
     */
    public PodsMetricStatus podsMetricStatus;
    /**
     * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
     * 
     */
    public ResourceMetricSource resourceMetricSource;
    /**
     * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    public ResourceMetricStatus resourceMetricStatus;
    /**
     * CronJob represents the configuration of a single cron job.
     * 
     */
    public CronJob cronJob;
    /**
     * CronJobList is a collection of cron jobs.
     * 
     */
    public CronJobList cronJobList;
    /**
     * CronJobSpec describes how the job execution will look like and when it will actually run.
     * 
     */
    public CronJobSpec cronJobSpec;
    /**
     * CronJobStatus represents the current state of a cron job.
     * 
     */
    public CronJobStatus cronJobStatus;
    /**
     * Job represents the configuration of a single job.
     * 
     */
    public Job job;
    /**
     * JobCondition describes current state of a job.
     * 
     */
    public JobCondition jobCondition;
    /**
     * JobList is a collection of jobs.
     * 
     */
    public JobList jobList;
    /**
     * JobSpec describes how the job execution will look like.
     * 
     */
    public JobSpec jobSpec;
    /**
     * JobStatus represents the current state of a Job.
     * 
     */
    public JobStatus jobStatus;
    /**
     * JobTemplateSpec describes the data a Job should have when created from a template
     * 
     */
    public JobTemplateSpec jobTemplateSpec;
    /**
     * PodFailurePolicy describes how failed pods influence the backoffLimit.
     * 
     */
    public PodFailurePolicy podFailurePolicy;
    /**
     * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
     * 
     */
    public PodFailurePolicyOnExitCodesRequirement podFailurePolicyOnExitCodesRequirement;
    /**
     * PodFailurePolicyOnPodConditionsPattern describes a pattern for matching an actual pod condition type.
     * 
     */
    public PodFailurePolicyOnPodConditionsPattern podFailurePolicyOnPodConditionsPattern;
    /**
     * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of OnExitCodes and onPodConditions, but not both, can be used in each rule.
     * 
     */
    public PodFailurePolicyRule podFailurePolicyRule;
    /**
     * UncountedTerminatedPods holds UIDs of Pods that have terminated but haven't been accounted in Job status counters.
     * 
     */
    public UncountedTerminatedPods uncountedTerminatedPods;
    /**
     * CertificateSigningRequest objects provide a mechanism to obtain x509 certificates by submitting a certificate signing request, and having it asynchronously approved and issued.
     * 
     * Kubelets use this API to obtain:
     *  1. client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client-kubelet" signerName).
     *  2. serving certificates for TLS endpoints kube-apiserver can connect to securely (with the "kubernetes.io/kubelet-serving" signerName).
     * 
     * This API can be used to request client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client" signerName), or to obtain certificates from custom non-Kubernetes signers.
     * 
     */
    public CertificateSigningRequest certificateSigningRequest;
    /**
     * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
     * 
     */
    public CertificateSigningRequestCondition certificateSigningRequestCondition;
    /**
     * CertificateSigningRequestList is a collection of CertificateSigningRequest objects
     * 
     */
    public CertificateSigningRequestList certificateSigningRequestList;
    /**
     * CertificateSigningRequestSpec contains the certificate request.
     * 
     */
    public CertificateSigningRequestSpec certificateSigningRequestSpec;
    /**
     * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
     * 
     */
    public CertificateSigningRequestStatus certificateSigningRequestStatus;
    /**
     * Lease defines a lease concept.
     * 
     */
    public Lease lease;
    /**
     * LeaseList is a list of Lease objects.
     * 
     */
    public LeaseList leaseList;
    /**
     * LeaseSpec is a specification of a Lease.
     * 
     */
    public LeaseSpec leaseSpec;
    /**
     * Represents a Persistent Disk resource in AWS.
     * 
     * An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
     * 
     */
    public AWSElasticBlockStoreVolumeSource aWSElasticBlockStoreVolumeSource;
    /**
     * Affinity is a group of affinity scheduling rules.
     * 
     */
    public Affinity affinity;
    /**
     * AttachedVolume describes a volume attached to a node
     * 
     */
    public AttachedVolume attachedVolume;
    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     * 
     */
    public AzureDiskVolumeSource azureDiskVolumeSource;
    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    public AzureFilePersistentVolumeSource azureFilePersistentVolumeSource;
    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    public AzureFileVolumeSource azureFileVolumeSource;
    /**
     * Binding ties one object to another; for example, a pod is bound to a node by a scheduler. Deprecated in 1.7, please use the bindings subresource of pods instead.
     * 
     */
    public Binding binding;
    /**
     * Represents storage that is managed by an external CSI volume driver (Beta feature)
     * 
     */
    public CSIPersistentVolumeSource cSIPersistentVolumeSource;
    /**
     * Represents a source location of a volume to mount, managed by an external CSI driver
     * 
     */
    public CSIVolumeSource cSIVolumeSource;
    /**
     * Adds and removes POSIX capabilities from running containers.
     * 
     */
    public Capabilities capabilities;
    /**
     * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public CephFSPersistentVolumeSource cephFSPersistentVolumeSource;
    /**
     * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public CephFSVolumeSource cephFSVolumeSource;
    /**
     * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
     * 
     */
    public CinderPersistentVolumeSource cinderPersistentVolumeSource;
    /**
     * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
     * 
     */
    public CinderVolumeSource cinderVolumeSource;
    /**
     * ClientIPConfig represents the configurations of Client IP based session affinity.
     * 
     */
    public ClientIPConfig clientIPConfig;
    /**
     * Information about the condition of a component.
     * 
     */
    public ComponentCondition componentCondition;
    /**
     * ComponentStatus (and ComponentStatusList) holds the cluster validation info. Deprecated: This API is deprecated in v1.19+
     * 
     */
    public ComponentStatus componentStatus;
    /**
     * Status of all the conditions for the component as a list of ComponentStatus objects. Deprecated: This API is deprecated in v1.19+
     * 
     */
    public ComponentStatusList componentStatusList;
    /**
     * ConfigMap holds configuration data for pods to consume.
     * 
     */
    public ConfigMap configMap;
    /**
     * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
     * 
     * The contents of the target ConfigMap's Data field will represent the key-value pairs as environment variables.
     * 
     */
    public ConfigMapEnvSource configMapEnvSource;
    /**
     * Selects a key from a ConfigMap.
     * 
     */
    public ConfigMapKeySelector configMapKeySelector;
    /**
     * ConfigMapList is a resource containing a list of ConfigMap objects.
     * 
     */
    public ConfigMapList configMapList;
    /**
     * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node. This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
     * 
     */
    public ConfigMapNodeConfigSource configMapNodeConfigSource;
    /**
     * Adapts a ConfigMap into a projected volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
     * 
     */
    public ConfigMapProjection configMapProjection;
    /**
     * Adapts a ConfigMap into a volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. ConfigMap volumes support ownership management and SELinux relabeling.
     * 
     */
    public ConfigMapVolumeSource configMapVolumeSource;
    /**
     * A single application container that you want to run within a pod.
     * 
     */
    public Container container;
    /**
     * Describe a container image
     * 
     */
    public ContainerImage containerImage;
    /**
     * ContainerPort represents a network port in a single container.
     * 
     */
    public ContainerPort containerPort;
    /**
     * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
     * 
     */
    public ContainerState containerState;
    /**
     * ContainerStateRunning is a running state of a container.
     * 
     */
    public ContainerStateRunning containerStateRunning;
    /**
     * ContainerStateTerminated is a terminated state of a container.
     * 
     */
    public ContainerStateTerminated containerStateTerminated;
    /**
     * ContainerStateWaiting is a waiting state of a container.
     * 
     */
    public ContainerStateWaiting containerStateWaiting;
    /**
     * ContainerStatus contains details for the current status of this container.
     * 
     */
    public ContainerStatus containerStatus;
    /**
     * DaemonEndpoint contains information about a single Daemon endpoint.
     * 
     */
    public DaemonEndpoint daemonEndpoint;
    /**
     * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
     * 
     */
    public DownwardAPIProjection downwardAPIProjection;
    /**
     * DownwardAPIVolumeFile represents information to create the file containing the pod field
     * 
     */
    public DownwardAPIVolumeFile downwardAPIVolumeFile;
    /**
     * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
     * 
     */
    public DownwardAPIVolumeSource downwardAPIVolumeSource;
    /**
     * Represents an empty directory for a pod. Empty directory volumes support ownership management and SELinux relabeling.
     * 
     */
    public EmptyDirVolumeSource emptyDirVolumeSource;
    /**
     * EndpointAddress is a tuple that describes single IP address.
     * 
     */
    public EndpointAddress endpointAddress;
    /**
     * EndpointPort represents a Port used by an EndpointSlice
     * 
     */
    public EndpointPort endpointPort;
    /**
     * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
     * 
     * 	{
     * 	  Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
     * 	  Ports:     [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
     * 	}
     * 
     * The resulting set of endpoints can be viewed as:
     * 
     * 	a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
     * 	b: [ 10.10.1.1:309, 10.10.2.2:309 ]
     * 
     */
    public EndpointSubset endpointSubset;
    /**
     * Endpoints is a collection of endpoints that implement the actual service. Example:
     * 
     * 	 Name: "mysvc",
     * 	 Subsets: [
     * 	   {
     * 	     Addresses: [{"ip": "10.10.1.1"}, {"ip": "10.10.2.2"}],
     * 	     Ports: [{"name": "a", "port": 8675}, {"name": "b", "port": 309}]
     * 	   },
     * 	   {
     * 	     Addresses: [{"ip": "10.10.3.3"}],
     * 	     Ports: [{"name": "a", "port": 93}, {"name": "b", "port": 76}]
     * 	   },
     * 	]
     * 
     */
    public Endpoints endpoints;
    /**
     * EndpointsList is a list of endpoints.
     * 
     */
    public EndpointsList endpointsList;
    /**
     * EnvFromSource represents the source of a set of ConfigMaps
     * 
     */
    public EnvFromSource envFromSource;
    /**
     * EnvVar represents an environment variable present in a Container.
     * 
     */
    public EnvVar envVar;
    /**
     * EnvVarSource represents a source for the value of an EnvVar.
     * 
     */
    public EnvVarSource envVarSource;
    /**
     * An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.
     * 
     * To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.
     * 
     */
    public EphemeralContainer ephemeralContainer;
    /**
     * Represents an ephemeral volume that is handled by a normal storage driver.
     * 
     */
    public EphemeralVolumeSource ephemeralVolumeSource;
    /**
     * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
     * 
     */
    public Event event;
    /**
     * EventList is a list of Event objects.
     * 
     */
    public EventList eventList;
    /**
     * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
     * 
     */
    public EventSeries eventSeries;
    /**
     * EventSource contains information for an event.
     * 
     */
    public EventSource eventSource;
    /**
     * ExecAction describes a "run in container" action.
     * 
     */
    public ExecAction execAction;
    /**
     * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
     * 
     */
    public FCVolumeSource fCVolumeSource;
    /**
     * FlexPersistentVolumeSource represents a generic persistent volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    public FlexPersistentVolumeSource flexPersistentVolumeSource;
    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    public FlexVolumeSource flexVolumeSource;
    /**
     * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public FlockerVolumeSource flockerVolumeSource;
    /**
     * Represents a Persistent Disk resource in Google Compute Engine.
     * 
     * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
     * 
     */
    public GCEPersistentDiskVolumeSource gCEPersistentDiskVolumeSource;
    public GRPCAction gRPCAction;
    /**
     * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
     * 
     * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     * 
     */
    public GitRepoVolumeSource gitRepoVolumeSource;
    /**
     * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public GlusterfsPersistentVolumeSource glusterfsPersistentVolumeSource;
    /**
     * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public GlusterfsVolumeSource glusterfsVolumeSource;
    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     * 
     */
    public HTTPGetAction hTTPGetAction;
    /**
     * HTTPHeader describes a custom header to be used in HTTP probes
     * 
     */
    public HTTPHeader hTTPHeader;
    /**
     * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
     * 
     */
    public HostAlias hostAlias;
    /**
     * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public HostPathVolumeSource hostPathVolumeSource;
    /**
     * ISCSIPersistentVolumeSource represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
     * 
     */
    public ISCSIPersistentVolumeSource iSCSIPersistentVolumeSource;
    /**
     * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
     * 
     */
    public ISCSIVolumeSource iSCSIVolumeSource;
    /**
     * Maps a string key to a path within a volume.
     * 
     */
    public KeyToPath keyToPath;
    /**
     * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
     * 
     */
    public Lifecycle lifecycle;
    /**
     * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
     * 
     */
    public LifecycleHandler lifecycleHandler;
    /**
     * LimitRange sets resource usage limits for each kind of resource in a Namespace.
     * 
     */
    public LimitRange limitRange;
    /**
     * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
     * 
     */
    public LimitRangeItem limitRangeItem;
    /**
     * LimitRangeList is a list of LimitRange items.
     * 
     */
    public LimitRangeList limitRangeList;
    /**
     * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
     * 
     */
    public LimitRangeSpec limitRangeSpec;
    /**
     * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
     * 
     */
    public LoadBalancerIngress loadBalancerIngress;
    /**
     * LoadBalancerStatus represents the status of a load-balancer.
     * 
     */
    public LoadBalancerStatus loadBalancerStatus;
    /**
     * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
     * 
     */
    public LocalObjectReference localObjectReference;
    /**
     * Local represents directly-attached storage with node affinity (Beta feature)
     * 
     */
    public LocalVolumeSource localVolumeSource;
    /**
     * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public NFSVolumeSource nFSVolumeSource;
    /**
     * Namespace provides a scope for Names. Use of multiple namespaces is optional.
     * 
     */
    public Namespace namespace;
    /**
     * NamespaceCondition contains details about state of namespace.
     * 
     */
    public NamespaceCondition namespaceCondition;
    /**
     * NamespaceList is a list of Namespaces.
     * 
     */
    public NamespaceList namespaceList;
    /**
     * NamespaceSpec describes the attributes on a Namespace.
     * 
     */
    public NamespaceSpec namespaceSpec;
    /**
     * NamespaceStatus is information about the current status of a Namespace.
     * 
     */
    public NamespaceStatus namespaceStatus;
    /**
     * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache (i.e. in etcd).
     * 
     */
    public Node node;
    /**
     * NodeAddress contains information for the node's address.
     * 
     */
    public NodeAddress nodeAddress;
    /**
     * Node affinity is a group of node affinity scheduling rules.
     * 
     */
    public NodeAffinity nodeAffinity;
    /**
     * NodeCondition contains condition information for a node.
     * 
     */
    public NodeCondition nodeCondition;
    /**
     * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
     * 
     */
    public NodeConfigSource nodeConfigSource;
    /**
     * NodeConfigStatus describes the status of the config assigned by Node.Spec.ConfigSource.
     * 
     */
    public NodeConfigStatus nodeConfigStatus;
    /**
     * NodeDaemonEndpoints lists ports opened by daemons running on the Node.
     * 
     */
    public NodeDaemonEndpoints nodeDaemonEndpoints;
    /**
     * NodeList is the whole list of all Nodes which have been registered with master.
     * 
     */
    public NodeList nodeList;
    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    public NodeSelector nodeSelector;
    /**
     * A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
     * 
     */
    public NodeSelectorRequirement nodeSelectorRequirement;
    /**
     * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
     * 
     */
    public NodeSelectorTerm nodeSelectorTerm;
    /**
     * NodeSpec describes the attributes that a node is created with.
     * 
     */
    public NodeSpec nodeSpec;
    /**
     * NodeStatus is information about the current status of a node.
     * 
     */
    public NodeStatus nodeStatus;
    /**
     * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
     * 
     */
    public NodeSystemInfo nodeSystemInfo;
    /**
     * ObjectFieldSelector selects an APIVersioned field of an object.
     * 
     */
    public ObjectFieldSelector objectFieldSelector;
    /**
     * ObjectReference contains enough information to let you inspect or modify the referred object.
     * 
     */
    public ObjectReference objectReference;
    /**
     * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
     * 
     */
    public PersistentVolume persistentVolume;
    /**
     * PersistentVolumeClaim is a user's request for and claim to a persistent volume
     * 
     */
    public PersistentVolumeClaim persistentVolumeClaim;
    /**
     * PersistentVolumeClaimCondition contails details about state of pvc
     * 
     */
    public PersistentVolumeClaimCondition persistentVolumeClaimCondition;
    /**
     * PersistentVolumeClaimList is a list of PersistentVolumeClaim items.
     * 
     */
    public PersistentVolumeClaimList persistentVolumeClaimList;
    /**
     * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
     * 
     */
    public PersistentVolumeClaimSpec persistentVolumeClaimSpec;
    /**
     * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
     * 
     */
    public PersistentVolumeClaimStatus persistentVolumeClaimStatus;
    /**
     * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
     * 
     */
    public PersistentVolumeClaimTemplate persistentVolumeClaimTemplate;
    /**
     * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
     * 
     */
    public PersistentVolumeClaimVolumeSource persistentVolumeClaimVolumeSource;
    /**
     * PersistentVolumeList is a list of PersistentVolume items.
     * 
     */
    public PersistentVolumeList persistentVolumeList;
    /**
     * PersistentVolumeSpec is the specification of a persistent volume.
     * 
     */
    public PersistentVolumeSpec persistentVolumeSpec;
    /**
     * PersistentVolumeStatus is the current status of a persistent volume.
     * 
     */
    public PersistentVolumeStatus persistentVolumeStatus;
    /**
     * Represents a Photon Controller persistent disk resource.
     * 
     */
    public PhotonPersistentDiskVolumeSource photonPersistentDiskVolumeSource;
    /**
     * Pod is a collection of containers that can run on a host. This resource is created by clients and scheduled onto hosts.
     * 
     */
    public Pod pod;
    /**
     * Pod affinity is a group of inter pod affinity scheduling rules.
     * 
     */
    public PodAffinity podAffinity;
    /**
     * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
     * 
     */
    public PodAffinityTerm podAffinityTerm;
    /**
     * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
     * 
     */
    public PodAntiAffinity podAntiAffinity;
    /**
     * PodCondition contains details for the current condition of this pod.
     * 
     */
    public PodCondition podCondition;
    /**
     * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
     * 
     */
    public PodDNSConfig podDNSConfig;
    /**
     * PodDNSConfigOption defines DNS resolver options of a pod.
     * 
     */
    public PodDNSConfigOption podDNSConfigOption;
    /**
     * IP address information for entries in the (plural) PodIPs field. Each entry includes:
     * 
     * 	IP: An IP address allocated to the pod. Routable at least within the cluster.
     * 
     */
    public PodIP podIP;
    /**
     * PodList is a list of Pods.
     * 
     */
    public PodList podList;
    /**
     * PodOS defines the OS parameters of a pod.
     * 
     */
    public PodOS podOS;
    /**
     * PodReadinessGate contains the reference to a pod condition
     * 
     */
    public PodReadinessGate podReadinessGate;
    /**
     * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
     * 
     */
    public PodSecurityContext podSecurityContext;
    /**
     * PodSpec is a description of a pod.
     * 
     */
    public PodSpec podSpec;
    /**
     * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
     * 
     */
    public PodStatus podStatus;
    /**
     * PodTemplate describes a template for creating copies of a predefined pod.
     * 
     */
    public PodTemplate podTemplate;
    /**
     * PodTemplateList is a list of PodTemplates.
     * 
     */
    public PodTemplateList podTemplateList;
    /**
     * PodTemplateSpec describes the data a pod should have when created from a template
     * 
     */
    public PodTemplateSpec podTemplateSpec;
    public PortStatus portStatus;
    /**
     * PortworxVolumeSource represents a Portworx volume resource.
     * 
     */
    public PortworxVolumeSource portworxVolumeSource;
    /**
     * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
     * 
     */
    public PreferredSchedulingTerm preferredSchedulingTerm;
    /**
     * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
     * 
     */
    public Probe probe;
    /**
     * Represents a projected volume source
     * 
     */
    public ProjectedVolumeSource projectedVolumeSource;
    /**
     * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
     * 
     */
    public QuobyteVolumeSource quobyteVolumeSource;
    /**
     * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
     * 
     */
    public RBDPersistentVolumeSource rBDPersistentVolumeSource;
    /**
     * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
     * 
     */
    public RBDVolumeSource rBDVolumeSource;
    /**
     * ReplicationController represents the configuration of a replication controller.
     * 
     */
    public ReplicationController replicationController;
    /**
     * ReplicationControllerCondition describes the state of a replication controller at a certain point.
     * 
     */
    public ReplicationControllerCondition replicationControllerCondition;
    /**
     * ReplicationControllerList is a collection of replication controllers.
     * 
     */
    public ReplicationControllerList replicationControllerList;
    /**
     * ReplicationControllerSpec is the specification of a replication controller.
     * 
     */
    public ReplicationControllerSpec replicationControllerSpec;
    /**
     * ReplicationControllerStatus represents the current status of a replication controller.
     * 
     */
    public ReplicationControllerStatus replicationControllerStatus;
    /**
     * ResourceFieldSelector represents container resources (cpu, memory) and their output format
     * 
     */
    public ResourceFieldSelector resourceFieldSelector;
    /**
     * ResourceQuota sets aggregate quota restrictions enforced per namespace
     * 
     */
    public ResourceQuota resourceQuota;
    /**
     * ResourceQuotaList is a list of ResourceQuota items.
     * 
     */
    public ResourceQuotaList resourceQuotaList;
    /**
     * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
     * 
     */
    public ResourceQuotaSpec resourceQuotaSpec;
    /**
     * ResourceQuotaStatus defines the enforced hard limits and observed use.
     * 
     */
    public ResourceQuotaStatus resourceQuotaStatus;
    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    public ResourceRequirements resourceRequirements;
    /**
     * SELinuxOptions are the labels to be applied to the container
     * 
     */
    public SELinuxOptions sELinuxOptions;
    /**
     * ScaleIOPersistentVolumeSource represents a persistent ScaleIO volume
     * 
     */
    public ScaleIOPersistentVolumeSource scaleIOPersistentVolumeSource;
    /**
     * ScaleIOVolumeSource represents a persistent ScaleIO volume
     * 
     */
    public ScaleIOVolumeSource scaleIOVolumeSource;
    /**
     * A scope selector represents the AND of the selectors represented by the scoped-resource selector requirements.
     * 
     */
    public ScopeSelector scopeSelector;
    /**
     * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
     * 
     */
    public ScopedResourceSelectorRequirement scopedResourceSelectorRequirement;
    /**
     * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
     * 
     */
    public SeccompProfile seccompProfile;
    /**
     * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
     * 
     */
    public Secret secret;
    /**
     * SecretEnvSource selects a Secret to populate the environment variables with.
     * 
     * The contents of the target Secret's Data field will represent the key-value pairs as environment variables.
     * 
     */
    public SecretEnvSource secretEnvSource;
    /**
     * SecretKeySelector selects a key of a Secret.
     * 
     */
    public SecretKeySelector secretKeySelector;
    /**
     * SecretList is a list of Secret.
     * 
     */
    public SecretList secretList;
    /**
     * Adapts a secret into a projected volume.
     * 
     * The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
     * 
     */
    public SecretProjection secretProjection;
    /**
     * SecretReference represents a Secret Reference. It has enough information to retrieve secret in any namespace
     * 
     */
    public SecretReference secretReference;
    /**
     * Adapts a Secret into a volume.
     * 
     * The contents of the target Secret's Data field will be presented in a volume as files using the keys in the Data field as the file names. Secret volumes support ownership management and SELinux relabeling.
     * 
     */
    public SecretVolumeSource secretVolumeSource;
    /**
     * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
     * 
     */
    public SecurityContext securityContext;
    /**
     * Service is a named abstraction of software service (for example, mysql) consisting of local port (for example 3306) that the proxy listens on, and the selector that determines which pods will answer requests sent through the proxy.
     * 
     */
    public Service service;
    /**
     * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
     * 
     */
    public ServiceAccount serviceAccount;
    /**
     * ServiceAccountList is a list of ServiceAccount objects
     * 
     */
    public ServiceAccountList serviceAccountList;
    /**
     * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
     * 
     */
    public ServiceAccountTokenProjection serviceAccountTokenProjection;
    /**
     * ServiceList holds a list of services.
     * 
     */
    public ServiceList serviceList;
    /**
     * ServicePort contains information on service's port.
     * 
     */
    public ServicePort servicePort;
    /**
     * ServiceSpec describes the attributes that a user creates on a service.
     * 
     */
    public ServiceSpec serviceSpec;
    /**
     * ServiceStatus represents the current status of a service.
     * 
     */
    public ServiceStatus serviceStatus;
    /**
     * SessionAffinityConfig represents the configurations of session affinity.
     * 
     */
    public SessionAffinityConfig sessionAffinityConfig;
    /**
     * Represents a StorageOS persistent volume resource.
     * 
     */
    public StorageOSPersistentVolumeSource storageOSPersistentVolumeSource;
    /**
     * Represents a StorageOS persistent volume resource.
     * 
     */
    public StorageOSVolumeSource storageOSVolumeSource;
    /**
     * Sysctl defines a kernel parameter to be set
     * 
     */
    public Sysctl sysctl;
    /**
     * TCPSocketAction describes an action based on opening a socket
     * 
     */
    public TCPSocketAction tCPSocketAction;
    /**
     * The node this Taint is attached to has the "effect" on any pod that does not tolerate the Taint.
     * 
     */
    public Taint taint;
    /**
     * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
     * 
     */
    public Toleration toleration;
    /**
     * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
     * 
     */
    public TopologySelectorLabelRequirement topologySelectorLabelRequirement;
    /**
     * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
     * 
     */
    public TopologySelectorTerm topologySelectorTerm;
    /**
     * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
     * 
     */
    public TopologySpreadConstraint topologySpreadConstraint;
    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
     * 
     */
    public TypedLocalObjectReference typedLocalObjectReference;
    /**
     * Volume represents a named volume in a pod that may be accessed by any container in the pod.
     * 
     */
    public Volume volume;
    /**
     * volumeDevice describes a mapping of a raw block device within a container.
     * 
     */
    public VolumeDevice volumeDevice;
    /**
     * VolumeMount describes a mounting of a Volume within a container.
     * 
     */
    public VolumeMount volumeMount;
    /**
     * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
     * 
     */
    public VolumeNodeAffinity volumeNodeAffinity;
    /**
     * Projection that may be projected along with other supported volume types
     * 
     */
    public VolumeProjection volumeProjection;
    /**
     * Represents a vSphere volume resource.
     * 
     */
    public VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSource;
    /**
     * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
     * 
     */
    public WeightedPodAffinityTerm weightedPodAffinityTerm;
    /**
     * WindowsSecurityContextOptions contain Windows-specific options and credentials.
     * 
     */
    public WindowsSecurityContextOptions windowsSecurityContextOptions;
    /**
     * Endpoint represents a single logical "backend" implementing a service.
     * 
     */
    public Endpoint endpoint;
    /**
     * EndpointConditions represents the current condition of an endpoint.
     * 
     */
    public EndpointConditions endpointConditions;
    /**
     * EndpointHints provides hints describing how an endpoint should be consumed.
     * 
     */
    public EndpointHints endpointHints;
    /**
     * EndpointSlice represents a subset of the endpoints that implement a service. For a given service there may be multiple EndpointSlice objects, selected by labels, which must be joined to produce the full set of endpoints.
     * 
     */
    public EndpointSlice endpointSlice;
    /**
     * EndpointSliceList represents a list of endpoint slices
     * 
     */
    public EndpointSliceList endpointSliceList;
    /**
     * ForZone provides information about which zones should consume this endpoint.
     * 
     */
    public ForZone forZone;
    /**
     * FlowDistinguisherMethod specifies the method of a flow distinguisher.
     * 
     */
    public FlowDistinguisherMethod flowDistinguisherMethod;
    /**
     * FlowSchema defines the schema of a group of flows. Note that a flow is made up of a set of inbound API requests with similar attributes and is identified by a pair of strings: the name of the FlowSchema and a "flow distinguisher".
     * 
     */
    public FlowSchema flowSchema;
    /**
     * FlowSchemaCondition describes conditions for a FlowSchema.
     * 
     */
    public FlowSchemaCondition flowSchemaCondition;
    /**
     * FlowSchemaList is a list of FlowSchema objects.
     * 
     */
    public FlowSchemaList flowSchemaList;
    /**
     * FlowSchemaSpec describes how the FlowSchema's specification looks like.
     * 
     */
    public FlowSchemaSpec flowSchemaSpec;
    /**
     * FlowSchemaStatus represents the current state of a FlowSchema.
     * 
     */
    public FlowSchemaStatus flowSchemaStatus;
    /**
     * GroupSubject holds detailed information for group-kind subject.
     * 
     */
    public GroupSubject groupSubject;
    /**
     * LimitResponse defines how to handle requests that can not be executed right now.
     * 
     */
    public LimitResponse limitResponse;
    /**
     * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
     *   - How are requests for this priority level limited?
     *   - What should be done with requests that exceed the limit?
     * 
     */
    public LimitedPriorityLevelConfiguration limitedPriorityLevelConfiguration;
    /**
     * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
     * 
     */
    public NonResourcePolicyRule nonResourcePolicyRule;
    /**
     * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
     * 
     */
    public PolicyRulesWithSubjects policyRulesWithSubjects;
    /**
     * PriorityLevelConfiguration represents the configuration of a priority level.
     * 
     */
    public PriorityLevelConfiguration priorityLevelConfiguration;
    /**
     * PriorityLevelConfigurationCondition defines the condition of priority level.
     * 
     */
    public PriorityLevelConfigurationCondition priorityLevelConfigurationCondition;
    /**
     * PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.
     * 
     */
    public PriorityLevelConfigurationList priorityLevelConfigurationList;
    /**
     * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
     * 
     */
    public PriorityLevelConfigurationReference priorityLevelConfigurationReference;
    /**
     * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
     * 
     */
    public PriorityLevelConfigurationSpec priorityLevelConfigurationSpec;
    /**
     * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
     * 
     */
    public PriorityLevelConfigurationStatus priorityLevelConfigurationStatus;
    /**
     * QueuingConfiguration holds the configuration parameters for queuing
     * 
     */
    public QueuingConfiguration queuingConfiguration;
    /**
     * ResourcePolicyRule is a predicate that matches some resource requests, testing the request's verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., `Namespace==""`) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request's namespace.
     * 
     */
    public ResourcePolicyRule resourcePolicyRule;
    /**
     * ServiceAccountSubject holds detailed information for service-account-kind subject.
     * 
     */
    public ServiceAccountSubject serviceAccountSubject;
    /**
     * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
     * 
     */
    public Subject subject;
    /**
     * UserSubject holds detailed information for user-kind subject.
     * 
     */
    public UserSubject userSubject;
    /**
     * HTTPIngressPath associates a path with a backend. Incoming urls matching the path are forwarded to the backend.
     * 
     */
    public HTTPIngressPath hTTPIngressPath;
    /**
     * HTTPIngressRuleValue is a list of http selectors pointing to backends. In the example: http://<host>/<path>?<searchpart> -> backend where where parts of the url correspond to RFC 3986, this resource will be used to match against everything after the last '/' and before the first '?' or '#'.
     * 
     */
    public HTTPIngressRuleValue hTTPIngressRuleValue;
    /**
     * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24","2001:db9::/64") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
     * 
     */
    public IPBlock iPBlock;
    /**
     * Ingress is a collection of rules that allow inbound connections to reach the endpoints defined by a backend. An Ingress can be configured to give services externally-reachable urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
     * 
     */
    public Ingress ingress;
    /**
     * IngressBackend describes all endpoints for a given service and port.
     * 
     */
    public IngressBackend ingressBackend;
    /**
     * IngressClass represents the class of the Ingress, referenced by the Ingress Spec. The `ingressclass.kubernetes.io/is-default-class` annotation can be used to indicate that an IngressClass should be considered default. When a single IngressClass resource has this annotation set to true, new Ingress resources without a class specified will be assigned this default class.
     * 
     */
    public IngressClass ingressClass;
    /**
     * IngressClassList is a collection of IngressClasses.
     * 
     */
    public IngressClassList ingressClassList;
    /**
     * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
     * 
     */
    public IngressClassParametersReference ingressClassParametersReference;
    /**
     * IngressClassSpec provides information about the class of an Ingress.
     * 
     */
    public IngressClassSpec ingressClassSpec;
    /**
     * IngressList is a collection of Ingress.
     * 
     */
    public IngressList ingressList;
    /**
     * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
     * 
     */
    public IngressRule ingressRule;
    /**
     * IngressServiceBackend references a Kubernetes Service as a Backend.
     * 
     */
    public IngressServiceBackend ingressServiceBackend;
    /**
     * IngressSpec describes the Ingress the user wishes to exist.
     * 
     */
    public IngressSpec ingressSpec;
    /**
     * IngressStatus describe the current state of the Ingress.
     * 
     */
    public IngressStatus ingressStatus;
    /**
     * IngressTLS describes the transport layer security associated with an Ingress.
     * 
     */
    public IngressTLS ingressTLS;
    /**
     * NetworkPolicy describes what network traffic is allowed for a set of Pods
     * 
     */
    public NetworkPolicy networkPolicy;
    /**
     * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
     * 
     */
    public NetworkPolicyEgressRule networkPolicyEgressRule;
    /**
     * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
     * 
     */
    public NetworkPolicyIngressRule networkPolicyIngressRule;
    /**
     * NetworkPolicyList is a list of NetworkPolicy objects.
     * 
     */
    public NetworkPolicyList networkPolicyList;
    /**
     * NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed
     * 
     */
    public NetworkPolicyPeer networkPolicyPeer;
    /**
     * NetworkPolicyPort describes a port to allow traffic on
     * 
     */
    public NetworkPolicyPort networkPolicyPort;
    /**
     * NetworkPolicySpec provides the specification of a NetworkPolicy
     * 
     */
    public NetworkPolicySpec networkPolicySpec;
    /**
     * NetworkPolicyStatus describe the current state of the NetworkPolicy.
     * 
     */
    public NetworkPolicyStatus networkPolicyStatus;
    /**
     * ServiceBackendPort is the service port being referenced.
     * 
     */
    public ServiceBackendPort serviceBackendPort;
    /**
     * Overhead structure represents the resource overhead associated with running a pod.
     * 
     */
    public Overhead overhead;
    /**
     * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
     * 
     */
    public RuntimeClass runtimeClass;
    /**
     * RuntimeClassList is a list of RuntimeClass objects.
     * 
     */
    public RuntimeClassList runtimeClassList;
    /**
     * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
     * 
     */
    public Scheduling scheduling;
    /**
     * Eviction evicts a pod from its node subject to certain policies and safety constraints. This is a subresource of Pod.  A request to cause such an eviction is created by POSTing to .../pods/<pod name>/evictions.
     * 
     */
    public Eviction eviction;
    /**
     * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
     * 
     */
    public PodDisruptionBudget podDisruptionBudget;
    /**
     * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
     * 
     */
    public PodDisruptionBudgetList podDisruptionBudgetList;
    /**
     * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
     * 
     */
    public PodDisruptionBudgetSpec podDisruptionBudgetSpec;
    /**
     * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
     * 
     */
    public PodDisruptionBudgetStatus podDisruptionBudgetStatus;
    /**
     * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
     * 
     */
    public AggregationRule aggregationRule;
    /**
     * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
     * 
     */
    public ClusterRole clusterRole;
    /**
     * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject.
     * 
     */
    public ClusterRoleBinding clusterRoleBinding;
    /**
     * ClusterRoleBindingList is a collection of ClusterRoleBindings
     * 
     */
    public ClusterRoleBindingList clusterRoleBindingList;
    /**
     * ClusterRoleList is a collection of ClusterRoles
     * 
     */
    public ClusterRoleList clusterRoleList;
    /**
     * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
     * 
     */
    public PolicyRule policyRule;
    /**
     * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
     * 
     */
    public Role role;
    /**
     * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.
     * 
     */
    public RoleBinding roleBinding;
    /**
     * RoleBindingList is a collection of RoleBindings
     * 
     */
    public RoleBindingList roleBindingList;
    /**
     * RoleList is a collection of Roles
     * 
     */
    public RoleList roleList;
    /**
     * RoleRef contains information that points to the role being used
     * 
     */
    public RoleRef roleRef;
    /**
     * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
     * 
     */
    public PriorityClass priorityClass;
    /**
     * PriorityClassList is a collection of priority classes.
     * 
     */
    public PriorityClassList priorityClassList;
    /**
     * CSIDriver captures information about a Container Storage Interface (CSI) volume driver deployed on the cluster. Kubernetes attach detach controller uses this object to determine whether attach is required. Kubelet uses this object to determine whether pod information needs to be passed on mount. CSIDriver objects are non-namespaced.
     * 
     */
    public CSIDriver cSIDriver;
    /**
     * CSIDriverList is a collection of CSIDriver objects.
     * 
     */
    public CSIDriverList cSIDriverList;
    /**
     * CSIDriverSpec is the specification of a CSIDriver.
     * 
     */
    public CSIDriverSpec cSIDriverSpec;
    /**
     * CSINode holds information about all CSI drivers installed on a node. CSI drivers do not need to create the CSINode object directly. As long as they use the node-driver-registrar sidecar container, the kubelet will automatically populate the CSINode object for the CSI driver as part of kubelet plugin registration. CSINode has the same name as a node. If the object is missing, it means either there are no CSI Drivers available on the node, or the Kubelet version is low enough that it doesn't create this object. CSINode has an OwnerReference that points to the corresponding node object.
     * 
     */
    public CSINode cSINode;
    /**
     * CSINodeDriver holds information about the specification of one CSI driver installed on a node
     * 
     */
    public CSINodeDriver cSINodeDriver;
    /**
     * CSINodeList is a collection of CSINode objects.
     * 
     */
    public CSINodeList cSINodeList;
    /**
     * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
     * 
     */
    public CSINodeSpec cSINodeSpec;
    /**
     * CSIStorageCapacity stores the result of one CSI GetCapacity call. For a given StorageClass, this describes the available capacity in a particular topology segment.  This can be used when considering where to instantiate new PersistentVolumes.
     * 
     * For example this can express things like: - StorageClass "standard" has "1234 GiB" available in "topology.kubernetes.io/zone=us-east1" - StorageClass "localssd" has "10 GiB" available in "kubernetes.io/hostname=knode-abc123"
     * 
     * The following three cases all imply that no capacity is available for a certain combination: - no object exists with suitable topology and storage class name - such an object exists, but the capacity is unset - such an object exists, but the capacity is zero
     * 
     * The producer of these objects can decide which approach is more suitable.
     * 
     * They are consumed by the kube-scheduler when a CSI driver opts into capacity-aware scheduling with CSIDriverSpec.StorageCapacity. The scheduler compares the MaximumVolumeSize against the requested size of pending volumes to filter out unsuitable nodes. If MaximumVolumeSize is unset, it falls back to a comparison against the less precise Capacity. If that is also unset, the scheduler assumes that capacity is insufficient and tries some other node.
     * 
     */
    public CSIStorageCapacity cSIStorageCapacity;
    /**
     * CSIStorageCapacityList is a collection of CSIStorageCapacity objects.
     * 
     */
    public CSIStorageCapacityList cSIStorageCapacityList;
    /**
     * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
     * 
     * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
     * 
     */
    public StorageClass storageClass;
    /**
     * StorageClassList is a collection of storage classes.
     * 
     */
    public StorageClassList storageClassList;
    /**
     * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
     * 
     * VolumeAttachment objects are non-namespaced.
     * 
     */
    public VolumeAttachment volumeAttachment;
    /**
     * VolumeAttachmentList is a collection of VolumeAttachment objects.
     * 
     */
    public VolumeAttachmentList volumeAttachmentList;
    /**
     * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
     * 
     */
    public VolumeAttachmentSource volumeAttachmentSource;
    /**
     * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
     * 
     */
    public VolumeAttachmentSpec volumeAttachmentSpec;
    /**
     * VolumeAttachmentStatus is the status of a VolumeAttachment request.
     * 
     */
    public VolumeAttachmentStatus volumeAttachmentStatus;
    /**
     * VolumeError captures an error encountered during a volume operation.
     * 
     */
    public VolumeError volumeError;
    /**
     * VolumeNodeResources is a set of resource limits for scheduling of volumes.
     * 
     */
    public VolumeNodeResources volumeNodeResources;
    /**
     * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.
     * 
     * The serialization format is:
     * 
     * ``` <quantity>        ::= <signedNumber><suffix>
     * 
     * 	(Note that <suffix> may be empty, from the "" case in <decimalSI>.)
     * 
     * <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= "+" | "-" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei
     * 
     * 	(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
     * 
     * <decimalSI>       ::= m | "" | k | M | G | T | P | E
     * 
     * 	(Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)
     * 
     * <decimalExponent> ::= "e" <signedNumber> | "E" <signedNumber> ```
     * 
     * No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.
     * 
     * When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.
     * 
     * Before serializing, Quantity will be put in "canonical form". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:
     * 
     * - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.
     * 
     * The sign will be omitted unless the number is negative.
     * 
     * Examples:
     * 
     * - 1.5 will be serialized as "1500m" - 1.5Gi will be serialized as "1536Mi"
     * 
     * Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.
     * 
     * Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)
     * 
     * This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
     * 
     */
    public String quantity;
    /**
     * APIGroup contains the name, the supported versions, and the preferred version of a group.
     * 
     */
    public APIGroup aPIGroup;
    /**
     * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
     * 
     */
    public APIGroupList aPIGroupList;
    /**
     * APIResource specifies the name of a resource and whether it is namespaced.
     * 
     */
    public APIResource aPIResource;
    /**
     * APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.
     * 
     */
    public APIResourceList aPIResourceList;
    /**
     * APIVersions lists the versions that are available, to allow clients to discover the API at /api, which is the root path of the legacy v1 API.
     * 
     */
    public APIVersions aPIVersions;
    /**
     * Condition contains details for one aspect of the current state of this API Resource.
     * 
     */
    public Condition condition;
    /**
     * DeleteOptions may be provided when deleting an API object.
     * 
     */
    public DeleteOptions deleteOptions;
    /**
     * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.
     * 
     * Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.
     * 
     * The exact format is defined in sigs.k8s.io/structured-merge-diff
     * 
     */
    public FieldsV1 fieldsV1;
    /**
     * GroupVersion contains the "group/version" and "version" string of a version. It is made a struct to keep extensibility.
     * 
     */
    public GroupVersionForDiscovery groupVersionForDiscovery;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector labelSelector;
    /**
     * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
     * 
     */
    public LabelSelectorRequirement labelSelectorRequirement;
    /**
     * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
     * 
     */
    public ListMeta listMeta;
    /**
     * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
     * 
     */
    public ManagedFieldsEntry managedFieldsEntry;
    /**
     * MicroTime is version of Time with microsecond level precision.
     * 
     */
    public String microTime;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta objectMeta;
    /**
     * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
     * 
     */
    public OwnerReference ownerReference;
    /**
     * Patch is provided to give a concrete name and type to the Kubernetes PATCH request body.
     * 
     */
    public Patch patch;
    /**
     * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
     * 
     */
    public Preconditions preconditions;
    /**
     * ServerAddressByClientCIDR helps the client to determine the server address that they should use, depending on the clientCIDR that they match.
     * 
     */
    public ServerAddressByClientCIDR serverAddressByClientCIDR;
    /**
     * Status is a return value for calls that don't return other objects.
     * 
     */
    public Status status;
    /**
     * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
     * 
     */
    public StatusCause statusCause;
    /**
     * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
     * 
     */
    public StatusDetails statusDetails;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String time;
    /**
     * Event represents a single event to a watched resource.
     * 
     */
    public WatchEvent watchEvent;
    /**
     * RawExtension is used to hold extensions in external versions.
     * 
     * To use this, make a field which has RawExtension as its type in your external, versioned struct, and Object in your internal struct. You also need to register your various plugin types.
     * 
     * // Internal package:
     * 
     * 	type MyAPIObject struct {
     * 		runtime.TypeMeta `json:",inline"`
     * 		MyPlugin runtime.Object `json:"myPlugin"`
     * 	}
     * 
     * 	type PluginA struct {
     * 		AOption string `json:"aOption"`
     * 	}
     * 
     * // External package:
     * 
     * 	type MyAPIObject struct {
     * 		runtime.TypeMeta `json:",inline"`
     * 		MyPlugin runtime.RawExtension `json:"myPlugin"`
     * 	}
     * 
     * 	type PluginA struct {
     * 		AOption string `json:"aOption"`
     * 	}
     * 
     * // On the wire, the JSON will look something like this:
     * 
     * 	{
     * 		"kind":"MyAPIObject",
     * 		"apiVersion":"v1",
     * 		"myPlugin": {
     * 			"kind":"PluginA",
     * 			"aOption":"foo",
     * 		},
     * 	}
     * 
     * So what happens? Decode first uses json or yaml to unmarshal the serialized data into your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked. The next step is to copy (using pkg/conversion) into the internal struct. The runtime package's DefaultScheme has conversion functions installed which will unpack the JSON stored in RawExtension, turning it into the correct object type, and storing it in the Object. (TODO: In the case where the object is of an unknown type, a runtime.Unknown object will be created and stored.)
     * 
     */
    public RawExtension rawExtension;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String intOrString;
    /**
     * Info contains versioning information. how we'll want to distribute that information.
     * 
     */
    public Info info;
    /**
     * APIService represents a server for a particular GroupVersion. Name must be "version.group".
     * 
     */
    public APIService aPIService;
    /**
     * APIServiceCondition describes the state of an APIService at a particular point
     * 
     */
    public APIServiceCondition aPIServiceCondition;
    /**
     * APIServiceList is a list of APIService objects.
     * 
     */
    public APIServiceList aPIServiceList;
    /**
     * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
     * 
     */
    public APIServiceSpec aPIServiceSpec;
    /**
     * APIServiceStatus contains derived information about an API server
     * 
     */
    public APIServiceStatus aPIServiceStatus;

    public Schema withMutatingWebhook(MutatingWebhook mutatingWebhook) {
        this.mutatingWebhook = mutatingWebhook;
        return this;
    }

    public Schema withMutatingWebhookConfiguration(MutatingWebhookConfiguration mutatingWebhookConfiguration) {
        this.mutatingWebhookConfiguration = mutatingWebhookConfiguration;
        return this;
    }

    public Schema withMutatingWebhookConfigurationList(MutatingWebhookConfigurationList mutatingWebhookConfigurationList) {
        this.mutatingWebhookConfigurationList = mutatingWebhookConfigurationList;
        return this;
    }

    public Schema withRuleWithOperations(RuleWithOperations ruleWithOperations) {
        this.ruleWithOperations = ruleWithOperations;
        return this;
    }

    public Schema withServiceReference(ServiceReference serviceReference) {
        this.serviceReference = serviceReference;
        return this;
    }

    public Schema withValidatingWebhook(ValidatingWebhook validatingWebhook) {
        this.validatingWebhook = validatingWebhook;
        return this;
    }

    public Schema withValidatingWebhookConfiguration(ValidatingWebhookConfiguration validatingWebhookConfiguration) {
        this.validatingWebhookConfiguration = validatingWebhookConfiguration;
        return this;
    }

    public Schema withValidatingWebhookConfigurationList(ValidatingWebhookConfigurationList validatingWebhookConfigurationList) {
        this.validatingWebhookConfigurationList = validatingWebhookConfigurationList;
        return this;
    }

    public Schema withWebhookClientConfig(WebhookClientConfig webhookClientConfig) {
        this.webhookClientConfig = webhookClientConfig;
        return this;
    }

    public Schema withControllerRevision(ControllerRevision controllerRevision) {
        this.controllerRevision = controllerRevision;
        return this;
    }

    public Schema withControllerRevisionList(ControllerRevisionList controllerRevisionList) {
        this.controllerRevisionList = controllerRevisionList;
        return this;
    }

    public Schema withDaemonSet(DaemonSet daemonSet) {
        this.daemonSet = daemonSet;
        return this;
    }

    public Schema withDaemonSetCondition(DaemonSetCondition daemonSetCondition) {
        this.daemonSetCondition = daemonSetCondition;
        return this;
    }

    public Schema withDaemonSetList(DaemonSetList daemonSetList) {
        this.daemonSetList = daemonSetList;
        return this;
    }

    public Schema withDaemonSetSpec(DaemonSetSpec daemonSetSpec) {
        this.daemonSetSpec = daemonSetSpec;
        return this;
    }

    public Schema withDaemonSetStatus(DaemonSetStatus daemonSetStatus) {
        this.daemonSetStatus = daemonSetStatus;
        return this;
    }

    public Schema withDaemonSetUpdateStrategy(DaemonSetUpdateStrategy daemonSetUpdateStrategy) {
        this.daemonSetUpdateStrategy = daemonSetUpdateStrategy;
        return this;
    }

    public Schema withDeployment(Deployment deployment) {
        this.deployment = deployment;
        return this;
    }

    public Schema withDeploymentCondition(DeploymentCondition deploymentCondition) {
        this.deploymentCondition = deploymentCondition;
        return this;
    }

    public Schema withDeploymentList(DeploymentList deploymentList) {
        this.deploymentList = deploymentList;
        return this;
    }

    public Schema withDeploymentSpec(DeploymentSpec deploymentSpec) {
        this.deploymentSpec = deploymentSpec;
        return this;
    }

    public Schema withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    public Schema withDeploymentStrategy(DeploymentStrategy deploymentStrategy) {
        this.deploymentStrategy = deploymentStrategy;
        return this;
    }

    public Schema withReplicaSet(ReplicaSet replicaSet) {
        this.replicaSet = replicaSet;
        return this;
    }

    public Schema withReplicaSetCondition(ReplicaSetCondition replicaSetCondition) {
        this.replicaSetCondition = replicaSetCondition;
        return this;
    }

    public Schema withReplicaSetList(ReplicaSetList replicaSetList) {
        this.replicaSetList = replicaSetList;
        return this;
    }

    public Schema withReplicaSetSpec(ReplicaSetSpec replicaSetSpec) {
        this.replicaSetSpec = replicaSetSpec;
        return this;
    }

    public Schema withReplicaSetStatus(ReplicaSetStatus replicaSetStatus) {
        this.replicaSetStatus = replicaSetStatus;
        return this;
    }

    public Schema withRollingUpdateDaemonSet(RollingUpdateDaemonSet rollingUpdateDaemonSet) {
        this.rollingUpdateDaemonSet = rollingUpdateDaemonSet;
        return this;
    }

    public Schema withRollingUpdateDeployment(RollingUpdateDeployment rollingUpdateDeployment) {
        this.rollingUpdateDeployment = rollingUpdateDeployment;
        return this;
    }

    public Schema withRollingUpdateStatefulSetStrategy(RollingUpdateStatefulSetStrategy rollingUpdateStatefulSetStrategy) {
        this.rollingUpdateStatefulSetStrategy = rollingUpdateStatefulSetStrategy;
        return this;
    }

    public Schema withStatefulSet(StatefulSet statefulSet) {
        this.statefulSet = statefulSet;
        return this;
    }

    public Schema withStatefulSetCondition(StatefulSetCondition statefulSetCondition) {
        this.statefulSetCondition = statefulSetCondition;
        return this;
    }

    public Schema withStatefulSetList(StatefulSetList statefulSetList) {
        this.statefulSetList = statefulSetList;
        return this;
    }

    public Schema withStatefulSetPersistentVolumeClaimRetentionPolicy(StatefulSetPersistentVolumeClaimRetentionPolicy statefulSetPersistentVolumeClaimRetentionPolicy) {
        this.statefulSetPersistentVolumeClaimRetentionPolicy = statefulSetPersistentVolumeClaimRetentionPolicy;
        return this;
    }

    public Schema withStatefulSetSpec(StatefulSetSpec statefulSetSpec) {
        this.statefulSetSpec = statefulSetSpec;
        return this;
    }

    public Schema withStatefulSetStatus(StatefulSetStatus statefulSetStatus) {
        this.statefulSetStatus = statefulSetStatus;
        return this;
    }

    public Schema withStatefulSetUpdateStrategy(StatefulSetUpdateStrategy statefulSetUpdateStrategy) {
        this.statefulSetUpdateStrategy = statefulSetUpdateStrategy;
        return this;
    }

    public Schema withBoundObjectReference(BoundObjectReference boundObjectReference) {
        this.boundObjectReference = boundObjectReference;
        return this;
    }

    public Schema withTokenRequest(TokenRequest tokenRequest) {
        this.tokenRequest = tokenRequest;
        return this;
    }

    public Schema withTokenRequestSpec(TokenRequestSpec tokenRequestSpec) {
        this.tokenRequestSpec = tokenRequestSpec;
        return this;
    }

    public Schema withTokenRequestStatus(TokenRequestStatus tokenRequestStatus) {
        this.tokenRequestStatus = tokenRequestStatus;
        return this;
    }

    public Schema withTokenReview(TokenReview tokenReview) {
        this.tokenReview = tokenReview;
        return this;
    }

    public Schema withTokenReviewSpec(TokenReviewSpec tokenReviewSpec) {
        this.tokenReviewSpec = tokenReviewSpec;
        return this;
    }

    public Schema withTokenReviewStatus(TokenReviewStatus tokenReviewStatus) {
        this.tokenReviewStatus = tokenReviewStatus;
        return this;
    }

    public Schema withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public Schema withLocalSubjectAccessReview(LocalSubjectAccessReview localSubjectAccessReview) {
        this.localSubjectAccessReview = localSubjectAccessReview;
        return this;
    }

    public Schema withNonResourceAttributes(NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        return this;
    }

    public Schema withNonResourceRule(NonResourceRule nonResourceRule) {
        this.nonResourceRule = nonResourceRule;
        return this;
    }

    public Schema withResourceAttributes(ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

    public Schema withResourceRule(ResourceRule resourceRule) {
        this.resourceRule = resourceRule;
        return this;
    }

    public Schema withSelfSubjectAccessReview(SelfSubjectAccessReview selfSubjectAccessReview) {
        this.selfSubjectAccessReview = selfSubjectAccessReview;
        return this;
    }

    public Schema withSelfSubjectAccessReviewSpec(SelfSubjectAccessReviewSpec selfSubjectAccessReviewSpec) {
        this.selfSubjectAccessReviewSpec = selfSubjectAccessReviewSpec;
        return this;
    }

    public Schema withSelfSubjectRulesReview(SelfSubjectRulesReview selfSubjectRulesReview) {
        this.selfSubjectRulesReview = selfSubjectRulesReview;
        return this;
    }

    public Schema withSelfSubjectRulesReviewSpec(SelfSubjectRulesReviewSpec selfSubjectRulesReviewSpec) {
        this.selfSubjectRulesReviewSpec = selfSubjectRulesReviewSpec;
        return this;
    }

    public Schema withSubjectAccessReview(SubjectAccessReview subjectAccessReview) {
        this.subjectAccessReview = subjectAccessReview;
        return this;
    }

    public Schema withSubjectAccessReviewSpec(SubjectAccessReviewSpec subjectAccessReviewSpec) {
        this.subjectAccessReviewSpec = subjectAccessReviewSpec;
        return this;
    }

    public Schema withSubjectAccessReviewStatus(SubjectAccessReviewStatus subjectAccessReviewStatus) {
        this.subjectAccessReviewStatus = subjectAccessReviewStatus;
        return this;
    }

    public Schema withSubjectRulesReviewStatus(SubjectRulesReviewStatus subjectRulesReviewStatus) {
        this.subjectRulesReviewStatus = subjectRulesReviewStatus;
        return this;
    }

    public Schema withCrossVersionObjectReference(CrossVersionObjectReference crossVersionObjectReference) {
        this.crossVersionObjectReference = crossVersionObjectReference;
        return this;
    }

    public Schema withHorizontalPodAutoscaler(HorizontalPodAutoscaler horizontalPodAutoscaler) {
        this.horizontalPodAutoscaler = horizontalPodAutoscaler;
        return this;
    }

    public Schema withHorizontalPodAutoscalerList(HorizontalPodAutoscalerList horizontalPodAutoscalerList) {
        this.horizontalPodAutoscalerList = horizontalPodAutoscalerList;
        return this;
    }

    public Schema withHorizontalPodAutoscalerSpec(HorizontalPodAutoscalerSpec horizontalPodAutoscalerSpec) {
        this.horizontalPodAutoscalerSpec = horizontalPodAutoscalerSpec;
        return this;
    }

    public Schema withHorizontalPodAutoscalerStatus(HorizontalPodAutoscalerStatus horizontalPodAutoscalerStatus) {
        this.horizontalPodAutoscalerStatus = horizontalPodAutoscalerStatus;
        return this;
    }

    public Schema withScale(Scale scale) {
        this.scale = scale;
        return this;
    }

    public Schema withScaleSpec(ScaleSpec scaleSpec) {
        this.scaleSpec = scaleSpec;
        return this;
    }

    public Schema withScaleStatus(ScaleStatus scaleStatus) {
        this.scaleStatus = scaleStatus;
        return this;
    }

    public Schema withContainerResourceMetricSource(ContainerResourceMetricSource containerResourceMetricSource) {
        this.containerResourceMetricSource = containerResourceMetricSource;
        return this;
    }

    public Schema withContainerResourceMetricStatus(ContainerResourceMetricStatus containerResourceMetricStatus) {
        this.containerResourceMetricStatus = containerResourceMetricStatus;
        return this;
    }

    public Schema withExternalMetricSource(ExternalMetricSource externalMetricSource) {
        this.externalMetricSource = externalMetricSource;
        return this;
    }

    public Schema withExternalMetricStatus(ExternalMetricStatus externalMetricStatus) {
        this.externalMetricStatus = externalMetricStatus;
        return this;
    }

    public Schema withHPAScalingPolicy(HPAScalingPolicy hPAScalingPolicy) {
        this.hPAScalingPolicy = hPAScalingPolicy;
        return this;
    }

    public Schema withHPAScalingRules(HPAScalingRules hPAScalingRules) {
        this.hPAScalingRules = hPAScalingRules;
        return this;
    }

    public Schema withHorizontalPodAutoscalerBehavior(HorizontalPodAutoscalerBehavior horizontalPodAutoscalerBehavior) {
        this.horizontalPodAutoscalerBehavior = horizontalPodAutoscalerBehavior;
        return this;
    }

    public Schema withHorizontalPodAutoscalerCondition(HorizontalPodAutoscalerCondition horizontalPodAutoscalerCondition) {
        this.horizontalPodAutoscalerCondition = horizontalPodAutoscalerCondition;
        return this;
    }

    public Schema withMetricIdentifier(MetricIdentifier metricIdentifier) {
        this.metricIdentifier = metricIdentifier;
        return this;
    }

    public Schema withMetricSpec(MetricSpec metricSpec) {
        this.metricSpec = metricSpec;
        return this;
    }

    public Schema withMetricStatus(MetricStatus metricStatus) {
        this.metricStatus = metricStatus;
        return this;
    }

    public Schema withMetricTarget(MetricTarget metricTarget) {
        this.metricTarget = metricTarget;
        return this;
    }

    public Schema withMetricValueStatus(MetricValueStatus metricValueStatus) {
        this.metricValueStatus = metricValueStatus;
        return this;
    }

    public Schema withObjectMetricSource(ObjectMetricSource objectMetricSource) {
        this.objectMetricSource = objectMetricSource;
        return this;
    }

    public Schema withObjectMetricStatus(ObjectMetricStatus objectMetricStatus) {
        this.objectMetricStatus = objectMetricStatus;
        return this;
    }

    public Schema withPodsMetricSource(PodsMetricSource podsMetricSource) {
        this.podsMetricSource = podsMetricSource;
        return this;
    }

    public Schema withPodsMetricStatus(PodsMetricStatus podsMetricStatus) {
        this.podsMetricStatus = podsMetricStatus;
        return this;
    }

    public Schema withResourceMetricSource(ResourceMetricSource resourceMetricSource) {
        this.resourceMetricSource = resourceMetricSource;
        return this;
    }

    public Schema withResourceMetricStatus(ResourceMetricStatus resourceMetricStatus) {
        this.resourceMetricStatus = resourceMetricStatus;
        return this;
    }

    public Schema withCronJob(CronJob cronJob) {
        this.cronJob = cronJob;
        return this;
    }

    public Schema withCronJobList(CronJobList cronJobList) {
        this.cronJobList = cronJobList;
        return this;
    }

    public Schema withCronJobSpec(CronJobSpec cronJobSpec) {
        this.cronJobSpec = cronJobSpec;
        return this;
    }

    public Schema withCronJobStatus(CronJobStatus cronJobStatus) {
        this.cronJobStatus = cronJobStatus;
        return this;
    }

    public Schema withJob(Job job) {
        this.job = job;
        return this;
    }

    public Schema withJobCondition(JobCondition jobCondition) {
        this.jobCondition = jobCondition;
        return this;
    }

    public Schema withJobList(JobList jobList) {
        this.jobList = jobList;
        return this;
    }

    public Schema withJobSpec(JobSpec jobSpec) {
        this.jobSpec = jobSpec;
        return this;
    }

    public Schema withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    public Schema withJobTemplateSpec(JobTemplateSpec jobTemplateSpec) {
        this.jobTemplateSpec = jobTemplateSpec;
        return this;
    }

    public Schema withPodFailurePolicy(PodFailurePolicy podFailurePolicy) {
        this.podFailurePolicy = podFailurePolicy;
        return this;
    }

    public Schema withPodFailurePolicyOnExitCodesRequirement(PodFailurePolicyOnExitCodesRequirement podFailurePolicyOnExitCodesRequirement) {
        this.podFailurePolicyOnExitCodesRequirement = podFailurePolicyOnExitCodesRequirement;
        return this;
    }

    public Schema withPodFailurePolicyOnPodConditionsPattern(PodFailurePolicyOnPodConditionsPattern podFailurePolicyOnPodConditionsPattern) {
        this.podFailurePolicyOnPodConditionsPattern = podFailurePolicyOnPodConditionsPattern;
        return this;
    }

    public Schema withPodFailurePolicyRule(PodFailurePolicyRule podFailurePolicyRule) {
        this.podFailurePolicyRule = podFailurePolicyRule;
        return this;
    }

    public Schema withUncountedTerminatedPods(UncountedTerminatedPods uncountedTerminatedPods) {
        this.uncountedTerminatedPods = uncountedTerminatedPods;
        return this;
    }

    public Schema withCertificateSigningRequest(CertificateSigningRequest certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
        return this;
    }

    public Schema withCertificateSigningRequestCondition(CertificateSigningRequestCondition certificateSigningRequestCondition) {
        this.certificateSigningRequestCondition = certificateSigningRequestCondition;
        return this;
    }

    public Schema withCertificateSigningRequestList(CertificateSigningRequestList certificateSigningRequestList) {
        this.certificateSigningRequestList = certificateSigningRequestList;
        return this;
    }

    public Schema withCertificateSigningRequestSpec(CertificateSigningRequestSpec certificateSigningRequestSpec) {
        this.certificateSigningRequestSpec = certificateSigningRequestSpec;
        return this;
    }

    public Schema withCertificateSigningRequestStatus(CertificateSigningRequestStatus certificateSigningRequestStatus) {
        this.certificateSigningRequestStatus = certificateSigningRequestStatus;
        return this;
    }

    public Schema withLease(Lease lease) {
        this.lease = lease;
        return this;
    }

    public Schema withLeaseList(LeaseList leaseList) {
        this.leaseList = leaseList;
        return this;
    }

    public Schema withLeaseSpec(LeaseSpec leaseSpec) {
        this.leaseSpec = leaseSpec;
        return this;
    }

    public Schema withAWSElasticBlockStoreVolumeSource(AWSElasticBlockStoreVolumeSource aWSElasticBlockStoreVolumeSource) {
        this.aWSElasticBlockStoreVolumeSource = aWSElasticBlockStoreVolumeSource;
        return this;
    }

    public Schema withAffinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public Schema withAttachedVolume(AttachedVolume attachedVolume) {
        this.attachedVolume = attachedVolume;
        return this;
    }

    public Schema withAzureDiskVolumeSource(AzureDiskVolumeSource azureDiskVolumeSource) {
        this.azureDiskVolumeSource = azureDiskVolumeSource;
        return this;
    }

    public Schema withAzureFilePersistentVolumeSource(AzureFilePersistentVolumeSource azureFilePersistentVolumeSource) {
        this.azureFilePersistentVolumeSource = azureFilePersistentVolumeSource;
        return this;
    }

    public Schema withAzureFileVolumeSource(AzureFileVolumeSource azureFileVolumeSource) {
        this.azureFileVolumeSource = azureFileVolumeSource;
        return this;
    }

    public Schema withBinding(Binding binding) {
        this.binding = binding;
        return this;
    }

    public Schema withCSIPersistentVolumeSource(CSIPersistentVolumeSource cSIPersistentVolumeSource) {
        this.cSIPersistentVolumeSource = cSIPersistentVolumeSource;
        return this;
    }

    public Schema withCSIVolumeSource(CSIVolumeSource cSIVolumeSource) {
        this.cSIVolumeSource = cSIVolumeSource;
        return this;
    }

    public Schema withCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public Schema withCephFSPersistentVolumeSource(CephFSPersistentVolumeSource cephFSPersistentVolumeSource) {
        this.cephFSPersistentVolumeSource = cephFSPersistentVolumeSource;
        return this;
    }

    public Schema withCephFSVolumeSource(CephFSVolumeSource cephFSVolumeSource) {
        this.cephFSVolumeSource = cephFSVolumeSource;
        return this;
    }

    public Schema withCinderPersistentVolumeSource(CinderPersistentVolumeSource cinderPersistentVolumeSource) {
        this.cinderPersistentVolumeSource = cinderPersistentVolumeSource;
        return this;
    }

    public Schema withCinderVolumeSource(CinderVolumeSource cinderVolumeSource) {
        this.cinderVolumeSource = cinderVolumeSource;
        return this;
    }

    public Schema withClientIPConfig(ClientIPConfig clientIPConfig) {
        this.clientIPConfig = clientIPConfig;
        return this;
    }

    public Schema withComponentCondition(ComponentCondition componentCondition) {
        this.componentCondition = componentCondition;
        return this;
    }

    public Schema withComponentStatus(ComponentStatus componentStatus) {
        this.componentStatus = componentStatus;
        return this;
    }

    public Schema withComponentStatusList(ComponentStatusList componentStatusList) {
        this.componentStatusList = componentStatusList;
        return this;
    }

    public Schema withConfigMap(ConfigMap configMap) {
        this.configMap = configMap;
        return this;
    }

    public Schema withConfigMapEnvSource(ConfigMapEnvSource configMapEnvSource) {
        this.configMapEnvSource = configMapEnvSource;
        return this;
    }

    public Schema withConfigMapKeySelector(ConfigMapKeySelector configMapKeySelector) {
        this.configMapKeySelector = configMapKeySelector;
        return this;
    }

    public Schema withConfigMapList(ConfigMapList configMapList) {
        this.configMapList = configMapList;
        return this;
    }

    public Schema withConfigMapNodeConfigSource(ConfigMapNodeConfigSource configMapNodeConfigSource) {
        this.configMapNodeConfigSource = configMapNodeConfigSource;
        return this;
    }

    public Schema withConfigMapProjection(ConfigMapProjection configMapProjection) {
        this.configMapProjection = configMapProjection;
        return this;
    }

    public Schema withConfigMapVolumeSource(ConfigMapVolumeSource configMapVolumeSource) {
        this.configMapVolumeSource = configMapVolumeSource;
        return this;
    }

    public Schema withContainer(Container container) {
        this.container = container;
        return this;
    }

    public Schema withContainerImage(ContainerImage containerImage) {
        this.containerImage = containerImage;
        return this;
    }

    public Schema withContainerPort(ContainerPort containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    public Schema withContainerState(ContainerState containerState) {
        this.containerState = containerState;
        return this;
    }

    public Schema withContainerStateRunning(ContainerStateRunning containerStateRunning) {
        this.containerStateRunning = containerStateRunning;
        return this;
    }

    public Schema withContainerStateTerminated(ContainerStateTerminated containerStateTerminated) {
        this.containerStateTerminated = containerStateTerminated;
        return this;
    }

    public Schema withContainerStateWaiting(ContainerStateWaiting containerStateWaiting) {
        this.containerStateWaiting = containerStateWaiting;
        return this;
    }

    public Schema withContainerStatus(ContainerStatus containerStatus) {
        this.containerStatus = containerStatus;
        return this;
    }

    public Schema withDaemonEndpoint(DaemonEndpoint daemonEndpoint) {
        this.daemonEndpoint = daemonEndpoint;
        return this;
    }

    public Schema withDownwardAPIProjection(DownwardAPIProjection downwardAPIProjection) {
        this.downwardAPIProjection = downwardAPIProjection;
        return this;
    }

    public Schema withDownwardAPIVolumeFile(DownwardAPIVolumeFile downwardAPIVolumeFile) {
        this.downwardAPIVolumeFile = downwardAPIVolumeFile;
        return this;
    }

    public Schema withDownwardAPIVolumeSource(DownwardAPIVolumeSource downwardAPIVolumeSource) {
        this.downwardAPIVolumeSource = downwardAPIVolumeSource;
        return this;
    }

    public Schema withEmptyDirVolumeSource(EmptyDirVolumeSource emptyDirVolumeSource) {
        this.emptyDirVolumeSource = emptyDirVolumeSource;
        return this;
    }

    public Schema withEndpointAddress(EndpointAddress endpointAddress) {
        this.endpointAddress = endpointAddress;
        return this;
    }

    public Schema withEndpointPort(EndpointPort endpointPort) {
        this.endpointPort = endpointPort;
        return this;
    }

    public Schema withEndpointSubset(EndpointSubset endpointSubset) {
        this.endpointSubset = endpointSubset;
        return this;
    }

    public Schema withEndpoints(Endpoints endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public Schema withEndpointsList(EndpointsList endpointsList) {
        this.endpointsList = endpointsList;
        return this;
    }

    public Schema withEnvFromSource(EnvFromSource envFromSource) {
        this.envFromSource = envFromSource;
        return this;
    }

    public Schema withEnvVar(EnvVar envVar) {
        this.envVar = envVar;
        return this;
    }

    public Schema withEnvVarSource(EnvVarSource envVarSource) {
        this.envVarSource = envVarSource;
        return this;
    }

    public Schema withEphemeralContainer(EphemeralContainer ephemeralContainer) {
        this.ephemeralContainer = ephemeralContainer;
        return this;
    }

    public Schema withEphemeralVolumeSource(EphemeralVolumeSource ephemeralVolumeSource) {
        this.ephemeralVolumeSource = ephemeralVolumeSource;
        return this;
    }

    public Schema withEvent(Event event) {
        this.event = event;
        return this;
    }

    public Schema withEventList(EventList eventList) {
        this.eventList = eventList;
        return this;
    }

    public Schema withEventSeries(EventSeries eventSeries) {
        this.eventSeries = eventSeries;
        return this;
    }

    public Schema withEventSource(EventSource eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    public Schema withExecAction(ExecAction execAction) {
        this.execAction = execAction;
        return this;
    }

    public Schema withFCVolumeSource(FCVolumeSource fCVolumeSource) {
        this.fCVolumeSource = fCVolumeSource;
        return this;
    }

    public Schema withFlexPersistentVolumeSource(FlexPersistentVolumeSource flexPersistentVolumeSource) {
        this.flexPersistentVolumeSource = flexPersistentVolumeSource;
        return this;
    }

    public Schema withFlexVolumeSource(FlexVolumeSource flexVolumeSource) {
        this.flexVolumeSource = flexVolumeSource;
        return this;
    }

    public Schema withFlockerVolumeSource(FlockerVolumeSource flockerVolumeSource) {
        this.flockerVolumeSource = flockerVolumeSource;
        return this;
    }

    public Schema withGCEPersistentDiskVolumeSource(GCEPersistentDiskVolumeSource gCEPersistentDiskVolumeSource) {
        this.gCEPersistentDiskVolumeSource = gCEPersistentDiskVolumeSource;
        return this;
    }

    public Schema withGRPCAction(GRPCAction gRPCAction) {
        this.gRPCAction = gRPCAction;
        return this;
    }

    public Schema withGitRepoVolumeSource(GitRepoVolumeSource gitRepoVolumeSource) {
        this.gitRepoVolumeSource = gitRepoVolumeSource;
        return this;
    }

    public Schema withGlusterfsPersistentVolumeSource(GlusterfsPersistentVolumeSource glusterfsPersistentVolumeSource) {
        this.glusterfsPersistentVolumeSource = glusterfsPersistentVolumeSource;
        return this;
    }

    public Schema withGlusterfsVolumeSource(GlusterfsVolumeSource glusterfsVolumeSource) {
        this.glusterfsVolumeSource = glusterfsVolumeSource;
        return this;
    }

    public Schema withHTTPGetAction(HTTPGetAction hTTPGetAction) {
        this.hTTPGetAction = hTTPGetAction;
        return this;
    }

    public Schema withHTTPHeader(HTTPHeader hTTPHeader) {
        this.hTTPHeader = hTTPHeader;
        return this;
    }

    public Schema withHostAlias(HostAlias hostAlias) {
        this.hostAlias = hostAlias;
        return this;
    }

    public Schema withHostPathVolumeSource(HostPathVolumeSource hostPathVolumeSource) {
        this.hostPathVolumeSource = hostPathVolumeSource;
        return this;
    }

    public Schema withISCSIPersistentVolumeSource(ISCSIPersistentVolumeSource iSCSIPersistentVolumeSource) {
        this.iSCSIPersistentVolumeSource = iSCSIPersistentVolumeSource;
        return this;
    }

    public Schema withISCSIVolumeSource(ISCSIVolumeSource iSCSIVolumeSource) {
        this.iSCSIVolumeSource = iSCSIVolumeSource;
        return this;
    }

    public Schema withKeyToPath(KeyToPath keyToPath) {
        this.keyToPath = keyToPath;
        return this;
    }

    public Schema withLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public Schema withLifecycleHandler(LifecycleHandler lifecycleHandler) {
        this.lifecycleHandler = lifecycleHandler;
        return this;
    }

    public Schema withLimitRange(LimitRange limitRange) {
        this.limitRange = limitRange;
        return this;
    }

    public Schema withLimitRangeItem(LimitRangeItem limitRangeItem) {
        this.limitRangeItem = limitRangeItem;
        return this;
    }

    public Schema withLimitRangeList(LimitRangeList limitRangeList) {
        this.limitRangeList = limitRangeList;
        return this;
    }

    public Schema withLimitRangeSpec(LimitRangeSpec limitRangeSpec) {
        this.limitRangeSpec = limitRangeSpec;
        return this;
    }

    public Schema withLoadBalancerIngress(LoadBalancerIngress loadBalancerIngress) {
        this.loadBalancerIngress = loadBalancerIngress;
        return this;
    }

    public Schema withLoadBalancerStatus(LoadBalancerStatus loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }

    public Schema withLocalObjectReference(LocalObjectReference localObjectReference) {
        this.localObjectReference = localObjectReference;
        return this;
    }

    public Schema withLocalVolumeSource(LocalVolumeSource localVolumeSource) {
        this.localVolumeSource = localVolumeSource;
        return this;
    }

    public Schema withNFSVolumeSource(NFSVolumeSource nFSVolumeSource) {
        this.nFSVolumeSource = nFSVolumeSource;
        return this;
    }

    public Schema withNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public Schema withNamespaceCondition(NamespaceCondition namespaceCondition) {
        this.namespaceCondition = namespaceCondition;
        return this;
    }

    public Schema withNamespaceList(NamespaceList namespaceList) {
        this.namespaceList = namespaceList;
        return this;
    }

    public Schema withNamespaceSpec(NamespaceSpec namespaceSpec) {
        this.namespaceSpec = namespaceSpec;
        return this;
    }

    public Schema withNamespaceStatus(NamespaceStatus namespaceStatus) {
        this.namespaceStatus = namespaceStatus;
        return this;
    }

    public Schema withNode(Node node) {
        this.node = node;
        return this;
    }

    public Schema withNodeAddress(NodeAddress nodeAddress) {
        this.nodeAddress = nodeAddress;
        return this;
    }

    public Schema withNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public Schema withNodeCondition(NodeCondition nodeCondition) {
        this.nodeCondition = nodeCondition;
        return this;
    }

    public Schema withNodeConfigSource(NodeConfigSource nodeConfigSource) {
        this.nodeConfigSource = nodeConfigSource;
        return this;
    }

    public Schema withNodeConfigStatus(NodeConfigStatus nodeConfigStatus) {
        this.nodeConfigStatus = nodeConfigStatus;
        return this;
    }

    public Schema withNodeDaemonEndpoints(NodeDaemonEndpoints nodeDaemonEndpoints) {
        this.nodeDaemonEndpoints = nodeDaemonEndpoints;
        return this;
    }

    public Schema withNodeList(NodeList nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public Schema withNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public Schema withNodeSelectorRequirement(NodeSelectorRequirement nodeSelectorRequirement) {
        this.nodeSelectorRequirement = nodeSelectorRequirement;
        return this;
    }

    public Schema withNodeSelectorTerm(NodeSelectorTerm nodeSelectorTerm) {
        this.nodeSelectorTerm = nodeSelectorTerm;
        return this;
    }

    public Schema withNodeSpec(NodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }

    public Schema withNodeStatus(NodeStatus nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    public Schema withNodeSystemInfo(NodeSystemInfo nodeSystemInfo) {
        this.nodeSystemInfo = nodeSystemInfo;
        return this;
    }

    public Schema withObjectFieldSelector(ObjectFieldSelector objectFieldSelector) {
        this.objectFieldSelector = objectFieldSelector;
        return this;
    }

    public Schema withObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
        return this;
    }

    public Schema withPersistentVolume(PersistentVolume persistentVolume) {
        this.persistentVolume = persistentVolume;
        return this;
    }

    public Schema withPersistentVolumeClaim(PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
        return this;
    }

    public Schema withPersistentVolumeClaimCondition(PersistentVolumeClaimCondition persistentVolumeClaimCondition) {
        this.persistentVolumeClaimCondition = persistentVolumeClaimCondition;
        return this;
    }

    public Schema withPersistentVolumeClaimList(PersistentVolumeClaimList persistentVolumeClaimList) {
        this.persistentVolumeClaimList = persistentVolumeClaimList;
        return this;
    }

    public Schema withPersistentVolumeClaimSpec(PersistentVolumeClaimSpec persistentVolumeClaimSpec) {
        this.persistentVolumeClaimSpec = persistentVolumeClaimSpec;
        return this;
    }

    public Schema withPersistentVolumeClaimStatus(PersistentVolumeClaimStatus persistentVolumeClaimStatus) {
        this.persistentVolumeClaimStatus = persistentVolumeClaimStatus;
        return this;
    }

    public Schema withPersistentVolumeClaimTemplate(PersistentVolumeClaimTemplate persistentVolumeClaimTemplate) {
        this.persistentVolumeClaimTemplate = persistentVolumeClaimTemplate;
        return this;
    }

    public Schema withPersistentVolumeClaimVolumeSource(PersistentVolumeClaimVolumeSource persistentVolumeClaimVolumeSource) {
        this.persistentVolumeClaimVolumeSource = persistentVolumeClaimVolumeSource;
        return this;
    }

    public Schema withPersistentVolumeList(PersistentVolumeList persistentVolumeList) {
        this.persistentVolumeList = persistentVolumeList;
        return this;
    }

    public Schema withPersistentVolumeSpec(PersistentVolumeSpec persistentVolumeSpec) {
        this.persistentVolumeSpec = persistentVolumeSpec;
        return this;
    }

    public Schema withPersistentVolumeStatus(PersistentVolumeStatus persistentVolumeStatus) {
        this.persistentVolumeStatus = persistentVolumeStatus;
        return this;
    }

    public Schema withPhotonPersistentDiskVolumeSource(PhotonPersistentDiskVolumeSource photonPersistentDiskVolumeSource) {
        this.photonPersistentDiskVolumeSource = photonPersistentDiskVolumeSource;
        return this;
    }

    public Schema withPod(Pod pod) {
        this.pod = pod;
        return this;
    }

    public Schema withPodAffinity(PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }

    public Schema withPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }

    public Schema withPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }

    public Schema withPodCondition(PodCondition podCondition) {
        this.podCondition = podCondition;
        return this;
    }

    public Schema withPodDNSConfig(PodDNSConfig podDNSConfig) {
        this.podDNSConfig = podDNSConfig;
        return this;
    }

    public Schema withPodDNSConfigOption(PodDNSConfigOption podDNSConfigOption) {
        this.podDNSConfigOption = podDNSConfigOption;
        return this;
    }

    public Schema withPodIP(PodIP podIP) {
        this.podIP = podIP;
        return this;
    }

    public Schema withPodList(PodList podList) {
        this.podList = podList;
        return this;
    }

    public Schema withPodOS(PodOS podOS) {
        this.podOS = podOS;
        return this;
    }

    public Schema withPodReadinessGate(PodReadinessGate podReadinessGate) {
        this.podReadinessGate = podReadinessGate;
        return this;
    }

    public Schema withPodSecurityContext(PodSecurityContext podSecurityContext) {
        this.podSecurityContext = podSecurityContext;
        return this;
    }

    public Schema withPodSpec(PodSpec podSpec) {
        this.podSpec = podSpec;
        return this;
    }

    public Schema withPodStatus(PodStatus podStatus) {
        this.podStatus = podStatus;
        return this;
    }

    public Schema withPodTemplate(PodTemplate podTemplate) {
        this.podTemplate = podTemplate;
        return this;
    }

    public Schema withPodTemplateList(PodTemplateList podTemplateList) {
        this.podTemplateList = podTemplateList;
        return this;
    }

    public Schema withPodTemplateSpec(PodTemplateSpec podTemplateSpec) {
        this.podTemplateSpec = podTemplateSpec;
        return this;
    }

    public Schema withPortStatus(PortStatus portStatus) {
        this.portStatus = portStatus;
        return this;
    }

    public Schema withPortworxVolumeSource(PortworxVolumeSource portworxVolumeSource) {
        this.portworxVolumeSource = portworxVolumeSource;
        return this;
    }

    public Schema withPreferredSchedulingTerm(PreferredSchedulingTerm preferredSchedulingTerm) {
        this.preferredSchedulingTerm = preferredSchedulingTerm;
        return this;
    }

    public Schema withProbe(Probe probe) {
        this.probe = probe;
        return this;
    }

    public Schema withProjectedVolumeSource(ProjectedVolumeSource projectedVolumeSource) {
        this.projectedVolumeSource = projectedVolumeSource;
        return this;
    }

    public Schema withQuobyteVolumeSource(QuobyteVolumeSource quobyteVolumeSource) {
        this.quobyteVolumeSource = quobyteVolumeSource;
        return this;
    }

    public Schema withRBDPersistentVolumeSource(RBDPersistentVolumeSource rBDPersistentVolumeSource) {
        this.rBDPersistentVolumeSource = rBDPersistentVolumeSource;
        return this;
    }

    public Schema withRBDVolumeSource(RBDVolumeSource rBDVolumeSource) {
        this.rBDVolumeSource = rBDVolumeSource;
        return this;
    }

    public Schema withReplicationController(ReplicationController replicationController) {
        this.replicationController = replicationController;
        return this;
    }

    public Schema withReplicationControllerCondition(ReplicationControllerCondition replicationControllerCondition) {
        this.replicationControllerCondition = replicationControllerCondition;
        return this;
    }

    public Schema withReplicationControllerList(ReplicationControllerList replicationControllerList) {
        this.replicationControllerList = replicationControllerList;
        return this;
    }

    public Schema withReplicationControllerSpec(ReplicationControllerSpec replicationControllerSpec) {
        this.replicationControllerSpec = replicationControllerSpec;
        return this;
    }

    public Schema withReplicationControllerStatus(ReplicationControllerStatus replicationControllerStatus) {
        this.replicationControllerStatus = replicationControllerStatus;
        return this;
    }

    public Schema withResourceFieldSelector(ResourceFieldSelector resourceFieldSelector) {
        this.resourceFieldSelector = resourceFieldSelector;
        return this;
    }

    public Schema withResourceQuota(ResourceQuota resourceQuota) {
        this.resourceQuota = resourceQuota;
        return this;
    }

    public Schema withResourceQuotaList(ResourceQuotaList resourceQuotaList) {
        this.resourceQuotaList = resourceQuotaList;
        return this;
    }

    public Schema withResourceQuotaSpec(ResourceQuotaSpec resourceQuotaSpec) {
        this.resourceQuotaSpec = resourceQuotaSpec;
        return this;
    }

    public Schema withResourceQuotaStatus(ResourceQuotaStatus resourceQuotaStatus) {
        this.resourceQuotaStatus = resourceQuotaStatus;
        return this;
    }

    public Schema withResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    public Schema withSELinuxOptions(SELinuxOptions sELinuxOptions) {
        this.sELinuxOptions = sELinuxOptions;
        return this;
    }

    public Schema withScaleIOPersistentVolumeSource(ScaleIOPersistentVolumeSource scaleIOPersistentVolumeSource) {
        this.scaleIOPersistentVolumeSource = scaleIOPersistentVolumeSource;
        return this;
    }

    public Schema withScaleIOVolumeSource(ScaleIOVolumeSource scaleIOVolumeSource) {
        this.scaleIOVolumeSource = scaleIOVolumeSource;
        return this;
    }

    public Schema withScopeSelector(ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
        return this;
    }

    public Schema withScopedResourceSelectorRequirement(ScopedResourceSelectorRequirement scopedResourceSelectorRequirement) {
        this.scopedResourceSelectorRequirement = scopedResourceSelectorRequirement;
        return this;
    }

    public Schema withSeccompProfile(SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
        return this;
    }

    public Schema withSecret(Secret secret) {
        this.secret = secret;
        return this;
    }

    public Schema withSecretEnvSource(SecretEnvSource secretEnvSource) {
        this.secretEnvSource = secretEnvSource;
        return this;
    }

    public Schema withSecretKeySelector(SecretKeySelector secretKeySelector) {
        this.secretKeySelector = secretKeySelector;
        return this;
    }

    public Schema withSecretList(SecretList secretList) {
        this.secretList = secretList;
        return this;
    }

    public Schema withSecretProjection(SecretProjection secretProjection) {
        this.secretProjection = secretProjection;
        return this;
    }

    public Schema withSecretReference(SecretReference secretReference) {
        this.secretReference = secretReference;
        return this;
    }

    public Schema withSecretVolumeSource(SecretVolumeSource secretVolumeSource) {
        this.secretVolumeSource = secretVolumeSource;
        return this;
    }

    public Schema withSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public Schema withService(Service service) {
        this.service = service;
        return this;
    }

    public Schema withServiceAccount(ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    public Schema withServiceAccountList(ServiceAccountList serviceAccountList) {
        this.serviceAccountList = serviceAccountList;
        return this;
    }

    public Schema withServiceAccountTokenProjection(ServiceAccountTokenProjection serviceAccountTokenProjection) {
        this.serviceAccountTokenProjection = serviceAccountTokenProjection;
        return this;
    }

    public Schema withServiceList(ServiceList serviceList) {
        this.serviceList = serviceList;
        return this;
    }

    public Schema withServicePort(ServicePort servicePort) {
        this.servicePort = servicePort;
        return this;
    }

    public Schema withServiceSpec(ServiceSpec serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }

    public Schema withServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    public Schema withSessionAffinityConfig(SessionAffinityConfig sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
        return this;
    }

    public Schema withStorageOSPersistentVolumeSource(StorageOSPersistentVolumeSource storageOSPersistentVolumeSource) {
        this.storageOSPersistentVolumeSource = storageOSPersistentVolumeSource;
        return this;
    }

    public Schema withStorageOSVolumeSource(StorageOSVolumeSource storageOSVolumeSource) {
        this.storageOSVolumeSource = storageOSVolumeSource;
        return this;
    }

    public Schema withSysctl(Sysctl sysctl) {
        this.sysctl = sysctl;
        return this;
    }

    public Schema withTCPSocketAction(TCPSocketAction tCPSocketAction) {
        this.tCPSocketAction = tCPSocketAction;
        return this;
    }

    public Schema withTaint(Taint taint) {
        this.taint = taint;
        return this;
    }

    public Schema withToleration(Toleration toleration) {
        this.toleration = toleration;
        return this;
    }

    public Schema withTopologySelectorLabelRequirement(TopologySelectorLabelRequirement topologySelectorLabelRequirement) {
        this.topologySelectorLabelRequirement = topologySelectorLabelRequirement;
        return this;
    }

    public Schema withTopologySelectorTerm(TopologySelectorTerm topologySelectorTerm) {
        this.topologySelectorTerm = topologySelectorTerm;
        return this;
    }

    public Schema withTopologySpreadConstraint(TopologySpreadConstraint topologySpreadConstraint) {
        this.topologySpreadConstraint = topologySpreadConstraint;
        return this;
    }

    public Schema withTypedLocalObjectReference(TypedLocalObjectReference typedLocalObjectReference) {
        this.typedLocalObjectReference = typedLocalObjectReference;
        return this;
    }

    public Schema withVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public Schema withVolumeDevice(VolumeDevice volumeDevice) {
        this.volumeDevice = volumeDevice;
        return this;
    }

    public Schema withVolumeMount(VolumeMount volumeMount) {
        this.volumeMount = volumeMount;
        return this;
    }

    public Schema withVolumeNodeAffinity(VolumeNodeAffinity volumeNodeAffinity) {
        this.volumeNodeAffinity = volumeNodeAffinity;
        return this;
    }

    public Schema withVolumeProjection(VolumeProjection volumeProjection) {
        this.volumeProjection = volumeProjection;
        return this;
    }

    public Schema withVsphereVirtualDiskVolumeSource(VsphereVirtualDiskVolumeSource vsphereVirtualDiskVolumeSource) {
        this.vsphereVirtualDiskVolumeSource = vsphereVirtualDiskVolumeSource;
        return this;
    }

    public Schema withWeightedPodAffinityTerm(WeightedPodAffinityTerm weightedPodAffinityTerm) {
        this.weightedPodAffinityTerm = weightedPodAffinityTerm;
        return this;
    }

    public Schema withWindowsSecurityContextOptions(WindowsSecurityContextOptions windowsSecurityContextOptions) {
        this.windowsSecurityContextOptions = windowsSecurityContextOptions;
        return this;
    }

    public Schema withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public Schema withEndpointConditions(EndpointConditions endpointConditions) {
        this.endpointConditions = endpointConditions;
        return this;
    }

    public Schema withEndpointHints(EndpointHints endpointHints) {
        this.endpointHints = endpointHints;
        return this;
    }

    public Schema withEndpointSlice(EndpointSlice endpointSlice) {
        this.endpointSlice = endpointSlice;
        return this;
    }

    public Schema withEndpointSliceList(EndpointSliceList endpointSliceList) {
        this.endpointSliceList = endpointSliceList;
        return this;
    }

    public Schema withForZone(ForZone forZone) {
        this.forZone = forZone;
        return this;
    }

    public Schema withFlowDistinguisherMethod(FlowDistinguisherMethod flowDistinguisherMethod) {
        this.flowDistinguisherMethod = flowDistinguisherMethod;
        return this;
    }

    public Schema withFlowSchema(FlowSchema flowSchema) {
        this.flowSchema = flowSchema;
        return this;
    }

    public Schema withFlowSchemaCondition(FlowSchemaCondition flowSchemaCondition) {
        this.flowSchemaCondition = flowSchemaCondition;
        return this;
    }

    public Schema withFlowSchemaList(FlowSchemaList flowSchemaList) {
        this.flowSchemaList = flowSchemaList;
        return this;
    }

    public Schema withFlowSchemaSpec(FlowSchemaSpec flowSchemaSpec) {
        this.flowSchemaSpec = flowSchemaSpec;
        return this;
    }

    public Schema withFlowSchemaStatus(FlowSchemaStatus flowSchemaStatus) {
        this.flowSchemaStatus = flowSchemaStatus;
        return this;
    }

    public Schema withGroupSubject(GroupSubject groupSubject) {
        this.groupSubject = groupSubject;
        return this;
    }

    public Schema withLimitResponse(LimitResponse limitResponse) {
        this.limitResponse = limitResponse;
        return this;
    }

    public Schema withLimitedPriorityLevelConfiguration(LimitedPriorityLevelConfiguration limitedPriorityLevelConfiguration) {
        this.limitedPriorityLevelConfiguration = limitedPriorityLevelConfiguration;
        return this;
    }

    public Schema withNonResourcePolicyRule(NonResourcePolicyRule nonResourcePolicyRule) {
        this.nonResourcePolicyRule = nonResourcePolicyRule;
        return this;
    }

    public Schema withPolicyRulesWithSubjects(PolicyRulesWithSubjects policyRulesWithSubjects) {
        this.policyRulesWithSubjects = policyRulesWithSubjects;
        return this;
    }

    public Schema withPriorityLevelConfiguration(PriorityLevelConfiguration priorityLevelConfiguration) {
        this.priorityLevelConfiguration = priorityLevelConfiguration;
        return this;
    }

    public Schema withPriorityLevelConfigurationCondition(PriorityLevelConfigurationCondition priorityLevelConfigurationCondition) {
        this.priorityLevelConfigurationCondition = priorityLevelConfigurationCondition;
        return this;
    }

    public Schema withPriorityLevelConfigurationList(PriorityLevelConfigurationList priorityLevelConfigurationList) {
        this.priorityLevelConfigurationList = priorityLevelConfigurationList;
        return this;
    }

    public Schema withPriorityLevelConfigurationReference(PriorityLevelConfigurationReference priorityLevelConfigurationReference) {
        this.priorityLevelConfigurationReference = priorityLevelConfigurationReference;
        return this;
    }

    public Schema withPriorityLevelConfigurationSpec(PriorityLevelConfigurationSpec priorityLevelConfigurationSpec) {
        this.priorityLevelConfigurationSpec = priorityLevelConfigurationSpec;
        return this;
    }

    public Schema withPriorityLevelConfigurationStatus(PriorityLevelConfigurationStatus priorityLevelConfigurationStatus) {
        this.priorityLevelConfigurationStatus = priorityLevelConfigurationStatus;
        return this;
    }

    public Schema withQueuingConfiguration(QueuingConfiguration queuingConfiguration) {
        this.queuingConfiguration = queuingConfiguration;
        return this;
    }

    public Schema withResourcePolicyRule(ResourcePolicyRule resourcePolicyRule) {
        this.resourcePolicyRule = resourcePolicyRule;
        return this;
    }

    public Schema withServiceAccountSubject(ServiceAccountSubject serviceAccountSubject) {
        this.serviceAccountSubject = serviceAccountSubject;
        return this;
    }

    public Schema withSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    public Schema withUserSubject(UserSubject userSubject) {
        this.userSubject = userSubject;
        return this;
    }

    public Schema withHTTPIngressPath(HTTPIngressPath hTTPIngressPath) {
        this.hTTPIngressPath = hTTPIngressPath;
        return this;
    }

    public Schema withHTTPIngressRuleValue(HTTPIngressRuleValue hTTPIngressRuleValue) {
        this.hTTPIngressRuleValue = hTTPIngressRuleValue;
        return this;
    }

    public Schema withIPBlock(IPBlock iPBlock) {
        this.iPBlock = iPBlock;
        return this;
    }

    public Schema withIngress(Ingress ingress) {
        this.ingress = ingress;
        return this;
    }

    public Schema withIngressBackend(IngressBackend ingressBackend) {
        this.ingressBackend = ingressBackend;
        return this;
    }

    public Schema withIngressClass(IngressClass ingressClass) {
        this.ingressClass = ingressClass;
        return this;
    }

    public Schema withIngressClassList(IngressClassList ingressClassList) {
        this.ingressClassList = ingressClassList;
        return this;
    }

    public Schema withIngressClassParametersReference(IngressClassParametersReference ingressClassParametersReference) {
        this.ingressClassParametersReference = ingressClassParametersReference;
        return this;
    }

    public Schema withIngressClassSpec(IngressClassSpec ingressClassSpec) {
        this.ingressClassSpec = ingressClassSpec;
        return this;
    }

    public Schema withIngressList(IngressList ingressList) {
        this.ingressList = ingressList;
        return this;
    }

    public Schema withIngressRule(IngressRule ingressRule) {
        this.ingressRule = ingressRule;
        return this;
    }

    public Schema withIngressServiceBackend(IngressServiceBackend ingressServiceBackend) {
        this.ingressServiceBackend = ingressServiceBackend;
        return this;
    }

    public Schema withIngressSpec(IngressSpec ingressSpec) {
        this.ingressSpec = ingressSpec;
        return this;
    }

    public Schema withIngressStatus(IngressStatus ingressStatus) {
        this.ingressStatus = ingressStatus;
        return this;
    }

    public Schema withIngressTLS(IngressTLS ingressTLS) {
        this.ingressTLS = ingressTLS;
        return this;
    }

    public Schema withNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
        return this;
    }

    public Schema withNetworkPolicyEgressRule(NetworkPolicyEgressRule networkPolicyEgressRule) {
        this.networkPolicyEgressRule = networkPolicyEgressRule;
        return this;
    }

    public Schema withNetworkPolicyIngressRule(NetworkPolicyIngressRule networkPolicyIngressRule) {
        this.networkPolicyIngressRule = networkPolicyIngressRule;
        return this;
    }

    public Schema withNetworkPolicyList(NetworkPolicyList networkPolicyList) {
        this.networkPolicyList = networkPolicyList;
        return this;
    }

    public Schema withNetworkPolicyPeer(NetworkPolicyPeer networkPolicyPeer) {
        this.networkPolicyPeer = networkPolicyPeer;
        return this;
    }

    public Schema withNetworkPolicyPort(NetworkPolicyPort networkPolicyPort) {
        this.networkPolicyPort = networkPolicyPort;
        return this;
    }

    public Schema withNetworkPolicySpec(NetworkPolicySpec networkPolicySpec) {
        this.networkPolicySpec = networkPolicySpec;
        return this;
    }

    public Schema withNetworkPolicyStatus(NetworkPolicyStatus networkPolicyStatus) {
        this.networkPolicyStatus = networkPolicyStatus;
        return this;
    }

    public Schema withServiceBackendPort(ServiceBackendPort serviceBackendPort) {
        this.serviceBackendPort = serviceBackendPort;
        return this;
    }

    public Schema withOverhead(Overhead overhead) {
        this.overhead = overhead;
        return this;
    }

    public Schema withRuntimeClass(RuntimeClass runtimeClass) {
        this.runtimeClass = runtimeClass;
        return this;
    }

    public Schema withRuntimeClassList(RuntimeClassList runtimeClassList) {
        this.runtimeClassList = runtimeClassList;
        return this;
    }

    public Schema withScheduling(Scheduling scheduling) {
        this.scheduling = scheduling;
        return this;
    }

    public Schema withEviction(Eviction eviction) {
        this.eviction = eviction;
        return this;
    }

    public Schema withPodDisruptionBudget(PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
        return this;
    }

    public Schema withPodDisruptionBudgetList(PodDisruptionBudgetList podDisruptionBudgetList) {
        this.podDisruptionBudgetList = podDisruptionBudgetList;
        return this;
    }

    public Schema withPodDisruptionBudgetSpec(PodDisruptionBudgetSpec podDisruptionBudgetSpec) {
        this.podDisruptionBudgetSpec = podDisruptionBudgetSpec;
        return this;
    }

    public Schema withPodDisruptionBudgetStatus(PodDisruptionBudgetStatus podDisruptionBudgetStatus) {
        this.podDisruptionBudgetStatus = podDisruptionBudgetStatus;
        return this;
    }

    public Schema withAggregationRule(AggregationRule aggregationRule) {
        this.aggregationRule = aggregationRule;
        return this;
    }

    public Schema withClusterRole(ClusterRole clusterRole) {
        this.clusterRole = clusterRole;
        return this;
    }

    public Schema withClusterRoleBinding(ClusterRoleBinding clusterRoleBinding) {
        this.clusterRoleBinding = clusterRoleBinding;
        return this;
    }

    public Schema withClusterRoleBindingList(ClusterRoleBindingList clusterRoleBindingList) {
        this.clusterRoleBindingList = clusterRoleBindingList;
        return this;
    }

    public Schema withClusterRoleList(ClusterRoleList clusterRoleList) {
        this.clusterRoleList = clusterRoleList;
        return this;
    }

    public Schema withPolicyRule(PolicyRule policyRule) {
        this.policyRule = policyRule;
        return this;
    }

    public Schema withRole(Role role) {
        this.role = role;
        return this;
    }

    public Schema withRoleBinding(RoleBinding roleBinding) {
        this.roleBinding = roleBinding;
        return this;
    }

    public Schema withRoleBindingList(RoleBindingList roleBindingList) {
        this.roleBindingList = roleBindingList;
        return this;
    }

    public Schema withRoleList(RoleList roleList) {
        this.roleList = roleList;
        return this;
    }

    public Schema withRoleRef(RoleRef roleRef) {
        this.roleRef = roleRef;
        return this;
    }

    public Schema withPriorityClass(PriorityClass priorityClass) {
        this.priorityClass = priorityClass;
        return this;
    }

    public Schema withPriorityClassList(PriorityClassList priorityClassList) {
        this.priorityClassList = priorityClassList;
        return this;
    }

    public Schema withCSIDriver(CSIDriver cSIDriver) {
        this.cSIDriver = cSIDriver;
        return this;
    }

    public Schema withCSIDriverList(CSIDriverList cSIDriverList) {
        this.cSIDriverList = cSIDriverList;
        return this;
    }

    public Schema withCSIDriverSpec(CSIDriverSpec cSIDriverSpec) {
        this.cSIDriverSpec = cSIDriverSpec;
        return this;
    }

    public Schema withCSINode(CSINode cSINode) {
        this.cSINode = cSINode;
        return this;
    }

    public Schema withCSINodeDriver(CSINodeDriver cSINodeDriver) {
        this.cSINodeDriver = cSINodeDriver;
        return this;
    }

    public Schema withCSINodeList(CSINodeList cSINodeList) {
        this.cSINodeList = cSINodeList;
        return this;
    }

    public Schema withCSINodeSpec(CSINodeSpec cSINodeSpec) {
        this.cSINodeSpec = cSINodeSpec;
        return this;
    }

    public Schema withCSIStorageCapacity(CSIStorageCapacity cSIStorageCapacity) {
        this.cSIStorageCapacity = cSIStorageCapacity;
        return this;
    }

    public Schema withCSIStorageCapacityList(CSIStorageCapacityList cSIStorageCapacityList) {
        this.cSIStorageCapacityList = cSIStorageCapacityList;
        return this;
    }

    public Schema withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    public Schema withStorageClassList(StorageClassList storageClassList) {
        this.storageClassList = storageClassList;
        return this;
    }

    public Schema withVolumeAttachment(VolumeAttachment volumeAttachment) {
        this.volumeAttachment = volumeAttachment;
        return this;
    }

    public Schema withVolumeAttachmentList(VolumeAttachmentList volumeAttachmentList) {
        this.volumeAttachmentList = volumeAttachmentList;
        return this;
    }

    public Schema withVolumeAttachmentSource(VolumeAttachmentSource volumeAttachmentSource) {
        this.volumeAttachmentSource = volumeAttachmentSource;
        return this;
    }

    public Schema withVolumeAttachmentSpec(VolumeAttachmentSpec volumeAttachmentSpec) {
        this.volumeAttachmentSpec = volumeAttachmentSpec;
        return this;
    }

    public Schema withVolumeAttachmentStatus(VolumeAttachmentStatus volumeAttachmentStatus) {
        this.volumeAttachmentStatus = volumeAttachmentStatus;
        return this;
    }

    public Schema withVolumeError(VolumeError volumeError) {
        this.volumeError = volumeError;
        return this;
    }

    public Schema withVolumeNodeResources(VolumeNodeResources volumeNodeResources) {
        this.volumeNodeResources = volumeNodeResources;
        return this;
    }

    public Schema withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public Schema withAPIGroup(APIGroup aPIGroup) {
        this.aPIGroup = aPIGroup;
        return this;
    }

    public Schema withAPIGroupList(APIGroupList aPIGroupList) {
        this.aPIGroupList = aPIGroupList;
        return this;
    }

    public Schema withAPIResource(APIResource aPIResource) {
        this.aPIResource = aPIResource;
        return this;
    }

    public Schema withAPIResourceList(APIResourceList aPIResourceList) {
        this.aPIResourceList = aPIResourceList;
        return this;
    }

    public Schema withAPIVersions(APIVersions aPIVersions) {
        this.aPIVersions = aPIVersions;
        return this;
    }

    public Schema withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    public Schema withDeleteOptions(DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
        return this;
    }

    public Schema withFieldsV1(FieldsV1 fieldsV1) {
        this.fieldsV1 = fieldsV1;
        return this;
    }

    public Schema withGroupVersionForDiscovery(GroupVersionForDiscovery groupVersionForDiscovery) {
        this.groupVersionForDiscovery = groupVersionForDiscovery;
        return this;
    }

    public Schema withLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public Schema withLabelSelectorRequirement(LabelSelectorRequirement labelSelectorRequirement) {
        this.labelSelectorRequirement = labelSelectorRequirement;
        return this;
    }

    public Schema withListMeta(ListMeta listMeta) {
        this.listMeta = listMeta;
        return this;
    }

    public Schema withManagedFieldsEntry(ManagedFieldsEntry managedFieldsEntry) {
        this.managedFieldsEntry = managedFieldsEntry;
        return this;
    }

    public Schema withMicroTime(String microTime) {
        this.microTime = microTime;
        return this;
    }

    public Schema withObjectMeta(ObjectMeta objectMeta) {
        this.objectMeta = objectMeta;
        return this;
    }

    public Schema withOwnerReference(OwnerReference ownerReference) {
        this.ownerReference = ownerReference;
        return this;
    }

    public Schema withPatch(Patch patch) {
        this.patch = patch;
        return this;
    }

    public Schema withPreconditions(Preconditions preconditions) {
        this.preconditions = preconditions;
        return this;
    }

    public Schema withServerAddressByClientCIDR(ServerAddressByClientCIDR serverAddressByClientCIDR) {
        this.serverAddressByClientCIDR = serverAddressByClientCIDR;
        return this;
    }

    public Schema withStatus(Status status) {
        this.status = status;
        return this;
    }

    public Schema withStatusCause(StatusCause statusCause) {
        this.statusCause = statusCause;
        return this;
    }

    public Schema withStatusDetails(StatusDetails statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    public Schema withTime(String time) {
        this.time = time;
        return this;
    }

    public Schema withWatchEvent(WatchEvent watchEvent) {
        this.watchEvent = watchEvent;
        return this;
    }

    public Schema withRawExtension(RawExtension rawExtension) {
        this.rawExtension = rawExtension;
        return this;
    }

    public Schema withIntOrString(String intOrString) {
        this.intOrString = intOrString;
        return this;
    }

    public Schema withInfo(Info info) {
        this.info = info;
        return this;
    }

    public Schema withAPIService(APIService aPIService) {
        this.aPIService = aPIService;
        return this;
    }

    public Schema withAPIServiceCondition(APIServiceCondition aPIServiceCondition) {
        this.aPIServiceCondition = aPIServiceCondition;
        return this;
    }

    public Schema withAPIServiceList(APIServiceList aPIServiceList) {
        this.aPIServiceList = aPIServiceList;
        return this;
    }

    public Schema withAPIServiceSpec(APIServiceSpec aPIServiceSpec) {
        this.aPIServiceSpec = aPIServiceSpec;
        return this;
    }

    public Schema withAPIServiceStatus(APIServiceStatus aPIServiceStatus) {
        this.aPIServiceStatus = aPIServiceStatus;
        return this;
    }

}
