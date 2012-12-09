package sg.edu.nus.iss.vmcs.customer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoinInputListener implements ActionListener {

	private CoinType coinType;
	private int number;
	private int totalAMount;
	public CoinInputBox getBox() {
		return box;
	}

	public void setBox(CoinInputBox box) {
		this.box = box;
	}

	private CoinInputBox box;
    public CoinInputListener(CoinInputBox box,CoinType CoinType)
    {
    	this.box=box;
    	this.coinType=CoinType;
    	
    }
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if(this.getCoinType().getValue()!=-1)
		{
	
		this.totalAMount=box.getTotalAmount()+getCoinType().getValue();
	
		
		box.setTotalAmount(totalAMount);
		float total=this.getTotalAMount()/100f;
		
		box.getTxtInserted().setText(String.valueOf(total));
		box.getTxtInvalidCoin().setBackground(Color.white);
		}
		else
		{
			box.getTxtInvalidCoin().setBackground(Color.red);
			
			
		}
	}





	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}

	public CoinType getCoinType() {
		return coinType;
	}

	public void setCoinType(CoinType coinType) {
		this.coinType = coinType;
	}

	public int getTotalAMount() {
		return totalAMount;
	}

	public void setTotalAMount(int totalAMount) {
		this.totalAMount = totalAMount;
	}
	
	

}
