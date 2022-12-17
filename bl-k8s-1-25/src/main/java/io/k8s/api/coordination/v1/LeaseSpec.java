
package io.k8s.api.coordination.v1;



/**
 * LeaseSpec is a specification of a Lease.
 * 
 */
public class LeaseSpec {

    /**
     * MicroTime is version of Time with microsecond level precision.
     * 
     */
    public String acquireTime;
    /**
     * holderIdentity contains the identity of the holder of a current lease.
     * 
     */
    public String holderIdentity;
    /**
     * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
     * 
     */
    public Integer leaseDurationSeconds;
    /**
     * leaseTransitions is the number of transitions of a lease between holders.
     * 
     */
    public Integer leaseTransitions;
    /**
     * MicroTime is version of Time with microsecond level precision.
     * 
     */
    public String renewTime;

    public LeaseSpec withAcquireTime(String acquireTime) {
        this.acquireTime = acquireTime;
        return this;
    }

    public LeaseSpec withHolderIdentity(String holderIdentity) {
        this.holderIdentity = holderIdentity;
        return this;
    }

    public LeaseSpec withLeaseDurationSeconds(Integer leaseDurationSeconds) {
        this.leaseDurationSeconds = leaseDurationSeconds;
        return this;
    }

    public LeaseSpec withLeaseTransitions(Integer leaseTransitions) {
        this.leaseTransitions = leaseTransitions;
        return this;
    }

    public LeaseSpec withRenewTime(String renewTime) {
        this.renewTime = renewTime;
        return this;
    }

}
