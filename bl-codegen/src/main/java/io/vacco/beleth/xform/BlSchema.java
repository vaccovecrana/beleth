package io.vacco.beleth.xform;

import jakarta.json.JsonObject;
import java.util.*;
import java.util.stream.Collectors;

public class BlSchema {

  public String packageName, name;
  public JsonObject document;
  public BlSchema parent;
  public Map<String, String> fieldRefs = new TreeMap<>();

  public BlSchema withFqn(String name, String packageName) {
    this.name = Objects.requireNonNull(name);
    this.packageName = Objects.requireNonNull(packageName);
    return this;
  }

  public BlSchema withFqn(String raw) {
    var fqn = Arrays.stream(raw.split("\\.")).collect(Collectors.toList());
    var name = fqn.remove(fqn.size() - 1);
    var pkg = String.join(".", fqn);
    return withFqn(name, pkg);
  }

  public BlSchema withDocument(JsonObject document) {
    this.document = Objects.requireNonNull(document);
    return this;
  }

  public BlSchema withParent(BlSchema parent) {
    this.parent = Objects.requireNonNull(parent);
    return this;
  }

  public String getFqn() {
    return String.format("%s.%s", packageName, name);
  }

  @Override public String toString() {
    return getFqn();
  }

}
