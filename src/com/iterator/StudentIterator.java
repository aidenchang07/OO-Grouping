package com.iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import com.composite.College;

public class StudentIterator implements IStudentIterator {
	
	private ArrayList<College> list;
	private int index;
	
	public StudentIterator(ArrayList<College> list) {
        this.list = list;
        this.index = 0;
    }

	@Override
	public boolean hasNext() {
		if(index < list.size()) {
			return true;
		} else {
			index = 0;
			return false;
		}
	}

	@Override
	public College next() {
		if(hasNext()) {
			return this.list.get(index++);
		} else {
			throw new NoSuchElementException();
		}
	}
	
}
