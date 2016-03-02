package er_peter_chen.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		er_peter_chen.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		er_peter_chen.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		er_peter_chen.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		er_peter_chen.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		er_peter_chen.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return er_peter_chen.diagram.part.Er_peter_chenDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
