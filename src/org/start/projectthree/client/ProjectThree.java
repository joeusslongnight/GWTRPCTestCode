package org.start.projectthree.client;


import org.start.projectthree.client.service.ServiceImpl;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ProjectThree implements EntryPoint {
	

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ServiceImpl clientA = new ServiceImpl(GWT.getModuleBaseURL() + "service");
		RootPanel.get().add(clientA.getMainGui() );
			
	
	}
}
