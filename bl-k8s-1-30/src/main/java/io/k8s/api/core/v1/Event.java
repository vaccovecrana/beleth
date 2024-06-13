package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Long;
import java.lang.String;

/**
 * Event is a report of an event somewhere in the cluster.  Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 */
public class Event {
  public String action;

  public String apiVersion;

  public Long count;

  public String eventTime;

  public String firstTimestamp;

  public ObjectReference involvedObject;

  public String kind;

  public String lastTimestamp;

  public String message;

  public ObjectMeta metadata;

  public String reason;

  public ObjectReference related;

  public String reportingComponent;

  public String reportingInstance;

  public EventSeries series;

  public EventSource source;

  public String type;

  /**
   * What action was taken/failed regarding to the Regarding object.
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
   * The number of times this event has occurred.
   */
  public Event count(Long count) {
    this.count = count;
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
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public Event firstTimestamp(String firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return this;
  }

  public Event involvedObject(ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Event kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public Event lastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

  /**
   * A human-readable description of the status of this operation.
   */
  public Event message(String message) {
    this.message = message;
    return this;
  }

  public Event metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
   */
  public Event reason(String reason) {
    this.reason = reason;
    return this;
  }

  public Event related(ObjectReference related) {
    this.related = related;
    return this;
  }

  /**
   * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
   */
  public Event reportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return this;
  }

  /**
   * ID of the controller instance, e.g. `kubelet-xyzf`.
   */
  public Event reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

  public Event series(EventSeries series) {
    this.series = series;
    return this;
  }

  public Event source(EventSource source) {
    this.source = source;
    return this;
  }

  /**
   * Type of this event (Normal, Warning), new types could be added in the future
   */
  public Event type(String type) {
    this.type = type;
    return this;
  }
}
