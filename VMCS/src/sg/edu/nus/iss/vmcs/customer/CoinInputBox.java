package sg.edu.nus.iss.vmcs.customer;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;
import java.awt.Button;
public class CoinInputBox extends Panel {
	
	private static final long serialVersionUID = 1L;
	
	public int totalAmount;
	
	public void setActive(Boolean state)
	{
		this.setEnabled(state);
	}
	
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	private Label txtEnterCoinHere;
	
	private Button btnFiveCent;
	private Button btnTenCent;
	private Button btnTwentyCent;
	private Button btnFiftyCent;
	private Button btnOneDollar;
	private Button btnInvalidCoin;
	
	private TextField txtInvalidCoin;
	private Label lbalTotalInserted;
	private TextField txtInserted;
	
	
	
	
	
	public CoinInputBox() {
		super();
		
		CoinInputListener fiveCentListener=new CoinInputListener(this,CoinType.FIVE);
		CoinInputListener tenCentListener=new CoinInputListener(this,CoinType.TEN);
		CoinInputListener twentyCentListener=new CoinInputListener(this,CoinType.TWENTY);
		CoinInputListener fiftyCentListener=new CoinInputListener(this,CoinType.FIFTY);
		CoinInputListener oneDollarListener=new CoinInputListener(this,CoinType.ONE_DOLLAR);
		CoinInputListener invalidCoinListener=new CoinInputListener(this,CoinType.INVALID);
		txtEnterCoinHere=new Label("Enter coin here: ");
		 btnFiveCent=new Button("5 ¢");
		 
		 btnTenCent=new Button("10 ¢");
		 btnFiveCent.addActionListener(fiveCentListener);
		 btnTwentyCent=new Button("20 ¢");
		 btnTenCent.addActionListener(tenCentListener);
		 btnFiftyCent=new Button("50 ¢");
		 btnTwentyCent.addActionListener(twentyCentListener);
		 btnOneDollar=new Button("1 $");
		 btnFiftyCent.addActionListener(fiftyCentListener);
		 btnInvalidCoin=new Button("Invalid");
		 btnOneDollar.addActionListener(oneDollarListener);
		 btnInvalidCoin.addActionListener(invalidCoinListener);
		 
		 txtInvalidCoin=new TextField("Invalid Coin");
			lbalTotalInserted=new Label("Total Money Inserted");	
			txtInserted=new TextField("");
	     setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
	     add(txtEnterCoinHere);
	     Panel coin=new Panel(new FlowLayout());
		 coin.add(btnFiveCent);
		coin. add(btnTenCent);
		coin. add(btnTwentyCent);
		coin. add(btnFiftyCent);
		coin. add(btnOneDollar);
		coin. add(btnInvalidCoin);
		add(coin);
		 Panel invalid=new Panel();
		 invalid.add(txtInvalidCoin);
		 add(invalid);
		 Panel inserted=new Panel();
		 inserted.add(lbalTotalInserted);
		 txtInserted.setPreferredSize(new Dimension(100,20));
		 inserted.add(txtInserted);
		 add(inserted);
		 
		
	}
	public Button getBtnFiveCent() {
		return btnFiveCent;
	}
	public void setBtnFiveCent(Button btnFiveCent) {
		this.btnFiveCent = btnFiveCent;
	}
	public Button getBtnTenCent() {
		return btnTenCent;
	}
	public void setBtnTenCent(Button btnTenCent) {
		this.btnTenCent = btnTenCent;
	}
	public Button getBtnTwentyCent() {
		return btnTwentyCent;
	}
	public void setBtnTwentyCent(Button btnTwentyCent) {
		this.btnTwentyCent = btnTwentyCent;
	}
	public Button getBtnFiftyCent() {
		return btnFiftyCent;
	}
	public void setBtnFiftyCent(Button btnFiftyCent) {
		this.btnFiftyCent = btnFiftyCent;
	}
	public Button getBtnOneDollar() {
		return btnOneDollar;
	}
	public void setBtnOneDollar(Button btnOneDollar) {
		this.btnOneDollar = btnOneDollar;
	}
	public Button getBtnInvalidCoin() {
		return btnInvalidCoin;
	}
	public void setBtnInvalidCoin(Button btnInvalidCoin) {
		this.btnInvalidCoin = btnInvalidCoin;
	}
	public TextField getTxtInvalidCoin() {
		return txtInvalidCoin;
	}
	public void setTxtInvalidCoin(TextField txtInvalidCoin) {
		this.txtInvalidCoin = txtInvalidCoin;
	}
	public Label getLbalTotalInserted() {
		return lbalTotalInserted;
	}
	public void setLbalTotalInserted(Label lbalTotalInserted) {
		this.lbalTotalInserted = lbalTotalInserted;
	}
	public TextField getTxtInserted() {
		return txtInserted;
	}
	public void setTxtInserted(TextField txtInserted) {
		this.txtInserted = txtInserted;
	}
	

}
