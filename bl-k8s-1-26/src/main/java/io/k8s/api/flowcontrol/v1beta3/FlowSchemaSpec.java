package io.k8s.api.flowcontrol.v1beta3;

import java.lang.Long;
import java.util.List;

/**
 * FlowSchemaSpec describes how the FlowSchema&#39;s specification looks like.
 */
public class FlowSchemaSpec {
  public FlowDistinguisherMethod distinguisherMethod;

  public Long matchingPrecedence;

  public PriorityLevelConfigurationReference priorityLevelConfiguration;

  public List<PolicyRulesWithSubjects> rules;

  public FlowSchemaSpec distinguisherMethod(FlowDistinguisherMethod distinguisherMethod) {
    this.distinguisherMethod = distinguisherMethod;
    return this;
  }

  /**
   * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be ranged in [1,10000]. Note that if the precedence is not specified, it will be set to 1000 as default.
   */
  public FlowSchemaSpec matchingPrecedence(Long matchingPrecedence) {
    this.matchingPrecedence = matchingPrecedence;
    return this;
  }

  public FlowSchemaSpec priorityLevelConfiguration(
      PriorityLevelConfigurationReference priorityLevelConfiguration) {
    this.priorityLevelConfiguration = priorityLevelConfiguration;
    return this;
  }

  /**
   * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
   */
  public FlowSchemaSpec rules(List<PolicyRulesWithSubjects> rules) {
    this.rules = rules;
    return this;
  }
}
