package sg.edu.nus.iss.vmcs.customer;

import sg.edu.nus.iss.vmcs.store.CashStoreItem;

//Hanlder for Change of Responsiblity
public interface MakeChangeInterface {

	// reference to the next handler in the chain
	public void setNext(MakeChangeInterface makeChangeInterface);
	
	//handle the request
	public void handleChangeProcess(CashStoreItem cashStoreItem);
	//public void changeProcess();
}
