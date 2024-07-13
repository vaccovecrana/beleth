package io.k8s.api.coordination.v1;

import java.lang.Long;
import java.lang.String;

/**
 * LeaseSpec is a specification of a Lease.
 */
public class LeaseSpec {
  public String acquireTime;

  public String holderIdentity;

  public Long leaseDurationSeconds;

  public Long leaseTransitions;

  public String renewTime;

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public LeaseSpec acquireTime(String acquireTime) {
    this.acquireTime = acquireTime;
    return this;
  }

  /**
   * holderIdentity contains the identity of the holder of a current lease.
   */
  public LeaseSpec holderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return this;
  }

  /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed renewTime.
   */
  public LeaseSpec leaseDurationSeconds(Long leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
    return this;
  }

  /**
   * leaseTransitions is the number of transitions of a lease between holders.
   */
  public LeaseSpec leaseTransitions(Long leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
    return this;
  }

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public LeaseSpec renewTime(String renewTime) {
    this.renewTime = renewTime;
    return this;
  }

  public static LeaseSpec leaseSpec() {
    return new LeaseSpec();
  }
}
