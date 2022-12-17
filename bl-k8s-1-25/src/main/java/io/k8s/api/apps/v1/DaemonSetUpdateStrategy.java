
package io.k8s.api.apps.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 * 
 */
public class DaemonSetUpdateStrategy {

    /**
     * Spec to control the desired behavior of daemon set rolling update.
     * 
     */
    public RollingUpdateDaemonSet rollingUpdate;
    /**
     * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"OnDelete"` Replace the old daemons only when it's killed
     *  - `"RollingUpdate"` Replace the old daemons by new ones using rolling update i.e replace them on each node one after the other.
     * 
     */
    public DaemonSetUpdateStrategy.Type type;

    public DaemonSetUpdateStrategy withRollingUpdate(RollingUpdateDaemonSet rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public DaemonSetUpdateStrategy withType(DaemonSetUpdateStrategy.Type type) {
        this.type = type;
        return this;
    }


    /**
     * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"OnDelete"` Replace the old daemons only when it's killed
     *  - `"RollingUpdate"` Replace the old daemons by new ones using rolling update i.e replace them on each node one after the other.
     * 
     */
    public enum Type {

        ON_DELETE("OnDelete"),
        ROLLING_UPDATE("RollingUpdate");
        private final String value;
        private final static Map<String, DaemonSetUpdateStrategy.Type> CONSTANTS = new HashMap<String, DaemonSetUpdateStrategy.Type>();

        static {
            for (DaemonSetUpdateStrategy.Type c: values()) {
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

        public static DaemonSetUpdateStrategy.Type fromValue(String value) {
            DaemonSetUpdateStrategy.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
