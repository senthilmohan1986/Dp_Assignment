/*package sg.edu.nus.iss.vmcs.customer;

import sg.edu.nus.iss.vmcs.customer.terminate.ChangeFaultTerminator;
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
		storecontroller = transactionController.getMainCtrl().getStoreController();
		StoreItem storeItem = storecontroller.getStoreItem(1, 10);
		CashStore cashStore = new CashStore();
		int cashStoreSize = cashStore.getStoreSize();
	}
	
	public void falutIsDetected()
	{
		transactionController.setTerminateStrategy(new ChangeFaultTerminator());
		transactionController.terminate();
	}
	
}
=======*/
package sg.edu.nus.iss.vmcs.customer;

import java.io.IOException;

import sg.edu.nus.iss.vmcs.customer.terminate.ChangeFaultTerminator;
import sg.edu.nus.iss.vmcs.store.CashStore;
import sg.edu.nus.iss.vmcs.store.CashStoreItem;
import sg.edu.nus.iss.vmcs.store.Coin;
import sg.edu.nus.iss.vmcs.store.Store;
import sg.edu.nus.iss.vmcs.store.StoreController;
import sg.edu.nus.iss.vmcs.store.StoreItem;
import sg.edu.nus.iss.vmcs.store.StoreIterator;

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
	StoreItem[] cashStoreItems;
	public void falutIsDetected()
	{
		transactionController.setTerminateStrategy(new ChangeFaultTerminator());
		transactionController.terminate();
	}

	public ChangeGiver(TransactionController transaction_controller) throws IOException
	{
		//convert the sorted iterator to array of cashStoreItems 
		//with element at index 0 the highest coin denom sorted desc
		this.transactionController = transaction_controller;
		storecontroller = transactionController.getMainCtrl().getStoreController(); 
		
	//	StoreController storeController = storecontroller.getInstance();
		storecontroller.initializeStores();
		System.out.println("Store has initialized");
		
		Store storeItem = storecontroller.getStoreByType(Store.CASH);
		
		System.out.println("How to get the index for Store Item??");
		int index=10;
		StoreItem storeItem1 = storecontroller.getStoreItem(Store.CASH, index);
		
		CashStore cashStore = storecontroller.getcStore();
		int cashStoreSize = cashStore.getStoreSize();
		
		StoreIterator iterator = cashStore.createIterator(1);
		StoreItem[] item = new StoreItem[10];
		CashStoreItem cashStoreItem = null;
		int i = 0;
		while (iterator.hasNextItem()) {
			item[i] = (StoreItem) iterator.nextItem();
			i++;
			System.out.println(item[i-1].getContent().getName());
			
		}
		//after the array is formed, traverse by index and set successor as the next index
		cashStoreItems = item;
		setupSuccessors(item, cashStoreSize);
	}

	    public void setupSuccessors(StoreItem[] storeItems, int size)
	  {
		for (int i =0; i<size-1; i++)
		{
			((CashStoreItem)storeItems[i]).setSuccessor( 
				(CashStoreItem)storeItems[i+1]);
		}
	}
	
	public void giveChange(Integer change_required)
	{
		//set the highest cashStoreItem to start dispensing job;
		// to vmcs iterator who already do the sorting job in descending order, 
		//we can simply start dispensing from the first element.
		CashStore cashStore = storecontroller.getcStore();
		int cashStoreSize = cashStore.getStoreSize();
		CashStoreItem highestDenom = (CashStoreItem)cashStoreItems[0];
		
		highestDenom.processChange(change_required);
	}	
	
}


