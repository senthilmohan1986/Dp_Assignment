package sg.edu.nus.iss.vmcs.customer.terminate;

import sg.edu.nus.iss.vmcs.customer.TransactionController;

public class CustomerTransactionTerminator implements ITerminateStrategy {

	@Override
	public void terminate(TransactionController transactionCtrl) {
		// TODO Auto-generated method stub
		System.out.println("CustomerTransactionTerminator");
		transactionCtrl.getCoinReceiver().stopReceive();
		transactionCtrl.getCoinReceiver().refundCash();
		transactionCtrl.getDispenseController().allowSelection(true);
		
	}

}
