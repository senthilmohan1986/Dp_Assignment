package sg.edu.nus.iss.vmcs.customer;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

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
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		this.sub = subject;
		sub.addObserver(this);
		label = new JLabel(name);
		label.setBackground(Color.white);
		add(label);
	}
	
	public ObserverLabel(Component component, String name, Subject subject) {
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		this.sub = subject;
		sub.addObserver(this);
		component.setBackground(Color.lightGray);
		add(component);
		label = new JLabel(name);
		label.setBackground(Color.white);
		add(label);
	}
	
	public JLabel getLabel() {
		return label;
	}


	@Override
	public abstract void update(boolean status, Coin o);
}
