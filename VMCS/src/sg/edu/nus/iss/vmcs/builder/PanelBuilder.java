package sg.edu.nus.iss.vmcs.builder;
import java.awt.Component;
import java.awt.Dialog;


public interface  PanelBuilder {
	

	public abstract void buildPanel();
	public abstract void buildControls();

	public abstract Dialog getPanel();
    
}
