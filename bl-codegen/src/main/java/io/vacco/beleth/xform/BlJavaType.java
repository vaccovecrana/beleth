package io.vacco.beleth.xform;

import com.squareup.javapoet.TypeSpec;

import java.util.Objects;

public class BlJavaType {

  public BlSchema schema;
  public TypeSpec typeSpec;

  public BlJavaType with(BlSchema schema, TypeSpec typeSpec) {
    this.schema = Objects.requireNonNull(schema);
    this.typeSpec = Objects.requireNonNull(typeSpec);
    return this;
  }

  @Override public String toString() {
    return schema.toString();
  }
}
