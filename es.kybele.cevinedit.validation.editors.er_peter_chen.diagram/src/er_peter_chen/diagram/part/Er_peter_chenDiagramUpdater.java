package er_peter_chen.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Er_peter_chenDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor> getSemanticChildren(
			View view) {
		switch (er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getERPCDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor> getERPCDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		er_peter_chen.ERPCDiagram modelElement = (er_peter_chen.ERPCDiagram) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it
				.hasNext();) {
			er_peter_chen.ERPCAttribute childElement = (er_peter_chen.ERPCAttribute) it
					.next();
			int visualID = er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntities().iterator(); it
				.hasNext();) {
			er_peter_chen.ERPCEntity childElement = (er_peter_chen.ERPCEntity) it
					.next();
			int visualID = er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRelationships().iterator(); it
				.hasNext();) {
			er_peter_chen.ERPCRelationship childElement = (er_peter_chen.ERPCRelationship) it
					.next();
			int visualID = er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getContainedLinks(
			View view) {
		switch (er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getERPCDiagram_1000ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2001ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2002ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2003ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2004ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2005ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2006ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2007ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2008ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2009ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getERPCCompositeAttribute_2010ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4001ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4002ContainedLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getIncomingLinks(
			View view) {
		switch (er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2001IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2002IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2003IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2004IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2005IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2006IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2007IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2008IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2009IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getERPCCompositeAttribute_2010IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4001IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4002IncomingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2001OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2002OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2003OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2004OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2005OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2006OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2007OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2008OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2009OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeEditPart.VISUAL_ID:
			return getERPCCompositeAttribute_2010OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4001OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4002OutgoingLinks(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCDiagram_1000ContainedLinks(
			View view) {
		er_peter_chen.ERPCDiagram modelElement = (er_peter_chen.ERPCDiagram) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ERPCEntityAttributeLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCDerivedAttribute_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCWeakEntity_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularEntity_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCWeakKeyAttribute_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCMultiValuedAttribute_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularRelationship_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCPrimaryKeyAttribute_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCIdentifyingRelationship_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularAttribute_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCCompositeAttribute_2010ContainedLinks(
			View view) {
		er_peter_chen.ERPCCompositeAttribute modelElement = (er_peter_chen.ERPCCompositeAttribute) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRelationshipAttributeLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCEntityRelationshipLink_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCEntityAttributeLink_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCDerivedAttribute_2001IncomingLinks(
			View view) {
		er_peter_chen.ERPCDerivedAttribute modelElement = (er_peter_chen.ERPCDerivedAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCWeakEntity_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularEntity_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCWeakKeyAttribute_2004IncomingLinks(
			View view) {
		er_peter_chen.ERPCWeakKeyAttribute modelElement = (er_peter_chen.ERPCWeakKeyAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCMultiValuedAttribute_2005IncomingLinks(
			View view) {
		er_peter_chen.ERPCMultiValuedAttribute modelElement = (er_peter_chen.ERPCMultiValuedAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularRelationship_2006IncomingLinks(
			View view) {
		er_peter_chen.ERPCRegularRelationship modelElement = (er_peter_chen.ERPCRegularRelationship) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCPrimaryKeyAttribute_2007IncomingLinks(
			View view) {
		er_peter_chen.ERPCPrimaryKeyAttribute modelElement = (er_peter_chen.ERPCPrimaryKeyAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCIdentifyingRelationship_2008IncomingLinks(
			View view) {
		er_peter_chen.ERPCIdentifyingRelationship modelElement = (er_peter_chen.ERPCIdentifyingRelationship) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularAttribute_2009IncomingLinks(
			View view) {
		er_peter_chen.ERPCRegularAttribute modelElement = (er_peter_chen.ERPCRegularAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCCompositeAttribute_2010IncomingLinks(
			View view) {
		er_peter_chen.ERPCCompositeAttribute modelElement = (er_peter_chen.ERPCCompositeAttribute) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRelationshipAttributeLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCEntityRelationshipLink_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCEntityAttributeLink_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCDerivedAttribute_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCWeakEntity_2002OutgoingLinks(
			View view) {
		er_peter_chen.ERPCWeakEntity modelElement = (er_peter_chen.ERPCWeakEntity) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularEntity_2003OutgoingLinks(
			View view) {
		er_peter_chen.ERPCRegularEntity modelElement = (er_peter_chen.ERPCRegularEntity) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCWeakKeyAttribute_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCMultiValuedAttribute_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularRelationship_2006OutgoingLinks(
			View view) {
		er_peter_chen.ERPCRegularRelationship modelElement = (er_peter_chen.ERPCRegularRelationship) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCPrimaryKeyAttribute_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCIdentifyingRelationship_2008OutgoingLinks(
			View view) {
		er_peter_chen.ERPCIdentifyingRelationship modelElement = (er_peter_chen.ERPCIdentifyingRelationship) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRegularAttribute_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCCompositeAttribute_2010OutgoingLinks(
			View view) {
		er_peter_chen.ERPCCompositeAttribute modelElement = (er_peter_chen.ERPCCompositeAttribute) view
				.getElement();
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCRelationshipAttributeLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCEntityRelationshipLink_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getERPCEntityAttributeLink_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getContainedTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
			er_peter_chen.ERPCDiagram container) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen.ERPCRelationshipAttributeLink) {
				continue;
			}
			er_peter_chen.ERPCRelationshipAttributeLink link = (er_peter_chen.ERPCRelationshipAttributeLink) linkObject;
			if (er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCAttribute dst = link.getAttribute();
			er_peter_chen.ERPCRelationship src = link.getRelationship();
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001,
					er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getContainedTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(
			er_peter_chen.ERPCDiagram container) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen.ERPCEntityRelationshipLink) {
				continue;
			}
			er_peter_chen.ERPCEntityRelationshipLink link = (er_peter_chen.ERPCEntityRelationshipLink) linkObject;
			if (er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCRelationship dst = link.getRelationship();
			er_peter_chen.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002,
					er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getContainedTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
			er_peter_chen.ERPCDiagram container) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen.ERPCEntityAttributeLink) {
				continue;
			}
			er_peter_chen.ERPCEntityAttributeLink link = (er_peter_chen.ERPCEntityAttributeLink) linkObject;
			if (er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCAttribute dst = link.getAttribute();
			er_peter_chen.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003,
					er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getIncomingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
			er_peter_chen.ERPCAttribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCRelationshipAttributeLink_Attribute()
					|| false == setting.getEObject() instanceof er_peter_chen.ERPCRelationshipAttributeLink) {
				continue;
			}
			er_peter_chen.ERPCRelationshipAttributeLink link = (er_peter_chen.ERPCRelationshipAttributeLink) setting
					.getEObject();
			if (er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCRelationship src = link.getRelationship();
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					target,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001,
					er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getIncomingTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(
			er_peter_chen.ERPCRelationship target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCEntityRelationshipLink_Relationship()
					|| false == setting.getEObject() instanceof er_peter_chen.ERPCEntityRelationshipLink) {
				continue;
			}
			er_peter_chen.ERPCEntityRelationshipLink link = (er_peter_chen.ERPCEntityRelationshipLink) setting
					.getEObject();
			if (er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					target,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002,
					er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getIncomingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
			er_peter_chen.ERPCAttribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCEntityAttributeLink_Attribute()
					|| false == setting.getEObject() instanceof er_peter_chen.ERPCEntityAttributeLink) {
				continue;
			}
			er_peter_chen.ERPCEntityAttributeLink link = (er_peter_chen.ERPCEntityAttributeLink) setting
					.getEObject();
			if (er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCEntity src = link.getEntity();
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					target,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003,
					er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getIncomingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4004(
			er_peter_chen.ERPCRegularAttribute target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCCompositeAttribute_ComposedAttributes()) {
				result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
						setting.getEObject(),
						target,
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttributeComposedAttributes_4004,
						er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getOutgoingTypeModelFacetLinks_ERPCRelationshipAttributeLink_4001(
			er_peter_chen.ERPCRelationship source) {
		er_peter_chen.ERPCDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof er_peter_chen.ERPCDiagram) {
				container = (er_peter_chen.ERPCDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen.ERPCRelationshipAttributeLink) {
				continue;
			}
			er_peter_chen.ERPCRelationshipAttributeLink link = (er_peter_chen.ERPCRelationshipAttributeLink) linkObject;
			if (er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCAttribute dst = link.getAttribute();
			er_peter_chen.ERPCRelationship src = link.getRelationship();
			if (src != source) {
				continue;
			}
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001,
					er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getOutgoingTypeModelFacetLinks_ERPCEntityRelationshipLink_4002(
			er_peter_chen.ERPCEntity source) {
		er_peter_chen.ERPCDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof er_peter_chen.ERPCDiagram) {
				container = (er_peter_chen.ERPCDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen.ERPCEntityRelationshipLink) {
				continue;
			}
			er_peter_chen.ERPCEntityRelationshipLink link = (er_peter_chen.ERPCEntityRelationshipLink) linkObject;
			if (er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCRelationship dst = link.getRelationship();
			er_peter_chen.ERPCEntity src = link.getEntity();
			if (src != source) {
				continue;
			}
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002,
					er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getOutgoingTypeModelFacetLinks_ERPCEntityAttributeLink_4003(
			er_peter_chen.ERPCEntity source) {
		er_peter_chen.ERPCDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof er_peter_chen.ERPCDiagram) {
				container = (er_peter_chen.ERPCDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof er_peter_chen.ERPCEntityAttributeLink) {
				continue;
			}
			er_peter_chen.ERPCEntityAttributeLink link = (er_peter_chen.ERPCEntityAttributeLink) linkObject;
			if (er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID != er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			er_peter_chen.ERPCAttribute dst = link.getAttribute();
			er_peter_chen.ERPCEntity src = link.getEntity();
			if (src != source) {
				continue;
			}
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					src,
					dst,
					link,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003,
					er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getOutgoingFeatureModelFacetLinks_ERPCCompositeAttribute_ComposedAttributes_4004(
			er_peter_chen.ERPCCompositeAttribute source) {
		LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> result = new LinkedList<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor>();
		for (Iterator<?> destinations = source.getComposedAttributes()
				.iterator(); destinations.hasNext();) {
			er_peter_chen.ERPCRegularAttribute destination = (er_peter_chen.ERPCRegularAttribute) destinations
					.next();
			result.add(new er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor(
					source,
					destination,
					er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCCompositeAttributeComposedAttributes_4004,
					er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeComposedAttributesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen.diagram.part.Er_peter_chenNodeDescriptor> getSemanticChildren(
				View view) {
			return Er_peter_chenDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getContainedLinks(
				View view) {
			return Er_peter_chenDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getIncomingLinks(
				View view) {
			return Er_peter_chenDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<er_peter_chen.diagram.part.Er_peter_chenLinkDescriptor> getOutgoingLinks(
				View view) {
			return Er_peter_chenDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
