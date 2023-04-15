package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.JsonObject;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.*;

public class BlType {

  public TypeName name;
  public JsonObject document;

  @SuppressWarnings("unchecked")
  public <T extends BlType> T withName(TypeName name) {
    this.name = Objects.requireNonNull(name);
    return (T) this;
  }

  public <T extends BlType> T withName(String packageName, String name) {
    return withName(
      ClassName.get(
        swapDash(Objects.requireNonNull(packageName)),
        upperCaseFirst(Objects.requireNonNull(name))
      )
    );
  }

  public <T extends BlType> T withName(String raw) {
    var fqn = Arrays.stream(raw.split("\\."))
      .filter(st -> st.length() > 0)
      .collect(Collectors.toList());
    var name = fqn.remove(fqn.size() - 1);
    var pkg = String.join(".", fqn);
    return withName(pkg, name);
  }

  @SuppressWarnings("unchecked")
  public <T extends BlType> T withDocument(JsonObject document) {
    this.document = Objects.requireNonNull(document);
    return (T) this;
  }

  public String getRootPackage() {
    return name.toString().toLowerCase();
  }

  @Override public String toString() {
    return name.toString();
  }

  public static String upperCaseFirst(String raw) {
    return format("%s%s", valueOf(raw.charAt(0)).toUpperCase(), raw.substring(1));
  }

  public static String swapDash(String raw) {
    return raw.replace("-", "_");
  }

}
