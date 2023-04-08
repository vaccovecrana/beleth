
package io.k8s.api.autoscaling.v2;



/**
 * HPAScalingPolicy is a single policy which must hold true for a specified past interval.
 * 
 */
public class HPAScalingPolicy {

    /**
     * PeriodSeconds specifies the window of time for which the policy should hold true. PeriodSeconds must be greater than zero and less than or equal to 1800 (30 min).
     * (Required)
     * 
     */
    public Integer periodSeconds;
    /**
     * Type is used to specify the scaling policy.
     * (Required)
     * 
     */
    public String type;
    /**
     * Value contains the amount of change which is permitted by the policy. It must be greater than zero
     * (Required)
     * 
     */
    public Integer value;

    public HPAScalingPolicy withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public HPAScalingPolicy withType(String type) {
        this.type = type;
        return this;
    }

    public HPAScalingPolicy withValue(Integer value) {
        this.value = value;
        return this;
    }

}
