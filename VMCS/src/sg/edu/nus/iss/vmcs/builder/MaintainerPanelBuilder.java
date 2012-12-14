package sg.edu.nus.iss.vmcs.builder;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import sg.edu.nus.iss.vmcs.maintenance.MaintenanceController;
import sg.edu.nus.iss.vmcs.maintenance.MaintenancePanel;

public class MaintainerPanelBuilder implements PanelBuilder {

	public MaintenancePanel panel;
	public MaintenanceController mtnCtrl;
	
	
	public MaintainerPanelBuilder(Frame scp,MaintenanceController maintenanceController) {
		// TODO Auto-generated constructor stub
		this.mtnCtrl=maintenanceController;
		panel=new MaintenancePanel(scp, maintenanceController);
	}

	public void buildPanel() {
		// TODO Auto-generated method stub
		//panel=new MaintenancePanel(f, c);
		
		ImageIcon img=new ImageIcon("tools.png");
		panel.setIconImage(img.getImage());
		
		panel.initialize();
	}

	@Override
	public void buildControls() {
		// TODO Auto-generated method stu
		    JLabel lblCollectCash=new JLabel("Collect Cash");
		    panel.add(lblCollectCash);
		    panel.setActive(1, false);
		    panel.repaint();
		    panel.setVisible(true);
		    panel.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					mtnCtrl.closeDown();
				}
			});

	}

	

	@Override
	public Dialog getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

	

}
