package com.amit.doublylinkedlist;

public class Node {
	Object ele;
	Node next;
	Node prev;
	
	Node(Object e)
	{
		ele=e;
	}

	public Node(Object ele, Node next, Node prev) {
		this.ele = ele;
		this.next = next;
		this.prev = prev;
	}
	

}
