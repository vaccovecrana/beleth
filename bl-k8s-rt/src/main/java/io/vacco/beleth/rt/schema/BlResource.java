package io.vacco.beleth.rt.schema;

import java.util.Objects;

public class BlResource implements Comparable<BlResource> {

  public Object manifest;
  private String pkg, nameSpace, name, contentHash, kind;

  private BlResource() {}

  public String id() {
    return String.format("%s|%s|%s|%s", pkg, nameSpace, kind, name);
  }

  @Override public int compareTo(BlResource o) {
    return this.id().compareTo(o.id());
  }

  @Override public boolean equals(Object obj) {
    return obj instanceof BlResource
      && ((BlResource) obj).id().equals(this.id());
  }

  @Override public int hashCode() {
    return this.id().hashCode();
  }

  @Override public String toString() {
    return String.format(
      "[%s, %s, %s]",
      id(), contentHash,
      manifest.getClass().getSimpleName()
    );
  }

  public static BlResource of(Object manifest, String pkg, String nameSpace,
                              String name, String contentHash, String kind) {
    var r = new BlResource();
    r.manifest = Objects.requireNonNull(manifest);
    r.pkg = Objects.requireNonNull(pkg);
    r.nameSpace = Objects.requireNonNull(nameSpace);
    r.name = Objects.requireNonNull(name);
    r.contentHash = Objects.requireNonNull(contentHash);
    r.kind = Objects.requireNonNull(kind);
    return r;
  }

  public String getName() {
    return name;
  }

  public String getNameSpace() {
    return nameSpace;
  }

  public String getContentHash() {
    return contentHash;
  }

  public String getPkg() {
    return pkg;
  }

  public String getKind() {
    return kind;
  }

}
