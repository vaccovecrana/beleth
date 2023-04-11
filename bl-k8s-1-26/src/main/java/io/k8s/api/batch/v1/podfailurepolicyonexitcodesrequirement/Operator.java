package io.k8s.api.batch.v1.podfailurepolicyonexitcodesrequirement;

/**
 * Represents the relationship between the container exit code(s) and the specified values. Containers completed with success (exit code 0) are excluded from the requirement check. Possible values are: - In: the requirement is satisfied if at least one container exit code
 *   (might be multiple if there are multiple containers not restricted
 *   by the &#39;containerName&#39; field) is in the set of specified values.
 * - NotIn: the requirement is satisfied if at least one container exit code
 *   (might be multiple if there are multiple containers not restricted
 *   by the &#39;containerName&#39; field) is not in the set of specified values.
 * Additional values are considered to be added in the future. Clients should react to an unknown operator by assuming the requirement is not satisfied.
 *
 * Possible enum values:
 *  - `&#34;In&#34;`
 *  - `&#34;NotIn&#34;`
 */
public enum Operator {
  In,

  NotIn
}
