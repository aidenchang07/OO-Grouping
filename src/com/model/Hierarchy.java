package com.model;

import java.util.ArrayList;
import com.iterator.StudentIterator;

public class Hierarchy implements College {
	
	private String studentType;
	private ArrayList<College> list;
	
	public Hierarchy(String studentType) {
		this.studentType = studentType;
		this.list = new ArrayList<College>();
	}
	
	@Override
	public String getInfo() {
		String info = "";
		info = this.studentType;
		return info;
	}
	
	public boolean add(College child) {
		this.list.add(child);
		return true;
    }

    public boolean remove(College child) {
    	this.list.remove(child);
    	return true;
    }
    
    public StudentIterator getIterator() {
    	return new StudentIterator(this.list);
    }

}
