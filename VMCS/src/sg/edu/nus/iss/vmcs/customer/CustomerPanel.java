package sg.edu.nus.iss.vmcs.customer;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class CustomerPanel extends Dialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9210551434582978969L;
	
	
	private TransactionController transCtrl;
	private CoinInputBox coinInputBox;
	private DrinkSelectionBox drinkSelectionBox=new DrinkSelectionBox();
	private Button btnTerminate=new Button("Terminate and Return Cash");
	private TextField txtNoChangeAvail=new TextField("No Change Available");
	private Label lblCollectCoins=new Label("Collect Coins: ");
	private TextField txtCollectCoin=new TextField("0 C");
	private Label lblCollectCan=new Label("Collect Can Here: ");
	private TextField txtCollectCan=new TextField("No Can ");
	private FaultDetectionPanel faultDetection;
	public CustomerPanel(Frame owner, TransactionController transCtrl) {
		
		super(owner);
		// TODO Auto-generated constructor stub
		this.transCtrl= transCtrl;
		coinInputBox = new CoinInputBox(transCtrl);
		initComponent();
		
	}
	
	
	public void initComponent()
	{
		FlowLayout fl=new FlowLayout();
		
		this.setLayout(fl);
		Panel p=new Panel();
		p.setLayout(new GridLayout(0,1));
		p.add(coinInputBox);
		p.add(drinkSelectionBox);
		
		
		Panel nochange=new Panel();
		nochange.setPreferredSize(new Dimension(100,100));
		BoxLayout box=new BoxLayout(nochange,BoxLayout.PAGE_AXIS);
		BorderLayout border=new BorderLayout();
		
		nochange.setLayout(border);
		txtNoChangeAvail.setPreferredSize(new Dimension(10,50));
		
		nochange.add(txtNoChangeAvail,BorderLayout.NORTH);
		nochange.add(btnTerminate,BorderLayout.SOUTH);
		p.add(nochange);
		btnTerminate.addActionListener(new CustomerPanelTerminateButtonListener(transCtrl));
		
		
		Panel coin=new Panel();
		coin.add(lblCollectCoins);
		txtCollectCoin.setPreferredSize(new Dimension(10,30));
	    coin.add(txtCollectCoin);
	    p.add(coin);
	    Panel bottom=new Panel();
	    
	    bottom.setLayout(new BorderLayout());
	     setFaultDetection(new FaultDetectionPanel());
	     bottom.add(faultDetection,BorderLayout.SOUTH);
	    Panel can=new Panel();
	   
		can.add(lblCollectCan);
		txtCollectCan.setPreferredSize(new Dimension(10,30));
		can.add(txtCollectCan,BorderLayout.CENTER);
		bottom.add(can);
		p.add(bottom);
		
		this.add(p);
		pack();
		
		final Dialog d=this;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				d.dispose();
			}
		});
		
		
		this.setVisible(true);
		
		
	}


	public CoinInputBox getCoinInputBox() {
		return coinInputBox;
	}


	public DrinkSelectionBox getDrinkSelectionBox() {
		return drinkSelectionBox;
	}


	public Button getBtnTerminate() {
		return btnTerminate;
	}


	public TextField getTxtNoChangeAvail() {
		return txtNoChangeAvail;
	}


	public Label getLblCollectCoins() {
		return lblCollectCoins;
	}


	public TextField getTxtCollectCoin() {
		return txtCollectCoin;
	}


	public Label getLblCollectCan() {
		return lblCollectCan;
	}


	public TextField getTxtCollectCan() {
		return txtCollectCan;
	}


	public void setCoinInputBox(CoinInputBox coinInputBox) {
		this.coinInputBox = coinInputBox;
	}


	public void setDrinkSelectionBox(DrinkSelectionBox drinkSelectionBox) {
		this.drinkSelectionBox = drinkSelectionBox;
	}


	public void setBtnTerminate(Button btnTerminate) {
		this.btnTerminate = btnTerminate;
	}


	public void setTxtNoChangeAvail(TextField txtNoChangeAvail) {
		this.txtNoChangeAvail = txtNoChangeAvail;
	}


	public void setLblCollectCoins(Label lblCollectCoins) {
		this.lblCollectCoins = lblCollectCoins;
	}


	public void setTxtCollectCoin(TextField txtCollectCoin) {
		this.txtCollectCoin = txtCollectCoin;
	}


	public void setLblCollectCan(Label lblCollectCan) {
		this.lblCollectCan = lblCollectCan;
	}


	public void setTxtCollectCan(TextField txtCollectCan) {
		this.txtCollectCan = txtCollectCan;
	}


	public FaultDetectionPanel getFaultDetection() {
		return faultDetection;
	}


	public void setFaultDetection(FaultDetectionPanel faultDetection) {
		this.faultDetection = faultDetection;
	}


	public TransactionController getTransactionController() {
		return transCtrl;
	}


	public void setTransactionController(TransactionController transCtrl) {
		this.transCtrl = transCtrl;
	}
	
	
	

}
