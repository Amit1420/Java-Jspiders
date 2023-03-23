package com.amit.binarysearchtree;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	private Node root = null;
	private int count = 0;
	private boolean flag = false;
	private Comparator<Object> c = null;

	public BinarySearchTree() {

	}

	public BinarySearchTree(Comparator<Object> c) {
		this.c = c;
	}

	public boolean add(Object k) {
		root = addNode(root, k);
		return flag;
	}

	private Node addNode(Node n, Object k) {

		if (n == null) {
			n = new Node(k);
			flag = true;
			count++;
			return n;
		}

		if (compare(k, n.key) < 0) {
			n.left = addNode(n.left, k);
		} else if (compare(k, n.key) > 0) {
			n.right = addNode(n.right, k);
		} else
			flag = false;
		return n;
	}

	@SuppressWarnings("unchecked")
	private int compare(Object o1, Object o2) {
		if (c != null) {
			return c.compare(o1, o2);
		}
		return ((Comparable<Object>)o1).compareTo(o2);
	}

	public void levelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		if (root != null)
			q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(n.key + " ");
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
		System.out.println();

	}

	public void preOrderTraverse() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node n) {
		if (n == null)
			return;
		System.out.print(n.key + " ");
		preOrder(n.left);
		preOrder(n.right);
	}

	public void postOrderTraverse() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node n) {
		if (n == null)
			return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key + " ");
	}

	public void inOrderTraverse() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node n) {
		if (n == null)
			return;
		inOrder(n.left);
		System.out.print(n.key + " ");
		inOrder(n.right);

	}

}
