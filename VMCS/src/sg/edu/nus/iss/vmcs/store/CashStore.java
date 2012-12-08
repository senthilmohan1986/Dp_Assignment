package sg.edu.nus.iss.vmcs.store;

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

public class CashStore extends Store {

	public final static int INVALID_COIN_WEIGHT = 9999;

	public CashStore() {
	}
	
	public int findCashStoreIndex (Coin c) {
		int size = getStoreSize();
		for (int i = 0; i < size; i++) {
			StoreItem item = (CashStoreItem) getStoreItem(i);
			Coin current = (Coin) item.getContent();
			if (current.getWeight() == c.getWeight())
				return i;
		}
		return -1;
	}
	
	public Coin findCoin(double weight){
		if (weight == 42.2) {
			return new Coin(100, 42.2);
		}else if (weight == 35.0){
			return new Coin(50, 35.2);
		}else if(weight == 18.5){
			return new Coin(20, 18.5);
		}else if(weight == 10.9){
			return new Coin(10, 10.9);
		}else if(weight == 7.1){
			return new Coin(5, 7.1);
		}else{
			return null;
		}
	}


}

