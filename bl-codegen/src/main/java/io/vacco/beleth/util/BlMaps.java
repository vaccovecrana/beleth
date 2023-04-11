package io.vacco.beleth.util;

import java.util.*;
import java.util.stream.Stream;

public class BlMaps {

  public static <K, V> Map.Entry<K, V> kv(K key, V value) {
    return new AbstractMap.SimpleEntry<>(key, value);
  }

  public static <K, V, M extends Map<K, V>> M mapOn(M m, Stream<Map.Entry<K, V>> entries) {
    entries.forEach(e -> m.put(e.getKey(), e.getValue()));
    return m;
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <K, V, M extends Map<K, V>> M map(M m, Map.Entry<K, V> ... entries) {
    return mapOn(m, Arrays.stream(entries));
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <K, V> Map<K, V> obj(Map.Entry<K, V> ... entries) {
    return map(new LinkedHashMap<>(), entries);
  }

}
