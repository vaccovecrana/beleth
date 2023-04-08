
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 * 
 */
public class StatusDetails {

    /**
     * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
     * 
     */
    public List<StatusCause> causes;
    /**
     * The group attribute of the resource associated with the status StatusReason.
     * 
     */
    public String group;
    /**
     * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
     * 
     */
    public String name;
    /**
     * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
     * 
     */
    public Integer retryAfterSeconds;
    /**
     * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    public String uid;

    public StatusDetails withCauses(List<StatusCause> causes) {
        this.causes = causes;
        return this;
    }

    public StatusDetails withGroup(String group) {
        this.group = group;
        return this;
    }

    public StatusDetails withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public StatusDetails withName(String name) {
        this.name = name;
        return this;
    }

    public StatusDetails withRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
        return this;
    }

    public StatusDetails withUid(String uid) {
        this.uid = uid;
        return this;
    }

}
