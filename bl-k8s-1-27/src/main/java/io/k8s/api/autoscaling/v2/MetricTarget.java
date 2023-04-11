package io.k8s.api.autoscaling.v2;

import java.lang.Long;
import java.lang.String;

/**
 * MetricTarget defines the target value, average value, or average utilization of a specific metric
 */
public class MetricTarget {
  public Long averageUtilization;

  public String averageValue;

  public String type;

  public String value;

  /**
   * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
   */
  public MetricTarget averageUtilization(Long averageUtilization) {
    this.averageUtilization = averageUtilization;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.
   *
   * The serialization format is:
   *
   * ``` &#60;quantity&#62;        ::= &#60;signedNumber&#62;&#60;suffix&#62;
   *
   * 	(Note that &#60;suffix&#62; may be empty, from the &#34;&#34; case in &#60;decimalSI&#62;.)
   *
   * &#60;digit&#62;           ::= 0 | 1 | ... | 9 &#60;digits&#62;          ::= &#60;digit&#62; | &#60;digit&#62;&#60;digits&#62; &#60;number&#62;          ::= &#60;digits&#62; | &#60;digits&#62;.&#60;digits&#62; | &#60;digits&#62;. | .&#60;digits&#62; &#60;sign&#62;            ::= &#34;+&#34; | &#34;-&#34; &#60;signedNumber&#62;    ::= &#60;number&#62; | &#60;sign&#62;&#60;number&#62; &#60;suffix&#62;          ::= &#60;binarySI&#62; | &#60;decimalExponent&#62; | &#60;decimalSI&#62; &#60;binarySI&#62;        ::= Ki | Mi | Gi | Ti | Pi | Ei
   *
   * 	(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
   *
   * &#60;decimalSI&#62;       ::= m | &#34;&#34; | k | M | G | T | P | E
   *
   * 	(Note that 1024 = 1Ki but 1000 = 1k; I didn&#39;t choose the capitalization.)
   *
   * &#60;decimalExponent&#62; ::= &#34;e&#34; &#60;signedNumber&#62; | &#34;E&#34; &#60;signedNumber&#62; ```
   *
   * No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.
   *
   * When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.
   *
   * Before serializing, Quantity will be put in &#34;canonical form&#34;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:
   *
   * - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.
   *
   * The sign will be omitted unless the number is negative.
   *
   * Examples:
   *
   * - 1.5 will be serialized as &#34;1500m&#34; - 1.5Gi will be serialized as &#34;1536Mi&#34;
   *
   * Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.
   *
   * Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)
   *
   * This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   */
  public MetricTarget averageValue(String averageValue) {
    this.averageValue = averageValue;
    return this;
  }

  /**
   * type represents whether the metric type is Utilization, Value, or AverageValue
   */
  public MetricTarget type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.
   *
   * The serialization format is:
   *
   * ``` &#60;quantity&#62;        ::= &#60;signedNumber&#62;&#60;suffix&#62;
   *
   * 	(Note that &#60;suffix&#62; may be empty, from the &#34;&#34; case in &#60;decimalSI&#62;.)
   *
   * &#60;digit&#62;           ::= 0 | 1 | ... | 9 &#60;digits&#62;          ::= &#60;digit&#62; | &#60;digit&#62;&#60;digits&#62; &#60;number&#62;          ::= &#60;digits&#62; | &#60;digits&#62;.&#60;digits&#62; | &#60;digits&#62;. | .&#60;digits&#62; &#60;sign&#62;            ::= &#34;+&#34; | &#34;-&#34; &#60;signedNumber&#62;    ::= &#60;number&#62; | &#60;sign&#62;&#60;number&#62; &#60;suffix&#62;          ::= &#60;binarySI&#62; | &#60;decimalExponent&#62; | &#60;decimalSI&#62; &#60;binarySI&#62;        ::= Ki | Mi | Gi | Ti | Pi | Ei
   *
   * 	(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
   *
   * &#60;decimalSI&#62;       ::= m | &#34;&#34; | k | M | G | T | P | E
   *
   * 	(Note that 1024 = 1Ki but 1000 = 1k; I didn&#39;t choose the capitalization.)
   *
   * &#60;decimalExponent&#62; ::= &#34;e&#34; &#60;signedNumber&#62; | &#34;E&#34; &#60;signedNumber&#62; ```
   *
   * No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.
   *
   * When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.
   *
   * Before serializing, Quantity will be put in &#34;canonical form&#34;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:
   *
   * - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.
   *
   * The sign will be omitted unless the number is negative.
   *
   * Examples:
   *
   * - 1.5 will be serialized as &#34;1500m&#34; - 1.5Gi will be serialized as &#34;1536Mi&#34;
   *
   * Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.
   *
   * Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)
   *
   * This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   */
  public MetricTarget value(String value) {
    this.value = value;
    return this;
  }
}
