package er_peter_chen.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ERPCCompositeAttributeComposedAttributesItemSemanticEditPolicy
		extends
		er_peter_chen.diagram.edit.policies.Er_peter_chenBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERPCCompositeAttributeComposedAttributesItemSemanticEditPolicy() {
		super(
				er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttributeComposedAttributes_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
