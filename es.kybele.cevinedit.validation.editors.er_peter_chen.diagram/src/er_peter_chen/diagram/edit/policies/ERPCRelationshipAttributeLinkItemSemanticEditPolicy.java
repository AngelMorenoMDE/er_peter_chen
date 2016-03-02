package er_peter_chen.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ERPCRelationshipAttributeLinkItemSemanticEditPolicy
		extends
		er_peter_chen.diagram.edit.policies.Er_peter_chenBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERPCRelationshipAttributeLinkItemSemanticEditPolicy() {
		super(
				er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
