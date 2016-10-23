package com.strategy;

import java.util.List;

import com.model.Leaf;

public class ContextStrategy {
	
	private IStrategy strategy;
	
	public ContextStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void grouping() {
		this.strategy.grouping();
	}
	
	public void setList(List<Leaf> leafList) {
		this.strategy.setList(leafList);
	}
	
}
