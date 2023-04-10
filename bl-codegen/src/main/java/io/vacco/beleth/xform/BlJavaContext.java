package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.*;
import javax.lang.model.SourceVersion;
import java.util.*;

import static io.vacco.beleth.xform.BlSchemas.*;
import static com.squareup.javapoet.TypeSpec.*;
import static com.squareup.javapoet.MethodSpec.*;
import static javax.lang.model.element.Modifier.*;

public class BlJavaContext {

  private final Map<String, BlSchema> primitiveIdx = new TreeMap<>();

  private BlType swapPrimitive(BlType t) {
    if (primitiveIdx.containsKey(t.name.toString())) {
      return primitiveIdx.get(t.name.toString()).primitiveType;
    }
    return t;
  }

  private Optional<String> getComment(JsonObject obj) {
    return hasDescription(obj)
      ? Optional.of(obj.getString(kDescription))
      : Optional.empty();
  }

  public void mapField(BlSchema schema, TypeSpec.Builder jcb, String field, BlType fieldType) {
    if (!SourceVersion.isName(field)) {
      // TODO add com.google.gson.annotations.SerializedName annotation to mangled field
      System.out.println("This field can't be mapped, now what?? " + field);
      return;
    }
    var ft = swapPrimitive(fieldType);
    var fld = FieldSpec.builder(ft.name, field, PUBLIC);

    jcb.addField(fld.build());

    var fldChain = methodBuilder(field)
      .addModifiers(PUBLIC)
      .returns(schema.name)
      .addParameter(ft.name, field)
      .addStatement("this.$L = $L", field, field)
      .addStatement("return this");
    getComment(ft.document).ifPresent(desc -> fldChain.addJavadoc("$L", desc));

    jcb.addMethod(fldChain.build());
  }

  private BlJavaType mapEnum(BlSchema schema) {
    var jeb = enumBuilder((ClassName) schema.name).addModifiers(PUBLIC);
    var enumVals = schema.document.getJsonArray(kEnum);

    enumVals.forEach(ev -> jeb.addEnumConstant(((JsonString) ev).getString())); // TODO catch invalid enum names too.
    getComment(schema.document).ifPresent(desc -> jeb.addJavadoc("$L", desc));

    var jEnum = jeb.build();
    return new BlJavaType().with(schema, jEnum);
  }

  private BlJavaType mapOpen(BlSchema schema) {
    var vt = schema.additionalPropType != null
      ? schema.additionalPropType
      : new BlType().withName(ClassName.get(Object.class));
    vt = swapPrimitive(vt);
    var kt = ClassName.get(String.class);
    var mapType = ParameterizedTypeName.get(ClassName.get(Map.class), kt, vt.name);
    var jcb = classBuilder((ClassName) schema.name)
      .addModifiers(PUBLIC)
      .superclass(mapType);

    var kvChain = methodBuilder("kv")
      .addModifiers(PUBLIC)
      .returns(schema.name)
      .addParameter(kt, "key")
      .addParameter(vt.name, "value")
      .addStatement("put(key, value)")
      .addStatement("return this");
    jcb.addMethod(kvChain.build());

    var jClass = jcb.build();

    return new BlJavaType().with(schema, jClass);
  }

  private BlJavaType mapClass(BlSchema schema) {
    var jcb = classBuilder((ClassName) schema.name).addModifiers(PUBLIC);
    getComment(schema.document).ifPresent(desc -> jcb.addJavadoc("$L", desc));
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

  public void map(Collection<BlSchema> schemas) {
    var typeList = new ArrayList<BlJavaType>();
    for (var schema : schemas) {
      if (schema.primitiveType != null) {
        primitiveIdx.put(schema.name.toString(), schema);
      }
    }
    for (var schema : schemas) {
      typeList.add(map(schema));
    }
    System.out.println("lol");
  }

}