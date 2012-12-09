package sg.edu.nus.iss.vmcs.customer;

import java.awt.Frame;

import sg.edu.nus.iss.vmcs.builder.CustomerPanelBuilder;
import sg.edu.nus.iss.vmcs.builder.MachineryPanelBuilder;
import sg.edu.nus.iss.vmcs.builder.controller.PanelSetupController;
import sg.edu.nus.iss.vmcs.machinery.MachinerySimulatorPanel;
import sg.edu.nus.iss.vmcs.system.MainController;
import sg.edu.nus.iss.vmcs.system.SimulatorControlPanel;

public class CustomerPanelController {

	public MainController mainCtrl;
	public CustomerPanel panel;
	public CustomerPanelController(MainController mc) {
		// TODO Auto-generated constructor stub
	    this.mainCtrl=mc;
	}

	
	public void displayCustomerPanel() {
		SimulatorControlPanel scp = mainCtrl.getSimulatorControlPanel();
//		if (ml == null)
//			ml = new MachinerySimulatorPanel(scp, this);
//		ml.display();
//		//System.out.println("get door status:" + door.isDoorClosed());
		scp.setActive(SimulatorControlPanel.ACT_MACHINERY, false);
		
		
		PanelSetupController builder=new PanelSetupController();
		builder.setPanelBuilder(new CustomerPanelBuilder((Frame) scp,this));
		builder.constractPanel();
		builder.getPanel().setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void closeCustomerPanel()
	{
		
		
		
	}

	public MainController getMainCtrl() {
		return mainCtrl;
	}


	public void setMainCtrl(MainController mainCtrl) {
		this.mainCtrl = mainCtrl;
	}

}
