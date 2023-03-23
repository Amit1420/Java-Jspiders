package com.amit.hashset;

public class Node {
	Object key;
	Node next;
	
	Node(Object k)
	{
		key=k;
	}

	public Node(Object k, Node n) {
		key = k;
		next = n;
	}
	

}
