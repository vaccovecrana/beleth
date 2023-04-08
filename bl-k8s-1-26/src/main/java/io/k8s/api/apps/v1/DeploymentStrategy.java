
package io.k8s.api.apps.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 * 
 */
public class DeploymentStrategy {

    /**
     * Spec to control the desired behavior of rolling update.
     * 
     */
    public RollingUpdateDeployment rollingUpdate;
    /**
     * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"Recreate"` Kill all existing pods before creating new ones.
     *  - `"RollingUpdate"` Replace the old ReplicaSets by new one using rolling update i.e gradually scale down the old ReplicaSets and scale up the new one.
     * 
     */
    public DeploymentStrategy.Type type;

    public DeploymentStrategy withRollingUpdate(RollingUpdateDeployment rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public DeploymentStrategy withType(DeploymentStrategy.Type type) {
        this.type = type;
        return this;
    }


    /**
     * Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"Recreate"` Kill all existing pods before creating new ones.
     *  - `"RollingUpdate"` Replace the old ReplicaSets by new one using rolling update i.e gradually scale down the old ReplicaSets and scale up the new one.
     * 
     */
    public enum Type {

        RECREATE("Recreate"),
        ROLLING_UPDATE("RollingUpdate");
        private final String value;
        private final static Map<String, DeploymentStrategy.Type> CONSTANTS = new HashMap<String, DeploymentStrategy.Type>();

        static {
            for (DeploymentStrategy.Type c: values()) {
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

        public static DeploymentStrategy.Type fromValue(String value) {
            DeploymentStrategy.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
