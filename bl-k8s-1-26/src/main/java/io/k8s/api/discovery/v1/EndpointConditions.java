package io.k8s.api.discovery.v1;

import java.lang.Boolean;

/**
 * EndpointConditions represents the current condition of an endpoint.
 */
public class EndpointConditions {
  public Boolean ready;

  public Boolean serving;

  public Boolean terminating;

  /**
   * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be &#34;true&#34; for terminating endpoints.
   */
  public EndpointConditions ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

  /**
   * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition.
   */
  public EndpointConditions serving(Boolean serving) {
    this.serving = serving;
    return this;
  }

  /**
   * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating.
   */
  public EndpointConditions terminating(Boolean terminating) {
    this.terminating = terminating;
    return this;
  }
}
