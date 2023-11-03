package com.stack;

import java.util.Scanner;

import com.genericlinkedlist.List;

public class Stack {
	static Scanner sc = new Scanner(System.in);

	static int menu() {
		int choice;
		System.out.println("******************");
		System.out.println("0. EXIT ");
		System.out.println("1. PUSH");
		System.out.println("2. POP");
		System.out.println("3. PEEK");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		List l1 = new List();
		int counter = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:

				System.out.println("Enter element ");
				int ele = sc.nextInt();
				l1.addFirst(ele);
				counter++;
				break;
			case 2:
				if (counter == 0) {
					System.out.println("Stack is Empty");
					break;
				}
				else if (l1.deleteFirst() == 0)
					System.out.println("Stack is Empty ");
				else
					System.out.println("Element Poped ");
				counter--;
				break;
			case 3:
				System.out.println("Element: "+l1.peek());
				break;

			default:
				System.out.println("Invlid selection ");
				break;
			}
		}
	}

}
