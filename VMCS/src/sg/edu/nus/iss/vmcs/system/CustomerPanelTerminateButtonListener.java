package sg.edu.nus.iss.vmcs.system;


import java.awt.event.*;

import sg.edu.nus.iss.vmcs.customer.TransactionController;
import sg.edu.nus.iss.vmcs.customer.terminate.CustomerTransactionTerminator;

public class CustomerPanelTerminateButtonListener implements ActionListener {

	private TransactionController ctrl;

	public CustomerPanelTerminateButtonListener(TransactionController transactionCtrl) {
		ctrl = transactionCtrl;
	}

	public void actionPerformed(ActionEvent event) {
		ctrl.setTerminateStrategy(new CustomerTransactionTerminator());
		ctrl.terminate();
	}

}
