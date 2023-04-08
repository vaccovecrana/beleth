
package io.k8s.api.autoscaling.v2;

import java.util.List;


/**
 * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
 * 
 */
public class HPAScalingRules {

    /**
     * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
     * 
     */
    public List<HPAScalingPolicy> policies;
    /**
     * selectPolicy is used to specify which policy should be used. If not set, the default value Max is used.
     * 
     */
    public String selectPolicy;
    /**
     * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     * 
     */
    public Integer stabilizationWindowSeconds;

    public HPAScalingRules withPolicies(List<HPAScalingPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public HPAScalingRules withSelectPolicy(String selectPolicy) {
        this.selectPolicy = selectPolicy;
        return this;
    }

    public HPAScalingRules withStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
        return this;
    }

}
