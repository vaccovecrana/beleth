
package io.k8s.api.apps.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 * 
 */
public class StatefulSetUpdateStrategy {

    /**
     * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
     * 
     */
    public RollingUpdateStatefulSetStrategy rollingUpdate;
    /**
     * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"OnDelete"` triggers the legacy behavior. Version tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec when they are manually deleted. When a scale operation is performed with this strategy,specification version indicated by the StatefulSet's currentRevision.
     *  - `"RollingUpdate"` indicates that update will be applied to all Pods in the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is performed with this strategy, new Pods will be created from the specification version indicated by the StatefulSet's updateRevision.
     * 
     */
    public StatefulSetUpdateStrategy.Type type;

    public StatefulSetUpdateStrategy withRollingUpdate(RollingUpdateStatefulSetStrategy rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public StatefulSetUpdateStrategy withType(StatefulSetUpdateStrategy.Type type) {
        this.type = type;
        return this;
    }


    /**
     * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"OnDelete"` triggers the legacy behavior. Version tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec when they are manually deleted. When a scale operation is performed with this strategy,specification version indicated by the StatefulSet's currentRevision.
     *  - `"RollingUpdate"` indicates that update will be applied to all Pods in the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is performed with this strategy, new Pods will be created from the specification version indicated by the StatefulSet's updateRevision.
     * 
     */
    public enum Type {

        ON_DELETE("OnDelete"),
        ROLLING_UPDATE("RollingUpdate");
        private final String value;
        private final static Map<String, StatefulSetUpdateStrategy.Type> CONSTANTS = new HashMap<String, StatefulSetUpdateStrategy.Type>();

        static {
            for (StatefulSetUpdateStrategy.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static StatefulSetUpdateStrategy.Type fromValue(String value) {
            StatefulSetUpdateStrategy.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
