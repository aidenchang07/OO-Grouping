package com.strategy;

public class ContextStrategy {
	
	private IStrategy strategy;
	
	public ContextStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void bestAbility() {
		this.strategy.bestAbility();
	}
	
}
