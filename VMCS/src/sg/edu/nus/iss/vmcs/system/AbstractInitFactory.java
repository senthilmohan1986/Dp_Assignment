//@author Vipul
package sg.edu.nus.iss.vmcs.system;

public abstract class AbstractInitFactory {
		abstract AbstractCashLoader createCashLoader(String source);
		abstract AbstractDrinksLoader createDrinkLoader(String source);
}
