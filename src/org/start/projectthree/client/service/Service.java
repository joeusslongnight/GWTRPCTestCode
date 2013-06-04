package org.start.projectthree.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("service")
public interface Service extends RemoteService {

	String sayHello(String name);
	
	int addTwoNumber(int num1, int num2);
}
