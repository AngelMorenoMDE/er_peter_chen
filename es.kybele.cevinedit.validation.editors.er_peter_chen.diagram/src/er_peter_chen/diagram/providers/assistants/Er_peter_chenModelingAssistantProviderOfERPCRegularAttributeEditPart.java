package er_peter_chen.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Er_peter_chenModelingAssistantProviderOfERPCRegularAttributeEditPart
		extends
		er_peter_chen.diagram.providers.Er_peter_chenModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttributeComposedAttributes_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008);
		} else if (relationshipType == er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakEntity_2002);
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularEntity_2003);
		} else if (relationshipType == er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttributeComposedAttributes_4004) {
			types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttribute_2010);
		}
		return types;
	}

}
