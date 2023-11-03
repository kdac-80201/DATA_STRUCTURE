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
		
		l1.displayAll();
		
		
		l1.addAfter(6,20);
		
		l1.addBefore(9,140);
		
		l1.displayAll();
		
		// List: 8 9 6 4 5 
		// List: 8 140 9 6 20 4 5 

		
	}

}
