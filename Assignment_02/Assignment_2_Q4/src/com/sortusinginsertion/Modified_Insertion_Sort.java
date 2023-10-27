package com.sortusinginsertion;

import java.util.Arrays;

public class Modified_Insertion_Sort {
		public static int SortingUsingModifiedInsertion(int[] arr,int length) {
			int com = 0;
			for(int i = 1; i< length ; i++) {
				int j = i - 1;
				int temp = arr[i];
				while(j >= 0 && arr[j] < temp) {
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
			int[] arr = {1,2,3,4,5,6,7,8,9,10}; // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1] No of comparison 45

			int comparison = SortingUsingModifiedInsertion(arr, arr.length);
			System.out.println("No of comparison "+comparison);
		}
}
