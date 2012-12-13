package sg.edu.nus.iss.vmcs.customer.terminate;

import sg.edu.nus.iss.vmcs.customer.TransactionController;

public class MaintainerLoginTerminator implements ITerminateStrategy {

	@Override
	public void terminate(TransactionController transactionCtrl) {
		// TODO Auto-generated method stub
		System.out.println("MaintainerLoginTerminator");
		
		if((transactionCtrl.getCoinReceiver().getCoins() != null))
		{
			
			if(transactionCtrl.getCoinReceiver().getCoins().size() > 0)
			{ 	//transaction in progress
				System.out.println("Transaction is in Progress");
				transactionCtrl.getCoinReceiver().stopReceive();
				transactionCtrl.getCoinReceiver().refundCash();				
				
			}
			else
			{
				transactionCtrl.getDispenseController().allowSelection(false);
				
			}
		}
		else
		{
			transactionCtrl.getDispenseController().allowSelection(false);
			
		}
		
	}

}
