package io.vacco.beleth.helm;

import io.vacco.beleth.util.BlArchive;
import io.vacco.beleth.xform.BlCodeGen;
import org.slf4j.*;
import java.io.File;
import java.net.URL;

public class BlHelmGen {

  private static final Logger log = LoggerFactory.getLogger(BlHelmGen.class);

  public static URL toUrl(File f) {
    try {
      return f.toURI().toURL();
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }

  public static void apply(URL archiveUrl, String rootPackage,
                           File stageDir, File srcOutDir) {
    try {
      var helmRoot = BlArchive.unpackTarGz(archiveUrl, stageDir);
      var codeGen = new BlCodeGen();
      BlArchive.scan(helmRoot, "json")
        .forEach(jf -> codeGen.swaggerXForm(toUrl(jf), srcOutDir, rootPackage));
      BlArchive.scan(helmRoot, ".yaml", ".yml")
        .forEach(yf -> codeGen.openApiCrdXForm(toUrl(yf), srcOutDir));
    } catch (Exception e) {
      log.error("Unable to process Helm chart schemas from {}", archiveUrl, e);
    }
  }

}
