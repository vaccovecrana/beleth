
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * NamespaceStatus is information about the current status of a Namespace.
 * 
 */
public class NamespaceStatus {

    /**
     * Represents the latest available observations of a namespace's current state.
     * 
     */
    public List<NamespaceCondition> conditions;
    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * Possible enum values:
     *  - `"Active"` means the namespace is available for use in the system
     *  - `"Terminating"` means the namespace is undergoing graceful termination
     * 
     */
    public NamespaceStatus.Phase phase;

    public NamespaceStatus withConditions(List<NamespaceCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public NamespaceStatus withPhase(NamespaceStatus.Phase phase) {
        this.phase = phase;
        return this;
    }


    /**
     * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     * Possible enum values:
     *  - `"Active"` means the namespace is available for use in the system
     *  - `"Terminating"` means the namespace is undergoing graceful termination
     * 
     */
    public enum Phase {

        ACTIVE("Active"),
        TERMINATING("Terminating");
        private final String value;
        private final static Map<String, NamespaceStatus.Phase> CONSTANTS = new HashMap<String, NamespaceStatus.Phase>();

        static {
            for (NamespaceStatus.Phase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Phase(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static NamespaceStatus.Phase fromValue(String value) {
            NamespaceStatus.Phase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
