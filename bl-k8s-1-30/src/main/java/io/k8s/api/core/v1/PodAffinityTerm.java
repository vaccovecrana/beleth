package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.String;
import java.util.List;

/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key &#60;topologyKey&#62; matches that of any node on which a pod of the set of pods is running
 */
public class PodAffinityTerm {
  public LabelSelector labelSelector;

  public List<String> matchLabelKeys;

  public List<String> mismatchLabelKeys;

  public LabelSelector namespaceSelector;

  public List<String> namespaces;

  public String topologyKey;

  public PodAffinityTerm labelSelector(LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * MatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key in (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both matchLabelKeys and labelSelector. Also, matchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
   */
  public PodAffinityTerm matchLabelKeys(List<String> matchLabelKeys) {
    this.matchLabelKeys = matchLabelKeys;
    return this;
  }

  /**
   * MismatchLabelKeys is a set of pod label keys to select which pods will be taken into consideration. The keys are used to lookup values from the incoming pod labels, those key-value labels are merged with `labelSelector` as `key notin (value)` to select the group of existing pods which pods will be taken into consideration for the incoming pod&#39;s pod (anti) affinity. Keys that don&#39;t exist in the incoming pod labels will be ignored. The default value is empty. The same key is forbidden to exist in both mismatchLabelKeys and labelSelector. Also, mismatchLabelKeys cannot be set when labelSelector isn&#39;t set. This is an alpha field and requires enabling MatchLabelKeysInPodAffinity feature gate.
   */
  public PodAffinityTerm mismatchLabelKeys(List<String> mismatchLabelKeys) {
    this.mismatchLabelKeys = mismatchLabelKeys;
    return this;
  }

  public PodAffinityTerm namespaceSelector(LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

  /**
   * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means &#34;this pod&#39;s namespace&#34;.
   */
  public PodAffinityTerm namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   */
  public PodAffinityTerm topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }
}
