package io.k8s.api.authorization.v1;

import java.lang.String;
import java.util.List;

/**
 * NonResourceRule holds information that describes a rule for the non-resource
 */
public class NonResourceRule {
  public List<String> nonResourceURLs;

  public List<String> verbs;

  /**
   * NonResourceURLs is a set of partial urls that a user should have access to.  <code>*</code>s are allowed, but only as the full, final step in the path.  &#34;<code>*</code>&#34; means all.
   */
  public NonResourceRule nonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  /**
   * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  &#34;<code>*</code>&#34; means all.
   */
  public NonResourceRule verbs(List<String> verbs) {
    this.verbs = verbs;
    return this;
  }

  public static NonResourceRule nonResourceRule() {
    return new NonResourceRule();
  }
}
