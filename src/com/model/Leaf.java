package com.model;

public class Leaf implements College {
	
	private String id;
	private int englishAbility;
	private int programAbility;
	
	public Leaf(String id, int englishAbility, int programAbility) {
		this.id = id;
		this.englishAbility = englishAbility;
		this.programAbility = programAbility;
	}
	
	@Override
	public String getInfo() {
		String info = "";
		info = this.id;
		info = info + ", " + this.englishAbility;
		info = info + ", " + this.programAbility;
		return info;
	}
	
}
