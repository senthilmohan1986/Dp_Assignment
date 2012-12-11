package sg.edu.nus.iss.vmcs.builder.controller;

import java.awt.Dialog;

import sg.edu.nus.iss.vmcs.builder.PanelBuilder;



public class PanelSetupController {
	
	private PanelBuilder builder;
	
	
	public void setPanelBuilder(PanelBuilder builder)
	{
		this.builder=builder;
	}
	
	public Dialog getPanel()
	{
		return builder.getPanel();
	}
	
	public void constractPanel()
	{
		builder.buildDisplay();
		builder.buildControls();
		builder.buildPanel();
		
	}

}
