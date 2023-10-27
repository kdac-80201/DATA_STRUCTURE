package com.linearqueue;

import java.util.Scanner;

import com.queuecode.Queue;

public class LInearQueue {
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
		int choice;
		System.out.println("Enter size of Queue");
		int size = sc.nextInt();
		Queue q = new Queue(size);
		
		while((choice = menu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("Enter value");
				int pushVal = sc.nextInt();
				q.push(pushVal);	
				break;
			case 2:
				q.pop();
				break;
			case 3:
				q.peek();
				break;

			default:
				System.out.println("Invalid Entry! ");
				break;
			}
		}
	}

}
