package sg.edu.nus.iss.vmcs.customer;

import java.awt.Frame;

import sg.edu.nus.iss.vmcs.builder.CustomerPanelBuilder;
import sg.edu.nus.iss.vmcs.builder.controller.PanelSetupController;
import sg.edu.nus.iss.vmcs.customer.terminate.ITerminateStrategy;
import sg.edu.nus.iss.vmcs.store.Coin;
import sg.edu.nus.iss.vmcs.store.StoreController;
import sg.edu.nus.iss.vmcs.system.MainController;
import sg.edu.nus.iss.vmcs.system.SimulatorControlPanel;
import sg.edu.nus.iss.vmcs.util.VMCSException;

public class TransactionController {
	
	private Boolean change_given;
	private Boolean drink_dispensed;
	private Integer price;
	private Integer selection;
	
	public MainController mainCtrl;
	private CustomerPanel customerPanel;
	private CoinReceiver coinReceiver;
	private ChangeGiver chainGiver;
	private DispenseController dispenseController;
	
	private ITerminateStrategy terminateStrategy;
	

	
	
	public void initialize() throws VMCSException {
		coinReceiver = new CoinReceiver(this);
		dispenseController = new DispenseController(this);
		chainGiver = new ChangeGiver(this);
	}

	/*public void initialize() throws VMCSException {
		coinReceiver = new CoinReceiver(this);
	}*/
	
	public TransactionController(MainController mainController)
	{
		mainCtrl = mainController;
	}


	public void startTransaction(Integer identifier)
	{
	//	the price of the selected item is obtained.
	//	the refund/change tray display is reset.
	// the can collection box is reset.
	// the drink selection box is deactivated.
	// the coin receiver will be instructed to start receiving the coins
	}
	
	public void processMoneyReceived(Integer total)
	{
		
	}
	
	public void completeTransaction()
	{
		
	}
	
	public void terminateFault()
	{
		
	}
	
	public void termianteTransaction()
	{
		terminateStrategy.terminate(this);

	}
	
	public void cancelTransaction()
	{
		terminateStrategy.terminate(this);

	}
	
	public void terminate()
	{
		terminateStrategy.terminate(this);
	}
	
	public void closeDown()
	{
		
	}
	public void displayCustomerPanel()
	{
		SimulatorControlPanel scp = mainCtrl.getSimulatorControlPanel();
		/*if (sm == null)
			sm = new CustomerSimulatorPanel(coinReceiver);

		sm.display();
		//System.out.println("get door status:" + door.isDoorClosed());
		scp.setActive(SimulatorControlPanel.ACT_CUSTOMER, false);
		*/
		
		PanelSetupController builder=new PanelSetupController();
		builder.setPanelBuilder(new CustomerPanelBuilder((Frame) scp,this));
		builder.constractPanel();
		customerPanel=(CustomerPanel)builder.getPanel();
		builder.getPanel().setVisible(true);

		
	}
	public CustomerPanel getCustomerPanel() {
		return customerPanel;
	}
	public void setCustomerPanel(CustomerPanel customerPanel) {
		this.customerPanel = customerPanel;
	}
	public void refreshCustomerPanel()
	{
	
	}
	public void storeCash()
	{
		if(coinReceiver.getCoins()!=null)
		{
			if(coinReceiver.getCoins().size() > 0)
			{
				for(Coin coin:coinReceiver.getCoins())
				{
					coinReceiver.storeCash(coin);
				}
			}
		}
	}
	
	
	public void setTerminateStrategy(ITerminateStrategy terminateStrategy) {
		this.terminateStrategy = terminateStrategy;
	}
	public CoinReceiver getCoinReceiver() {
		return coinReceiver;
	}
	public void setCoinReceiver(CoinReceiver coinReceiver) {
		this.coinReceiver = coinReceiver;
	}
	public DispenseController getDispenseController() {
		return dispenseController;
	}
	public void setDispenseController(DispenseController dispenseController) {
		this.dispenseController = dispenseController;
	}
	
	public Boolean getChange_given() {
		return change_given;
	}


	public void setChange_given(Boolean change_given) {
		this.change_given = change_given;
	}


	public Boolean getDrink_dispensed() {
		return drink_dispensed;
	}


	public void setDrink_dispensed(Boolean drink_dispensed) {
		this.drink_dispensed = drink_dispensed;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Integer getSelection() {
		return selection;
	}


	public void setSelection(Integer selection) {
		this.selection = selection;
	}

	public MainController getMainCtrl() {
		return mainCtrl;
	}

	public void createChangeGiver(){
		ChangeGiver cg = new ChangeGiver();
		
	}

}
	