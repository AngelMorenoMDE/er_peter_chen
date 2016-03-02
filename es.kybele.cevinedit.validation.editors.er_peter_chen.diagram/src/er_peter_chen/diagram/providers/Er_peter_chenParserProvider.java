package er_peter_chen.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Er_peter_chenParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser eRPCDerivedAttributeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getERPCDerivedAttributeName_5001Parser() {
		if (eRPCDerivedAttributeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCDerivedAttributeName_5001Parser = parser;
		}
		return eRPCDerivedAttributeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCWeakEntityName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getERPCWeakEntityName_5002Parser() {
		if (eRPCWeakEntityName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCEntity_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCWeakEntityName_5002Parser = parser;
		}
		return eRPCWeakEntityName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCRegularEntityName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getERPCRegularEntityName_5003Parser() {
		if (eRPCRegularEntityName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCEntity_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCRegularEntityName_5003Parser = parser;
		}
		return eRPCRegularEntityName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCWeakKeyAttributeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getERPCWeakKeyAttributeName_5004Parser() {
		if (eRPCWeakKeyAttributeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCWeakKeyAttributeName_5004Parser = parser;
		}
		return eRPCWeakKeyAttributeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCMultiValuedAttributeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getERPCMultiValuedAttributeName_5005Parser() {
		if (eRPCMultiValuedAttributeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCMultiValuedAttributeName_5005Parser = parser;
		}
		return eRPCMultiValuedAttributeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCRegularRelationshipName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getERPCRegularRelationshipName_5006Parser() {
		if (eRPCRegularRelationshipName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCRelationship_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCRegularRelationshipName_5006Parser = parser;
		}
		return eRPCRegularRelationshipName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCPrimaryKeyAttributeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getERPCPrimaryKeyAttributeName_5007Parser() {
		if (eRPCPrimaryKeyAttributeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCPrimaryKeyAttributeName_5007Parser = parser;
		}
		return eRPCPrimaryKeyAttributeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCIdentifyingRelationshipName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getERPCIdentifyingRelationshipName_5008Parser() {
		if (eRPCIdentifyingRelationshipName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCRelationship_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCIdentifyingRelationshipName_5008Parser = parser;
		}
		return eRPCIdentifyingRelationshipName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCRegularAttributeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getERPCRegularAttributeName_5009Parser() {
		if (eRPCRegularAttributeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCRegularAttributeName_5009Parser = parser;
		}
		return eRPCRegularAttributeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCCompositeAttributeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getERPCCompositeAttributeName_5010Parser() {
		if (eRPCCompositeAttributeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCAttribute_Name() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCCompositeAttributeName_5010Parser = parser;
		}
		return eRPCCompositeAttributeName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser eRPCEntityRelationshipLinkCardinality_6001Parser;

	/**
	 * @generated
	 */
	private IParser getERPCEntityRelationshipLinkCardinality_6001Parser() {
		if (eRPCEntityRelationshipLinkCardinality_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { er_peter_chen.Er_peter_chenPackage.eINSTANCE
					.getERPCEntityRelationshipLink_Cardinality() };
			er_peter_chen.diagram.parsers.MessageFormatParser parser = new er_peter_chen.diagram.parsers.MessageFormatParser(
					features);
			eRPCEntityRelationshipLinkCardinality_6001Parser = parser;
		}
		return eRPCEntityRelationshipLinkCardinality_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case er_peter_chen.diagram.edit.parts.ERPCDerivedAttributeNameEditPart.VISUAL_ID:
			return getERPCDerivedAttributeName_5001Parser();
		case er_peter_chen.diagram.edit.parts.ERPCWeakEntityNameEditPart.VISUAL_ID:
			return getERPCWeakEntityName_5002Parser();
		case er_peter_chen.diagram.edit.parts.ERPCRegularEntityNameEditPart.VISUAL_ID:
			return getERPCRegularEntityName_5003Parser();
		case er_peter_chen.diagram.edit.parts.ERPCWeakKeyAttributeNameEditPart.VISUAL_ID:
			return getERPCWeakKeyAttributeName_5004Parser();
		case er_peter_chen.diagram.edit.parts.ERPCMultiValuedAttributeNameEditPart.VISUAL_ID:
			return getERPCMultiValuedAttributeName_5005Parser();
		case er_peter_chen.diagram.edit.parts.ERPCRegularRelationshipNameEditPart.VISUAL_ID:
			return getERPCRegularRelationshipName_5006Parser();
		case er_peter_chen.diagram.edit.parts.ERPCPrimaryKeyAttributeNameEditPart.VISUAL_ID:
			return getERPCPrimaryKeyAttributeName_5007Parser();
		case er_peter_chen.diagram.edit.parts.ERPCIdentifyingRelationshipNameEditPart.VISUAL_ID:
			return getERPCIdentifyingRelationshipName_5008Parser();
		case er_peter_chen.diagram.edit.parts.ERPCRegularAttributeNameEditPart.VISUAL_ID:
			return getERPCRegularAttributeName_5009Parser();
		case er_peter_chen.diagram.edit.parts.ERPCCompositeAttributeNameEditPart.VISUAL_ID:
			return getERPCCompositeAttributeName_5010Parser();
		case er_peter_chen.diagram.edit.parts.ERPCEntityRelationshipLinkCardinalityEditPart.VISUAL_ID:
			return getERPCEntityRelationshipLinkCardinality_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (er_peter_chen.diagram.providers.Er_peter_chenElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
