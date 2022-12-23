package io.vacco.beleth.helm;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.vacco.beleth.gen.BlGenConfig;
import org.jsonschema2pojo.*;
import java.io.*;
import java.net.URL;
import java.util.*;

import static io.vacco.beleth.helm.BlHelmGen.*;

public class BlHelmPackage {

  public static File generate(File schemasRoot, BlGenConfig cfg,
                              RuleLogger logger, ObjectMapper om) throws IOException {
    var schemaUrls = new ArrayList<URL>();
    var rawFiles = new ArrayList<File>();
    var javaSources = new File(schemasRoot.getParentFile(), "java");
    javaSources.mkdirs();

    for (File f : Objects.requireNonNull(schemasRoot.listFiles())) {
      var u = f.toURI().toURL();
      if (!f.getName().startsWith("Values")) {
        schemaUrls.add(u);
      } else {
        rawFiles.add(f);
      }
    }

    for (File f : rawFiles) {
      var tree = (ObjectNode) om.readTree(f);
      var javaPkg = stripDash(tree.remove(javaType).textValue());
      tree.remove(generateRaw);
      om.writeValue(f, tree);
      cfg
        .withSources(f.toURI().toURL())
        .withSourceType(SourceType.JSON)
        .withTargetDirectory(javaSources)
        .withTargetPackage(javaPkg);
      Jsonschema2Pojo.generate(cfg, logger);
    }

    cfg
      .withSources(schemaUrls.toArray(URL[]::new))
      .withSourceType(SourceType.JSONSCHEMA)
      .withTargetDirectory(javaSources)
      .withTargetPackage("")
      .withRemoveOldOutput(false);
    Jsonschema2Pojo.generate(cfg, logger);

    return javaSources;
  }

}
