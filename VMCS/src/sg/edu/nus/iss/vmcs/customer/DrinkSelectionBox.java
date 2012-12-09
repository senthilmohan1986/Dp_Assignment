package sg.edu.nus.iss.vmcs.customer;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

import java.awt.Button;

public class DrinkSelectionBox extends Panel{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5331267538227219978L;
	private Button btnCoca=new Button("Coca-Cola");
	private Button btnFanta=new Button("Fanta");
	private Button btnSari=new Button("Sari");
	private Button btnSoyaBean=new Button("Soya Bean");
	private Button btnCocaCola=new Button("Coca-cola");
	
	private TextField txtCoca=new TextField("Coca-Cola");
	private TextField txtFanta=new TextField("Fanta");
	private TextField txtSari=new TextField("Sari");
	private TextField txtSoyaBean=new TextField("Soya Bean");
	private TextField txtCocaCola=new TextField("Coca-cola");
	
	private TextField txtCocaStatus=new TextField("Coca-Cola");
	private TextField txtFantaStatus=new TextField("Fanta");
	private TextField txtSariStatus=new TextField("Sari");
	private TextField txtSoyaBeanStatus=new TextField("Soya Bean");
	private TextField txtCocaColaStatus=new TextField("Coca-cola");
	
	public DrinkSelectionBox()
	{
		
		GridLayout grid=new GridLayout(5,1); 
		grid.setHgap(50);
		Panel p=new Panel(grid);
		
		
		
		p.add(btnCoca);
		p.add(txtCoca);
		p.add(txtCocaStatus);
		
		p.add(btnFanta);
		p.add(txtFanta);
		p.add(txtFantaStatus);
		p.add(btnSari);
		p.add(txtSari);
		p.add(txtSariStatus);
		p.add(btnSoyaBean);
		p.add(txtSoyaBean);
		p.add(txtSoyaBeanStatus);
		
		p.add(btnCocaCola);
		p.add(txtCocaCola);		
		p.add(txtCocaColaStatus);
		
		add(p);
	   
	}

	public Button getBtnCoca() {
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
	}
	
	
}
