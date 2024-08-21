package io.k8s.api.resource.v1alpha3;

import java.lang.String;

/**
 * CELDeviceSelector contains a CEL expression for selecting a device.
 */
public class CELDeviceSelector {
  public String expression;

  /**
   * Expression is a CEL expression which evaluates a single device. It must evaluate to true when the device under consideration satisfies the desired criteria, and false when it does not. Any other result is an error and causes allocation of devices to abort.
   *
   * The expression&#39;s input is an object named &#34;device&#34;, which carries the following properties:
   *  - driver (string): the name of the driver which defines this device.
   *  - attributes (map[string]object): the device&#39;s attributes, grouped by prefix
   *    (e.g. device.attributes[&#34;dra.example.com&#34;] evaluates to an object with all
   *    of the attributes which were prefixed by &#34;dra.example.com&#34;.
   *  - capacity (map[string]object): the device&#39;s capacities, grouped by prefix.
   *
   * Example: Consider a device with driver=&#34;dra.example.com&#34;, which exposes two attributes named &#34;model&#34; and &#34;ext.example.com/family&#34; and which exposes one capacity named &#34;modules&#34;. This input to this expression would have the following fields:
   *
   *     device.driver
   *     device.attributes[&#34;dra.example.com&#34;].model
   *     device.attributes[&#34;ext.example.com&#34;].family
   *     device.capacity[&#34;dra.example.com&#34;].modules
   *
   * The device.driver field can be used to check for a specific driver, either as a high-level precondition (i.e. you only want to consider devices from this driver) or as part of a multi-clause expression that is meant to consider devices from different drivers.
   *
   * The value type of each attribute is defined by the device definition, and users who write these expressions must consult the documentation for their specific drivers. The value type of each capacity is Quantity.
   *
   * If an unknown prefix is used as a lookup in either device.attributes or device.capacity, an empty map will be returned. Any reference to an unknown field will cause an evaluation error and allocation to abort.
   *
   * A robust expression should check for the existence of attributes before referencing them.
   *
   * For ease of use, the cel.bind() function is enabled, and can be used to simplify expressions that access multiple attributes with the same domain. For example:
   *
   *     cel.bind(dra, device.attributes[&#34;dra.example.com&#34;], dra.someBool &#38;&#38; dra.anotherBool)
   */
  public CELDeviceSelector expression(String expression) {
    this.expression = expression;
    return this;
  }

  public static CELDeviceSelector cELDeviceSelector() {
    return new CELDeviceSelector();
  }
}
