package com.amit.queueusingsinglelinkedlist;

public class Queue {
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
		first=new Node(e,null);
		last=first;
		count++;
		return;
		}
		last.next=new Node(e,null);
		last=last.next;
		count++;
	}
	
	public int size()
	{
		return count;
	}
	public Object peek()
	{
		if(first==null) return null;
		return first.ele;
	}
	public Object poll()
	{
		if(first==null) return null;
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}

}
