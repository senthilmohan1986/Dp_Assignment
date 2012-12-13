//@author vipul
package sg.edu.nus.iss.vmcs.system;

public class FactoryMaker {
	private static AbstractInitFactory pf=null;
	static AbstractInitFactory getFactory(String choice){
		if(choice.equals("db")){
			pf=new DBInitFactory();
		}else{
			pf = new FileInitFactory();
		}
			return pf;
	}
}
