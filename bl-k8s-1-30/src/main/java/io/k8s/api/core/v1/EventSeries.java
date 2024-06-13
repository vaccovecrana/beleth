package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
public class EventSeries {
  public Long count;

  public String lastObservedTime;

  /**
   * Number of occurrences in this series up to the last heartbeat time
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

  public static EventSeries eventSeries() {
    return new EventSeries();
  }
}
