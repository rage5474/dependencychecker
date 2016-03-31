package de.raphaelgeissler.dependencychecker.core.impl.validation;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DValBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DValCompBuilder;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyValidationResultImpl;
import de.raphaelgeissler.dependencychecker.core.impl.validation.DependencyValidationResultMessageImpl;
import de.raphaelgeissler.dependencychecker.core.impl.validation.OuterDependencyUMLGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class UmlGeneratorTest {
  private DependencyValidationResultImpl result;
  
  private Checker checker;
  
  @Before
  public void setup() {
    DependencyValidationResultImpl _dependencyValidationResultImpl = new DependencyValidationResultImpl();
    this.result = _dependencyValidationResultImpl;
    DependencyValidationResultMessageImpl _dependencyValidationResultMessageImpl = new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.plugin.dest", 
      "de.ragedev.example.core.plugin.src");
    this.result.addResultMessage(_dependencyValidationResultMessageImpl);
    DependencyValidationResultMessageImpl _dependencyValidationResultMessageImpl_1 = new DependencyValidationResultMessageImpl(true, 0, "de.ragedev.example.core.api", 
      "de.ragedev.example.ui");
    this.result.addResultMessage(_dependencyValidationResultMessageImpl_1);
    DValBuilder _dValBuilder = new DValBuilder("TestConfig");
    DValCompBuilder _dValCompBuilder = new DValCompBuilder("Core");
    DValCompBuilder _id = _dValCompBuilder.id("de.ragedev.example.core*");
    DValCompBuilder _port = _id.port("de.ragedev.example.core.api");
    DValBuilder _comp = _dValBuilder.comp(_port);
    DValCompBuilder _dValCompBuilder_1 = new DValCompBuilder("UI");
    DValCompBuilder _id_1 = _dValCompBuilder_1.id("de.ragedev.example.ui*");
    DValBuilder _comp_1 = _comp.comp(_id_1);
    Checker _build = _comp_1.build();
    this.checker = _build;
  }
  
  @Test
  public void noInnerConnection() throws Exception {
    final OuterDependencyUMLGenerator generator = new OuterDependencyUMLGenerator(this.result, this.checker, false);
    final String generatedUmlString = generator.generatePackagePlantUMLString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package Core{");
    _builder.newLine();
    _builder.append("[de.ragedev.example.core.api] <<Port>>");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("package UI{");
    _builder.newLine();
    _builder.append("[de.ragedev.example.ui] <<Inner>>");
    _builder.newLine();
    _builder.append("}");
    String expectedUmlString = _builder.toString();
    String _replaceAll = expectedUmlString.replaceAll("\\s+", "");
    String _replaceAll_1 = generatedUmlString.replaceAll("\\s+", "");
    Assert.assertEquals(_replaceAll, _replaceAll_1);
  }
  
  @Test
  public void innerConnection() throws Exception {
    final OuterDependencyUMLGenerator generator = new OuterDependencyUMLGenerator(this.result, this.checker, true);
    final String generatedUmlString = generator.generatePackagePlantUMLString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package Core{");
    _builder.newLine();
    _builder.append("[de.ragedev.example.core.api] <<Port>>");
    _builder.newLine();
    _builder.append("[de.ragedev.example.core.plugin.dest] <<Inner>>");
    _builder.newLine();
    _builder.append("[de.ragedev.example.core.plugin.src] <<Inner>>");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("package UI{");
    _builder.newLine();
    _builder.append("[de.ragedev.example.ui] <<Inner>>");
    _builder.newLine();
    _builder.append("}");
    String expectedUmlString = _builder.toString();
    String _replaceAll = expectedUmlString.replaceAll("\\s+", "");
    String _replaceAll_1 = generatedUmlString.replaceAll("\\s+", "");
    Assert.assertEquals(_replaceAll, _replaceAll_1);
  }
}
