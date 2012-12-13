package sg.edu.nus.iss.vmcs.customer;

public class ChangeProcessor {

	//maintain a reference to the previous handler so, we can add the next one
		// this class allows us to add in new handlers at any stage.  
		private MakeChangeInterface previousMakeChangeInterface;
		public void addHandler(MakeChangeInterface makeChangeInterface){
			if(previousMakeChangeInterface != null){
				makeChangeInterface.setNext(makeChangeInterface);
			}
			previousMakeChangeInterface = makeChangeInterface;
		}
}
