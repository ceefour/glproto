
package com.soluvas.glproto;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GlprotoStandaloneSetup extends GlprotoStandaloneSetupGenerated{

	public static void doSetup() {
		new GlprotoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

