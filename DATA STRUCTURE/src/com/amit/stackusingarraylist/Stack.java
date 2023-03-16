package com.amit.stackusingarraylist;

import java.util.EmptyStackException;

public class Stack {
	private Object[] a=new Object[5];
	private int p=0;
	
	public void push(Object e)
	{
		if(p>=a.length) increase();
		a[p++]=e;
	}
	public Object pop()
	{
		if(isEmpty()) throw new EmptyStackException();
		Object e=a[--p];
		return e;
	}
	public Object peek()
	{
		if(isEmpty()) throw new EmptyStackException();
		return a[p-1];
	}
	
	private void increase() 
	{
		Object[] temp=new Object[a.length+3];
	    System.arraycopy(a, 0, temp, 0, a.length);
	    a=temp;
	}
	public int size()
	{
		return p;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}


}
