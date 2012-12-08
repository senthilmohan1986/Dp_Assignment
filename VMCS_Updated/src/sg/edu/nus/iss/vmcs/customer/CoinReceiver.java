package sg.edu.nus.iss.vmcs.customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sg.edu.nus.iss.vmcs.store.CashStore;
import sg.edu.nus.iss.vmcs.store.Coin;

public class CoinReceiver implements Subject{
	
	 private List<Observer> observers = new ArrayList<Observer>();
	 
	 private List<Coin> coins = new ArrayList<Coin>();
	 
	 private CashStore cashStore = new CashStore();
	 
	 private boolean coinStatus;
	 
	 public void ReceiveCoin(double weight) {
		 Coin coin = cashStore.findCoin(weight);
		 if (coin == null) {
			coinStatus = false;
		}else {
			coinStatus = true;
		}
		 add(coin);
	}
	 
	 public void add(Coin coin) {
		 if (coin != null) {
			 coins.add(coin);
		}
		 notifyObservers(coin);
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
	}
	
	private void notifyObservers(Coin coin) {
        Iterator<Observer> i = observers.iterator();
        while( i.hasNext() ) {
              Observer o = ( Observer ) i.next();
              o.update(coinStatus, coin );
        }
  }
	
	public static void main(String[] args) {
		CoinReceiver receiver = new CoinReceiver();
		receiver.ReceiveCoin(18.5);
	}
}
