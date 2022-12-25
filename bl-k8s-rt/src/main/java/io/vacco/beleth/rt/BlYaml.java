package io.vacco.beleth.rt;

import org.yaml.snakeyaml.*;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.*;
import org.yaml.snakeyaml.representer.Representer;

import java.lang.reflect.Field;

public class BlYaml extends Yaml {

  // TODO there HAS to be a better way to control the way SnakeYaml renders enums.
  private static ThreadLocal<Field> nodeValField = ThreadLocal.withInitial(() -> {
    try {
      var nvf = ScalarNode.class.getDeclaredField("value");
      nvf.setAccessible(true);
      return nvf;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  });

  public BlYaml() {
    super(new Representer(new DumperOptions()) {
      @Override protected NodeTuple representJavaBeanProperty(Object javaBean, Property property,
                                                              Object propertyValue, Tag customTag) {
        if (propertyValue == null) { return null; }
        var tup = super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
        if (property.getType() != null && Enum.class.isAssignableFrom(property.getType())) {
          try {
            var vn = tup.getValueNode();
            var eVal = (Enum<?>) propertyValue;
            nodeValField.get().set(vn, eVal.toString());
          } catch (Exception e) {
            throw new IllegalStateException(e);
          }
        }
        return tup;
      }
    });
  }
}
