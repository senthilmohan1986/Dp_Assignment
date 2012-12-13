package sg.edu.nus.iss.vmcs.customer.Dispense;
import sg.edu.nus.iss.vmcs.store.*;;

// Command that handles drink dispense
public class DrinksDispenseCommand implements Command {
	StoreItem drinkStoreItem;

	public 	DrinksDispenseCommand(StoreItem drinkStoreItem){
		this.drinkStoreItem = drinkStoreItem;
	}
	
	@Override
	public void execute() {
		drinkStoreItem.decrement();

	}

}
