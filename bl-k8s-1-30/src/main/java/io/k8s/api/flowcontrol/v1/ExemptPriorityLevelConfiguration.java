package io.k8s.api.flowcontrol.v1;

import java.lang.Long;

/**
 * ExemptPriorityLevelConfiguration describes the configurable aspects of the handling of exempt requests. In the mandatory exempt configuration object the values in the fields here can be modified by authorized users, unlike the rest of the `spec`.
 */
public class ExemptPriorityLevelConfiguration {
  public Long lendablePercent;

  public Long nominalConcurrencyShares;

  /**
   * `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels.  This value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
   *
   * LendableCL(i) = round( NominalCL(i) <code>*</code> lendablePercent(i)/100.0 )
   */
  public ExemptPriorityLevelConfiguration lendablePercent(Long lendablePercent) {
    this.lendablePercent = lendablePercent;
    return this;
  }

  /**
   * `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats nominally reserved for this priority level. This DOES NOT limit the dispatching from this priority level but affects the other priority levels through the borrowing mechanism. The server&#39;s concurrency limit (ServerCL) is divided among all the priority levels in proportion to their NCS values:
   *
   * NominalCL(i)  = ceil( ServerCL <code>*</code> NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
   *
   * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of zero.
   */
  public ExemptPriorityLevelConfiguration nominalConcurrencyShares(Long nominalConcurrencyShares) {
    this.nominalConcurrencyShares = nominalConcurrencyShares;
    return this;
  }
}
