package com.tester;

import com.sunbeam.List;

public class Program {
	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(5);
		l1.addFirst(4);
		l1.addFirst(6);
		l1.addFirst(9);
		l1.addFirst(8);
		
		System.out.println("Before Sort ");
		l1.displayAll(); // List: 8 9 6 4 5 
		
		l1.sortLinkedList();
	
		System.out.println("After sort");	
		l1.displayAll();  // List: 4 5 6 8 9 
	}

}
