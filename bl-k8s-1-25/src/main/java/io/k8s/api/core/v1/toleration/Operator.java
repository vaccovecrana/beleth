package io.k8s.api.core.v1.toleration;

/**
 * Operator represents a key&#39;s relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
 *
 * Possible enum values:
 *  - `&#34;Equal&#34;`
 *  - `&#34;Exists&#34;`
 */
public enum Operator {
  Equal,

  Exists
}
