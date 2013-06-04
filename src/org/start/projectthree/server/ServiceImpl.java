package org.start.projectthree.server;

import org.start.projectthree.client.service.Service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ServiceImpl extends RemoteServiceServlet implements Service{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		String greeting = "Hello " + name;
		return greeting;
	}

	@Override
	public int addTwoNumber(int num1, int num2) {
		// TODO Auto-generated method stub
		int result = num1 + num2;
		return  result;
	}

}
