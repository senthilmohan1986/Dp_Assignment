package sg.edu.nus.iss.vmcs.customer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerminateButtonListener implements ActionListener {

	public CustomerPanel customerPanel;
	
	public TerminateButtonListener(CustomerPanel p)
	{
		this.customerPanel=p;	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	    String amount=customerPanel.getCoinInputBox().getTotalCost().getLabel().getText();
	    customerPanel.getTxtCollectCoin().setText(amount);
	    customerPanel.getCoinInputBox().getTotalCost().getLabel().setText("0.00");
	    
	}

}
