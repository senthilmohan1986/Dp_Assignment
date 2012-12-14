package sg.edu.nus.iss.vmcs.builder;

import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.ImageIcon;

import sg.edu.nus.iss.vmcs.machinery.MachineryController;
import sg.edu.nus.iss.vmcs.machinery.MachinerySimulatorPanel;
import sg.edu.nus.iss.vmcs.maintenance.MaintenanceController;
import sg.edu.nus.iss.vmcs.maintenance.MaintenancePanel;
import sg.edu.nus.iss.vmcs.system.SimulatorControlPanel;




public class MachineryPanelBuilder implements PanelBuilder {

	private static final String TITLE = "Machinery Panel";

	public MachinerySimulatorPanel panel;
	
	public MachineryPanelBuilder (Frame scp,MachineryController machineryController) 
	{
		// TODO Auto-generated constructor stub
		
		((SimulatorControlPanel) scp).setActive(SimulatorControlPanel.ACT_MACHINERY, false);
		panel=new MachinerySimulatorPanel(scp, machineryController);
	}

	@Override
	public void buildPanel() {
		// TODO Auto-generated method stub
		ImageIcon img=new ImageIcon("machine.png");
		panel.setIconImage(img.getImage());
		panel.initialize();
		Label lb = new Label(TITLE);
		lb.setFont(new Font("Helvetica", Font.BOLD, 24));
		lb.setAlignment(Label.CENTER);
		this.panel.getMainPanel().add("North",lb);

	}

	@Override
	public void buildControls() {
	
		panel.setActive(false);
		panel.setDoorState(true);
		
	}



	@Override
	public Dialog getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}
