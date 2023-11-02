package com.sunbeam;

import com.linkedlist.List;

public class FindMinMax {
	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(9);
		l1.addFirst(8);
		l1.addFirst(50);
		l1.addFirst(40);
		l1.addFirst(36);
		
		l1.displayAll();
		
		System.out.println("Minimum value is "+l1.FindMin());
		System.out.println("Maximum value is "+l1.FindMax());
	}

}
