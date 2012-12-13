package sg.edu.nus.iss.vmcs.system;

public class DBInitFactory extends AbstractInitFactory {



	@Override
	AbstractCashLoader createCashLoader(String CASH_TABLE_NAME) {
		return new CashDBLoader(CASH_TABLE_NAME);
	}

	@Override
	AbstractDrinksLoader createDrinkLoader(String DRINK_TABLE_NAME) {
		return new DrinkDBLoader(DRINK_TABLE_NAME);
	}

}
