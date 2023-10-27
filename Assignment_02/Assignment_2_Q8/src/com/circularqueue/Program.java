package com.circularqueue;

import java.util.Scanner;

import com.tester.CircularQueue;

public class Program {
	static Scanner sc = new Scanner(System.in);

	static int menu() {
		int choice;
		System.out.println("0. EXIT ");
		System.out.println("1. PUSH ");
		System.out.println("2. POP");
		System.out.println("3. PEEK");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int counter = 0;
		System.out.println("Enter size of circular queue");
		int size = sc.nextInt();

		CircularQueue cq = new CircularQueue(size);

		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (counter > size) {
					System.out.println("Queue is full ");
				} else {
					System.out.print("Enter value ");
					int value = sc.nextInt();
					cq.push(value);
					counter++;
				}
				break;
			case 2:
				if (counter != 0) {
					cq.pop();
					System.out.println("Element poped ");
					counter--;
				} else
					System.out.println("Empty Queue ");
				break;
			case 3:
				if (counter != 0)
					System.out.println("Peeked element " + cq.peek());
				else
					System.out.println("Empty Queue ");
				break;
			default:
				System.out.println("Invalid Entry! ");
				break;
			}

		}
	}
}
