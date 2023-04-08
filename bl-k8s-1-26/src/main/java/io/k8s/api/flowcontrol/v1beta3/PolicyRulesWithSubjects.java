
package io.k8s.api.flowcontrol.v1beta3;

import java.util.List;
import io.k8s.api.rbac.v1.Subject;


/**
 * PolicyRulesWithSubjects prescribes a test that applies to a request to an apiserver. The test considers the subject making the request, the verb being requested, and the resource to be acted upon. This PolicyRulesWithSubjects matches a request if and only if both (a) at least one member of subjects matches the request and (b) at least one member of resourceRules or nonResourceRules matches the request.
 * 
 */
public class PolicyRulesWithSubjects {

    /**
     * `nonResourceRules` is a list of NonResourcePolicyRules that identify matching requests according to their verb and the target non-resource URL.
     * 
     */
    public List<NonResourcePolicyRule> nonResourceRules;
    /**
     * `resourceRules` is a slice of ResourcePolicyRules that identify matching requests according to their verb and the target resource. At least one of `resourceRules` and `nonResourceRules` has to be non-empty.
     * 
     */
    public List<ResourcePolicyRule> resourceRules;
    /**
     * subjects is the list of normal user, serviceaccount, or group that this rule cares about. There must be at least one member in this slice. A slice that includes both the system:authenticated and system:unauthenticated user groups matches every request. Required.
     * (Required)
     * 
     */
    public List<Subject> subjects;

    public PolicyRulesWithSubjects withNonResourceRules(List<NonResourcePolicyRule> nonResourceRules) {
        this.nonResourceRules = nonResourceRules;
        return this;
    }

    public PolicyRulesWithSubjects withResourceRules(List<ResourcePolicyRule> resourceRules) {
        this.resourceRules = resourceRules;
        return this;
    }

    public PolicyRulesWithSubjects withSubjects(List<Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

}
