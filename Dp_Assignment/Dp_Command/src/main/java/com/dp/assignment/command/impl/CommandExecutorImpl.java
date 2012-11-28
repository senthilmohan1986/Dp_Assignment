package com.dp.assignment.command.impl;

import com.dp.assignment.interfaces.IExecutorPatterns;

public class CommandExecutorImpl implements IExecutorPatterns{

	public void processRequest() {
		System.out.println("Command - process Request");
	}	
}
