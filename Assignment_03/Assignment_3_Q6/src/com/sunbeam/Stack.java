package com.sunbeam;

public class Stack {
	private int arr[];
	private int rear, front;
	private final int SIZE;

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}

	public void push(int data) {
		rear++;
		arr[rear] = data;
	}

	public int pop() {
		front++;
		int value = arr[front];
		return value;
	}

	public int peek() {
		return arr[rear];
	}

	public boolean isFull() {
		return rear == SIZE - 1;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public void DeleteAll() {
		front = -1;
		rear = -1;
	}
}
