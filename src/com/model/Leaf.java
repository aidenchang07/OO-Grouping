package com.model;

public class Leaf implements College, Comparable<Leaf> {
	
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
		info = info + "," + this.englishAbility;
		info = info + "," + this.programAbility;
		return info;
	}

	public String getId() {
		return id;
	}

	public int getEnglishAbility() {
		return englishAbility;
	}

	public int getProgramAbility() {
		return programAbility;
	}

	@Override
	public int compareTo(Leaf o) {
		return o.englishAbility - this.englishAbility;
	}
	
	@Override
    public String toString() {
        return String.format("(%s, %d, %d)", id, englishAbility, programAbility);
    }
	
}
