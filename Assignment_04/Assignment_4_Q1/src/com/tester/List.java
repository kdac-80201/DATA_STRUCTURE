package com.tester;

public class List{
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	private Node tail;
	public List() {
		head = null;
		tail = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;	
			tail = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;	
		}
	}
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;
			tail = newnode;
		}
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newnode;	
		}
	}
	public void deleteFirst() {
		head = head.next;
	}
	
	public void deleteLast() {
		Node trav = head;
		while(trav.next.next != null)
			trav = trav.next;
		trav.next = null;
		
	}
	
	public void displayList() {
		if(isEmpty())
			System.out.println("List is empty");
		else {
			Node trav = head;
			System.out.print("List: ");
			do {
				System.out.print(trav.data+" ");
				trav = trav.next;
			}while(trav!=null);
		}
	}
}
