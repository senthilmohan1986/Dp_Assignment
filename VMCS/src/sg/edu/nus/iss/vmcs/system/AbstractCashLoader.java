//@author Vipul
package sg.edu.nus.iss.vmcs.system;

import java.io.IOException;

import sg.edu.nus.iss.vmcs.store.PropertyLoader;
import sg.edu.nus.iss.vmcs.store.StoreItem;

public abstract class AbstractCashLoader implements PropertyLoader{
	public abstract void initialize() throws IOException;
	public abstract void saveProperty() throws IOException; 
	public abstract int getNumOfItems();
	public abstract void setNumOfItems(int numItems);
	public abstract StoreItem getItem (int index);
	public abstract void setItem (int index, StoreItem item);
}
