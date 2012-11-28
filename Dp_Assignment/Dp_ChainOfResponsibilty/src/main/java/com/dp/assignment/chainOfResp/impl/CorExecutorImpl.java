package com.dp.assignment.chainOfResp.impl;

import com.dp.assignment.interfaces.IExecutorPatterns;

public class CorExecutorImpl implements IExecutorPatterns{

	public void processRequest() {
		System.out.println("Chain Of Responsibility - process Request");
	}	
}
