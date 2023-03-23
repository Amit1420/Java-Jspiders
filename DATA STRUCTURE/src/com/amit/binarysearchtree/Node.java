package com.amit.binarysearchtree;

public class Node {
Object key;
Node left;
Node right;
public Node(Object k)
{
	key=k;
}
public Node(Object key, Node left, Node right) {
	this.key = key;
	this.left = left;
	this.right = right;
}

}
