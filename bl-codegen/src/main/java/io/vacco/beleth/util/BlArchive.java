package io.vacco.beleth.util;

import io.vacco.cpiohell.*;
import java.io.File;
import java.net.URL;
import java.nio.file.*;
import java.util.Objects;
import java.util.stream.Stream;

public class BlArchive {

  private static boolean hasExtension(File f, String ... allowedExt) {
    for (var ext : allowedExt) {
      if (f.getName().endsWith(ext)) {
        return true;
      }
    }
    return false;
  }

  public static Stream<File> scan(File dir, String ... allowedExt) {
    try {
      return Files.walk(dir.toPath())
        .map(Path::toFile)
        .filter(f -> !f.isDirectory())
        .filter(f -> hasExtension(f, allowedExt));
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  public static File unpackTarGz(URL url, File outDir) {
    var urlHash = Integer.toHexString(Objects.requireNonNull(url).toString().hashCode());
    var archiveDir = new File(outDir, urlHash);
    var archiveFile = new File(archiveDir, String.format("%s.tar.gz", urlHash));
    archiveDir.mkdirs();
    CoDownload.apply(url, archiveFile);
    CoExpand.apply(archiveFile.toPath(), archiveDir.toPath(), true);
    return archiveDir;
  }

}
