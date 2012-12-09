package sg.edu.nus.iss.vmcs.customer;

import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.vmcs.store.Coin;

public class CoinReceiver {

	private TransactionController transactionController;
	private List<Coin> coins;
	private int totalInserted;

	public CoinReceiver(TransactionController transactionController) {
		this.transactionController = transactionController;
		this.coins = new ArrayList<Coin>();
	}


	public TransactionController getTransactionController() {
		return transactionController;
	}


}
