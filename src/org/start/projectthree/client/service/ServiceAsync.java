package org.start.projectthree.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ServiceAsync {
	
	void sayHello(String name, AsyncCallback callback);
	
	void addTwoNumber(int num1, int num2, AsyncCallback callback);

}
