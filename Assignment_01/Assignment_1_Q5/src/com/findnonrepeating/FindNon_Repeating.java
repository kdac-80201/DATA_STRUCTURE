package com.findnonrepeating;

public class FindNon_Repeating {
	public static void findNonRepeating(int[] arr,int length) {
		
		for(int i = 0; i < length; i++ ) {
			int j;
			for(j = 0; j < length; j++) {
				if(arr[i] == arr[j] && i != j)
					break;
			}
			if(j == length) {
				System.out.println("non repeating element "+arr[i]);
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		findNonRepeating(arr,arr.length);
		
	}
	

}
