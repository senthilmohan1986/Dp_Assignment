package sg.edu.nus.iss.vmcs.customer;

import sg.edu.nus.iss.vmcs.customer.terminate.DispenseFaultTerminator;
import sg.edu.nus.iss.vmcs.store.DrinksBrand;
import sg.edu.nus.iss.vmcs.store.DrinksStore;
import sg.edu.nus.iss.vmcs.store.DrinksStoreItem;
import sg.edu.nus.iss.vmcs.store.Store;
import sg.edu.nus.iss.vmcs.store.StoreItem;

public class DispenseController {

	private TransactionController transactionController;

	public DispenseController (TransactionController transactionController){
		this.transactionController = transactionController;
	}

	public void allowSelection(boolean allow) {

		if (allow){
			Store drinkStore = transactionController.getMainCtrl().getStoreController().getStore(Store.DRINK);
			StoreItem[] storeItems = drinkStore.getItems();
			for (int i =0; i< storeItems.length; i++){
				StoreItem storeItem = storeItems[i];
				if (storeItem.getQuantity() == 0) {
					//transactionController.getCustomerPanel().setDrinkSelectionBoxState(i, false);
					//transactionController.getCustomerPanel().setDrinkSelectionBoxItemState(i, false);
				}
				else {
					//transactionController.getCustomerPanel().setDrinkSelectionBoxState(i, true);
					//transactionController.getCustomerPanel().setDrinkSelectionBoxState(i, true);
				}
			}
		} else {
			transactionController.getCustomerPanel().getDrinkSelectionBox().setActive(allow);
		}
	}

	public void resetCan(){
		//transactionController.getCustomerPanel().setCollectCanValue("No CAN");
	}

	public boolean dispenseDrink(int selectedBrand) throws Exception{
		 transactionController.getMainCtrl().getMachineryController().dispenseDrink(selectedBrand);
		StoreItem storeItem = transactionController.getMainCtrl().getStoreController().getStoreItem(Store.DRINK, selectedBrand);
		transactionController.getCustomerPanel().setCollectCanValue(storeItem.getContent().getName());
		//if (drinkDispensed)
			updateDrinkSelection(selectedBrand);
		
     return true;
	}

	public void updateDrinkSelection(int selection){
		 DrinksStore drinksStore =(DrinksStore)transactionController.getMainCtrl().getStoreController().getStore(Store.DRINK);
         DrinksStoreItem drinksStoreItem = null;
		try {
			drinksStoreItem = (DrinksStoreItem)drinksStore.getStoreItem(selection);
		} catch (Exception e) {
			e.printStackTrace();
		}
         DrinksBrand drinksBrand = (DrinksBrand)drinksStoreItem.getContent();
         int qty = drinksStoreItem.getQuantity();
         int price = drinksBrand.getPrice();
         String name = drinksBrand.getName();
        // transactionController.getCustomerPanel().updateDrinkInput(selection, qty, price, name) ;
	}	

	public void updateDrinkPanel(){
		// TODO
	}	
	
	public void faultIsDetected()
	{
		transactionController.setTerminateStrategy(new DispenseFaultTerminator());
		transactionController.terminate();
	}
}

