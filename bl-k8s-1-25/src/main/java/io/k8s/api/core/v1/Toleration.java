
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
 * 
 */
public class Toleration {

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
     */
    public Toleration.Effect effect;
    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    public String key;
    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * 
     * Possible enum values:
     *  - `"Equal"`
     *  - `"Exists"`
     * 
     */
    public Toleration.Operator operator;
    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    public Integer tolerationSeconds;
    /**
     * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    public String value;

    public Toleration withEffect(Toleration.Effect effect) {
        this.effect = effect;
        return this;
    }

    public Toleration withKey(String key) {
        this.key = key;
        return this;
    }

    public Toleration withOperator(Toleration.Operator operator) {
        this.operator = operator;
        return this;
    }

    public Toleration withTolerationSeconds(Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
        return this;
    }

    public Toleration withValue(String value) {
        this.value = value;
        return this;
    }


    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
     */
    public enum Effect {

        NO_EXECUTE("NoExecute"),
        NO_SCHEDULE("NoSchedule"),
        PREFER_NO_SCHEDULE("PreferNoSchedule");
        private final String value;
        private final static Map<String, Toleration.Effect> CONSTANTS = new HashMap<String, Toleration.Effect>();

        static {
            for (Toleration.Effect c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Effect(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Toleration.Effect fromValue(String value) {
            Toleration.Effect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * 
     * Possible enum values:
     *  - `"Equal"`
     *  - `"Exists"`
     * 
     */
    public enum Operator {

        EQUAL("Equal"),
        EXISTS("Exists");
        private final String value;
        private final static Map<String, Toleration.Operator> CONSTANTS = new HashMap<String, Toleration.Operator>();

        static {
            for (Toleration.Operator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Toleration.Operator fromValue(String value) {
            Toleration.Operator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
