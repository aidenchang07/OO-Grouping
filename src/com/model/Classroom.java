package com.model;

import java.util.ArrayList;

public class Classroom implements StudentInterface {
	
	private String name;
	private int englishAbility;
	private int programAbility;
	
	private ArrayList<StudentInterface> componentList;
	
	public Classroom(String name, int englishAbility, int programAbility) {
		this.name = name;
		this.englishAbility = englishAbility;
		this.programAbility = programAbility;
		componentList = new ArrayList<>();
	}

	@Override
	public void PayInformation() {
		
	}
	
	public void add(Classroom child) {
        componentList.add(child);
    }

    public void remove(Classroom child) {
        componentList.remove(child);
    }

    public StudentInterface getChild(int position) {
        return componentList.get(position);
    }
    
    public void allStudent() {
    	for (StudentInterface component : componentList) {
            
        }
    }

}
