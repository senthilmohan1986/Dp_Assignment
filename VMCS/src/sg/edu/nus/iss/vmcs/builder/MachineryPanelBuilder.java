package sg.edu.nus.iss.vmcs.builder;

import java.awt.Dialog;
import java.awt.Frame;

import sg.edu.nus.iss.vmcs.machinery.MachineryController;
import sg.edu.nus.iss.vmcs.machinery.MachinerySimulatorPanel;
import sg.edu.nus.iss.vmcs.maintenance.MaintenanceController;
import sg.edu.nus.iss.vmcs.maintenance.MaintenancePanel;



public class MachineryPanelBuilder extends PanelBuilder {

	public MachinerySimulatorPanel panel;
	
	public MachineryPanelBuilder (Frame scp,MachineryController machineryController) 
	{
		// TODO Auto-generated constructor stub
		panel=new MachinerySimulatorPanel(scp, machineryController);
	}

	@Override
	public void buildPanel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildControls() {
		// TODO Auto-generated method stub
		panel.setActive(true);
		panel.setDoorState(false);
		refreshPanel(panel);
		panel.getMainPanel().repaint();
		panel.getMainPanel().setVisible(true);
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
