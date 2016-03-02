package er_peter_chen.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl;

/**
 * @generated
 */
public class ERPCEntityRelationshipLinkEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {
	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification notification) {		
		super.handleNotificationEvent(notification);		
	}
	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public ERPCEntityRelationshipLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new er_peter_chen.diagram.edit.policies.ERPCEntityRelationshipLinkItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ERPCEntityRelationshipLinkFigure();
	}

	/**
	 * @generated
	 */
	public ERPCEntityRelationshipLinkFigure getPrimaryShape() {
		return (ERPCEntityRelationshipLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ERPCEntityRelationshipLinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureERPCEntityRelationshipLinkCardinalityLabel;

		/**
		 * @generated
		 */
		public ERPCEntityRelationshipLinkFigure() 
		{
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureERPCEntityRelationshipLinkCardinalityLabel() {
			return fFigureERPCEntityRelationshipLinkCardinalityLabel;
		}

	}

}
