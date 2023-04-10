package io.vacco.beleth.xform;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import java.util.Objects;

import static io.vacco.beleth.xform.BlSchemas.*;
import static com.squareup.javapoet.TypeSpec.*;
import static com.squareup.javapoet.MethodSpec.*;
import static javax.lang.model.element.Modifier.*;

public class BlTypeContext {

  public TypeName wrap(BlSchema schema) {
    return ClassName.get("", schema.name);
  }

  public void mapPrimitive(BlSchema schema, TypeSpec.Builder jcb, String field, Class<?> cls) {
    var fld = FieldSpec.builder(cls, field, PUBLIC).build();
    jcb.addField(fld);
    var fldChain = methodBuilder(field)
      .addModifiers(PUBLIC)
      .returns(wrap(schema))
      .addParameter(cls, field)
      .addStatement("this.$L = $L", field, field)
      .addStatement("return this")
      .build();
    jcb.addMethod(fldChain);
  }

  public BlClass map(BlSchema schema, BlSchemaIndex schemaIndex) {
    var jcb = classBuilder(schema.name).addModifiers(PUBLIC);
    var doc = schema.document;

    if (doc.containsKey(kProperties)) {
      for (var pe : doc.getJsonObject(kProperties).entrySet()) {
        var prop = pe.getValue().asJsonObject();
        hasPrimitive(prop)
          .ifPresent(cls -> mapPrimitive(schema, jcb, pe.getKey(), cls));
        System.out.println("lo");
      }
    } else {
      System.out.println("Now what?");
    }

    var jClass = jcb.build();

    return new BlClass().with(schema, jClass);
  }

  public void map(BlSchemaIndex schemaIndex) {
    for (var schema : schemaIndex.values()) {
      map(schema, schemaIndex);
    }
  }

}
