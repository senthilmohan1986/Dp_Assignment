package sg.edu.nus.iss.vmcs.customer;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;

import sg.edu.nus.iss.vmcs.store.Coin;
public class CoinInputBox extends Panel {
	
	private static final long serialVersionUID = 1L;
	
	private TransactionController transCtrl;
	
	private CoinReceiver receiver;
	
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
	
	//private TextField txtInvalidCoin;
	private Label lbalTotalInserted;
	//private TextField txtInserted;
	
	private ObserverLabel invalidCoin;
	
	private ObserverLabel totalCost;
	
	
	
	
	public ObserverLabel getInvalidCoin() {
		return invalidCoin;
	}

	public void setInvalidCoin(ObserverLabel invalidCoin) {
		this.invalidCoin = invalidCoin;
	}

	public ObserverLabel getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(ObserverLabel totalCost) {
		this.totalCost = totalCost;
	}

	public TransactionController getTransCtrl() {
		return transCtrl;
	}

	public void setTransCtrl(TransactionController transCtrl) {
		this.transCtrl = transCtrl;
	}

	public CoinInputBox(TransactionController transCtrl) {
		super();
		this.transCtrl = transCtrl;
		 this.receiver = new CoinReceiver(transCtrl, this);
		 
		CoinInputListener fiveCentListener=new CoinInputListener(receiver, this,CoinType.FIVE);
		CoinInputListener tenCentListener=new CoinInputListener(receiver, this,CoinType.TEN);
		CoinInputListener twentyCentListener=new CoinInputListener(receiver, this,CoinType.TWENTY);
		CoinInputListener fiftyCentListener=new CoinInputListener(receiver, this,CoinType.FIFTY);
		CoinInputListener oneDollarListener=new CoinInputListener(receiver, this,CoinType.ONE_DOLLAR);
		CoinInputListener invalidCoinListener=new CoinInputListener(receiver, this,CoinType.INVALID);
		
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
		 btnInvalidCoin=new Button("3 $");
		 btnOneDollar.addActionListener(oneDollarListener);
		 btnInvalidCoin.addActionListener(invalidCoinListener);
		 
		
		 
		 invalidCoin = new ObserverLabel("Invalid Coin", receiver) {
			
			@Override
			public void update(boolean status, Coin o) {
				System.out.println("Success for invalid");
				if (o == null) {
					this.getLabel().setBackground(Color.red);
				//	this.getLabel().setText("Success");
					this.getLabel().setOpaque(true);
					this.getParent().repaint();
				}
			}
		};
		 
		// txtInvalidCoin=new TextField("Invalid Coin");
			lbalTotalInserted=new Label("Total Money Inserted");	
			
			totalCost = new ObserverLabel("00.00",receiver) {
				
				@Override
				public void update(boolean status, Coin o) {
					System.out.println("success for total amt");
					 DecimalFormat df = new DecimalFormat("##.##");
					if (o != null) {
						double presentValue = 0;
						if (this.getLabel().getText() != null &&  !this.getLabel().getText().isEmpty()) {
							presentValue = Double.parseDouble(this.getLabel().getText());
						}
						Double totalValue = presentValue + o.getValue()/ 100f;
						//this.getLabel().setBackground(Color.red);
						this.getLabel().setPreferredSize(new Dimension(100, 20));
						System.out.println(Double.toString(totalValue));
						this.getLabel().setText(df.format(totalValue));
						
						this.getLabel().setOpaque(true);
						this.getParent().repaint();

					}
				}
			};
		
		//	txtInserted=new TextField("");
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
		/* Panel invalid=new Panel();
		 invalid.add(txtInvalidCoin);*/
		 add(invalidCoin);
		/* Panel inserted=new Panel();
		 inserted.add(lbalTotalInserted);
		 txtInserted.setPreferredSize(new Dimension(100,20));
		 inserted.add(txtInserted);*/
		 add(totalCost);
		 
		
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
	/*public TextField getTxtInvalidCoin() {
		return txtInvalidCoin;
	}
	public void setTxtInvalidCoin(TextField txtInvalidCoin) {
		this.txtInvalidCoin = txtInvalidCoin;
	}*/
	public Label getLbalTotalInserted() {
		return lbalTotalInserted;
	}
	public void setLbalTotalInserted(Label lbalTotalInserted) {
		this.lbalTotalInserted = lbalTotalInserted;
	}
	/*public TextField getTxtInserted() {
		return txtInserted;
	}
	public void setTxtInserted(TextField txtInserted) {
		this.txtInserted = txtInserted;
	}*/
	

}
