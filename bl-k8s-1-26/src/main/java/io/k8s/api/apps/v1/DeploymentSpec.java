
package io.k8s.api.apps.v1;

import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 * 
 */
public class DeploymentSpec {

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    public Integer minReadySeconds;
    /**
     * Indicates that the deployment is paused.
     * 
     */
    public Boolean paused;
    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    public Integer progressDeadlineSeconds;
    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    public Integer replicas;
    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
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
     * DeploymentStrategy describes how to replace existing pods with new ones.
     * 
     */
    public DeploymentStrategy strategy;
    /**
     * PodTemplateSpec describes the data a pod should have when created from a template
     * (Required)
     * 
     */
    public PodTemplateSpec template;

    public DeploymentSpec withMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public DeploymentSpec withPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }

    public DeploymentSpec withProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        return this;
    }

    public DeploymentSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public DeploymentSpec withRevisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public DeploymentSpec withSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public DeploymentSpec withStrategy(DeploymentStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public DeploymentSpec withTemplate(PodTemplateSpec template) {
        this.template = template;
        return this;
    }

}
