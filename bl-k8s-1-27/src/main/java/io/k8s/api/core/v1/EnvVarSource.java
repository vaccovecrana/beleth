package io.k8s.api.core.v1;

/**
 * EnvVarSource represents a source for the value of an EnvVar.
 */
public class EnvVarSource {
  public ConfigMapKeySelector configMapKeyRef;

  public ObjectFieldSelector fieldRef;

  public ResourceFieldSelector resourceFieldRef;

  public SecretKeySelector secretKeyRef;

  public EnvVarSource configMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

  public EnvVarSource fieldRef(ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

  public EnvVarSource resourceFieldRef(ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

  public EnvVarSource secretKeyRef(SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }
}
