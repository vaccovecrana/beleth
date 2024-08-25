package io.vacco.beleth.rt.schema;

import java.util.Objects;

public class BlResourceType implements Comparable<BlResourceType> {

  public String apiPath, name;
  public boolean nameSpaced;

  public String id() {
    return String.format("%s|%s|%s", apiPath, name, nameSpaced);
  }

  @Override public int compareTo(BlResourceType o) {
    return this.id().compareTo(o.id());
  }

  @Override public boolean equals(Object obj) {
    if (!(obj instanceof BlResourceType)) {
      return false;
    }
    return this.id().equals(((BlResourceType) obj).id());
  }

  @Override public int hashCode() {
    return id().hashCode();
  }

  @Override public String toString() {
    return this.id();
  }

  public static BlResourceType of(String apiPath, String name, boolean nameSpaced) {
    var rt = new BlResourceType();
    rt.apiPath = Objects.requireNonNull(apiPath);
    rt.name = Objects.requireNonNull(name);
    rt.nameSpaced = nameSpaced;
    return rt;
  }

}
