package sg.edu.nus.iss.vmcs.customer;

import javax.swing.JLabel;

import sg.edu.nus.iss.vmcs.store.Coin;

public abstract class ObserverLabel extends Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Subject sub;
	
	private JLabel label;
	
	public ObserverLabel(String name, Subject subject) {
		this.sub = subject;
		sub.addObserver(this);
		label = new JLabel(name);
		add(label);
	}
	
	public JLabel getLabel() {
		return label;
	}


	@Override
	public abstract void update(boolean status, Coin o);
}
