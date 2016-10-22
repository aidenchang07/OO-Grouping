package com.iterator;

import java.util.ArrayList;
import com.model.College;

public class StudentIterator implements IStudentIterator {
	
	private ArrayList<College> list;
	private int index;
	
	public StudentIterator(ArrayList<College> list) {
        this.list = list;
        this.index = 0;
    }

	@Override
	public boolean hasNext() {
        return index < list.size();
	}

	@Override
	public College next() {
		return this.list.get(index++);
	}
	
	public ArrayList<College> getAllChildren() {
		return  this.list;
	}
	
}
