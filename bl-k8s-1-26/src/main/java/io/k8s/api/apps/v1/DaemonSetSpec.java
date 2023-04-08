
package io.k8s.api.apps.v1;

import io.k8s.api.core.v1.PodTemplateSpec;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * DaemonSetSpec is the specification of a daemon set.
 * 
 */
public class DaemonSetSpec {

    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
     */
    public Integer minReadySeconds;
    /**
     * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
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
     * PodTemplateSpec describes the data a pod should have when created from a template
     * (Required)
     * 
     */
    public PodTemplateSpec template;
    /**
     * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
     * 
     */
    public DaemonSetUpdateStrategy updateStrategy;

    public DaemonSetSpec withMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public DaemonSetSpec withRevisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public DaemonSetSpec withSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public DaemonSetSpec withTemplate(PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public DaemonSetSpec withUpdateStrategy(DaemonSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

}
