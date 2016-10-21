package com.model;

public class TwoYearCollege implements StudentInterface {
	
	private String id;
	private int englishAbility;
	private int programAbility;
	
	public TwoYearCollege(String id, int englishAbility, int programAbility) {
		this.id = id;
		this.englishAbility = englishAbility;
		this.programAbility = programAbility;
	}

	@Override
	public void PayInformation() {
		
	}
	
}
