package er_peter_chen.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Er_peter_chenModelingAssistantProviderOfERPCRegularEntityEditPart
		extends
		er_peter_chen.diagram.providers.Er_peter_chenModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002);
		}
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002);
		}
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		}
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		}
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		}
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		}
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		}
		if (targetEditPart instanceof er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeEditPart) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget(
				(er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008);
		} else if (relationshipType == er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDerivedAttribute_2001);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakKeyAttribute_2004);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCMultiValuedAttribute_2005);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCPrimaryKeyAttribute_2007);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularAttribute_2009);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttribute_2010);
		}
		return types;
	}

}
