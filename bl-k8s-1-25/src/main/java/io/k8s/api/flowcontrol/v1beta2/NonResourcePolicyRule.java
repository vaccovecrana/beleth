package io.k8s.api.flowcontrol.v1beta2;

import java.lang.String;
import java.util.List;

/**
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 */
public class NonResourcePolicyRule {
  public List<String> nonResourceURLs;

  public List<String> verbs;

  /**
   * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
   *   - &#34;/healthz&#34; is legal
   *   - &#34;/hea<code>*</code>&#34; is illegal
   *   - &#34;/hea&#34; is legal but matches nothing
   *   - &#34;/hea/<code>*</code>&#34; also matches nothing
   *   - &#34;/healthz/<code>*</code>&#34; matches all per-component health checks.
   * &#34;<code>*</code>&#34; matches all non-resource urls. if it is present, it must be the only entry. Required.
   */
  public NonResourcePolicyRule nonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  /**
   * `verbs` is a list of matching verbs and may not be empty. &#34;<code>*</code>&#34; matches all verbs. If it is present, it must be the only entry. Required.
   */
  public NonResourcePolicyRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public static NonResourcePolicyRule nonResourcePolicyRule() {
    return new NonResourcePolicyRule();
  }
}
