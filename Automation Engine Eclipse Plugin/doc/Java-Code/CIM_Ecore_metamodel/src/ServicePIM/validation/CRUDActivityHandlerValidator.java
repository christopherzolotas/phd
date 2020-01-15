/**
 *
 * $Id$
 */
package ServicePIM.validation;

import ServicePIM.CRUDVerb;
import ServicePIM.CreateHypermediaPIMFunction;
import ServicePIM.DatabaseController;

/**
 * A sample validator interface for {@link ServicePIM.CRUDActivityHandler}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CRUDActivityHandlerValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateCrudVerb(CRUDVerb value);
	boolean validateHasHypermediaFunction(CreateHypermediaPIMFunction value);
	boolean validateUsesDBController(DatabaseController value);
}