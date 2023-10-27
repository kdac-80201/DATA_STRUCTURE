package com.sortusing.insertionsort;

import java.util.Arrays;

public class Sort_Using_InsertionSort {
		public static int SortingUsingInsertion(int[] arr,int length) {
			int com = 0;
			for(int i = 1; i< length -1; i++) {
				int j = i - 1;
				int temp = arr[i];
				while(j >= 0 && arr[j] > temp) {
					com++;
					arr[j+1]= arr[j];
					j--;
				}
				arr[j+1]= temp;
			}
			System.out.println(Arrays.toString(arr));
			return com;
			
		}
		public static void main(String[] args) {
			int[] arr = {5,9,5,4,1,0,3,5,7,8,2};  //[0, 1, 3, 4, 5, 5, 5, 7, 8, 9, 2]  No of comparison 20
			int comparison = SortingUsingInsertion(arr, arr.length);
			System.out.println("No of comparison "+comparison);
		}
}
