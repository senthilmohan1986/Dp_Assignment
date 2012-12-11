package sg.edu.nus.iss.vmcs.builder;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JLabel;

import sg.edu.nus.iss.vmcs.maintenance.MaintenanceController;
import sg.edu.nus.iss.vmcs.maintenance.MaintenancePanel;

public class MaintainerPanelBuilder extends PanelBuilder {

	public MaintenancePanel panel;
	
	
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
		// TODO Auto-generated method stu
		    JLabel lblCollectCash=new JLabel("Collect Cash");
		    panel.add(lblCollectCash);
		    panel.setActive(1, false);
		    panel.repaint();
		    panel.setVisible(true);
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
