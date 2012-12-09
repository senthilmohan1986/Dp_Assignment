package sg.edu.nus.iss.vmcs.customer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.vmcs.store.Coin;
import sg.edu.nus.iss.vmcs.system.CustomerSimulatorPanel;

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
	
	public void stopReceive() {
		CustomerPanel customerPanel=transactionController.getCustomerPanel();
		//customerPanel.getCoinInputBox().setActive(false);
	}
	
	public void refundCash()
	{
		CustomerPanel customerPanel=transactionController.getCustomerPanel();
		customerPanel.getTxtCollectCoin().setText(customerPanel.getCoinInputBox().getTotalAmount() + " C");
		customerPanel.getCoinInputBox().setTotalAmount(0);
		customerPanel.getCoinInputBox().getTxtInserted().setText("0 "+ "C");
		customerPanel.getCoinInputBox().getTxtInvalidCoin().setBackground(Color.white);
		System.out.println("refund cash");
		
	}


}
