package io.k8s.api.core.v1;

import java.lang.String;

/**
 * EnvFromSource represents the source of a set of ConfigMaps
 */
public class EnvFromSource {
  public ConfigMapEnvSource configMapRef;

  public String prefix;

  public SecretEnvSource secretRef;

  public EnvFromSource configMapRef(ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
    return this;
  }

  /**
   * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   */
  public EnvFromSource prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  public EnvFromSource secretRef(SecretEnvSource secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  public static EnvFromSource envFromSource() {
    return new EnvFromSource();
  }
}
