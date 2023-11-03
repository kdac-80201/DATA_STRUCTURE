package com.linkedlist;

public class List{
	public class Node{
		private int data;
		private Node  next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
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
		if(isEmpty()) {
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		}
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
		}	
	}
	
	public void addPosition(int pos,int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		}
		else {
			Node trav = head;
			for(int i = 1; i< pos - 1 && trav.next != null;i++)
				trav = trav.next;
			if(trav.next.next == head)
				addLast(value);
			
			Node temp = trav.next.next;
			newnode.next = temp;
			newnode.prev = trav;
			trav.next.next.prev = newnode;
			trav.next = newnode;
		}
	}
	
	public void deleteLast() {
		
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			
			head.prev.prev.next = head;
			
			head.prev = head.prev.prev;
		}
	}
	public void deletePosition(int pos) {
		if(isEmpty())
			System.out.println("List is empty");
		else {
			Node trav = head;
			for(int i = 0; i < pos -1 && trav.next != null; i++ )
				trav = trav.next;
			if(trav.next.next == head)
				deleteLast();
			
			Node temp = trav.next.next;
			trav.next.next.prev = trav;
			trav.next = temp;
		}
		
	}
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		}
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
			
	}
	public void displayDCLL() {
		if(isEmpty())
			System.out.println("List is empty ");
		else {
			Node trav = head;
			do {
				System.out.print(trav.data+" ");
				trav = trav.next;
				
			}while(trav != head);
		}
		
	}
}