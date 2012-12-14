package sg.edu.nus.iss.vmcs.builder;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.ImageIcon;

import sg.edu.nus.iss.vmcs.customer.CustomerPanel;
import sg.edu.nus.iss.vmcs.customer.TerminateButtonListener;
import sg.edu.nus.iss.vmcs.customer.TransactionController;
import sg.edu.nus.iss.vmcs.store.StoreController;
import sg.edu.nus.iss.vmcs.system.CustomerPanelTerminateButtonListener;


public class CustomerPanelBuilder  implements PanelBuilder {


	Properties p=new Properties();
	CustomerPanel panel;
	TransactionController transCtrl;
	public CustomerPanelBuilder(){
		// TODO Auto-generated constructor stub
	}

	


	/*public CustomerPanelBuilder(Frame scp,
			TransactionController transCtrl) {
		// TODO Auto-generated constructor stub
		panel=new CustomerPanel(scp, transCtrl);
		this.transCtrl = transCtrl;
		p=new Properties();
	}*/

	public CustomerPanelBuilder(Frame scp,
			TransactionController customerPanelController, StoreController storeController) {
		// TODO Auto-generated constructor stub
		panel=new CustomerPanel(scp, customerPanelController, storeController);
		this.transCtrl = customerPanelController;
		p=new Properties();
	}



	@Override
	public void buildPanel() {
		// TODO Auto-generated method stub
	
		
	   ImageIcon img=new ImageIcon("drink.png");
		panel.setIconImage(img.getImage());
		
		
		panel.initComponent();
		
		
	}

	@Override
	public void buildControls() {
		// TODO Auto-generated method stub
		panel.getBtnTerminate().addActionListener(new CustomerPanelTerminateButtonListener(transCtrl)); 
	}

	

	@Override
	public Dialog getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}
