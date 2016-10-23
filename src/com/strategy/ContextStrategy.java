package com.strategy;

public class ContextStrategy {
	
	private IStrategy strategy;
	
	public ContextStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void grouping(String studentList) {
		this.strategy.grouping(studentList);
	}
	
}
