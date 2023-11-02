package com.sunbeam;


public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			// TODO Auto-generated constructor stub
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public List() {
		head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else
			newnode.next = head;
		head = newnode;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = newnode;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = newnode;
		}
	}
	
	public void deleteFirst() {
		if (isEmpty())
			System.out.println("List is empty");
		else
			head = head.next;
	}

	public void deleteLast() {

		if (isEmpty())
			System.out.println("List is empty");
		else if (head.next == null)
			head = null;
		else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}

	
	
	
	public void addAfter(int value,int pos) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			for(int i = 1; i < pos; i++)
				trav = trav.next;
			Node temp = trav.next;
			trav.next = newnode;
			newnode.next = temp;	
		}
		
	}
	public void addBefore(int value,int pos) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			for(int i = 1; i< pos-1; i++)
				trav = trav.next;
			Node temp = trav.next;
			trav.next = newnode;
			newnode.next = temp;	
			
		}
	}
	
	
	public void displayAll() {
		if (isEmpty())
			System.out.println("List is empty");
		else {

			Node trav = head;
			System.out.print("List: ");
			do {
				System.out.print(trav.data + " ");
				trav = trav.next;
			} while (trav != null);
			System.out.println("");
		}
	}

}