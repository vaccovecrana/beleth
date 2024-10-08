package io.k8s.api.flowcontrol.v1beta3;

import java.lang.Long;

/**
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
 *   - How are requests for this priority level limited?
 *   - What should be done with requests that exceed the limit?
 */
public class LimitedPriorityLevelConfiguration {
  public Long borrowingLimitPercent;

  public Long lendablePercent;

  public LimitResponse limitResponse;

  public Long nominalConcurrencyShares;

  /**
   * `borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.
   *
   * BorrowingCL(i) = round( NominalCL(i) <code>*</code> borrowingLimitPercent(i)/100.0 )
   *
   * The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.
   */
  public LimitedPriorityLevelConfiguration borrowingLimitPercent(Long borrowingLimitPercent) {
    this.borrowingLimitPercent = borrowingLimitPercent;
    return this;
  }

  /**
   * `lendablePercent` prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.
   *
   * LendableCL(i) = round( NominalCL(i) <code>*</code> lendablePercent(i)/100.0 )
   */
  public LimitedPriorityLevelConfiguration lendablePercent(Long lendablePercent) {
    this.lendablePercent = lendablePercent;
    return this;
  }

  public LimitedPriorityLevelConfiguration limitResponse(LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
    return this;
  }

  /**
   * `nominalConcurrencyShares` (NCS) contributes to the computation of the NominalConcurrencyLimit (NominalCL) of this level. This is the number of execution seats available at this priority level. This is used both for requests dispatched from this priority level as well as requests dispatched from other priority levels borrowing seats from this level. The server&#39;s concurrency limit (ServerCL) is divided among the Limited priority levels in proportion to their NCS values:
   *
   * NominalCL(i)  = ceil( ServerCL <code>*</code> NCS(i) / sum_ncs ) sum_ncs = sum[priority level k] NCS(k)
   *
   * Bigger numbers mean a larger nominal concurrency limit, at the expense of every other priority level. This field has a default value of 30.
   */
  public LimitedPriorityLevelConfiguration nominalConcurrencyShares(Long nominalConcurrencyShares) {
    this.nominalConcurrencyShares = nominalConcurrencyShares;
    return this;
  }

  public static LimitedPriorityLevelConfiguration limitedPriorityLevelConfiguration() {
    return new LimitedPriorityLevelConfiguration();
  }
}
