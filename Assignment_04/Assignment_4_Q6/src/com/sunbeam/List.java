package com.sunbeam;

public class List {
	
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			
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

	public void sortLinkedList() {
	
		Node trav = head;
		for (; trav.next.next != null; trav = trav.next) {
			Node trav2 = head;
			for (; trav2.next != null; trav2 = trav2.next) {
				if (trav2.data > trav2.next.data) {
					int temp = trav2.data;
					trav2.data = trav2.next.data;
					trav2.next.data = temp;
				}

			}
			if (trav2.next == null)
				trav2 = head;

		}

	}

}
