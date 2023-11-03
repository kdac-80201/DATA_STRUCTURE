package com.sunbeam;

public class List {
	int counter;

	public class Node {
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
		counter++;
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
		counter++;
	}

	public void deleteFirst() {
		if (isEmpty())
			System.out.println("List is empty");
		else
			head = head.next;
		counter--;
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
		counter--;
	}

//	public void addAfter2(int value, int pos) {
//		Node newnode = new Node(value);
//		if (isEmpty())
//			head = newnode;
//		else {
//			Node trav = head;
//			for (int i = 1; i < pos; i++)
//				trav = trav.next;
//			Node temp = trav.next;
//			trav.next = newnode;
//			newnode.next = temp;
//		}
//		counter++;
//	}  // for given position add element 
	
	public void addAfter(int posElement, int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			do {
				if(trav.data == posElement) {
					newnode.next = trav.next;
					trav.next = newnode;
				}
				
				trav = trav.next;
					
			}while(trav.next != null);
		}
		counter++;
	}

//	public void addBefore(int value, int pos) {
//		Node newnode = new Node(value);
//		if (isEmpty())
//			head = newnode;
//		else {
//			Node trav = head;
//			for (int i = 1; i < pos - 1; i++)
//				trav = trav.next;
//			Node temp = trav.next;
//			trav.next = newnode;
//			newnode.next = temp;
//
//		}
//		counter++;
//	}  add before position by given position index
	public void addBefore(int posvalue,int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			Node trav = head;
			do {
				if(trav.next.data == posvalue) {
					Node temp = trav.next;
					trav.next = newnode;					
					newnode.next = temp;
				}
				trav = trav.next;
			}while(trav.next != null);
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
