package sg.edu.nus.iss.vmcs.customer.terminate;

import sg.edu.nus.iss.vmcs.customer.TransactionController;

public class ChangeFaultTerminator implements ITerminateStrategy {

	@Override
	public void terminate(TransactionController transactionCtrl) {
		// TODO Auto-generated method stub
		transactionCtrl.getDispenseController().allowSelection(false);
		transactionCtrl.storeCash();

	}

}
