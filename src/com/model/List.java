package com.model;

public interface List {
	public void add();
	public void remove();
	public int getLength();
	@SuppressWarnings("rawtypes")
	public StudentIterator getIterator();
}
