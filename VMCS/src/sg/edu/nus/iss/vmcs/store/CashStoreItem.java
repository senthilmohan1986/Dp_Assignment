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

	private int handledAmount;
	
	public int getHandledAmount() {
		return handledAmount;
	}

	public void setHandledAmount(int handledAmount) {
		this.handledAmount = handledAmount;
	}

	public CashStoreItem(Coin coin, int qty) {
		super((StoreObject) coin, qty);

	}

	protected CashStoreItem successor;

	public void setSuccessor(CashStoreItem successor)
	{
		this.successor = successor;
	}

	public void processChange(int change)
	{
		if (change==0)
			return;
		else
		{
			int availableQty = getQuantity();
			Coin c = (Coin)getContent();
			int denoCoin  = c.getValue();
			int neededQty = change/denoCoin;
			if((change >= denoCoin)&&(availableQty> 0))	
		        {
				if (availableQty >= neededQty)
				{
					availableQty -= neededQty;
					setHandledAmount(neededQty);
					change -= neededQty*denoCoin;
				}
				else if (availableQty < neededQty)
				{
					setHandledAmount(availableQty);
					change -= availableQty*denoCoin;
					availableQty=0;
				}
				setQuantity(availableQty);
			}
			if ((successor == null ) && (change > 0 ))
			{
				System.out.println("Not enough coin to dispense");
			} else successor.processChange(change); 
			return;
		}//end of if
	}

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