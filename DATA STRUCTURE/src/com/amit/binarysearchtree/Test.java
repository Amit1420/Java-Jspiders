package com.amit.binarysearchtree;

import java.util.Comparator;

class Len implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		return ((String) o1).length() - ((String) o2).length();
	}
}

public class Test {

	public static void main(String[] args) {
		BinarySearchTree s = new BinarySearchTree();
//		s.add(50);
//		s.add(75);
//		s.add(20);
//		s.add(10);
//		s.add(30);
//		s.add(60);
//		s.add(90);
		s.add("java");
		s.add("sql");
		s.add("android");
		s.add("react");
		s.add("python");
		s.add("c");
//		System.out.println("Level Order :");
//		s.levelOrder();
//		System.out.println("----------------------------------------");
//		System.out.println("Pre Order :");
//		s.preOrderTraverse();
//		System.out.println("----------------------------------------");
//		System.out.println("Pre Order :");
//		s.postOrderTraverse();
//		System.out.println("----------------------------------------");
		System.out.println("In Order :");
		s.inOrderTraverse();

	}

}
