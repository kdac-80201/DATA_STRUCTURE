package com.linkedlist;

import com.tester.List;

public class Singly_Linear_LinkedList {
	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		
		l1.addLast(20);
		l1.addLast(30);
		
		l1.deleteFirst();
		l1.deleteLast();
		
		l1.displayList();
		
	}

}
