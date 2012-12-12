package sg.edu.nus.iss.vmcs.customer;

import sg.edu.nus.iss.vmcs.store.CashStore;
import sg.edu.nus.iss.vmcs.store.Coin;
import sg.edu.nus.iss.vmcs.store.CashStoreItem;
import sg.edu.nus.iss.vmcs.store.StoreController;
import sg.edu.nus.iss.vmcs.store.StoreItem;

public class ChangeGiver {

	

	private ChangeProcessor processor;
	public ChangeGiver(){
		createProcessor();
	}
	
	private void createProcessor(){
		Coin coin = new Coin();
		processor = new ChangeProcessor();
		processor.addHandler(new CashStoreItem(coin, 10));
	}
	private StoreController storecontroller;
	private TransactionController transactionController;

	public ChangeGiver(TransactionController transactionController) {
		super();
		this.transactionController = transactionController;
		storecontroller = StoreController.getInstanceStoreController();
		StoreItem storeItem = storecontroller.getStoreItem(1, 10);
		CashStore cashStore = new CashStore();
		int cashStoreSize = cashStore.getStoreSize();
		
		
	}
	
}
