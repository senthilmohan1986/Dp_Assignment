package sg.edu.nus.iss.vmcs.builder;

import java.awt.Dialog;
import java.awt.Frame;

import sg.edu.nus.iss.vmcs.customer.CustomerPanel;
import sg.edu.nus.iss.vmcs.customer.CustomerPanelController;
import sg.edu.nus.iss.vmcs.machinery.MachinerySimulatorPanel;

public class CustomerPanelBuilder  extends PanelBuilder {

	
	Dialog panel;
	public CustomerPanelBuilder(){
		// TODO Auto-generated constructor stub
	}

	

	public CustomerPanelBuilder(Frame scp,
			CustomerPanelController customerPanelController) {
		// TODO Auto-generated constructor stub
		panel=new CustomerPanel(scp, customerPanelController);
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
