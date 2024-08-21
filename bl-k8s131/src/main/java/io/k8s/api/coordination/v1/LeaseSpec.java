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

  public String preferredHolder;

  public String renewTime;

  public String strategy;

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public LeaseSpec acquireTime(String acquireTime) {
    this.acquireTime = acquireTime;
    return this;
  }

  /**
   * holderIdentity contains the identity of the holder of a current lease. If Coordinated Leader Election is used, the holder identity must be equal to the elected LeaseCandidate.metadata.name field.
   */
  public LeaseSpec holderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return this;
  }

  /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measured against the time of last observed renewTime.
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
   * PreferredHolder signals to a lease holder that the lease has a more optimal holder and should be given up. This field can only be set if Strategy is also set.
   */
  public LeaseSpec preferredHolder(String preferredHolder) {
    this.preferredHolder = preferredHolder;
    return this;
  }

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public LeaseSpec renewTime(String renewTime) {
    this.renewTime = renewTime;
    return this;
  }

  /**
   * Strategy indicates the strategy for picking the leader for coordinated leader election. If the field is not specified, there is no active coordination for this lease. (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.
   */
  public LeaseSpec strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

  public static LeaseSpec leaseSpec() {
    return new LeaseSpec();
  }
}
