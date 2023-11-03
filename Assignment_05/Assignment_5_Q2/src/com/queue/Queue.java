package com.queue;

import java.util.Scanner;

import com.genericlinkedlist.List;

public class Queue {
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
		List l1 = new List();
		int counter = 0;
		
		int choice;
		while((choice = menu())!= 0) {
			
			switch (choice) {
			case 1:
				System.out.println("Enter Element");
				int ele = sc.nextInt();
				l1.addLast(ele);
				counter++;
				break;
			case 2:
				if(counter == 0) {
					System.out.println("Queue is Empty ");
					break;
				}
				l1.deleteFirst();
				counter--;
				break;
			case 3:
				System.out.println("Peeked Element: "+l1.peekQueue());
				break;
				
			default:
				System.out.println("Invalid Entry ");
				break;
			}
			
		}
		

	}

}
