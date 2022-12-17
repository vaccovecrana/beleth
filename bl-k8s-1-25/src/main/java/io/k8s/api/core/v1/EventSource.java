
package io.k8s.api.core.v1;



/**
 * EventSource contains information for an event.
 * 
 */
public class EventSource {

    /**
     * Component from which the event is generated.
     * 
     */
    public String component;
    /**
     * Node name on which the event is generated.
     * 
     */
    public String host;

    public EventSource withComponent(String component) {
        this.component = component;
        return this;
    }

    public EventSource withHost(String host) {
        this.host = host;
        return this;
    }

}
