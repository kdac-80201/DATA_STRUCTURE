package com.tester;

import java.util.Scanner;

import com.linkedlist.List;

public class Program {
	static Scanner sc = new Scanner(System.in);

	static int menu() {
		int choice;
		System.out.println("************");
		System.out.println("0. EXIT ");
		System.out.println("1. AddFirst ");
		System.out.println("2. AddLast ");
		System.out.println("3. PollFirst ");
		System.out.println("4. PollLast ");
		System.out.println("5. PeekFirst ");
		System.out.println("6. PeekLast ");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int counter = 0;
		List l1 = new List();

		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Enter Element");
				int ele = sc.nextInt();
				l1.addFirst(ele);
				counter++;
				break;
			case 2:
				System.out.println("Enter Element");
				int ele1 = sc.nextInt();
				l1.addLast(ele1);
				counter++;
				break;
			case 3:
				if(counter == 0) {
					System.out.println("Deque is empty");
					break;
				}
				l1.pollFirst();
				counter --;
				System.out.println("Element Polled! ");
				break;
			case 4:
				if(counter == 0) {
					System.out.println("Deque is empty");
					break;
				}
				l1.pollLast();
				counter --;
				System.out.println("Element Polled! ");
				break;
			case 5:
				System.out.println("Peeked Element: "+l1.peekFirst());
				break;
			case 6:
				System.out.println("Peeked Element: "+l1.peekLast());
				break;
			default:
				System.out.println("Invalid Entry ");
				break;
			}
		}

	}

}
