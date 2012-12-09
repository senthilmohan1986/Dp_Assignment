package sg.edu.nus.iss.vmcs.customer;

public enum CoinType {

	FIVE(5),
	TWENTY(20),
	FIFTY(50),
	TEN(10),
	ONE_DOLLAR(100),
	INVALID(-1);

	public int value;
	private CoinType(int value)
	{
		
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
