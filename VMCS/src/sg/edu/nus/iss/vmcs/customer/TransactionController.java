package sg.edu.nus.iss.vmcs.customer;

import sg.edu.nus.iss.vmcs.system.MainController;

public class TransactionController {
	
	private Boolean change_given;
	private Boolean drink_dispensed;
	private Integer price;
	private Integer selection;
	
	
	public TransactionController()
	{
		
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


	public void startTransaction()
	{
	//	the price of the selected item is obtained.
	//	the refund/change tray display is reset.
	// the can collection box is reset.
	// the drink selection box is deactivated.
	// the coin receiver will be instructed to start receiving the coins
	}
	
	public void processMoneyReceived(Integer identifier)
	{
		
	}
	
	public void completeTransaction(Integer total)
	{
		
	}
	
	public void terminateFault()
	{
		
	}
	
	public void termianteTransaction()
	{
		
	}
	
	public void cancelTransaction()
	{
		
	}
	
	public void closeDown()
	{
		
	}
	public void displayCustomerPanel(MainController mainController)
	{
		
	}
	public void refreshCustomerPanel(MainController mainController)
	{
		
	}

}
	