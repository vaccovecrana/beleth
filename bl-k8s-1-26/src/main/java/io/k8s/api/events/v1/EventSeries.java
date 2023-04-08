
package io.k8s.api.events.v1;



/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in "k8s.io/client-go/tools/events/event_broadcaster.go" shows how this struct is updated on heartbeats and can guide customized reporter implementations.
 * 
 */
public class EventSeries {

    /**
     * count is the number of occurrences in this series up to the last heartbeat time.
     * (Required)
     * 
     */
    public Integer count;
    /**
     * MicroTime is version of Time with microsecond level precision.
     * (Required)
     * 
     */
    public String lastObservedTime;

    public EventSeries withCount(Integer count) {
        this.count = count;
        return this;
    }

    public EventSeries withLastObservedTime(String lastObservedTime) {
        this.lastObservedTime = lastObservedTime;
        return this;
    }

}
