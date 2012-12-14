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
	
	public final static int ITERATOR_TYPE_DESC_VALUE = 1;
	public final static int ITERATOR_TYPE_NON_ZERO = 2;

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
		if (weight == 100) {
			return new Coin(100, 42.2);
		}else if (weight == 50){
			return new Coin(50, 35.2);
		}else if(weight == 20){
			return new Coin(20, 18.5);
		}else if(weight == 10){
			return new Coin(10, 10.9);
		}else if(weight == 5){
			return new Coin(5, 7.1);
		}else{
			return null;
		}
	}

	@Override
	public StoreIterator createIterator(int type) {
		if(type == ITERATOR_TYPE_DESC_VALUE){
			return new DescValueIterator(this);
		}
		else if(type == ITERATOR_TYPE_NON_ZERO){
			return new NonZeroIterator(this);
		}
		return null;
	}
}

