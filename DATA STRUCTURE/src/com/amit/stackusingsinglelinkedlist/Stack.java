package com.amit.stackusingsinglelinkedlist;

import java.util.EmptyStackException;

public class Stack {
	private Node first=null;
	private int count=0;
	
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		Node curr=first;
		curr=new Node(e,first);
		first=curr;
		count++;
	}
	public Object pop()
	{
		if(isEmpty()) throw new EmptyStackException();
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	public Object peek()
	{
		if(isEmpty()) throw new EmptyStackException();
		return first.ele;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
	public int size()
	{
		return count;
	}

}
