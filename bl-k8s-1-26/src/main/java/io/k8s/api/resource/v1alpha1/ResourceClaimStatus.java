package io.k8s.api.resource.v1alpha1;

import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * ResourceClaimStatus tracks whether the resource has been allocated and what the resulting attributes are.
 */
public class ResourceClaimStatus {
  public AllocationResult allocation;

  public Boolean deallocationRequested;

  public String driverName;

  public List<ResourceClaimConsumerReference> reservedFor;

  public ResourceClaimStatus allocation(AllocationResult allocation) {
    this.allocation = allocation;
    return this;
  }

  /**
   * DeallocationRequested indicates that a ResourceClaim is to be deallocated.
   *
   * The driver then must deallocate this claim and reset the field together with clearing the Allocation field.
   *
   * While DeallocationRequested is set, no new consumers may be added to ReservedFor.
   */
  public ResourceClaimStatus deallocationRequested(Boolean deallocationRequested) {
    this.deallocationRequested = deallocationRequested;
    return this;
  }

  /**
   * DriverName is a copy of the driver name from the ResourceClass at the time when allocation started.
   */
  public ResourceClaimStatus driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * ReservedFor indicates which entities are currently allowed to use the claim. A Pod which references a ResourceClaim which is not reserved for that Pod will not be started.
   *
   * There can be at most 32 such reservations. This may get increased in the future, but not reduced.
   */
  public ResourceClaimStatus reservedFor(List<ResourceClaimConsumerReference> reservedFor) {
    this.reservedFor = reservedFor;
    return this;
  }
}
