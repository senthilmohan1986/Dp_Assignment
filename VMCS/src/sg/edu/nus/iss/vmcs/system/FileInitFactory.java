//@author vipul
package sg.edu.nus.iss.vmcs.system;

public class FileInitFactory extends AbstractInitFactory {

	@Override
	AbstractCashLoader createCashLoader(String CASH_PROP_FILE) {
		return new CashPropertyLoader(CASH_PROP_FILE);
	}

	@Override
	AbstractDrinksLoader createDrinkLoader(String DRINK_PROP_FILE) {
		// TODO Auto-generated method stub
		return new DrinkPropertyLoader(DRINK_PROP_FILE);
	}

}
