package io.vacco.beleth.rt.util;

import io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Labels;
import io.vacco.beleth.rt.schema.BlResource;
import io.vacco.beleth.rt.schema.BlResourcePair;
import java.util.*;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;
import static io.vacco.beleth.rt.util.BlIo.*;

public class BlResources {

  public static final String
    kMetadata = "metadata",
    kLabels   = "labels",
    kBlPkg    = "beleth.io.pkg",
    kBlHash   = "beleth.io.hash";

  public static final String DefaultNs = "default";

  @SuppressWarnings({"unchecked", "rawtypes"})
  public static void injectMeta(Object manifest, String labelKey, String labelValue) {
    try {
      if (manifest instanceof Map) {
        var m = (Map) manifest;
        var meta = (Map) m.get(kMetadata);
        var labels = (Map) meta.computeIfAbsent(kLabels, k -> new LinkedHashMap<>());
        labels.put(labelKey, labelValue);
      } else {
        var mt = manifest.getClass().getField(kMetadata).get(manifest);
        var lf = mt.getClass().getField(kLabels);
        var lb = lf.get(mt);
        if (lb == null) {
          lb = new Labels();
          lf.set(mt, lb);
        }
        ((Labels) lb).put(labelKey, labelValue);
      }
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  public static boolean isValidIdentifier(String identifier) {
    if (identifier.isEmpty()) {
      return false;
    }
    var firstChar = identifier.charAt(0);
    if (!Character.isLetter(firstChar) && firstChar != '_') {
      return false;
    }
    for (int i = 1; i < identifier.length(); i++) {
      var ch = identifier.charAt(i);
      if (!Character.isLetterOrDigit(ch) && ch != '_') {
        return false;
      }
    }
    return true;
  }

  public static boolean isValidPackageName(String packageName) {
    if (packageName == null || packageName.isEmpty()) {
      return false;
    }
    for (var part : packageName.split("\\.")) {
      if (!isValidIdentifier(part)) {
        return false;
      }
    }
    return true;
  }

  @SuppressWarnings("rawtypes")
  public static BlResource resourceOf(Object manifest, String packageName, String contentHash, String kind) {
    if (requireNonNull(manifest) instanceof Map) {
      var m = (Map) manifest;
      var ns = pointerOnMap(m, "metadata/namespace");
      var blPkg = requireNonNull(pointerOnMap(m, format("/metadata/labels/%s", kBlPkg))).toString();
      var blHash = requireNonNull(pointerOnMap(m, format("/metadata/labels/%s", kBlHash))).toString();
      var name = requireNonNull(pointerOnMap(m, "/metadata/name")).toString();
      return BlResource.of(manifest, blPkg, ns == null ? DefaultNs : ns.toString(), name, blHash, kind);
    } else {
      injectMeta(manifest, kBlPkg, packageName);
      injectMeta(manifest, kBlHash, contentHash);
      var ns = pointerOnObject(manifest, "/metadata/namespace");
      var name = requireNonNull(pointerOnObject(manifest, "/metadata/name")).toString();
      var labels = (Map) requireNonNull(pointerOnObject(manifest, "/metadata/labels"));
      return BlResource.of(
        manifest, packageName,
        ns != null ? ns.toString() : DefaultNs,
        name, labels.get(kBlHash).toString(), kind
      );
    }
  }

  public static BlResourcePair resourcePairOf(String blId, Set<BlResource> local, Set<BlResource> cluster) {
    var r0 = local.stream().filter(r -> r.id().equals(blId)).findFirst().orElseThrow();
    var r1 = cluster.stream().filter(r -> r.id().equals(blId)).findFirst().orElseThrow();
    return BlResourcePair.of(r0, r1);
  }

}
