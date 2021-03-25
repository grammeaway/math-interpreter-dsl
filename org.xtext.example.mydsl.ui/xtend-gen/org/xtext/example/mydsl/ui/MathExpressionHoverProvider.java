package org.xtext.example.mydsl.ui;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.generator.MyDslGenerator;
import org.xtext.example.mydsl.myDsl.MathExp;

@SuppressWarnings("all")
public class MathExpressionHoverProvider extends DefaultEObjectHoverProvider {
  @Inject
  @Extension
  private MyDslGenerator _myDslGenerator;
  
  @Override
  public String getHoverInfoAsHtml(final EObject o) {
    System.out.println("getHover invoked");
    if ((o instanceof MathExp)) {
      final MathExp exp = ((MathExp) o);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>");
      _builder.newLine();
      _builder.append("Result : <b>");
      int _compute = this._myDslGenerator.compute(exp);
      _builder.append(_compute);
      _builder.append("</b> <br>");
      _builder.newLineIfNotEmpty();
      _builder.append("</p>");
      _builder.newLine();
      return _builder.toString();
    } else {
      return super.getHoverInfoAsHtml(o);
    }
  }
}
