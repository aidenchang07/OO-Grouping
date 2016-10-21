package com.model;

import java.util.ArrayList;

public class StudentList<T> implements List {
	private int index = 0;
    private int size = 0;                
    private ArrayList<T> studentList;
    
    public StudentList() {
    	studentList = new ArrayList<T>();
    }

    public StudentIterator<T> getIterator(){
        return new StudentIterator<T>(this);
    }

	@Override
	public void add() {
		studentList.add(e);
	}
	
	@Override
	public void remove() {
		// Do Nothing
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
