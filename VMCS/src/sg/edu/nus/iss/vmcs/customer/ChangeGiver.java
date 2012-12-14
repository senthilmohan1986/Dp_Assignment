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
		cashStoreItems = cashStore.getItems(); 
		/*CashStore cs = cash.getCa();
               //use vmcs iterator to obtain an array of cashStoreItems  sorted from highest denom at index 0 
               
               Iterator.VMCSIterator iter =  cashStore.CreateCashDenomIterator();
               int index = 0;
               while(iter.hasNext())
               {
        	      storeItems[index]=(CashStoreItem)iter.next();
        	      index++;
               }*/
		
		StoreIterator iterator = cashStore.createIterator(1);
		
		while (iterator.hasNextItem()) {
			StoreItem item = (StoreItem) iterator.nextItem();
			System.out.println(item.getContent().getName());
			
		}
		
		//after the array is formed, traverse by index and set successor as the next index
		setupSuccessors(cashStoreItems, cashStoreSize);
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
		
		CashStore cashStore = new CashStore();
		int cashStoreSize = cashStore.getStoreSize();
		cashStoreItems = new CashStoreItem[cashStoreSize];
		   CashStoreItem highestDenom = (CashStoreItem)cashStoreItems[0];
		highestDenom.processChange(change_required);
	}	
	
	public void giveChangeDraft(int changeRequired){
		/*
		 * 	}
		//loop for each denomination(starting the largest)

		//find the number of coins and their value
		//determine max number of coins of denomination that can be given as change
		cashStore.getItem(Integer)
		cashStoreItem.getQuantity();
		cashStoreItem.getContent();

		//if(noOfCoins>0){ //then issue the coins as change}
		//if noOfCoins>0 start
		//issue the  coins 
		machineryController.giveChange(Int,int)
		storeController.giveChange(int,int)
		{
		cashStore.getItem(Integer);
		//1. decrement the number held by the number issued.
		cashStoreItem.decrement();
		//2. find the new number held
		cashStoreItem.getQuantity();
		//3. update the machinery simulator panel
		cashStoreDisplay.update();
		}
		//loop end
		//display change on Customer Panel
		refund/changeTrayDisplay.setValue(integer);
		//if change is not given in full, then display No Change Avaliable message.
		//otherwise, reset the display
		NochangeAvailabilityDisplay.setState(Boolean);
	
		 */
	}
		

}


