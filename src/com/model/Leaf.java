package com.model;

import com.iterator.StudentIterator;

public class Leaf implements College {
	
	private String id;
	private int englishAbility;
	private int programAbility;
	
	public Leaf(String id, int englishAbility, int programAbility) {
		this.id = id;
		this.englishAbility = englishAbility;
		this.programAbility = programAbility;
	}
	
	public String getInfo() {
		String info = "";
		info = "學號 : " + this.id;
		info = info + "\t英文能力 : " + this.englishAbility;
		info = info + "\t程式能力 : " + this.programAbility;
		return info;
	}

	@Override
	public StudentIterator getIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
