package sg.edu.nus.iss.vmcs.builder;
import java.awt.Dialog;

import com.dp.assignment.builder.frontend.panel.VMCSPanel;
public abstract class PanelBuilder {
	
	public PanelBuilder()
	{
		
	}
	public abstract void buildPanel();
	public abstract void buildControls();
	public abstract void buildDisplay();
	public abstract void buildCoinInput();
	public abstract void buildDrinkSelectionBox();
	public abstract Dialog getPanel();

}
