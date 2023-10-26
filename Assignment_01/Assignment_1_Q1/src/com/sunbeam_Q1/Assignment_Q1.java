package com.sunbeam_Q1;

public class Assignment_Q1 {
	
public static int findBy_Linear_Search(int[] arr,int key,int length) {
		for(int i = 0; i< length ; i++) {
			if(key == arr[i])
				return i;
		}
		return -1;		
	}

public static int Using_Binary(int[] arr,int key,int length) {
		
		int start = 0;
		int end = arr.length;
		int count = 0;
		while(start < end) {
			
			int mid = (start+end)/2;
			if(arr[mid] == key) {
				count++;
				return count;
			}
			if(key > arr[mid]) {
				count++;
				start = mid + 1;
			}
			else if(key < arr[mid]) {
				count++;
				end = mid -1;
			}
		}
		return count;
	}
	
public static void main(String[] args) {
//	int[] arr = {1,2,5,6,7,8,9,10,20,30};
	int[] arr = {5,6,8,9,10};
	int key = 8;
	
	
	int Linear_count = findBy_Linear_Search(arr, key, arr.length);
	System.out.println("Comparison Linear "+(Linear_count+1));
	
	
	int Binary_count = Using_Binary(arr,key,arr.length);
	System.out.println("Comparison taken "+Binary_count);
	
	
	
}

}
