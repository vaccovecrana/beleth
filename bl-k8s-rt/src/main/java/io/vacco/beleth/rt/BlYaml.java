package io.vacco.beleth.rt;

import org.yaml.snakeyaml.*;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.*;
import org.yaml.snakeyaml.representer.Representer;

public class BlYaml extends Yaml {
  public BlYaml() {
    super(new Representer(new DumperOptions()) {
      @Override protected NodeTuple representJavaBeanProperty(Object javaBean, Property property,
                                                              Object propertyValue, Tag customTag) {
        if (propertyValue == null) { return null; }
        return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
      }
    });
  }
}
