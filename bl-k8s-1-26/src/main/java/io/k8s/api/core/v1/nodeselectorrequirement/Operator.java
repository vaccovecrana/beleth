package io.k8s.api.core.v1.nodeselectorrequirement;

/**
 * Represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
 *
 * Possible enum values:
 *  - `&#34;DoesNotExist&#34;`
 *  - `&#34;Exists&#34;`
 *  - `&#34;Gt&#34;`
 *  - `&#34;In&#34;`
 *  - `&#34;Lt&#34;`
 *  - `&#34;NotIn&#34;`
 */
public enum Operator {
  DoesNotExist,

  Exists,

  Gt,

  In,

  Lt,

  NotIn
}
