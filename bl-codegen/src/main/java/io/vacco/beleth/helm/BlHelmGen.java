package io.vacco.beleth.helm;

import com.fasterxml.jackson.databind.*;
import io.vacco.beleth.gen.*;
import io.vacco.cpiohell.*;
import org.jsonschema2pojo.*;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.*;

import static io.vacco.beleth.helm.BlHelmValues.*;

public class BlHelmGen {

  public static final String javaType = "javaType";
  public static final String generateRaw = "generateRaw";

  private final ObjectMapper om = new ObjectMapper();
  private final ObjectWriter ow = om.writerWithDefaultPrettyPrinter();
  private final Yaml yaml = new Yaml();

  public static String stripDash(String in) {
    return in.replace("-", "_");
  }

  public File unpack(URL helmUrl, File downloadDir) {
    var urlHash = Integer.toHexString(Objects.requireNonNull(helmUrl).toString().hashCode());
    var archiveDir = new File(downloadDir, urlHash);
    var archiveFile = new File(archiveDir, String.format("%s.tar.gz", urlHash));
    archiveDir.mkdirs();
    CoDownload.apply(helmUrl, archiveFile);
    CoExpand.apply(archiveFile.toPath(), archiveDir.toPath(), true);
    return archiveDir;
  }

  public File apply(URL helmUrl, File stageDir, RuleLogger logger, String repoAlias) {
    try {
      var helmRoot = unpack(helmUrl, stageDir);
      var schemasRoot = scanDocument(helmRoot, yaml, om, ow, repoAlias);
      return BlHelmPackage.generate(schemasRoot, new BlGenConfig(), logger, om);
    } catch (Exception e) {
      throw new IllegalStateException(
        String.format("Unable to process Helm definitions. [%s, %s]", helmUrl, stageDir),
        e
      );
    }
  }

  private void delete(File dir) throws IOException {
    if (dir.exists()) {
      var fs = Files.walk(dir.toPath());
      try (fs) {
        fs.sorted(Comparator.reverseOrder())
          .map(Path::toFile)
          .forEach(File::delete);
      }
    }
  }

  public void apply(File targetJavaSrcDir, File helmStagingDir,
                    BlHelmCache helmCache, List<BlHelmSrc> sources,
                    RuleLogger logger) throws IOException {
    delete(targetJavaSrcDir);
    targetJavaSrcDir.mkdirs();
    for (BlHelmSrc hs : sources) {
      var u = helmCache.urlFor(hs.repoAlias, hs.chart, hs.version);
      var javaSrc = new BlHelmGen().apply(u, helmStagingDir, logger, hs.repoAlias);
      var msg = String.format("Generating Helm resources for package [%s]", u.toString());
      logger.warn(msg);
      try (var fs = Files.walk(javaSrc.toPath())) {
        fs.sorted(Comparator.reverseOrder())
          .map(Path::toFile)
          .filter(f -> f.getName().endsWith(".java"))
          .forEach(f -> {
            var srcPath = javaSrc.toPath().relativize(f.toPath());
            var tgtPath = targetJavaSrcDir.toPath().resolve(srcPath);
            if (!tgtPath.toFile().getParentFile().exists()) {
              tgtPath.toFile().getParentFile().mkdirs();
            }
            try {
              Files.move(f.toPath(), tgtPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
              throw new RuntimeException(e);
            }
          });
      }
    }
  }

}
