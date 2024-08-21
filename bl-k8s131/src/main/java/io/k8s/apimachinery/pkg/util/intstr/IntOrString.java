package io.k8s.apimachinery.pkg.util.intstr;

/**
 * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
 */
public class IntOrString {
  public static IntOrString intOrString() {
    return new IntOrString();
  }
}
