package io.k8s.api.flowcontrol.v1;

import java.lang.String;

/**
 * LimitResponse defines how to handle requests that can not be executed right now.
 */
public class LimitResponse {
  public QueuingConfiguration queuing;

  public String type;

  public LimitResponse queuing(QueuingConfiguration queuing) {
    this.queuing = queuing;
    return this;
  }

  /**
   * `type` is &#34;Queue&#34; or &#34;Reject&#34;. &#34;Queue&#34; means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. &#34;Reject&#34; means that requests that can not be executed upon arrival are rejected. Required.
   */
  public LimitResponse type(String type) {
    this.type = type;
    return this;
  }
}
