package com.sortbybubble;

import java.util.Arrays;

public class BubbleSort {
	public static void SortUsingBubbleSort(int[] arr,int length) {
		int flag = 0;
		for(int i = 1 ; i < length ; i++) {
			for(int j = 0; j < length-1; j++) {
				if(arr[j]> arr[j+1]) {
					flag++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				if(flag == 0)
					break;
			}
		}
		System.out.println("no of comparisons "+flag);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int[] arr = {6,5,8,1,4,2,3,9}; // [1, 2, 3, 4, 5, 6, 8, 9] no of comparisons 15
//		int[] arr = {1, 2, 3, 4, 5, 6, 8, 9}; // no of comparisons 0
		
		SortUsingBubbleSort(arr,arr.length);
		
	}

}

