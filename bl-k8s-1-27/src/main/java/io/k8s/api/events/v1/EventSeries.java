package io.k8s.api.events.v1;

import java.lang.Long;
import java.lang.String;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time. How often to update the EventSeries is up to the event reporters. The default event reporter in &#34;k8s.io/client-go/tools/events/event_broadcaster.go&#34; shows how this struct is updated on heartbeats and can guide customized reporter implementations.
 */
public class EventSeries {
  public Long count;

  public String lastObservedTime;

  /**
   * count is the number of occurrences in this series up to the last heartbeat time.
   */
  public EventSeries count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public EventSeries lastObservedTime(String lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return this;
  }
}
