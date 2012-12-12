package sg.edu.nus.iss.vmcs.store;

import sg.edu.nus.iss.vmcs.customer.MakeChangeInterface;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class CashStoreItem extends StoreItem implements MakeChangeInterface{

	public CashStoreItem(Coin coin, int qty) {
		super((StoreObject) coin, qty);

	}

//	protected CashStoreItem changeSuccessor;
//	
//	public void setSuccessor(CashStoreItem cashStoreItemSuccessor){
//		this.changeSuccessor = cashStoreItemSuccessor;
//	}
//	
//	public void changeProcess(int change){
//		
//	}

	/*
	 * set up concrete handler, this handler pass the request it does not interested them
	 * 
	 */
	private MakeChangeInterface next;
	@Override
	public void setNext(MakeChangeInterface makeChangeInterface) {
		// TODO Auto-generated method stub
		next = makeChangeInterface;
		
	}

	@Override
	public void handleChangeProcess(CashStoreItem cashStoreItem) {
		// TODO Auto-generated method stub
		/*
		 * Need to add how to handle the change...:)
		 */
	}
}