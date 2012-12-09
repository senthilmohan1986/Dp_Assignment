package sg.edu.nus.iss.vmcs.customer.terminate;

import sg.edu.nus.iss.vmcs.customer.TransactionController;

public interface ITerminateStrategy {
	
	public void terminate(TransactionController transactionCtrl);

}
