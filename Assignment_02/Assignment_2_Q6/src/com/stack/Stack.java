package com.stack;

public class Stack {
	int[] arr;
	int size;
	int top;
	public Stack(int SIZE) {
		this.size = SIZE;
	    arr = new int[size];
		top = size;
	}
	public void push(int element) {
		top--;
		arr[top]= element;
	}
	public int pop() {
		int element = arr[top];
		top++;
		return element;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top == size;
	}
	public boolean isFull() {
		return top == 0;
	}

}
