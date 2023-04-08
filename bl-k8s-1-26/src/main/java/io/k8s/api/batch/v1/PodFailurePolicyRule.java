
package io.k8s.api.batch.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of OnExitCodes and onPodConditions, but not both, can be used in each rule.
 * 
 */
public class PodFailurePolicyRule {

    /**
     * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
     *   running pods are terminated.
     * - Ignore: indicates that the counter towards the .backoffLimit is not
     *   incremented and a replacement pod is created.
     * - Count: indicates that the pod is handled in the default way - the
     *   counter towards the .backoffLimit is incremented.
     * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
     * 
     * Possible enum values:
     *  - `"Count"` This is an action which might be taken on a pod failure - the pod failure is handled in the default way - the counter towards .backoffLimit, represented by the job's .status.failed field, is incremented.
     *  - `"FailJob"` This is an action which might be taken on a pod failure - mark the pod's job as Failed and terminate all running pods.
     *  - `"Ignore"` This is an action which might be taken on a pod failure - the counter towards .backoffLimit, represented by the job's .status.failed field, is not incremented and a replacement pod is created.
     * (Required)
     * 
     */
    public PodFailurePolicyRule.Action action;
    /**
     * PodFailurePolicyOnExitCodesRequirement describes the requirement for handling a failed pod based on its container exit codes. In particular, it lookups the .state.terminated.exitCode for each app container and init container status, represented by the .status.containerStatuses and .status.initContainerStatuses fields in the Pod status, respectively. Containers completed with success (exit code 0) are excluded from the requirement check.
     * 
     */
    public PodFailurePolicyOnExitCodesRequirement onExitCodes;
    /**
     * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
     * (Required)
     * 
     */
    public List<PodFailurePolicyOnPodConditionsPattern> onPodConditions;

    public PodFailurePolicyRule withAction(PodFailurePolicyRule.Action action) {
        this.action = action;
        return this;
    }

    public PodFailurePolicyRule withOnExitCodes(PodFailurePolicyOnExitCodesRequirement onExitCodes) {
        this.onExitCodes = onExitCodes;
        return this;
    }

    public PodFailurePolicyRule withOnPodConditions(List<PodFailurePolicyOnPodConditionsPattern> onPodConditions) {
        this.onPodConditions = onPodConditions;
        return this;
    }


    /**
     * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
     *   running pods are terminated.
     * - Ignore: indicates that the counter towards the .backoffLimit is not
     *   incremented and a replacement pod is created.
     * - Count: indicates that the pod is handled in the default way - the
     *   counter towards the .backoffLimit is incremented.
     * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
     * 
     * Possible enum values:
     *  - `"Count"` This is an action which might be taken on a pod failure - the pod failure is handled in the default way - the counter towards .backoffLimit, represented by the job's .status.failed field, is incremented.
     *  - `"FailJob"` This is an action which might be taken on a pod failure - mark the pod's job as Failed and terminate all running pods.
     *  - `"Ignore"` This is an action which might be taken on a pod failure - the counter towards .backoffLimit, represented by the job's .status.failed field, is not incremented and a replacement pod is created.
     * 
     */
    public enum Action {

        COUNT("Count"),
        FAIL_JOB("FailJob"),
        IGNORE("Ignore");
        private final String value;
        private final static Map<String, PodFailurePolicyRule.Action> CONSTANTS = new HashMap<String, PodFailurePolicyRule.Action>();

        static {
            for (PodFailurePolicyRule.Action c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PodFailurePolicyRule.Action fromValue(String value) {
            PodFailurePolicyRule.Action constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
