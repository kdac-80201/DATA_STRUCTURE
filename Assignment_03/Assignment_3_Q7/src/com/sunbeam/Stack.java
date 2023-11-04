package com.sunbeam;

public class Stack {
	int[] arr;
	int size;
	int top;
	public Stack(int SIZE) {
		this.size = SIZE;
	    arr = new int[size];
		top = -1;
	}
	public void push(int element) {
		top++;
		arr[top]= element;
	}
	public int pop() {
		int element = arr[top];
		top--;
		return element;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == size -1;
	}

}

