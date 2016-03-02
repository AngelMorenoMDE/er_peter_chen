package er_peter_chen.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
