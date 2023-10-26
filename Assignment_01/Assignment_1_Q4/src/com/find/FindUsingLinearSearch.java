package com.find;

public class FindUsingLinearSearch {
	public static int findKey(int[] arr, int key) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]== key) {				
				count++;	
			}
		}
		if(count == 0)
			return -1;
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,5,4,6,8,2,3,2,9,7};
		int key = 2;
		int find = findKey(arr,key);
		//No of Occurence are 3

		System.out.println("No of Occurence are "+find);

	}

}
