package sg.edu.nus.iss.vmcs.customer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Stroke;
import java.awt.TextField;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import sg.edu.nus.iss.vmcs.machinery.StoreViewerListener;
import sg.edu.nus.iss.vmcs.store.Store;
import sg.edu.nus.iss.vmcs.store.StoreController;
import sg.edu.nus.iss.vmcs.store.StoreItem;
import sg.edu.nus.iss.vmcs.util.LabelledDisplay;

public class DrinkSelectionBox extends Panel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5331267538227219978L;
	/*private Button btnCoca=new Button("Coca-Cola");
	private Button btnFanta=new Button("Fanta");
	private Button btnSari=new Button("Sari");
	private Button btnSoyaBean=new Button("Soya Bean");
	private Button btnCocaCola=new Button("Coca-cola");
	
	private TextField txtCoca=new TextField("Coca-Cola");
	private TextField txtFanta=new TextField("Fanta");
	private TextField txtSari=new TextField("Sari");
	private TextField txtSoyaBean=new TextField("Soya Bean");
	private TextField txtCocaCola=new TextField("Coca-cola");
	
	private TextField txtCocaStatus=new TextField("NOT IN STOCK");
	private TextField txtFantaStatus=new TextField("NOT IN STOCK");
	private TextField txtSariStatus=new TextField("NOT IN STOCK");
	private TextField txtSoyaBeanStatus=new TextField("NOT IN STOCK");
	private TextField txtCocaColaStatus=new TextField("NOT IN STOCK");*/
	Panel panelDrinkSelect = new Panel(new BorderLayout());
	private Label drinkSelectedLabel = new  Label("\nSelected Drink");
	private Label drinkSelected = new  Label();
	
	
	public Label getDrinkSelected() {
		return drinkSelected;
	}

	public void setDrinkSelected(Label drinkSelected) {
		this.drinkSelected = drinkSelected;
		
		
	}
	
	private StoreController storeCtrl;
	
	
	public DrinkSelectionBox(StoreController storeCtrl)
	{
		this.storeCtrl = storeCtrl;
		//FlowLayout grid = new FlowLayout();	//	
		GridLayout grid=new GridLayout(0,2);grid.setHgap(50);grid.setVgap(2);
		this.setBounds(10,10,10,10);
		Properties prop=new Properties();
		try{
		InputStream ip=new FileInputStream("DrinkPropertyFile.txt");
		prop.load(ip);
		Panel p=new Panel(grid);
		StoreItem[] storeItem = storeCtrl.getStoreItems(Store.DRINK);

		for (int i = 0; i < storeCtrl.getStoreSize(Store.DRINK); i++) {
			String price = "Price" + (i+1);
			String drinkName = "Name" + (i+1);
			String drinkContent =  storeItem[i].getContent().getName() + "-(" + prop.get(price) + "C)";	
			Button drink = new Button(drinkContent);
				if (storeItem[i].getContent().getName().equals(prop.getProperty(drinkName))) {
					drink.setName(drinkName);
					System.out.println(drinkName);
			}
//			drink.setName(name)
			drink.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println(arg0.getActionCommand() + ((Button)(arg0.getSource())).getLabel());
					drinkSelected.setText(arg0.getActionCommand());
					drinkSelected.setBackground(Color.green);
					
				}
			});
			
			p.add(drink);
			p.add(new Panel());
		}

	panelDrinkSelect.add(drinkSelectedLabel, BorderLayout.LINE_START);
		panelDrinkSelect.add(drinkSelected, BorderLayout.CENTER);
		drinkSelected.setFont(new Font("ARIAL", 1, 12));
//		panelDrinkSelect.setBackground(Color.white);

		/*p.add(btnCoca);
		p.add(setBlackTheme(txtCoca));
		p.add(setDisableTheme(txtCocaStatus));
		
		p.add(btnFanta);
		p.add(setBlackTheme(txtFanta));
		p.add(setDisableTheme(txtFantaStatus));
		p.add(btnSari);
		p.add(setBlackTheme(txtSari));
		p.add(setDisableTheme(txtSariStatus));
		p.add(btnSoyaBean);
		p.add(setBlackTheme(txtSoyaBean));
		p.add(setDisableTheme(txtSoyaBeanStatus));
		
		p.add(btnCocaCola);
		p.add(setBlackTheme(txtCocaCola));		
		p.add(setDisableTheme(txtCocaColaStatus));
		*/
		setLayout(new BorderLayout()); 
		add(p, BorderLayout.NORTH);
		add(panelDrinkSelect, BorderLayout.CENTER);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	   
	}
	
	//private void initializeDrinks() {
		
			/*String name = storeItem[i].getContent().getName();
			viewItems[i] = new LabelledDisplay(name,
						LabelledDisplay.DEFAULT,
						LabelledDisplay.GRID);
			viewItems[i].addListener(
                        new StoreViewerListener(type, i, storeCtrl));
			this.add(viewItems[i]);*/
//		}
//	}

	/*public Button getBtnCoca() {
		return btnCoca;
	}

	public Button getBtnFanta() {
		return btnFanta;
	}

	public Button getBtnSari() {
		return btnSari;
	}

	public Button getBtnSoyaBean() {
		return btnSoyaBean;
	}

	public Button getBtnCocaCola() {
		return btnCocaCola;
	}

	public TextField getTxtCoca() {
		return txtCoca;
	}

	public TextField getTxtFanta() {
		return txtFanta;
	}

	public TextField getTxtSari() {
		return txtSari;
	}

	public TextField getTxtSoyaBean() {
		return txtSoyaBean;
	}

	public TextField getTxtCocaCola() {
		return txtCocaCola;
	}

	public TextField getTxtCocaStatus() {
		return txtCocaStatus;
	}

	public TextField getTxtFantaStatus() {
		return txtFantaStatus;
	}

	public TextField getTxtSariStatus() {
		return txtSariStatus;
	}

	public TextField getTxtSoyaBeanStatus() {
		return txtSoyaBeanStatus;
	}

	public TextField getTxtCocaColaStatus() {
		return txtCocaColaStatus;
	}

	public void setBtnCoca(Button btnCoca) {
		this.btnCoca = btnCoca;
	}

	public void setBtnFanta(Button btnFanta) {
		this.btnFanta = btnFanta;
	}

	public void setBtnSari(Button btnSari) {
		this.btnSari = btnSari;
	}

	public void setBtnSoyaBean(Button btnSoyaBean) {
		this.btnSoyaBean = btnSoyaBean;
	}

	public void setBtnCocaCola(Button btnCocaCola) {
		this.btnCocaCola = btnCocaCola;
	}

	public void setTxtCoca(TextField txtCoca) {
		this.txtCoca = txtCoca;
	}

	public void setTxtFanta(TextField txtFanta) {
		this.txtFanta = txtFanta;
	}

	public void setTxtSari(TextField txtSari) {
		this.txtSari = txtSari;
	}

	public void setTxtSoyaBean(TextField txtSoyaBean) {
		this.txtSoyaBean = txtSoyaBean;
	}

	public void setTxtCocaCola(TextField txtCocaCola) {
		this.txtCocaCola = txtCocaCola;
	}

	public void setTxtCocaStatus(TextField txtCocaStatus) {
		this.txtCocaStatus = txtCocaStatus;
	}

	public void setTxtFantaStatus(TextField txtFantaStatus) {
		this.txtFantaStatus = txtFantaStatus;
	}

	public void setTxtSariStatus(TextField txtSariStatus) {
		this.txtSariStatus = txtSariStatus;
	}

	public void setTxtSoyaBeanStatus(TextField txtSoyaBeanStatus) {
		this.txtSoyaBeanStatus = txtSoyaBeanStatus;
	}

	public void setTxtCocaColaStatus(TextField txtCocaColaStatus) {
		this.txtCocaColaStatus = txtCocaColaStatus;
	}*/
	
	
	private TextField setBlackTheme(TextField b)
	{
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		return b;
		
	}
	private TextField setDisableTheme(TextField b)
	{
		b.setBackground(Color.BLACK);
		b.setForeground(Color.DARK_GRAY);
	
		return b;
		
	}
	
	public void setActive(boolean isActive)
	{
		this.setEnabled(isActive);
	}
}
