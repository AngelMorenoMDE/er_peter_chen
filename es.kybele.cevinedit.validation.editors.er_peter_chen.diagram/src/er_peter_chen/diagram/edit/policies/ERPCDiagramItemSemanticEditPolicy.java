package er_peter_chen.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ERPCDiagramItemSemanticEditPolicy
		extends
		er_peter_chen.diagram.edit.policies.Er_peter_chenBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ERPCDiagramItemSemanticEditPolicy() {
		super(
				er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDerivedAttribute_2001 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCDerivedAttributeCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakEntity_2002 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCWeakEntityCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularEntity_2003 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCRegularEntityCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakKeyAttribute_2004 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCWeakKeyAttributeCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCMultiValuedAttribute_2005 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCMultiValuedAttributeCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCRegularRelationshipCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCPrimaryKeyAttribute_2007 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCPrimaryKeyAttributeCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCIdentifyingRelationshipCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularAttribute_2009 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCRegularAttributeCreateCommand(
					req));
		}
		if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttribute_2010 == req
				.getElementType()) {
			return getGEFWrapper(new er_peter_chen.diagram.edit.commands.ERPCCompositeAttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
