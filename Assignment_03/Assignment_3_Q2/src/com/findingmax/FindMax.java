package com.findingmax;

import java.util.Scanner;

import com.stack.Stack;

public class FindMax {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		Stack st = new Stack(5);
		Scanner sc = new Scanner(System.in);
		int element,temp = Integer.MIN_VALUE;
		
		System.out.println("Insert 5 element into stack");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " Element: ");
			
			element = sc.nextInt();
			
			st.push(element);
			if(element > temp) {
				temp  = element;				
			}
		}
		System.out.println("Maximum value is "+temp);
	}

}
