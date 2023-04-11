package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 */
public class StatusDetails {
  public List<StatusCause> causes;

  public String group;

  public String kind;

  public String name;

  public Long retryAfterSeconds;

  public String uid;

  /**
   * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
   */
  public StatusDetails causes(List<StatusCause> causes) {
    this.causes = causes;
    return this;
  }

  /**
   * The group attribute of the resource associated with the status StatusReason.
   */
  public StatusDetails group(String group) {
    this.group = group;
    return this;
  }

  /**
   * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public StatusDetails kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
   */
  public StatusDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
   */
  public StatusDetails retryAfterSeconds(Long retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
    return this;
  }

  /**
   * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   */
  public StatusDetails uid(String uid) {
    this.uid = uid;
    return this;
  }
}
