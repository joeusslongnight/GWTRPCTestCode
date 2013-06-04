package org.start.projectthree.client.gui;

import org.start.projectthree.client.service.ServiceImpl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainGui extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	
	private TextBox txt1;
	private Button bt1;
	private Label result;
	
	private TextBox txtNum1;
	private TextBox txtNum2;
	private Button btnAdd;
	private Label numResult;
	
	private ServiceImpl serviceLocal;
	
	public MainGui (ServiceImpl serviceI){
		initWidget(vPanel);
		serviceLocal = serviceI;
		
		txt1 = new TextBox();
		vPanel.add(txt1);
		
		bt1 = new Button("Click");
		bt1.addClickHandler(new Bt1ClickHandler() );
		vPanel.add(bt1);
		
		result = new Label("Result is right here");
		vPanel.add(result);
		
		txtNum1 = new TextBox();
		txtNum2 = new TextBox();
		vPanel.add(txtNum1);
		vPanel.add(txtNum2);
		
		btnAdd = new Button("Add");
		btnAdd.addClickHandler(new AddBtnClickHandler() );
		vPanel.add(btnAdd);
		
		numResult = new Label("Cal Result Here");
		vPanel.add(numResult);
	}
	
	public void showResult (String greeting) {
		result.setText(greeting);
	}
	
	public void showResultNum (int resultBack) {
		numResult.setText("" + resultBack);
	}
	private class Bt1ClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			String name = txt1.getText();
			serviceLocal.sayHello(name);
			
		}
		
			
	}
	
	private class AddBtnClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			int num1 = Integer.valueOf(txtNum1.getText());
			int num2 = Integer.valueOf(txtNum2.getText());
			
			serviceLocal.addTwoNumber(num1, num2);
			
		}
		
			
	}

}
