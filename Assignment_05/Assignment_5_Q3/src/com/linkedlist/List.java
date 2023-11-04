package com.linkedlist;

public class List {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	public Node head;
	public Node tail;

	public List() {
		tail = head = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = tail = newnode;
			head.next = null;
			head.prev = null;
		} else {
			newnode.next = head;
			head.prev = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = tail = newnode;
		else {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;
		}
	}
	public int peekFirst() {
		if(isEmpty())
			return 0;			
		else
			return head.data;
		}
	public int peekLast() {
		if(isEmpty())
			return 0;
		else
			return tail.data;
	}
	public void pollFirst() {
		if(isEmpty())
			System.out.println("Dequeue is Empty ");
		else {
			head = head.next;
		}
	}
	public void pollLast() {
		if(isEmpty())
			System.out.println("Dequeue is Empty");
		else {
			tail = tail.prev;
		}
	}
	
	
}
