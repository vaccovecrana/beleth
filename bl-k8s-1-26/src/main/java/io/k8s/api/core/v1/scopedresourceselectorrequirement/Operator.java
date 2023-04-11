package io.k8s.api.core.v1.scopedresourceselectorrequirement;

/**
 * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
 *
 * Possible enum values:
 *  - `&#34;DoesNotExist&#34;`
 *  - `&#34;Exists&#34;`
 *  - `&#34;In&#34;`
 *  - `&#34;NotIn&#34;`
 */
public enum Operator {
  DoesNotExist,

  Exists,

  In,

  NotIn
}
