package sg.edu.nus.iss.vmcs.builder;
import java.awt.Component;
import java.awt.Dialog;


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
    protected void refreshPanel(Dialog d)
    {
      for(Component c: d.getComponents())
      {
    	c.repaint();c.setVisible(true);
      }
    }
}
