/**
 *
 * $Id$
 */
package ServicePIM.validation;

import ServicePIM.CRUDActivityHandler;
import ServicePIM.CRUDVerb;
import ServicePIM.RDBMSActivity;

/**
 * A sample validator interface for {@link ServicePIM.ResourceControllerCRUDActivity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResourceControllerCRUDActivityValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateActivityURI(String value);
	boolean validateCrudVerb(CRUDVerb value);
	boolean validateHasCRUDActivityHandler(CRUDActivityHandler value);
	boolean validateIsMappedToRDBMSActivity(RDBMSActivity value);
}
