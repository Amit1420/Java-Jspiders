package com.amit.doublylinkedlist;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList d=new DoublyLinkedList();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.reverse();
		for(int i=0; i<d.size(); i++) {
			System.out.println(d.get(i));
		}

	}

}
