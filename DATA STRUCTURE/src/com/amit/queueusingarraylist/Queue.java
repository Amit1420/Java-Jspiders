package com.amit.queueusingarraylist;

import java.util.EmptyStackException;

public class Queue {
	private Object[] a=new Object[5];
	private int p=0;
	
	public void add(Object e)
	{
		if(p>=a.length) increase();
		a[p++]=e;
	}
	public Object poll()
	{
		if(isEmpty()) throw new EmptyStackException();
		Object e=a[0];
		a[0]=null;
		Object[] temp=new Object[a.length-1];
		System.arraycopy(a, 1, temp, 0, a.length-1);
		a=temp;
		p--;
		return e;
	}
	public Object peek()
	{
		if(isEmpty()) throw new EmptyStackException();
		return a[0];
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
