package com.genericlinkedlist;

public class List {
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
			head = newnode;
		}	
	}
	public int deleteFirst() {
		if(isEmpty())
			return 0;
		else {
			head.next.next.prev = head.prev;
			head.prev.next = head.next.next;
			head = head.next;
			return 1;
		}
	}
	
	public int peek() {
		
		return head.data;
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
		}
			
	}
	public int peekQueue() {
		
		return head.data;
	}
}
