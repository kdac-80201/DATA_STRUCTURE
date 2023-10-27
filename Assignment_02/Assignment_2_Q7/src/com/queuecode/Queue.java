package com.queuecode;

public class Queue {
	public int arr[];
	public int size;
	int front;
	int rear;
	public Queue(int SIZE) {
		this.size = SIZE;
	    arr = new int[size];
	    front = 0;
	    rear = 0;
	}
	public void push(int value) {
//		System.out.println("Array's length "+arr.length);
		if(rear == arr.length) {			
			System.out.println("Array is full! ");
		}
		else {
			arr[rear++] = value;
		}
	}
	public void pop() {
		if(front == rear) {
			System.out.println("Queue is empty ");
		}
		else {
			front++;
			System.out.println("Element is poped ");
		}
	}
	public void peek() {
		if(rear == front) {
			System.out.println("Queue is Empty ");
		}
		else {			
			System.out.println("Peeked element "+arr[front]);
//			front++;
		}
	}
	
}
