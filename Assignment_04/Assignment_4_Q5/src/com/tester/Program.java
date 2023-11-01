package com.tester;

import com.sunbeam.List;

public class Program {
	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(50);
		
//		l1.addAfter(66, 4);
		l1.addBefore(45, 3);
		l1.displayAll();
	}

}
