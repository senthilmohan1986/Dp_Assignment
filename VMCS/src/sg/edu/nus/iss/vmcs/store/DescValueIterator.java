package sg.edu.nus.iss.vmcs.store;

import java.util.Set;
import java.util.TreeSet;

public class DescValueIterator extends StoreIterator{

	private CashStore store;
	private Set<StoreItem> itemList;
	
	public DescValueIterator(){
		
	}
	
	public DescValueIterator(CashStore store){
		this.store = store;
		itemList = new TreeSet<StoreItem>();
		StoreItem[] itemArr = store.getItems();
		for(StoreItem tmpItem : itemArr){
			itemList.add(tmpItem);
		}
		first();
	}
	
	@Override
	public void first() {
		setIt(itemList.iterator());
		nextItem();
	}
}
