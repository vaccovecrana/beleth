package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.*;
import org.slf4j.*;
import javax.lang.model.SourceVersion;
import java.util.*;

import static io.vacco.beleth.xform.BlSchemas.*;
import static com.squareup.javapoet.TypeSpec.*;
import static com.squareup.javapoet.MethodSpec.*;
import static javax.lang.model.element.Modifier.*;
import static java.lang.String.format;

public class BlJavaContext {

  private static final Logger log = LoggerFactory.getLogger(BlJavaContext.class);

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

  private void mapFieldDeclaration(TypeSpec.Builder jcb, String field, String alias, BlType fieldType) {
    var fld = FieldSpec.builder(fieldType.name, alias == null ? field : alias, PUBLIC);
    if (alias != null) {
      fld.addAnnotation(
        AnnotationSpec
          .builder(ClassName.get("com.google.gson.annotations", "SerializedName"))
          .addMember("value", "\"$L\"", field)
          .build()
      );
    }
    jcb.addField(fld.build());
  }

  private void mapFieldChainMethod(BlSchema schema, TypeSpec.Builder jcb, String field, String alias, BlType fieldType) {
    var fldName = alias == null ? field : alias;
    var fldChain = methodBuilder(fldName)
      .addModifiers(PUBLIC)
      .returns(schema.name)
      .addParameter(fieldType.name, fldName)
      .addStatement("this.$L = $L", fldName, fldName)
      .addStatement("return this");
    getComment(fieldType.document).ifPresent(desc -> fldChain.addJavadoc("$L", desc));
    jcb.addMethod(fldChain.build());
  }

  public void mapField(BlSchema schema, TypeSpec.Builder jcb, String field, BlType fieldType) {
    var ft = swapPrimitive(fieldType);
    if (!SourceVersion.isName(field)) {
      log.warn(
        "Field [{}] of schema {} cannot be mapped verbatim. Serialization will work, but name will be mangled.",
        field, schema
      );
      var fieldAlias = format("v%s", BlSchemaContext.upperCaseFirst(field));
      mapFieldDeclaration(jcb, field, fieldAlias, ft);
      mapFieldChainMethod(schema, jcb, field, fieldAlias, ft);
    } else {
      mapFieldDeclaration(jcb, field, null, ft);
      mapFieldChainMethod(schema, jcb, field, null, ft);
    }
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

  public BlJavaType mapTypes(BlSchema schema) {
    if (schema.isEnum) {
      return mapEnum(schema);
    } else if (schema.isOpen) {
      return mapOpen(schema);
    }
    return mapClass(schema);
  }

  public List<BlJavaType> mapTypes(Collection<BlSchema> schemas) {
    var typeList = new ArrayList<BlJavaType>();
    for (var schema : schemas) {
      if (schema.primitiveType != null) {
        primitiveIdx.put(schema.name.toString(), schema);
      }
    }
    for (var schema : schemas) {
      typeList.add(mapTypes(schema));
    }
    return typeList;
  }

}