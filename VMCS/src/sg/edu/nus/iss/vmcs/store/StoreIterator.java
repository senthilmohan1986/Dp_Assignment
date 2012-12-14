package sg.edu.nus.iss.vmcs.store;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class StoreIterator {

	private Store store;
	private StoreItem item;
	private Iterator<StoreItem> it;
	
	public StoreIterator(){
		
	}
	
	public StoreIterator(Store store){
		this.store = store;
	}
	
	public abstract void first();
	
	public StoreItem nextItem(){
		try{
			item = it.next();
			//System.out.println("Iterator Pattern ==> " + item.getContent().getName() + " / " + item.getContent().getDenomination());
		}
		catch(NoSuchElementException e){
			item = null;
		}
		return item;
	}
	
	public boolean hasNextItem(){
		return it.hasNext();
	}
	
	public StoreItem getCurrentItem(){
		return item;
	}

	public Iterator<StoreItem> getIt() {
		return it;
	}

	public void setIt(Iterator<StoreItem> it) {
		this.it = it;
	}
}
