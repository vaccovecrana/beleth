package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.*;
import org.slf4j.*;
import javax.lang.model.SourceVersion;
import java.io.File;
import java.util.*;

import static io.vacco.beleth.xform.BlSchemas.*;
import static com.squareup.javapoet.TypeSpec.*;
import static com.squareup.javapoet.MethodSpec.*;
import static javax.lang.model.element.Modifier.*;
import static java.lang.String.format;

public class BlJavaContext {

  public static final String vValue = "value";
  private static final Logger log = LoggerFactory.getLogger(BlJavaContext.class);

  private final Map<String, BlSchema> primitiveIdx = new TreeMap<>();
  private final Map<String, BlJavaType> typeIdx = new TreeMap<>();

  private BlType swapPrimitive(BlType t) {
    if (primitiveIdx.containsKey(t.name.toString())) {
      return primitiveIdx.get(t.name.toString()).primitiveType;
    }
    return t;
  }

  public static String escapeHTML(String s) {
    StringBuilder out = new StringBuilder(Math.max(16, s.length()));
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c > 127 || c == '"' || c == '\'' || c == '<' || c == '>' || c == '&') {
        out.append("&#");
        out.append((int) c);
        out.append(';');
      } else {
        out.append(c);
      }
    }
    return out.toString().replace("*", "<code>*</code>");
  }

  private Optional<String> getComment(JsonObject obj) {
    return hasDescription(obj)
      ? Optional.of(escapeHTML(obj.getString(kDescription)))
      : Optional.empty();
  }

  private AnnotationSpec serializedName(String value) {
    return AnnotationSpec
      .builder(ClassName.get("com.google.gson.annotations", "SerializedName"))
      .addMember(vValue, "$S", value)
      .build();
  }

  private void mapFieldDeclaration(TypeSpec.Builder jcb, String field, String alias, BlType fieldType) {
    var fld = FieldSpec.builder(fieldType.name, alias == null ? field : alias, PUBLIC);
    if (alias != null) {
      fld.addAnnotation(serializedName(field));
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
      if (log.isDebugEnabled()) {
        log.debug(
          "Field [{}] of schema {} cannot be mapped verbatim. Serialization will work, but name will be mangled.",
          field, schema
        );
      }
      var fieldAlias = format("v%s", BlType.upperCaseFirst(field));
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
    var enumArr = enumVals.toArray(JsonValue[]::new);
    for (int i = 0; i < enumArr.length; i++) {
      var raw = ((JsonString) enumArr[i]).getString();
      if (raw.isEmpty()) {
        if (log.isDebugEnabled()) {
          log.debug("Schema {} declares empty enum constant. Skipping declaration. {}", schema, schema.document);
        }
      } else if (!SourceVersion.isName(raw) || !isValidIdentifier(raw)) {
        if (log.isDebugEnabled()) {
          log.debug("Schema {} declares unmappable enum constant [{}]. Enum name will be mangled.", schema, raw);
        }
        var alias = format("Val%03d", i);
        jeb.addEnumConstant(
          alias,
          anonymousClassBuilder("")
            .addAnnotation(serializedName(raw))
            .build()
        );
      } else {
        jeb.addEnumConstant(raw, anonymousClassBuilder("").build());
      }
    }
    getComment(schema.document).ifPresent(desc -> jeb.addJavadoc("$L", desc));
    var jEnum = jeb.build();
    return new BlJavaType().with(schema, jEnum);
  }

  private MethodSpec mapStaticBuilder(BlSchema schema) {
    var clazz = (ClassName) schema.name;
    var clazzName = clazz.simpleName();
    var staticBuilderMethod = clazzName.substring(0, 1).toLowerCase() + clazzName.substring(1);

    if (staticBuilderMethod.equals("default")) {
      staticBuilderMethod = "_default";
    }

    return methodBuilder(staticBuilderMethod)
      .addModifiers(PUBLIC, STATIC)
      .returns(schema.name)
      .addStatement(format("return new %s()", clazzName))
      .build();
  }

  private BlJavaType mapOpen(BlSchema schema) {
    var vt = schema.additionalPropType != null
      ? schema.additionalPropType
      : new BlType().withName(ClassName.get(Object.class));
    vt = swapPrimitive(vt);
    var kt = ClassName.get(String.class);
    var mapType = ParameterizedTypeName.get(ClassName.get(LinkedHashMap.class), kt, vt.name);
    var jcb = classBuilder((ClassName) schema.name)
      .addModifiers(PUBLIC)
      .addAnnotation(
        AnnotationSpec
          .builder(SuppressWarnings.class)
          .addMember(vValue, "$S", "serial")
          .build()
      )
      .superclass(mapType);

    var kvChain = methodBuilder("kv")
      .addModifiers(PUBLIC)
      .returns(schema.name)
      .addParameter(kt, "key")
      .addParameter(vt.name, vValue)
      .addStatement("put(key, value)")
      .addStatement("return this");
    jcb.addMethod(kvChain.build());
    jcb.addMethod(mapStaticBuilder(schema));

    var jClass = jcb.build();
    return new BlJavaType().with(schema, jClass);
  }

  private BlJavaType mapClass(BlSchema schema) {
    var clazz = (ClassName) schema.name;
    var jcb = classBuilder(clazz).addModifiers(PUBLIC);
    getComment(schema.document).ifPresent(desc -> jcb.addJavadoc("$L", desc));
    schema.propTypes.forEach((field, type) -> mapField(schema, jcb, field, type));
    jcb.addMethod(mapStaticBuilder(schema));

    var jClass = jcb.build();
    return new BlJavaType().with(schema, jClass);
  }

  public BlJavaType mapType(BlSchema schema) {
    if (schema.isEnum) {
      return mapEnum(schema);
    } else if (schema.isOpen) {
      return mapOpen(schema);
    }
    return mapClass(schema);
  }

  public void update(Collection<BlSchema> schemas) {
    for (var schema : schemas) {
      if (schema.primitiveType != null) {
        primitiveIdx.put(schema.name.toString(), schema);
      }
    }
    for (var schema : schemas) {
      if (typeIdx.containsKey(schema.name.toString())) {
        log.warn("Schema already mapped: {}", schema);
      } else {
        typeIdx.put(schema.name.toString(), mapType(schema));
      }
    }
  }

  public void export(File outDir) {
    try {
      if (!typeIdx.isEmpty()) {
        log.info("Writing [{}] type definitions to {}", typeIdx.size(), outDir.getAbsolutePath());
        for (var jt : typeIdx.values()) {
          var pkg = ((ClassName) jt.schema.name).packageName();
          var jf = JavaFile.builder(pkg, jt.typeSpec);
          if (log.isDebugEnabled()) {
            log.debug("Writing type [{}]", jt.schema.name);
          }
          jf.build().writeTo(outDir);
        }
      }
    } catch (Exception e) {
      log.error("Unable to write Java type definitions to {}", outDir, e);
      throw new IllegalStateException(e);
    }
  }

}