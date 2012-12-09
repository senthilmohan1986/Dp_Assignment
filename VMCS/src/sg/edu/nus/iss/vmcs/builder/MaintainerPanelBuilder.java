package sg.edu.nus.iss.vmcs.builder;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JLabel;

import sg.edu.nus.iss.vmcs.maintenance.MaintenanceController;
import sg.edu.nus.iss.vmcs.maintenance.MaintenancePanel;

import com.dp.assignment.builder.frontend.panel.MaintainerPanel;
import com.dp.assignment.builder.frontend.panel.VMCSPanel;

public class MaintainerPanelBuilder extends PanelBuilder {

	public Dialog panel;
	
	
	public MaintainerPanelBuilder(Frame scp,MaintenanceController maintenanceController) {
		// TODO Auto-generated constructor stub
		panel=new MaintenancePanel(scp, maintenanceController);
	}

	public void buildPanel(Frame f, MaintenanceController c) {
		// TODO Auto-generated method stub
		panel=new MaintenancePanel(f, c);
	}

	@Override
	public void buildControls() {
		// TODO Auto-generated method stub
		   JLabel lblTitle=new JLabel(" VMCS - Mainteainer Panel");
		  JLabel lblPassword=new JLabel(" Password");
		   JLabel lblAvailableCoin=new JLabel(" Quantity of Coins Available");
		   JLabel lblAvailableDrink=new JLabel(" Quantity of Drinks Availble");
		    JLabel lblbrandPrice=new JLabel("Brand Price");
		    JLabel lblCollectCash=new JLabel("Collect Cash");
		    panel.add(lblCollectCash);
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

	@Override
	public void buildPanel() {
		// TODO Auto-generated method stub
		
	}

}
