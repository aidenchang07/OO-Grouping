package com.model;

public class FourYearCollege implements StudentInterface {
	
	private String id;
	private int englishAbility;
	private int programAbility;
	
	public FourYearCollege(String id, int englishAbility, int programAbility) {
		this.id = id;
		this.englishAbility = englishAbility;
		this.programAbility = programAbility;
	}
	
	@Override
	public void PayInformation() {
		
	}

}
