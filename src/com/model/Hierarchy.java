package com.model;

import java.util.ArrayList;
import com.iterator.IStudentIterator;
import com.iterator.StudentIterator;

public class Hierarchy implements College {
	
	private String studentType;
	private ArrayList<College> list;
	
	public Hierarchy(String studentType) {
		this.studentType = studentType;
		list = new ArrayList<College>();
	}
	
	@Override
	public String getInfo() {
		String info = "";
		info = this.studentType;
		return info;
	}
	
	public void add(College child) {
		list.add(child);
    }

    public void remove(College child) {
    	list.remove(child);
    }
    
    public int getLength() {
        return list.size();
    }
    
    public IStudentIterator getIterator() {
    	return new StudentIterator(this.list);
    }

}
