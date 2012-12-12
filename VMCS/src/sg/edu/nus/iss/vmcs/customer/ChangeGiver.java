package sg.edu.nus.iss.vmcs.customer;

import sg.edu.nus.iss.vmcs.store.Coin;
import sg.edu.nus.iss.vmcs.store.CashStoreItem;
import sg.edu.nus.iss.vmcs.store.StoreController;

public class ChangeGiver {

	private StoreController storeController;

	public StoreController getInstanceStoreController() {
		return storeController;
	}

	private ChangeProcessor processor;
	public ChangeGiver(){
		createProcessor();
	}
	
	private void createProcessor(){
		Coin coin = new Coin();
		processor = new ChangeProcessor();
		processor.addHandler(new CashStoreItem(coin, 10));
	}
	
}
