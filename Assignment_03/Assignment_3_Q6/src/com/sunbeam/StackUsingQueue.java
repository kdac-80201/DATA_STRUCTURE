package com.sunbeam;

public class StackUsingQueue {
	private int arr[];
	private int rear,front;
	private final int SIZE;
	public StackUsingQueue(int size) {
		SIZE = size-1;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	public void push(int data) {
		rear++;
		arr[rear]  = data;
	}
	public int pop() {
		int value = arr[rear];
		rear--;
		return value;
	}
	public int peek() {
		return arr[rear];
	}
	public boolean isFull() {
		return rear == SIZE -1 ;
	}
	public boolean isEmpty() {
		return rear == front;
	}
}
