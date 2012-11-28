package com.dp.assignment.abstractFactory.impl;

import com.dp.assignment.interfaces.IExecutorPatterns;

public class BuilderExecutorImpl implements IExecutorPatterns{

	public void processRequest() {
		System.out.println("Builder - process Request");
	}	
}
