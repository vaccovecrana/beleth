package io.vacco.beleth.xform;

import java.util.*;

public class BlSchema extends BlType {

  public Map<String, BlType> propTypes = new TreeMap<>();
  public Map<String, String> serializedNames = new TreeMap<>();
  public BlType additionalPropType;
  public BlType primitiveType;

  public boolean isOpen = false;
  public boolean isEnum = false;

  public void addPropType(String name, BlType type) {
    propTypes.put(name, type);
  }

  public void addSerializedProperty(String name, String serializedName) {
    serializedNames.put(name, serializedName);
  }

  public BlSchema withOpen(boolean isOpen) {
    this.isOpen = isOpen;
    return this;
  }

  public BlSchema withEnum(boolean isEnum) {
    this.isEnum = isEnum;
    return this;
  }

  public BlSchema withAdditionalPropType(BlType additionalPropType) {
    this.additionalPropType = Objects.requireNonNull(additionalPropType);
    return this;
  }

  public BlSchema withPrimitiveType(BlType primitiveType) {
    this.primitiveType = Objects.requireNonNull(primitiveType);
    return this;
  }

  @Override public String toString() {
    return String.format("(%s) %s",
      primitiveType != null ? "P" : isOpen ? "O" : isEnum ? "E" : "C",
      super.toString());
  }
}
