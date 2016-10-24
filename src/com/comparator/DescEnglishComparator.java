package com.comparator;

import java.util.Comparator;
import com.composite.Leaf;

public class DescEnglishComparator implements Comparator<Leaf> {

	@Override
	public int compare(Leaf o1, Leaf o2) {
		return o2.getEnglishAbility() - o1.getEnglishAbility();
	}

}
