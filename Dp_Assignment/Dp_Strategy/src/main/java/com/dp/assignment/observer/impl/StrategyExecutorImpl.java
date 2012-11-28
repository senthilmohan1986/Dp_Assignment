package com.dp.assignment.observer.impl;

import com.dp.assignment.interfaces.IExecutorPatterns;

public class StrategyExecutorImpl implements IExecutorPatterns{

	public void processRequest() {
		System.out.println("Strategy - process Request");
	}	
}
