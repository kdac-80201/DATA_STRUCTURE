package com.Program;

import java.util.Arrays;

import com.stack.Stack;

public class ArrayOfIntegers {
	public static void ReverseArray(int[] arr) {
		Stack stack = new Stack(arr.length);
		for(int i = 0 ; i < arr.length ; i++)
			stack.push(arr[i]);
		
		for(int j = 0 ; j < arr.length; j++)
			arr[j] = stack.pop();
		
		System.out.println("After Reverse "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Before Reverse "+Arrays.toString(arr));
		ReverseArray(arr);
	}

}
