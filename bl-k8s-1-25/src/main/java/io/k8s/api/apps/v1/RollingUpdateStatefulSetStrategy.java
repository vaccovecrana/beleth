
package io.k8s.api.apps.v1;



/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 * 
 */
public class RollingUpdateStatefulSetStrategy {

    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String maxUnavailable;
    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned for updates. During a rolling update, all pods from ordinal Replicas-1 to Partition are updated. All pods from ordinal Partition-1 to 0 remain untouched. This is helpful in being able to do a canary based deployment. The default value is 0.
     * 
     */
    public Integer partition;

    public RollingUpdateStatefulSetStrategy withMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    public RollingUpdateStatefulSetStrategy withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

}
