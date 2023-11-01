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
		l1.addFirst(60);
		
		l1.displayAll();
		
		System.out.print("Reverse List: ");
		l1.displayInReverse();
		
		
		
	}

}
