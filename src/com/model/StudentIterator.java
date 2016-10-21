package com.model;

public class StudentIterator<T> implements Iterator<T> {
	
	private StudentList<T> studentList;
	private int index;
	
	public StudentIterator(StudentList<T> studentList) {
        this.studentList = studentList;
        this.index = 0;
    }

	@Override
	public boolean hasNext() {
        return index < studentList;
	}

	@Override
	public T next() {
		if(hasNext()){
            return studentList[index++];        
        }
        throw new IndexOutOfBoundsException();
	}
	
}
