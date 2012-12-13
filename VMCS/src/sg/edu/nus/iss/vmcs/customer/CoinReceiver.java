package sg.edu.nus.iss.vmcs.customer;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.vmcs.customer.terminate.ChangeFaultTerminator;
import sg.edu.nus.iss.vmcs.customer.terminate.StoringCoinFaultTerminator;
import sg.edu.nus.iss.vmcs.machinery.MachineryController;
import sg.edu.nus.iss.vmcs.store.CashStore;
import sg.edu.nus.iss.vmcs.store.Coin;
import sg.edu.nus.iss.vmcs.system.MainController;
import sg.edu.nus.iss.vmcs.util.VMCSException;


public class CoinReceiver implements Subject{

	private TransactionController transactionController;
	private List<Coin> coins;
	private int totalInserted;
	private CoinInputBox coinInputBox;
	
	private List<Observer> observers;
	
	private CashStore cashStore = new CashStore();

	public CoinReceiver(TransactionController transactionController, CoinInputBox box) {
		this.transactionController = transactionController;
		this.coins = new ArrayList<Coin>();
		this.coinInputBox = box;
		observers = new ArrayList<Observer>();
	}
	
	public CoinReceiver(TransactionController transactionController) {
		this.transactionController = transactionController;
		this.coins = new ArrayList<Coin>();
		observers = new ArrayList<Observer>();
	}


	public TransactionController getTransactionController() {
		return transactionController;
	}
	
	public void stopReceive() {
		CustomerPanel customerPanel=transactionController.getCustomerPanel();
		customerPanel.getCoinInputBox().setActive(false);
	}
	
	public void refundCash()
	{
		CustomerPanel customerPanel=transactionController.getCustomerPanel();
		customerPanel.getTxtCollectCoin().setText(customerPanel.getCoinInputBox().getTotalAmount() + " C");
		customerPanel.getCoinInputBox().setTotalAmount(0);
		customerPanel.getCoinInputBox().getTotalCost().getLabel().setText("0 "+ "C");
		customerPanel.getCoinInputBox().getInvalidCoin().getLabel().setBackground(Color.white);
		System.out.println("refund cash");
		
	}

	
	public void ReceiveCoin(double weight) {
		Coin coin = cashStore.findCoin(weight);
		
		if (coin != null) {
			coins.add(coin);
			updateObserver(true, coin);
		}else{
			updateObserver(false, coin);
		}
	}

	private void updateObserver(boolean status, Coin coin) {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(status, coin);
		}
	}
	
	public void storeCash(Coin coin)
	{
		MainController mainCtrl = transactionController.getMainCtrl();
		MachineryController machineryCtrl = mainCtrl.getMachineryController();
		try {
			machineryCtrl.storeCoin(coin);
		} catch (VMCSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void falutIsDetected()
	{
		transactionController.setTerminateStrategy(new StoringCoinFaultTerminator());
		transactionController.terminate();
		
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}


	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Coin> getCoins() {
		return coins;
	}

}
