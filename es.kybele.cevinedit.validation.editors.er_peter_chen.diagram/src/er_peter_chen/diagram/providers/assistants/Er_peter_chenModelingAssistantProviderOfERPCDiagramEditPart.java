package er_peter_chen.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Er_peter_chenModelingAssistantProviderOfERPCDiagramEditPart extends
		er_peter_chen.diagram.providers.Er_peter_chenModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDerivedAttribute_2001);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakEntity_2002);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularEntity_2003);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakKeyAttribute_2004);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCMultiValuedAttribute_2005);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCPrimaryKeyAttribute_2007);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularAttribute_2009);
		types.add(er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttribute_2010);
		return types;
	}

}
