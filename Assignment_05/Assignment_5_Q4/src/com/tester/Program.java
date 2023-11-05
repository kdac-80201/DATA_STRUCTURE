package com.tester;

import com.treesearchbinary.BSTree;

public class Program {

	public static void main(String[] args) {
		BSTree b = new BSTree();
	
		b.addNode(10);
		b.addNode(3);
		b.addNode(4);
		b.addNode(60);
		
		
		b.addRecNode(50); // Using recursive method
		b.addRecNode(1);
		b.addRecNode(19);
		
		
		b.displayTree();
	}

}
