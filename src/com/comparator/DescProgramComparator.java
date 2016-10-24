package com.comparator;

import java.util.Comparator;
import com.composite.Leaf;

public class DescProgramComparator implements Comparator<Leaf> {
	
	@Override
	public int compare(Leaf o1, Leaf o2) {
		return o2.getProgramAbility() - o1.getProgramAbility();
	}
	
}
