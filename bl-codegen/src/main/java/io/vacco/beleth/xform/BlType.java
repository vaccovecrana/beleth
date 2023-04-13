package io.vacco.beleth.xform;

import com.squareup.javapoet.*;
import jakarta.json.JsonObject;
import java.util.*;
import java.util.stream.Collectors;

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
        Objects.requireNonNull(packageName),
        Objects.requireNonNull(name)
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

}
