package io.k8s.api.resource.v1alpha3;

import java.lang.Boolean;
import java.util.List;

/**
 * ResourceClaimStatus tracks whether the resource has been allocated and what the result of that was.
 */
public class ResourceClaimStatus {
  public AllocationResult allocation;

  public Boolean deallocationRequested;

  public List<ResourceClaimConsumerReference> reservedFor;

  public ResourceClaimStatus allocation(AllocationResult allocation) {
    this.allocation = allocation;
    return this;
  }

  /**
   * Indicates that a claim is to be deallocated. While this is set, no new consumers may be added to ReservedFor.
   *
   * This is only used if the claim needs to be deallocated by a DRA driver. That driver then must deallocate this claim and reset the field together with clearing the Allocation field.
   *
   * This is an alpha field and requires enabling the DRAControlPlaneController feature gate.
   */
  public ResourceClaimStatus deallocationRequested(Boolean deallocationRequested) {
    this.deallocationRequested = deallocationRequested;
    return this;
  }

  /**
   * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started. A claim that is in use or might be in use because it has been reserved must not get deallocated.
   *
   * In a cluster with multiple scheduler instances, two pods might get scheduled concurrently by different schedulers. When they reference the same ResourceClaim which already has reached its maximum number of consumers, only one pod can be scheduled.
   *
   * Both schedulers try to add their pod to the claim.status.reservedFor field, but only the update that reaches the API server first gets stored. The other one fails with an error and the scheduler which issued it knows that it must put the pod back into the queue, waiting for the ResourceClaim to become usable again.
   *
   * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
   */
  public ResourceClaimStatus reservedFor(List<ResourceClaimConsumerReference> reservedFor) {
    this.reservedFor = reservedFor;
    return this;
  }

  public static ResourceClaimStatus resourceClaimStatus() {
    return new ResourceClaimStatus();
  }
}
