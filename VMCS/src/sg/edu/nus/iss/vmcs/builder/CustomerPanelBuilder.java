package sg.edu.nus.iss.vmcs.builder;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import sg.edu.nus.iss.vmcs.customer.CustomerPanel;
import sg.edu.nus.iss.vmcs.customer.TransactionController;


public class CustomerPanelBuilder  extends PanelBuilder {

	Properties p=new Properties();
	CustomerPanel panel;
	public CustomerPanelBuilder(){
		// TODO Auto-generated constructor stub
	}

	

	public CustomerPanelBuilder(Frame scp,
			TransactionController customerPanelController) {
		// TODO Auto-generated constructor stub
		panel=new CustomerPanel(scp, customerPanelController);
		 p=new Properties();
	}



	@Override
	public void buildPanel() {
		// TODO Auto-generated method stub
	
		
		
		
	}

	@Override
	public void buildControls() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildDisplay() {
		// TODO Auto-generated method stub
		
		
		try {
			InputStream ip=new FileInputStream("DrinkPropertyFile.txt");
			p.load(ip);
			panel.getDrinkSelectionBox().getTxtCoca().setText((String)p.get("Price1"));
			panel.getDrinkSelectionBox().getTxtFanta().setText((String)p.get("Price2"));
			panel.getDrinkSelectionBox().getTxtSari().setText((String)p.get("Price3"));
			panel.getDrinkSelectionBox().getTxtSoyaBean().setText((String)p.get("Price4"));
			panel.getDrinkSelectionBox().getTxtCocaCola().setText((String)p.get("Price5"));
			
			if (Integer.parseInt((String)p.get("Quantity1"))<1)
			{
			panel.getDrinkSelectionBox().getTxtCocaStatus().setForeground(Color.white);
			panel.getDrinkSelectionBox().getBtnCoca().setEnabled(false);
			}
			if (Integer.parseInt((String)p.get("Quantity2"))<1){
				panel.getDrinkSelectionBox().getTxtFantaStatus().setForeground(Color.white);panel.getDrinkSelectionBox().getBtnFanta().setEnabled(false);
			}
			if (Integer.parseInt((String)p.get("Quantity3"))<1){
				panel.getDrinkSelectionBox().getTxtSariStatus().setForeground(Color.white);panel.getDrinkSelectionBox().getBtnSari().setEnabled(false);
			}
			if (Integer.parseInt((String)p.get("Quantity4"))<1){
				panel.getDrinkSelectionBox().getTxtSoyaBeanStatus().setForeground(Color.white);panel.getDrinkSelectionBox().getBtnSoyaBean().setEnabled(false);
			}
			if (Integer.parseInt((String)p.get("Quantity5"))<1){
				panel.getDrinkSelectionBox().getTxtCocaColaStatus().setForeground(Color.white);panel.getDrinkSelectionBox().getBtnCocaCola().setEnabled(false);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void buildCoinInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildDrinkSelectionBox() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dialog getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}
