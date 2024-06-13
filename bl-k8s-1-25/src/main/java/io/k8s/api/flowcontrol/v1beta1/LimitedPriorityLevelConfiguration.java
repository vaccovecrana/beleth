package io.k8s.api.flowcontrol.v1beta1;

import java.lang.Long;

/**
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
 *   - How are requests for this priority level limited?
 *   - What should be done with requests that exceed the limit?
 */
public class LimitedPriorityLevelConfiguration {
  public Long assuredConcurrencyShares;

  public LimitResponse limitResponse;

  /**
   * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
   *
   *             ACV(l) = ceil( SCL <code>*</code> ACS(l) / ( sum[priority levels k] ACS(k) ) )
   *
   * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
   */
  public LimitedPriorityLevelConfiguration assuredConcurrencyShares(Long assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
    return this;
  }

  public LimitedPriorityLevelConfiguration limitResponse(LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
    return this;
  }

  public static LimitedPriorityLevelConfiguration limitedPriorityLevelConfiguration() {
    return new LimitedPriorityLevelConfiguration();
  }
}
