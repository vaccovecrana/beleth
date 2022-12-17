package io.vacco.beleth;

import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import java.io.*;
import java.net.*;
import java.util.*;

public class BlGenConfig implements GenerationConfig {

  private final List<URL> sources = new ArrayList<>();
  private File targetDir;
  private String targetPackage;
  private SourceType sourceType;

  @Override public boolean isGenerateBuilders() { return true; }
  @Override public boolean isIncludeTypeInfo() { return false; }
  @Override public boolean isIncludeConstructorPropertiesAnnotation() { return false; }
  @Override public boolean isUsePrimitives() { return false; }

  @Override public Iterator<URL> getSource() { return sources.iterator(); }
  public BlGenConfig withSources(URL ... sources) {
    this.sources.clear();
    this.sources.addAll(Arrays.asList(sources));
    return this;
  }

  @Override public File getTargetDirectory() { return targetDir; }
  public BlGenConfig withTargetDirectory(File targetDir) {
    this.targetDir = Objects.requireNonNull(targetDir);
    return this;
  }

  @Override public String getTargetPackage() { return targetPackage; }
  public BlGenConfig withTargetPackage(String targetPackage) {
    this.targetPackage = Objects.requireNonNull(targetPackage);
    return this;
  }

  @Override public char[] getPropertyWordDelimiters() { return new char[0]; }
  @Override public boolean isUseLongIntegers() { return false; }
  @Override public boolean isUseBigIntegers() { return false; }
  @Override public boolean isUseDoubleNumbers() { return false; }
  @Override public boolean isUseBigDecimals() { return false; }
  @Override public boolean isIncludeHashcodeAndEquals() { return false; }
  @Override public boolean isIncludeToString() { return false; }
  @Override public boolean isUseTitleAsClassname() { return false; }

  @Override public String[] getToStringExcludes() { return new String[0]; }
  @Override public AnnotationStyle getAnnotationStyle() { return AnnotationStyle.NONE; }
  @Override public InclusionLevel getInclusionLevel() { return InclusionLevel.NON_NULL; }
  @Override public Class<? extends Annotator> getCustomAnnotator() { return NoopAnnotator.class; }
  @Override public Class<? extends RuleFactory> getCustomRuleFactory() { return BlRuleFactory.class; }
  @Override public String getOutputEncoding() { return "UTF-8"; }

  @Override public boolean isIncludeJsr303Annotations() { return false; }
  @Override public boolean isIncludeJsr305Annotations() { return false; }
  @Override public boolean isUseOptionalForGetters() { return false; }

  @Override public SourceType getSourceType() { return sourceType; }
  public BlGenConfig withSourceType(SourceType st) {
    this.sourceType = Objects.requireNonNull(st);
    return this;
  }

  @Override public boolean isRemoveOldOutput() { return true; }
  @Override public boolean isUseJodaDates() { return false; }
  @Override public boolean isUseJodaLocalDates() { return false; }
  @Override public boolean isUseJodaLocalTimes() { return false; }
  @Override public boolean isParcelable() { return false; }
  @Override public boolean isSerializable() { return false; }
  @Override public boolean isInitializeCollections() { return false; }

  @Override public FileFilter getFileFilter() { return null; }
  @Override public String getClassNamePrefix() { return ""; }
  @Override public String getClassNameSuffix() { return ""; }
  @Override public String[] getFileExtensions() { return new String[0]; }

  @Override public boolean isIncludeConstructors() { return false; }
  @Override public boolean isConstructorsRequiredPropertiesOnly() { return false; }
  @Override public boolean isIncludeRequiredPropertiesConstructor() { return false; }
  @Override public boolean isIncludeAllPropertiesConstructor() { return false; }
  @Override public boolean isIncludeCopyConstructor() { return false; }
  @Override public boolean isIncludeAdditionalProperties() { return true; }
  @Override public boolean isIncludeGetters() { return false; }
  @Override public boolean isIncludeSetters() { return false; }

  @Override public String getTargetVersion() { return null; }

  @Override public boolean isIncludeDynamicAccessors() { return false; }
  @Override public boolean isIncludeDynamicGetters() { return false; }
  @Override public boolean isIncludeDynamicSetters() { return false; }
  @Override public boolean isIncludeDynamicBuilders() { return true; }

  @Override public String getDateTimeType() { return null; }
  @Override public String getDateType() { return null; }
  @Override public String getTimeType() { return null; }

  @Override public boolean isFormatDates() { return false; }
  @Override public boolean isFormatTimes() { return false; }
  @Override public boolean isFormatDateTimes() { return false; }

  @Override public String getCustomDatePattern() { return null; }
  @Override public String getCustomTimePattern() { return null; }
  @Override public String getCustomDateTimePattern() { return null; }
  @Override public String getRefFragmentPathDelimiters() { return "#/."; }

  @Override public SourceSortOrder getSourceSortOrder() { return null; }
  @Override public Map<String, String> getFormatTypeMapping() { return Collections.emptyMap(); }

  @Override public boolean isIncludeGeneratedAnnotation() { return false; }
  @Override public boolean isUseJakartaValidation() { return false; }

}
