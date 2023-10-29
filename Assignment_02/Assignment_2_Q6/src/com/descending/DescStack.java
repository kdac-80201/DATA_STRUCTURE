package com.descending;

import java.util.Scanner;

import com.stack.Stack;

public class DescStack {
	static Scanner sc = new Scanner(System.in);
	static int menu() {
		
		int choice;
		System.out.println("*******");
		System.out.println("0. EXIT");
		System.out.println("1. PUSH");
		System.out.println("2. POP");
		System.out.println("3. PEEK");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter stack size");
		int size = sc.nextInt();
		Stack st = new Stack(size);
		
		int choice;
		while((choice = menu())!=0) {
			switch (choice) {
			case 1:
				if(!st.isFull()) {					
					System.out.println("Enter Element ");
					int ele = sc.nextInt();
					st.push(ele);
				}
				else 
					System.out.println("Stack is full");
				break;
			case 2:
				if(!st.isEmpty())
				System.out.println("Poped element "+st.pop());
				else
					System.out.println("stack is empty");
				break;
			case 3:
				if(!st.isEmpty())
			System.out.println("Peeked element "+st.peek());
				else
					System.out.println("Stack is empty");
			break;
			default:
				System.out.println("Invalid entry  ");
				break;
			}
		}
		
	}

}
