package io.vacco.beleth.util;

import java.util.Objects;

public class BlExceptions {

  public static Throwable rootCauseOf(Throwable throwable) {
    Throwable rootCause = Objects.requireNonNull(throwable);
    while (rootCause.getCause() != null && rootCause.getCause() != rootCause) {
      rootCause = rootCause.getCause();
    }
    return rootCause;
  }

}
