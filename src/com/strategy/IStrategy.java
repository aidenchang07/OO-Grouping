package com.strategy;

import java.util.List;
import com.model.Leaf;

public interface IStrategy {
	public void grouping(List<Leaf> leafList);
}
