package io.k8s.apimachinery.pkg.apis.meta.v1;

/**
 * MicroTime is version of Time with microsecond level precision.
 */
public class MicroTime {
  public static MicroTime microTime() {
    return new MicroTime();
  }
}
