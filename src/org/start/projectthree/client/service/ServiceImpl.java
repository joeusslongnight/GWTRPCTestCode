package org.start.projectthree.client.service;

import org.start.projectthree.client.gui.MainGui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class ServiceImpl implements ServiceInterface {
	private ServiceAsync serviceCall;
	private MainGui mainGui;
	
	public ServiceImpl (String url){
		serviceCall = GWT.create(Service.class);
		ServiceDefTarget endPoint = (ServiceDefTarget) this.serviceCall;
		endPoint.setServiceEntryPoint(url);
		
		mainGui = new MainGui(this);
	}
	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		serviceCall.sayHello(name, new DefaultCallBack() );
		
	}

	@Override
	public void addTwoNumber(int num1, int num2) {
		// TODO Auto-generated method stub
		serviceCall.addTwoNumber(num1, num2, new DefaultCallBack() );
		
	}
	
	public MainGui getMainGui () {
		return mainGui;
		
	}
	
	private class DefaultCallBack implements AsyncCallback {

		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			System.out.println("Just another error");
		}

		@Override
		public void onSuccess(Object result) {
			// TODO Auto-generated method stub
			System.out.println("Yahoo Got it");
			if (result instanceof String) {
				String greeting = (String) result;
				mainGui.showResult(greeting);
			} else if (result instanceof Integer) {
				int returnBack = (Integer) result;
				mainGui.showResultNum(returnBack);
			}
			
		}
		
	}

}
