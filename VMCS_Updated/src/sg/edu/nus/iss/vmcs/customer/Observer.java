package sg.edu.nus.iss.vmcs.customer;

import javax.swing.JPanel;

import sg.edu.nus.iss.vmcs.store.Coin;

public abstract class Observer extends JPanel{
	
	public abstract void update(boolean status, Coin o );
	
}
