package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.JsonString;
import javax.lang.model.SourceVersion;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import static io.vacco.beleth.xform.BlSchemas.*;
import static com.squareup.javapoet.TypeSpec.*;
import static com.squareup.javapoet.MethodSpec.*;
import static javax.lang.model.element.Modifier.*;

public class BlJavaContext {

  public void mapField(BlSchema schema, TypeSpec.Builder jcb, String field, BlType fieldType) {
    if (!SourceVersion.isName(field)) {
      // TODO add com.google.gson.annotations.SerializedName annotation to mangled field
      System.out.println("This field can't be mapped, now what?? " + field);
      return;
    }
    var fld = FieldSpec.builder(fieldType.name, field, PUBLIC).build();
    jcb.addField(fld);
    var fldChain = methodBuilder(field)
      .addModifiers(PUBLIC)
      .returns(schema.name)
      .addParameter(fieldType.name, field)
      .addStatement("this.$L = $L", field, field)
      .addStatement("return this")
      .build();
    jcb.addMethod(fldChain);
  }

  private BlJavaType mapEnum(BlSchema schema) {
    var jeb = enumBuilder((ClassName) schema.name)
      .addModifiers(PUBLIC);
    var enumVals = schema.document.getJsonArray(kEnum);
    enumVals.forEach(ev -> {
      jeb.addEnumConstant(((JsonString) ev).getString());
    });
    var jEnum = jeb.build();
    return new BlJavaType().with(schema, jEnum);
  }

  private BlJavaType mapOpen(BlSchema schema) {
    var valType = schema.additionalPropType != null
      ? schema.additionalPropType.name
      : ClassName.get(Object.class);
    var mapType = ParameterizedTypeName.get(ClassName.get(Map.class), ClassName.get(String.class), valType);
    var jcb = classBuilder((ClassName) schema.name)
      .addModifiers(PUBLIC)
      .superclass(mapType);
    var jClass = jcb.build();
    return new BlJavaType().with(schema, jClass);
  }

  private BlJavaType mapClass(BlSchema schema) {
    var jcb = classBuilder((ClassName) schema.name).addModifiers(PUBLIC);
    schema.propTypes.forEach((field, type) -> mapField(schema, jcb, field, type));
    var jClass = jcb.build();
    return new BlJavaType().with(schema, jClass);
  }

  public BlJavaType map(BlSchema schema) {
    if (schema.isEnum) {
      return mapEnum(schema);
    } else if (schema.isOpen) {
      return mapOpen(schema);
    }
    return mapClass(schema);
  }

  // TODO add documentation nodes
  // TODO rename primitive type mappings

  public void map(Collection<BlSchema> schemas) {
    var classes = schemas.stream().map(this::map).collect(Collectors.toList());
    System.out.println("lol");
  }

}