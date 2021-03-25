/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
@SuppressWarnings("all")
public class MyDslLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public MyDslLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
