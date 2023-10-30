package com.program;

import com.SInglyCircualarLinkedlist.SinglyCircular;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyCircular sc = new SinglyCircular();
		sc.addFirst(10);
		sc.addFirst(20);
		sc.addFirst(30);
		sc.addFirst(40);
		sc.addFirst(50);
		
//		sc.deleteLast();
		sc.deletePosition(1);
		sc.addPosition(300, 3);
//		sc.deleteFirst();
		sc.displayList();

	}

}
