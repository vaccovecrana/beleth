package io.k8s.api.batch.v1;

import java.lang.Long;
import java.lang.String;

/**
 * SuccessPolicyRule describes rule for declaring a Job as succeeded. Each rule must have at least one of the &#34;succeededIndexes&#34; or &#34;succeededCount&#34; specified.
 */
public class SuccessPolicyRule {
  public Long succeededCount;

  public String succeededIndexes;

  /**
   * succeededCount specifies the minimal required size of the actual set of the succeeded indexes for the Job. When succeededCount is used along with succeededIndexes, the check is constrained only to the set of indexes specified by succeededIndexes. For example, given that succeededIndexes is &#34;1-4&#34;, succeededCount is &#34;3&#34;, and completed indexes are &#34;1&#34;, &#34;3&#34;, and &#34;5&#34;, the Job isn&#39;t declared as succeeded because only &#34;1&#34; and &#34;3&#34; indexes are considered in that rules. When this field is null, this doesn&#39;t default to any value and is never evaluated at any time. When specified it needs to be a positive integer.
   */
  public SuccessPolicyRule succeededCount(Long succeededCount) {
    this.succeededCount = succeededCount;
    return this;
  }

  /**
   * succeededIndexes specifies the set of indexes which need to be contained in the actual set of the succeeded indexes for the Job. The list of indexes must be within 0 to &#34;.spec.completions-1&#34; and must not contain duplicates. At least one element is required. The indexes are represented as intervals separated by commas. The intervals can be a decimal integer or a pair of decimal integers separated by a hyphen. The number are listed in represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as &#34;1,3-5,7&#34;. When this field is null, this field doesn&#39;t default to any value and is never evaluated at any time.
   */
  public SuccessPolicyRule succeededIndexes(String succeededIndexes) {
    this.succeededIndexes = succeededIndexes;
    return this;
  }
}
