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
		info = "�Ǹ� : " + this.id;
		info = info + "\t�^���O : " + this.englishAbility;
		info = info + "\t�{����O : " + this.programAbility;
		return info;
	}
	
}
