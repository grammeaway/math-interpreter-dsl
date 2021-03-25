package org.xtext.example.mydsl.ui

import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import org.xtext.example.mydsl.generator.MyDslGenerator
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject
import org.xtext.example.mydsl.myDsl.MathExp
import org.xtext.example.mydsl.myDsl.Expression

class MathExpressionHoverProvider extends DefaultEObjectHoverProvider {
	@Inject extension MyDslGenerator
	
	override getHoverInfoAsHtml(EObject o) {
		System.out.println("getHover invoked") 
		 if (o instanceof MathExp) {
			 val exp = o as MathExp
			 return '''
			 <p>
			 Result : <b>«exp.compute»</b> <br>
			 </p>
			 '''
			 } else
	 		return super.getHoverInfoAsHtml(o)
	 }
	
}