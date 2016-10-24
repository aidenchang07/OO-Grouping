package com.strategy;

import java.util.List;
import com.model.Leaf;

public class ContextStrategy {
	
	private IStrategy strategy;
	
	public ContextStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void grouping(List<Leaf> leafList) {
		this.strategy.grouping(leafList);
	}
	
}
