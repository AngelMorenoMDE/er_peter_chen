package er_peter_chen.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Er_peter_chenNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem) {
			er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem item = (er_peter_chen.diagram.navigator.Er_peter_chenNavigatorItem) element;
			return er_peter_chen.diagram.part.Er_peter_chenVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
