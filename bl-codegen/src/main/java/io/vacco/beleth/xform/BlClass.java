package io.vacco.beleth.xform;

import com.squareup.javapoet.TypeSpec;

import java.util.Objects;

public class BlClass {

  public BlSchema schema;
  public TypeSpec typeSpec;

  public BlClass with(BlSchema schema, TypeSpec typeSpec) {
    this.schema = Objects.requireNonNull(schema);
    this.typeSpec = Objects.requireNonNull(typeSpec);
    return this;
  }

  @Override public String toString() {
    return schema.toString();
  }
}
