package io.vacco.beleth;

import org.jsonschema2pojo.*;
import java.io.File;
import java.net.URL;

public class BlK8sGen {

  public static void apply(URL k8sSwaggerUrl, File javaScrOutDir) {
    try {
      var preprocessedSchema = new File("./build/schema.json");
      var cfg = new BlGenConfig()
        .withSources(preprocessedSchema.toURI().toURL())
        .withSourceType(SourceType.JSONSCHEMA)
        .withTargetDirectory(javaScrOutDir)
        .withTargetPackage("io.k8s");
      new BlSchemaIo().prepareSchema(k8sSwaggerUrl, preprocessedSchema);
      Jsonschema2Pojo.generate(cfg, new BlDummyLogger());
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
