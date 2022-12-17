
package io.k8s.api.events.v1;

import io.k8s.api.core.v1.EventSource;
import io.k8s.api.core.v1.ObjectReference;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Event is a report of an event somewhere in the cluster. It generally denotes some state change in the system. Events have a limited retention time and triggers and messages may evolve with time.  Event consumers should not rely on the timing of an event with a given Reason reflecting a consistent underlying trigger, or the continued existence of events with that Reason.  Events should be treated as informative, best-effort, supplemental data.
 * 
 */
public class Event {

    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public String action;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    public Integer deprecatedCount;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String deprecatedFirstTimestamp;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String deprecatedLastTimestamp;
    /**
     * EventSource contains information for an event.
     * 
     */
    public EventSource deprecatedSource;
    /**
     * MicroTime is version of Time with microsecond level precision.
     * (Required)
     * 
     */
    public String eventTime;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    public String note;
    /**
     * reason is why the action was taken. It is human-readable. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public String reason;
    /**
     * ObjectReference contains enough information to let you inspect or modify the referred object.
     * 
     */
    public ObjectReference regarding;
    /**
     * ObjectReference contains enough information to let you inspect or modify the referred object.
     * 
     */
    public ObjectReference related;
    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    public String reportingController;
    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    public String reportingInstance;
    /**
     * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
     * 
     */
    public EventSeries series;
    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable. This field cannot be empty for new Events.
     * 
     */
    public String type;

    public Event withAction(String action) {
        this.action = action;
        return this;
    }

    public Event withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Event withDeprecatedCount(Integer deprecatedCount) {
        this.deprecatedCount = deprecatedCount;
        return this;
    }

    public Event withDeprecatedFirstTimestamp(String deprecatedFirstTimestamp) {
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        return this;
    }

    public Event withDeprecatedLastTimestamp(String deprecatedLastTimestamp) {
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        return this;
    }

    public Event withDeprecatedSource(EventSource deprecatedSource) {
        this.deprecatedSource = deprecatedSource;
        return this;
    }

    public Event withEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    public Event withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Event withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Event withNote(String note) {
        this.note = note;
        return this;
    }

    public Event withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public Event withRegarding(ObjectReference regarding) {
        this.regarding = regarding;
        return this;
    }

    public Event withRelated(ObjectReference related) {
        this.related = related;
        return this;
    }

    public Event withReportingController(String reportingController) {
        this.reportingController = reportingController;
        return this;
    }

    public Event withReportingInstance(String reportingInstance) {
        this.reportingInstance = reportingInstance;
        return this;
    }

    public Event withSeries(EventSeries series) {
        this.series = series;
        return this;
    }

    public Event withType(String type) {
        this.type = type;
        return this;
    }

}
