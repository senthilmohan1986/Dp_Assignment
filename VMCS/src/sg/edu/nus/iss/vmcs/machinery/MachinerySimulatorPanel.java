package sg.edu.nus.iss.vmcs.machinery;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.*;
import java.awt.event.*;

import sg.edu.nus.iss.vmcs.store.*;

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class MachinerySimulatorPanel extends Dialog {

	private static final String TITLE = "Machinery Panel";

	private StoreViewer cashDisplay;
	private StoreViewer drinksDisplay;
	private Checkbox doorDisplay;
	private StoreController storeCtrl;
	private MachineryController machineryCtrl;
	private Panel mainPanel=new Panel();
	private Panel topPanel = new Panel();
	private Panel downPanel = new Panel();
	
	
	public MachinerySimulatorPanel(Frame fr, MachineryController machCtrl) {
		super(fr, TITLE, false);

		machineryCtrl = machCtrl;
		storeCtrl = machineryCtrl.getMainController().getStoreController();

		//initialize();
	}

public void initialize() {
		

		cashDisplay = new StoreViewer(Store.CASH, storeCtrl);
		drinksDisplay = new StoreViewer(Store.DRINK, storeCtrl);

		
		topPanel.setLayout(new GridLayout(0, 1));
		topPanel.add(cashDisplay);
		topPanel.add(drinksDisplay);

		
		doorDisplay = new Checkbox();
		doorDisplay.addItemListener(new DoorListener(machineryCtrl));
		doorDisplay.setLabel("Door Locked");
		downPanel.add(doorDisplay);

		mainPanel.setLayout(new BorderLayout());
		//mainPanel.add("North", lb);
		mainPanel.add("Center", topPanel);
		mainPanel.add("South", downPanel);
		add(mainPanel);
		pack();

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				machineryCtrl.closeMachineryPanel();
			}
		});
	}


	public void display() {
		this.setVisible(true);
	}

	public void closeDown() {
		dispose();
	}

	public StoreViewer getCashStoreDisplay() {
		return cashDisplay;
	}

	public StoreViewer getDrinksStoreDisplay() {
		return drinksDisplay;
	}

	public void setDoorState(boolean state) {
		doorDisplay.setState(state);
		this.setActive(!state);
		this.repaint();
		this.setVisible(true); 
		
  
	}

	public void setActive(boolean state) {
		cashDisplay.setActive(state);
		drinksDisplay.setActive(state);
		doorDisplay.setEnabled(state);
	}

	public Panel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(Panel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public Panel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(Panel topPanel) {
		this.topPanel = topPanel;
	}

	public Panel getDownPanel() {
		return downPanel;
	}

	public void setDownPanel(Panel downPanel) {
		this.downPanel = downPanel;
	}

}
