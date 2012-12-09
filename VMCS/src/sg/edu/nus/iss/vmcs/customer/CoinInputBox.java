package sg.edu.nus.iss.vmcs.customer;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;
import java.awt.Button;
public class CoinInputBox extends Panel {
	
	private static final long serialVersionUID = 1L;
	
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
		txtEnterCoinHere=new Label("Enter coin here: ");
		 btnFiveCent=new Button("5 ¢");
		 btnTenCent=new Button("10 ¢");
		 btnTwentyCent=new Button("20 ¢");
		 btnFiftyCent=new Button("50 ¢");
		 btnOneDollar=new Button("1 $");
		 btnInvalidCoin=new Button("Invalid");
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
