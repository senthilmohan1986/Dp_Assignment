package sg.edu.nus.iss.vmcs.store;

import java.util.ArrayList;
import java.util.List;

public class NonZeroIterator extends StoreIterator{

	private CashStore store;
	private List<StoreItem> itemList;
	
	public NonZeroIterator(){
		
	}
	
	public NonZeroIterator(CashStore store){
		this.store = store;
		itemList = new ArrayList<StoreItem>();
		
		StoreItem[] itemArr = store.getItems();
		for(StoreItem tmpItem : itemArr){
			if(tmpItem.getQuantity() > 0){
				itemList.add(tmpItem);
			}
		}
		first();
	}

	@Override
	public void first() {
		setIt(itemList.iterator());
		nextItem();
	}
}
