package io.k8s.api.authorization.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.FieldSelectorRequirement;
import java.lang.String;
import java.util.List;

/**
 * FieldSelectorAttributes indicates a field limited access. Webhook authors are encouraged to <code>*</code> ensure rawSelector and requirements are not both set <code>*</code> consider the requirements field if set <code>*</code> not try to parse or consider the rawSelector field if set. This is to avoid another CVE-2022-2880 (i.e. getting different systems to agree on how exactly to parse a query is not something we want), see https://www.oxeye.io/resources/golang-parameter-smuggling-attack for more details. For the <code>*</code>SubjectAccessReview endpoints of the kube-apiserver: <code>*</code> If rawSelector is empty and requirements are empty, the request is not limited. <code>*</code> If rawSelector is present and requirements are empty, the rawSelector will be parsed and limited if the parsing succeeds. <code>*</code> If rawSelector is empty and requirements are present, the requirements should be honored <code>*</code> If rawSelector is present and requirements are present, the request is invalid.
 */
public class FieldSelectorAttributes {
  public String rawSelector;

  public List<FieldSelectorRequirement> requirements;

  /**
   * rawSelector is the serialization of a field selector that would be included in a query parameter. Webhook implementations are encouraged to ignore rawSelector. The kube-apiserver&#39;s <code>*</code>SubjectAccessReview will parse the rawSelector as long as the requirements are not present.
   */
  public FieldSelectorAttributes rawSelector(String rawSelector) {
    this.rawSelector = rawSelector;
    return this;
  }

  /**
   * requirements is the parsed interpretation of a field selector. All requirements must be met for a resource instance to match the selector. Webhook implementations should handle requirements, but how to handle them is up to the webhook. Since requirements can only limit the request, it is safe to authorize as unlimited request if the requirements are not understood.
   */
  public FieldSelectorAttributes requirements(List<FieldSelectorRequirement> requirements) {
    this.requirements = requirements;
    return this;
  }

  public static FieldSelectorAttributes fieldSelectorAttributes() {
    return new FieldSelectorAttributes();
  }
}
