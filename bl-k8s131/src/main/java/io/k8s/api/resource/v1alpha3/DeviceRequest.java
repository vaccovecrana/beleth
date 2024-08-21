package io.k8s.api.resource.v1alpha3;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * DeviceRequest is a request for devices required for a claim. This is typically a request for a single resource like a device, but can also ask for several identical devices.
 *
 * A DeviceClassName is currently required. Clients must check that it is indeed set. It&#39;s absence indicates that something changed in a way that is not supported by the client yet, in which case it must refuse to handle the request.
 */
public class DeviceRequest {
  public Boolean adminAccess;

  public String allocationMode;

  public Long count;

  public String deviceClassName;

  public String name;

  public List<DeviceSelector> selectors;

  /**
   * AdminAccess indicates that this is a claim for administrative access to the device(s). Claims with AdminAccess are expected to be used for monitoring or other management services for a device.  They ignore all ordinary claims to the device with respect to access modes and any resource allocations.
   */
  public DeviceRequest adminAccess(Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return this;
  }

  /**
   * AllocationMode and its related fields define how devices are allocated to satisfy this request. Supported values are:
   *
   * - ExactCount: This request is for a specific number of devices.
   *   This is the default. The exact number is provided in the
   *   count field.
   *
   * - All: This request is for all of the matching devices in a pool.
   *   Allocation will fail if some devices are already allocated,
   *   unless adminAccess is requested.
   *
   * If AlloctionMode is not specified, the default mode is ExactCount. If the mode is ExactCount and count is not specified, the default count is one. Any other requests must specify this field.
   *
   * More modes may get added in the future. Clients must refuse to handle requests with unknown modes.
   */
  public DeviceRequest allocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
    return this;
  }

  /**
   * Count is used only when the count mode is &#34;ExactCount&#34;. Must be greater than zero. If AllocationMode is ExactCount and this field is not specified, the default is one.
   */
  public DeviceRequest count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * DeviceClassName references a specific DeviceClass, which can define additional configuration and selectors to be inherited by this request.
   *
   * A class is required. Which classes are available depends on the cluster.
   *
   * Administrators may use this to restrict which devices may get requested by only installing classes with selectors for permitted devices. If users are free to request anything without restrictions, then administrators can create an empty DeviceClass for users to reference.
   */
  public DeviceRequest deviceClassName(String deviceClassName) {
    this.deviceClassName = deviceClassName;
    return this;
  }

  /**
   * Name can be used to reference this request in a pod.spec.containers[].resources.claims entry and in a constraint of the claim.
   *
   * Must be a DNS label.
   */
  public DeviceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Selectors define criteria which must be satisfied by a specific device in order for that device to be considered for this request. All selectors must be satisfied for a device to be considered.
   */
  public DeviceRequest selectors(List<DeviceSelector> selectors) {
    this.selectors = selectors;
    return this;
  }

  public static DeviceRequest deviceRequest() {
    return new DeviceRequest();
  }
}
