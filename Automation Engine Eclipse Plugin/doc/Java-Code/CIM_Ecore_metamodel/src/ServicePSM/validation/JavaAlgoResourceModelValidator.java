/**
 *
 * $Id$
 */
package ServicePSM.validation;

import ServicePSM.JAXBAnnotation;
import ServicePSM.JavaAlgoResourceModel;
import ServicePSM.JavaGetterFunction;
import ServicePSM.JavaSetterFunction;
import ServicePSM.PSMComponentProperty;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ServicePSM.JavaAlgoResourceModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaAlgoResourceModelValidator {
	boolean validate();

	boolean validateJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation value);
	boolean validateJavaAlgoModelHasProperty(PSMComponentProperty value);
	boolean validateJavaAlgoModelHasSetterFunction(JavaSetterFunction value);
	boolean validateJavaAlgoModelHasGetterFunction(JavaGetterFunction value);
	boolean validateName(String value);
	boolean validateParentName(String value);
	boolean validateHasRelatedAlgoModel(EList<JavaAlgoResourceModel> value);
	boolean validateIsRelatedAlgoModel(EList<JavaAlgoResourceModel> value);
}
