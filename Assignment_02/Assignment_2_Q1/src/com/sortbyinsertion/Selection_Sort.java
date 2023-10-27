package com.sortbyinsertion;
import java.util.Arrays;

public class Selection_Sort {
	public static int SortBySelection(int[] arr,int length) {
		int com=0;
		for(int i = 1; i < length;i++) {
			for(int j = 0; j< length ;j++) {
				if(arr[i]< arr[j]) {
					com++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
					
			}
			
		}
		System.out.println(Arrays.toString(arr));
		return com;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,8,4,3,6,3,2,5};
		int comparison = SortBySelection(arr,arr.length);
		System.out.println("Comparison: "+comparison);
		// After sort [1, 2, 3, 4, 5, 5, 6, 8]
	}
}