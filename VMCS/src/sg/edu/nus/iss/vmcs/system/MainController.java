package sg.edu.nus.iss.vmcs.system;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.io.*;

import sg.edu.nus.iss.vmcs.customer.TransactionController;
import sg.edu.nus.iss.vmcs.maintenance.*;
import sg.edu.nus.iss.vmcs.machinery.*;
import sg.edu.nus.iss.vmcs.store.*;
import sg.edu.nus.iss.vmcs.util.*;

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class MainController {

	private SimulationController  simulatorCtrl;
	private MachineryController   machineryCtrl;
	private MaintenanceController maintenanceCtrl;
	private StoreController       storeCtrl;
	private TransactionController transactionCtrl;

	private String      propertyFile;

	public MainController(String propertyFile) {
		this.propertyFile = propertyFile;
	}

	public void start() throws VMCSException {
		try {
			initialize();
			simulatorCtrl.displaySimulatorControlPanel();
			simulatorCtrl.setSimulationActive(false);
		} catch (VMCSException e) {
			throw new VMCSException(e);
		}
	}

	public void initialize() throws VMCSException {
		try {
			Environment.initialize(propertyFile);
			
			//Changes by Vipul
			/**Commented as part of factory implementation**/
//			CashPropertyLoader cashLoader = new CashPropertyLoader(Environment.getCashPropFile());
//			DrinkPropertyLoader drinksLoader = new DrinkPropertyLoader(Environment.getDrinkPropFile());
			
			/**Abstract Factory Implementation Starts**/
			System.out.println("AbstractInitFactory ai = FactoryMaker.getFactory(Environment.getFactoryType());"+Environment.getFactoryType());
			AbstractInitFactory ai = FactoryMaker.getFactory(Environment.getFactoryType());
			
			System.out.println("AbstractCashLoader cashLoader = ai.createCashLoader();"+Environment.getCashPropFile());
			AbstractCashLoader cashLoader = ai.createCashLoader(Environment.getCashPropFile());
			
			System.out.println("AbstractDrinksLoader drinksLoader = createDrinkLoader();"+Environment.getDrinkPropFile());
			AbstractDrinksLoader drinksLoader = ai.createDrinkLoader(Environment.getDrinkPropFile());
			/**Abstract Factory Implementation ENDS**/
			
			cashLoader.initialize();
			drinksLoader.initialize();
			storeCtrl = new StoreController(cashLoader, drinksLoader);
			storeCtrl.initialize();
			simulatorCtrl = new SimulationController(this);
			machineryCtrl = new MachineryController(this);
			machineryCtrl.initialize();
			maintenanceCtrl = new MaintenanceController(this);
			transactionCtrl=new TransactionController(this, storeCtrl);
			transactionCtrl.initialize();
			
		} catch (IOException e) {
			throw new VMCSException(
				"MainController.initialize",
				e.getMessage());
		}
	}

	public SimulationController getSimulationController() {
		return simulatorCtrl;
	}

	public SimulatorControlPanel getSimulatorControlPanel() {
		return simulatorCtrl.getSimulatorControlPanel();
	}

	public StoreController getStoreController() {
		return storeCtrl;
	}

	public MachineryController getMachineryController() {
		return machineryCtrl;
	}

	public MaintenanceController getMaintenanceController() {
		return maintenanceCtrl;
	}

	public void closeDown() {
		try {
			storeCtrl.closeDown();
		} catch (Exception e) {
			System.out.println("Error closing down the stores: " + e);
		}
		machineryCtrl.closeDown();
		maintenanceCtrl.closeDown();
		simulatorCtrl.closeDown();
	}

	public TransactionController getTransactionCtrl() {
		return transactionCtrl;
	}

	public void setTransactionCtrl(TransactionController customerCtrl) {
		this.transactionCtrl = customerCtrl;
	}
}
