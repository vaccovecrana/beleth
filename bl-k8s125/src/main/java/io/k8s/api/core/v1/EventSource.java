package io.k8s.api.core.v1;

import java.lang.String;

/**
 * EventSource contains information for an event.
 */
public class EventSource {
  public String component;

  public String host;

  /**
   * Component from which the event is generated.
   */
  public EventSource component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Node name on which the event is generated.
   */
  public EventSource host(String host) {
    this.host = host;
    return this;
  }

  public static EventSource eventSource() {
    return new EventSource();
  }
}
