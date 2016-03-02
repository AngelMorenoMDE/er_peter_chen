package er_peter_chen.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Er_peter_chenNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem
				&& !isOwnView(((er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof er_peter_chen.diagram.navigator.Er_peter_chenNavigatorGroup) {
			er_peter_chen.diagram.navigator.Er_peter_chenNavigatorGroup group = (er_peter_chen.diagram.navigator.Er_peter_chenNavigatorGroup) element;
			return er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem) {
			er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem navigatorItem = (er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.kybele.es/gmf/er_peter_chen?ERPCDiagram", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDiagram_1000); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCDerivedAttribute", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDerivedAttribute_2001); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCWeakEntity", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakEntity_2002); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCRegularEntity", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularEntity_2003); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCWeakKeyAttribute", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakKeyAttribute_2004); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCMultiValuedAttribute", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCMultiValuedAttribute_2005); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCRegularRelationship", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCPrimaryKeyAttribute", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCPrimaryKeyAttribute_2007); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCIdentifyingRelationship", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.kybele.es/gmf/er_peter_chen?ERPCRegularAttribute", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularAttribute_2009); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_peter_chen?ERPCRelationshipAttributeLink", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRelationshipAttributeLink_4001); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_peter_chen?ERPCEntityRelationshipLink", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityRelationshipLink_4002); //$NON-NLS-1$
		case er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/gmf/er_peter_chen?ERPCEntityAttributeLink", er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCEntityAttributeLink_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& er_peter_chen.diagram.providers.Er_peter_chenElementTypes
						.isKnownElementType(elementType)) {
			image = er_peter_chen.diagram.providers.Er_peter_chenElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof er_peter_chen.diagram.navigator.Er_peter_chenNavigatorGroup) {
			er_peter_chen.diagram.navigator.Er_peter_chenNavigatorGroup group = (er_peter_chen.diagram.navigator.Er_peter_chenNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem) {
			er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem navigatorItem = (er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
				.getVisualID(view)) {
		case er_peter_chen.diagram.edit.parts.ERPCDiagramEditPart.VISUAL_ID:
			return getERPCDiagram_1000Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeEditPart.VISUAL_ID:
			return getERPCDerivedAttribute_2001Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakEntityEditPart.VISUAL_ID:
			return getERPCWeakEntity_2002Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularEntityEditPart.VISUAL_ID:
			return getERPCRegularEntity_2003Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeEditPart.VISUAL_ID:
			return getERPCWeakKeyAttribute_2004Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeEditPart.VISUAL_ID:
			return getERPCMultiValuedAttribute_2005Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipEditPart.VISUAL_ID:
			return getERPCRegularRelationship_2006Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttribute_2007Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationship_2008Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCRegularAttributeEditPart.VISUAL_ID:
			return getERPCRegularAttribute_2009Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCRelationshipAttributeLinkEditPart.VISUAL_ID:
			return getERPCRelationshipAttributeLink_4001Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLink_4002Text(view);
		case er_peter_chen.diagram.edit.parts.ERPCEntityAttributeLinkEditPart.VISUAL_ID:
			return getERPCEntityAttributeLink_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getERPCDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getERPCDerivedAttribute_2001Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCDerivedAttribute_2001,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCWeakEntity_2002Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakEntity_2002,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCWeakEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRegularEntity_2003Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularEntity_2003,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCRegularEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCWeakKeyAttribute_2004Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCWeakKeyAttribute_2004,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCMultiValuedAttribute_2005Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCMultiValuedAttribute_2005,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRegularRelationship_2006Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularRelationship_2006,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCPrimaryKeyAttribute_2007Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCPrimaryKeyAttribute_2007,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCIdentifyingRelationship_2008Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCIdentifyingRelationship_2008,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRegularAttribute_2009Text(View view) {
		IParser parser = er_peter_chen.diagram.providers.Er_peter_chenParserProvider
				.getParser(
						er_peter_chen.diagram.providers.Er_peter_chenElementTypes.ERPCRegularAttribute_2009,
						view.getElement() != null ? view.getElement() : view,
						er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
								.getType(er_peter_chen.diagram.edit.parts.ERPCRegularAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getERPCRelationshipAttributeLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getERPCEntityRelationshipLink_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getERPCEntityAttributeLink_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return er_peter_chen.diagram.edit.parts.ERPCDiagramEditPart.MODEL_ID
				.equals(er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
						.getModelID(view));
	}

}
