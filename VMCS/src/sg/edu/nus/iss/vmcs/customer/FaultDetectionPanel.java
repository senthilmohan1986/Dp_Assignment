package sg.edu.nus.iss.vmcs.customer;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	public FaultDetectionPanel(final TransactionController transCtrl) {
		
		btnFault1=new Button("Change Fault");
		btnFault2=new Button("Storing Coin Fault");
		btnFault3=new Button("Dispense Fault");
		// TODO Auto-generated constructor stub
		
		Panel panel=new Panel();
		GridLayout box=new GridLayout(1,4);
		panel.setLayout(box);
		
		btnFault1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				transCtrl.getChainGiver().falutIsDetected();
				
			}
		});
		
		btnFault2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				transCtrl.getCoinReceiver().falutIsDetected();
				
			}
		});
		
		
		btnFault3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				transCtrl.getDispenseController().faultIsDetected();
				
			}
		});
		panel.add(btnFault1);
		panel.add(btnFault2);
		panel.add(btnFault3);
		
		add(panel);
		
	}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
