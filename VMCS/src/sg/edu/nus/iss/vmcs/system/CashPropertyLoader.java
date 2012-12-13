package sg.edu.nus.iss.vmcs.system;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import sg.edu.nus.iss.vmcs.store.*;

/**
 *
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class CashPropertyLoader extends AbstractCashLoader {

	private static final String NAME_LABEL     = "Name";
	private static final String WEIGHT_LABEL   = "Weight";
	private static final String VALUE_LABEL    = "Value";
	private static final String QUANTITY_LABEL = "Quantity";
	private static final String PROP_NUM_ITEMS = "NumOfItems";

	private Properties prop;
	private String fileName;

	public CashPropertyLoader(String filen) {
		System.out.println("CashPropertyLoader "+filen);
		this.fileName = filen;
	}

	public StoreItem getItem (int index) {
		int idx = index + 1;
		Coin coin = new Coin();

		String name = new String(NAME_LABEL + idx);
		String value = getValue(name);
		coin.setName(value);

		name = new String(WEIGHT_LABEL + idx);
		value = getValue(name);
		coin.setWeight(Double.parseDouble(value));

		name = new String(VALUE_LABEL + idx);
		value = getValue(name);
		coin.setValue(Integer.parseInt(value));

		name = new String(QUANTITY_LABEL + idx);
		value = getValue(name);
		int qty = Integer.parseInt(value);

		CashStoreItem item = new CashStoreItem(coin, qty);
		return item;
	}

	public void setItem(int index, StoreItem cashItem) {
		int idx = index + 1;

		CashStoreItem item = (CashStoreItem) cashItem;
		Coin cn = (Coin) item.getContent();
		String itn = new String(NAME_LABEL + idx);

		setValue(itn, cn.getName());

		itn = new String(WEIGHT_LABEL + idx);
		setValue(itn, String.valueOf(cn.getWeight()));

		itn = new String(VALUE_LABEL + idx);
		setValue(itn, String.valueOf(cn.getValue()));

		itn = new String(QUANTITY_LABEL + idx);
		setValue(itn, String.valueOf(item.getQuantity()));
	}
	

	public void initialize() throws IOException {
		prop = new Properties(System.getProperties());
		FileInputStream stream = new FileInputStream(fileName);
		prop.load(stream);
		stream.close();
	}

	public void saveProperty() throws IOException {
		FileOutputStream stream = new FileOutputStream(fileName);
		prop.store(stream, "");
		stream.close();
	}

	public int getNumOfItems() {
		String nm = prop.getProperty(PROP_NUM_ITEMS);
		int nmi;
		nmi = Integer.parseInt(nm);
		return nmi;
	}

	public void setNumOfItems(int vl) {
		prop.setProperty(PROP_NUM_ITEMS, String.valueOf(vl));
	}

	// Utility methoids for accessing the hashtable 

	public String getValue(String key) {
		return prop.getProperty(key);
	}

	public void setValue(String key, String value) {
		prop.setProperty(key, value);
	}


}