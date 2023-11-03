package com.tester;

import com.linkedlist.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(60);
		l1.addFirst(70);
		l1.addLast(50);
		
		l1.addPosition(2,999);
		
		l1.deletePosition(3);
		
			
		l1.displayDCLL();
	}

}
