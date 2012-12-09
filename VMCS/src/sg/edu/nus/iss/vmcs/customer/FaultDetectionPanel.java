package sg.edu.nus.iss.vmcs.customer;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.BoxLayout;

public class FaultDetectionPanel extends Panel {

	/**
	 * 
	 */
	private Button btnFault1;
	private Button btnFault2;
	private Button btnFault3;
	private Button btnFault4;
	
	private static final long serialVersionUID = -863766868878640262L;

	public FaultDetectionPanel() {
		
		btnFault1=new Button("Fault 1");
		btnFault2=new Button("Fault 2");
		btnFault3=new Button("Fault 3");
		btnFault4=new Button("Fault 4");
		// TODO Auto-generated constructor stub
		
		Panel panel=new Panel();
		GridLayout box=new GridLayout(1,4);
		panel.setLayout(box);
		panel.add(btnFault1);
		panel.add(btnFault2);
		panel.add(btnFault3);
		panel.add(btnFault4);
		
		add(panel);
		
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
