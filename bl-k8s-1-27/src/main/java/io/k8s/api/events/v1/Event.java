package io.k8s.api.events.v1;

import io.k8s.api.core.v1.EventSource;
import io.k8s.api.core.v1.ObjectReference;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Long;
import java.lang.String;

/**
 * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 */
public class Event {
  public String action;

  public String apiVersion;

  public Long deprecatedCount;

  public String deprecatedFirstTimestamp;

  public String deprecatedLastTimestamp;

  public EventSource deprecatedSource;

  public String eventTime;

  public String kind;

  public ObjectMeta metadata;

  public String note;

  public String reason;

  public ObjectReference regarding;

  public ObjectReference related;

  public String reportingController;

  public String reportingInstance;

  public EventSeries series;

  public String type;

  /**
   * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
   */
  public Event action(String action) {
    this.action = action;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Event apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
   */
  public Event deprecatedCount(Long deprecatedCount) {
    this.deprecatedCount = deprecatedCount;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public Event deprecatedFirstTimestamp(String deprecatedFirstTimestamp) {
    this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public Event deprecatedLastTimestamp(String deprecatedLastTimestamp) {
    this.deprecatedLastTimestamp = deprecatedLastTimestamp;
    return this;
  }

  public Event deprecatedSource(EventSource deprecatedSource) {
    this.deprecatedSource = deprecatedSource;
    return this;
  }

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public Event eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Event kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Event metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
   */
  public Event note(String note) {
    this.note = note;
    return this;
  }

  /**
   * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
   */
  public Event reason(String reason) {
    this.reason = reason;
    return this;
  }

  public Event regarding(ObjectReference regarding) {
    this.regarding = regarding;
    return this;
  }

  public Event related(ObjectReference related) {
    this.related = related;
    return this;
  }

  /**
   * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
   */
  public Event reportingController(String reportingController) {
    this.reportingController = reportingController;
    return this;
  }

  /**
   * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
   */
  public Event reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

  public Event series(EventSeries series) {
    this.series = series;
    return this;
  }

  /**
   * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
   */
  public Event type(String type) {
    this.type = type;
    return this;
  }
}
