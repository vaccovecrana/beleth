package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import javax.lang.model.SourceVersion;
import java.util.Collection;
import java.util.stream.Collectors;

import static com.squareup.javapoet.TypeSpec.*;
import static com.squareup.javapoet.MethodSpec.*;
import static javax.lang.model.element.Modifier.*;

public class BlTypeContext {

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

  public BlClass map(BlSchema schema) {
    var jcb = classBuilder((ClassName) schema.name).addModifiers(PUBLIC);
    schema.propTypes.forEach((field, type) -> mapField(schema, jcb, field, type));

    // TODO add extra processing steps (enums, open class, etc...)

    var jClass = jcb.build();
    return new BlClass().with(schema, jClass);
  }

  public void map(Collection<BlSchema> schemas) {
    var classes = schemas.stream().map(this::map).collect(Collectors.toList());
    System.out.println("lol");
  }

}