package com.tester;

import java.util.Scanner;

import com.sunbeam.StackUsingQueue;

public class QueueStack {
	static Scanner sc = new Scanner(System.in);

	static int menu() {
		int choice;
		System.out.println("*******");
		System.out.println("0. EXIT");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. Display");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		System.out.println("Enter stack size ");
		int stacksize = sc.nextInt();
		StackUsingQueue suq = new StackUsingQueue(stacksize);
		int choice, counter = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (!suq.isFull()) {
					
					System.out.println("Enter data");					
				int element = sc.nextInt();
				suq.push(element);
				}
				else
					System.out.println("stack is full");					
				counter++;

				break;
			case 2:
				suq.pop();
				counter--;
				break;
			case 3:
				System.out.println("Peeked element"+suq.peek());
				break;
			case 4:
				for (int i = 0; i < counter; i++) {
					System.out.println("Values are " + suq.pop());					
				}
				System.out.println();
				break;

			default:
				System.out.println("Invlaid Entry ");
				break;
			}

		}
	}

}
