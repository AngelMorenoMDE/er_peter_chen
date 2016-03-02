package er_peter_chen.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Er_peter_chenElementTypes {

	/**
	 * @generated
	 */
	private Er_peter_chenElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ERPCDiagram_1000 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCDerivedAttribute_2001 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCDerivedAttribute_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCWeakEntity_2002 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCWeakEntity_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCRegularEntity_2003 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCRegularEntity_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCWeakKeyAttribute_2004 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCWeakKeyAttribute_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCMultiValuedAttribute_2005 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCMultiValuedAttribute_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCRegularRelationship_2006 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCRegularRelationship_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCPrimaryKeyAttribute_2007 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCPrimaryKeyAttribute_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCIdentifyingRelationship_2008 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCIdentifyingRelationship_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCRegularAttribute_2009 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCRegularAttribute_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCCompositeAttribute_2010 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCCompositeAttribute_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ERPCRelationshipAttributeLink_4001 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCRelationshipAttributeLink_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCEntityRelationshipLink_4002 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCEntityRelationshipLink_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ERPCEntityAttributeLink_4003 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCEntityAttributeLink_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ERPCCompositeAttributeComposedAttributes_4004 = getElementType("es.kybele.cevinedit.validation.editors.er_peter_chen.diagram.ERPCCompositeAttributeComposedAttributes_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ERPCDiagram_1000,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCDiagram());

			elements.put(ERPCDerivedAttribute_2001,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCDerivedAttribute());

			elements.put(ERPCWeakEntity_2002,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCWeakEntity());

			elements.put(ERPCRegularEntity_2003,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCRegularEntity());

			elements.put(ERPCWeakKeyAttribute_2004,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCWeakKeyAttribute());

			elements.put(ERPCMultiValuedAttribute_2005,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCMultiValuedAttribute());

			elements.put(ERPCRegularRelationship_2006,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCRegularRelationship());

			elements.put(ERPCPrimaryKeyAttribute_2007,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCPrimaryKeyAttribute());

			elements.put(ERPCIdentifyingRelationship_2008,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCIdentifyingRelationship());

			elements.put(ERPCRegularAttribute_2009,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCRegularAttribute());

			elements.put(ERPCCompositeAttribute_2010,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCCompositeAttribute());

			elements.put(ERPCRelationshipAttributeLink_4001,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCRelationshipAttributeLink());

			elements.put(ERPCEntityRelationshipLink_4002,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCEntityRelationshipLink());

			elements.put(ERPCEntityAttributeLink_4003,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCEntityAttributeLink());

			elements.put(ERPCCompositeAttributeComposedAttributes_4004,
					er_peter_chen.Er_peter_chenPackage.eINSTANCE
							.getERPCCompositeAttribute_ComposedAttributes());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ERPCDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(ERPCDerivedAttribute_2001);
			KNOWN_ELEMENT_TYPES.add(ERPCWeakEntity_2002);
			KNOWN_ELEMENT_TYPES.add(ERPCRegularEntity_2003);
			KNOWN_ELEMENT_TYPES.add(ERPCWeakKeyAttribute_2004);
			KNOWN_ELEMENT_TYPES.add(ERPCMultiValuedAttribute_2005);
			KNOWN_ELEMENT_TYPES.add(ERPCRegularRelationship_2006);
			KNOWN_ELEMENT_TYPES.add(ERPCPrimaryKeyAttribute_2007);
			KNOWN_ELEMENT_TYPES.add(ERPCIdentifyingRelationship_2008);
			KNOWN_ELEMENT_TYPES.add(ERPCRegularAttribute_2009);
			KNOWN_ELEMENT_TYPES.add(ERPCCompositeAttribute_2010);
			KNOWN_ELEMENT_TYPES.add(ERPCRelationshipAttributeLink_4001);
			KNOWN_ELEMENT_TYPES.add(ERPCEntityRelationshipLink_4002);
			KNOWN_ELEMENT_TYPES.add(ERPCEntityAttributeLink_4003);
			KNOWN_ELEMENT_TYPES
					.add(ERPCCompositeAttributeComposedAttributes_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case er_peter_chen.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return ERPCDiagram_1000;
		case er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return ERPCDerivedAttribute_2001;
		case er_peter_chen.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return ERPCWeakEntity_2002;
		case er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return ERPCRegularEntity_2003;
		case er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return ERPCWeakKeyAttribute_2004;
		case er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return ERPCMultiValuedAttribute_2005;
		case er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return ERPCRegularRelationship_2006;
		case er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return ERPCPrimaryKeyAttribute_2007;
		case er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return ERPCIdentifyingRelationship_2008;
		case er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return ERPCRegularAttribute_2009;
		case er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return ERPCCompositeAttribute_2010;
		case er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return ERPCRelationshipAttributeLink_4001;
		case er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return ERPCEntityRelationshipLink_4002;
		case er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return ERPCEntityAttributeLink_4003;
		case er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID:
			return ERPCCompositeAttributeComposedAttributes_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return er_peter_chen.diagram.providers.Er_peter_chenElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return er_peter_chen.diagram.providers.Er_peter_chenElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return er_peter_chen.diagram.providers.Er_peter_chenElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
