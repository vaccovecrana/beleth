package io.vacco.beleth.gen;

import com.sun.codemodel.*;
import org.jsonschema2pojo.rules.*;
import org.jsonschema2pojo.util.*;
import java.util.LinkedHashMap;

public class BlRuleFactory extends RuleFactory {

  private final ReflectionHelper reflectionHelper = new ReflectionHelper(this);

  public JDefinedClass extendLinkedHashMap(JDefinedClass jclass, Class<?> kClass, Class<?> vClass) {
    var lhType = jclass.owner().ref(LinkedHashMap.class);
    var kClassRef = jclass.owner().ref(kClass);
    var vClassRef = jclass.owner().ref(vClass);
    lhType = lhType.narrow(kClassRef, vClassRef);
    jclass._extends(lhType);
    return jclass;
  }

  @Override public Rule<JDefinedClass, JDefinedClass> getAdditionalPropertiesRule() {
    return new BlAdditionalPropertiesRule(this);
  }

  @Override public Rule<JDefinedClass, JDefinedClass> getPropertyRule() {
    return new BlPropertyRule(this);
  }

  @Override public Rule<JPackage, JType> getObjectRule() {
    return new BlObjectRule(this, new ParcelableHelper(), reflectionHelper);
  }

}
