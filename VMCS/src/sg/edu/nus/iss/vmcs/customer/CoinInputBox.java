package sg.edu.nus.iss.vmcs.customer;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class CoinInputBox extends Panel {
	
	private static final long serialVersionUID = 1L;
	
	private Label txtEnterCoinHere;
	
	private JButton btnFiveCent;
	private JButton btnTenCent;
	private JButton btnTwentyCent;
	private JButton btnFiftyCent;
	private JButton btnOneDollar;
	private JButton btnInvalidCoin;
	
	private TextField txtInvalidCoin;
	private Label lbalTotalInserted;
	private TextField txtInserted;
	
	
	
	
	
	public CoinInputBox() {
		super();
		txtEnterCoinHere=new Label("Enter coin here: ");
		 btnFiveCent=new JButton("5 ¢");
		 btnTenCent=new JButton("10 ¢");
		 btnTwentyCent=new JButton("20 ¢");
		 btnFiftyCent=new JButton("50 ¢");
		 btnOneDollar=new JButton("1 $");
		 btnInvalidCoin=new JButton("Invalid");
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
	public JButton getBtnFiveCent() {
		return btnFiveCent;
	}
	public void setBtnFiveCent(JButton btnFiveCent) {
		this.btnFiveCent = btnFiveCent;
	}
	public JButton getBtnTenCent() {
		return btnTenCent;
	}
	public void setBtnTenCent(JButton btnTenCent) {
		this.btnTenCent = btnTenCent;
	}
	public JButton getBtnTwentyCent() {
		return btnTwentyCent;
	}
	public void setBtnTwentyCent(JButton btnTwentyCent) {
		this.btnTwentyCent = btnTwentyCent;
	}
	public JButton getBtnFiftyCent() {
		return btnFiftyCent;
	}
	public void setBtnFiftyCent(JButton btnFiftyCent) {
		this.btnFiftyCent = btnFiftyCent;
	}
	public JButton getBtnOneDollar() {
		return btnOneDollar;
	}
	public void setBtnOneDollar(JButton btnOneDollar) {
		this.btnOneDollar = btnOneDollar;
	}
	public JButton getBtnInvalidCoin() {
		return btnInvalidCoin;
	}
	public void setBtnInvalidCoin(JButton btnInvalidCoin) {
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
