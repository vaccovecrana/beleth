
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 * 
 */
public class NodeSelectorRequirement {

    /**
     * The label key that the selector applies to.
     * (Required)
     * 
     */
    public String key;
    /**
     * Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
     * 
     * Possible enum values:
     *  - `"DoesNotExist"`
     *  - `"Exists"`
     *  - `"Gt"`
     *  - `"In"`
     *  - `"Lt"`
     *  - `"NotIn"`
     * (Required)
     * 
     */
    public NodeSelectorRequirement.Operator operator;
    /**
     * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
     * 
     */
    public List<String> values;

    public NodeSelectorRequirement withKey(String key) {
        this.key = key;
        return this;
    }

    public NodeSelectorRequirement withOperator(NodeSelectorRequirement.Operator operator) {
        this.operator = operator;
        return this;
    }

    public NodeSelectorRequirement withValues(List<String> values) {
        this.values = values;
        return this;
    }


    /**
     * Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
     * 
     * Possible enum values:
     *  - `"DoesNotExist"`
     *  - `"Exists"`
     *  - `"Gt"`
     *  - `"In"`
     *  - `"Lt"`
     *  - `"NotIn"`
     * 
     */
    public enum Operator {

        DOES_NOT_EXIST("DoesNotExist"),
        EXISTS("Exists"),
        GT("Gt"),
        IN("In"),
        LT("Lt"),
        NOT_IN("NotIn");
        private final String value;
        private final static Map<String, NodeSelectorRequirement.Operator> CONSTANTS = new HashMap<String, NodeSelectorRequirement.Operator>();

        static {
            for (NodeSelectorRequirement.Operator c: values()) {
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

        public static NodeSelectorRequirement.Operator fromValue(String value) {
            NodeSelectorRequirement.Operator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
