package io.vacco.beleth.gen;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;
import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.rules.ObjectRule;
import org.jsonschema2pojo.util.*;

public class BlObjectRule extends ObjectRule {

  private final BlRuleFactory ruleFactory;

  protected BlObjectRule(BlRuleFactory ruleFactory,
                         ParcelableHelper parcelableHelper,
                         ReflectionHelper reflectionHelper) {
    super(ruleFactory, parcelableHelper, reflectionHelper);
    this.ruleFactory = ruleFactory;
  }

  @Override public JType apply(String nodeName,
                               JsonNode node, JsonNode parent,
                               JPackage _package, Schema schema) {
    var jclass = super.apply(nodeName, node, parent, _package, schema);
    if (jclass instanceof JDefinedClass) {
      var jdc = (JDefinedClass) jclass;
      if (jdc.fields().isEmpty()) {
        jclass = ruleFactory.extendLinkedHashMap(jdc, String.class, Object.class);
      }
    }
    return jclass;
  }

}
