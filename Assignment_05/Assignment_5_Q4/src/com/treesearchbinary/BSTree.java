package com.treesearchbinary;

public class BSTree {
	public class Node {
		private int data;
		private Node right;
		private Node left;

		public Node(int value) {
			data = value;
			right = null;
			left = null;
		}
	}

	private Node root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			root = newnode;
		} else {
			while (true) {
				Node trav = root;
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					} else {
						trav = trav.left;	
						break;
					}
				} else {
					if (trav.right == null) {
						trav.right = newnode;
						break;
					} else {
						trav = trav.right;						
						break;
					}
				}
			}

		}
	}
	
	public void addRecNode(Node trav, int value)
	{
		if (isEmpty())
			root = new Node(value);
		else if(value<trav.data)
		{
			if(trav.left==null) {
				trav.left = new Node(value);
				return;
			}
			else {
				trav = trav.left;
				addRecNode(trav, value);
			}
		}
		else
		{
			if(trav.right==null) {
				trav.right = new Node(value);
				return;
			}
			else
			{
				trav = trav.right;
				addRecNode(trav, value);
			}
		}
	}
	public void addRecNode(int value) {
		addRecNode(root, value);
	}
	
	
	public void displayTree() {
		displayTree(root);
	}
	public void displayTree(Node trav) {
		
		if(trav == null)
			return;
		displayTree(trav.left);
		System.out.println(trav.data);
		displayTree(trav.right);
			
	}

}
