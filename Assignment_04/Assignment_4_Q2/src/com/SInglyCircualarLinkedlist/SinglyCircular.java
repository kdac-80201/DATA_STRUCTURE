package com.SInglyCircualarLinkedlist;

public class SinglyCircular {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			// TODO Auto-generated constructor stub
			data = value;
			next = null;
		}
	}
	private Node tail;
	private int count;
	public SinglyCircular() {
		tail = null;
		count = 0;
	}
	public int getCount() {
		return this.count;
	}
	public boolean isEmpty() {
		return tail == null;
	}
	public void addFirst(int value) { // Time Complexity O(n)
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		}
		else {
			newnode.next = tail;
			Node trav = tail;
			while(trav.next != tail)
				trav = trav.next;
			trav.next = newnode;
			tail = newnode;
		}
		count++;	
	}
	public void deleteFirst() {  // Time Complexity O(n)
		if(isEmpty())
			System.out.println("List is empty");
		else if(tail.next == tail)
			tail = null;
		else {
			Node trav = tail;
			while(trav.next != tail)
				trav = trav.next;
			trav.next = tail.next;
			tail = tail.next;
		}
		count--;
	}
	public void addLast(int value) { //Time Complexity O(n)
		Node newnode = new Node(value);
		if(isEmpty()) {
			
			tail = newnode;
			tail.next = tail;
		}
		else {
			newnode.next = tail;
			Node trav = tail;
			while(trav.next != tail)
				trav = trav.next;
			trav.next = newnode;
		}	
		count++;
	}
	public void deleteLast() {  // Time Complexity O(n)
		if(isEmpty())
			System.out.println("List is empty");
		else if(tail.next == tail)
			tail = null;
		else {
			Node trav = tail;
			for(; trav.next.next !=tail;trav = trav.next);
			trav.next = tail;
		}
		count--;		
	}
	public void deletePosition(int pos) { //Time Complexity O(n)
		if(pos < 1 || pos > count)
			return;
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else if(pos == 1) {
			deleteFirst();
			return;			
		}
		else if(tail.next == tail)
				tail = null;
		else {
			Node trav = tail;
			for(int i =1; i< pos -1;i++)
				trav = trav.next;
			trav.next = trav.next.next;
		}
		count--;
	}
	public void addPosition(int value, int pos) { // Time Complexity O(n)
		if(pos < 1 || pos > count+1)
			return;
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			tail.next = tail;
		}
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		else {
			Node trav = tail;
			for(int i = 1;i<pos -1; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;	
	}
	
	public void displayList() {  //Time Complexity O(n)
		if(isEmpty())
			System.out.println("Empty List ");
		else {
			Node trav = tail;
			System.out.print("List: ");
			do {
				System.out.print(trav.data+" ");				
				trav = trav.next;
			} while(trav != tail);

		}
	}
	

}
