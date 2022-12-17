package io.vacco.beleth;

import java.util.*;

public class BlIterators {

  public static <T> List<T> listFrom(Iterator<T> it) {
    var l = new ArrayList<T>();
    it.forEachRemaining(l::add);
    return l;
  }

}
