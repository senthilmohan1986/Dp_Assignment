package sg.edu.nus.iss.vmcs.customer.terminate;

import sg.edu.nus.iss.vmcs.customer.TransactionController;

public class DispenseFaultTerminator implements ITerminateStrategy {

	@Override
	public void terminate(TransactionController transactionCtrl) {
		
		transactionCtrl.getCoinReceiver().refundCash();
		//transactionCtrl.getDispenseController().allowSelection(false);

	}

}
