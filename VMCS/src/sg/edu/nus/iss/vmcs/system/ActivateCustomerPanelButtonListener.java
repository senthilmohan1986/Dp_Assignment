package sg.edu.nus.iss.vmcs.system;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.event.*;

import sg.edu.nus.iss.vmcs.customer.CoinReceiver;

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class ActivateCustomerPanelButtonListener implements ActionListener {

	private CustomerSimulatorPanel custPanel;
	private CoinReceiver receiver;
	
	public ActivateCustomerPanelButtonListener(CoinReceiver ct) {
		receiver = ct;
		custPanel = new CustomerSimulatorPanel(receiver);
	}
	public void actionPerformed(ActionEvent e) {
		/**@todo: Implement this java.awt.event.ActionListener method*/
		System.out.println("Inside the Customer Panel");
//		ctrl.setupSimulator();
		custPanel.display();
		
	}
}