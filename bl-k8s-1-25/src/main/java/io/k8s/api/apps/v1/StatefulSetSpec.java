
package io.k8s.api.apps.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.k8s.api.core.v1.PersistentVolumeClaim;
import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 * 
 */
public class StatefulSetSpec {

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Integer minReadySeconds;
    /**
     * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
     * 
     */
    public StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy;
    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     * Possible enum values:
     *  - `"OrderedReady"` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
     *  - `"Parallel"` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
     * 
     */
    public StatefulSetSpec.PodManagementPolicy podManagementPolicy;
    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    public Integer replicas;
    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    public Integer revisionHistoryLimit;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * (Required)
     * 
     */
    public LabelSelector selector;
    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
     * (Required)
     * 
     */
    public String serviceName;
    /**
     * PodTemplateSpec describes the data a pod should have when created from a template
     * (Required)
     * 
     */
    public PodTemplateSpec template;
    /**
     * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
     * 
     */
    public StatefulSetUpdateStrategy updateStrategy;
    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    public List<PersistentVolumeClaim> volumeClaimTemplates;

    public StatefulSetSpec withMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public StatefulSetSpec withPersistentVolumeClaimRetentionPolicy(StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
        this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
        return this;
    }

    public StatefulSetSpec withPodManagementPolicy(StatefulSetSpec.PodManagementPolicy podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
        return this;
    }

    public StatefulSetSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public StatefulSetSpec withRevisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public StatefulSetSpec withSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public StatefulSetSpec withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public StatefulSetSpec withTemplate(PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public StatefulSetSpec withUpdateStrategy(StatefulSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    public StatefulSetSpec withVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
        return this;
    }


    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     * Possible enum values:
     *  - `"OrderedReady"` will create pods in strictly increasing order on scale up and strictly decreasing order on scale down, progressing only when the previous pod is ready or terminated. At most one pod will be changed at any time.
     *  - `"Parallel"` will create and delete pods as soon as the stateful set replica count is changed, and will not wait for pods to be ready or complete termination.
     * 
     */
    public enum PodManagementPolicy {

        ORDERED_READY("OrderedReady"),
        PARALLEL("Parallel");
        private final String value;
        private final static Map<String, StatefulSetSpec.PodManagementPolicy> CONSTANTS = new HashMap<String, StatefulSetSpec.PodManagementPolicy>();

        static {
            for (StatefulSetSpec.PodManagementPolicy c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PodManagementPolicy(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static StatefulSetSpec.PodManagementPolicy fromValue(String value) {
            StatefulSetSpec.PodManagementPolicy constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
