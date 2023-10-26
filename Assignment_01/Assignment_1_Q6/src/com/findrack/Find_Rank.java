package com.findrack;

public class Find_Rank {
	
	public static void findRank(int[] arr,int num, int length) {
		int count = 0;
		for(int i = 0; i < length ; i++) {
			if(num == arr[i] || num > arr[i] ) {
				count++;
			}
		}
		System.out.println("Rank of an element is "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		int num = 20;
		findRank(arr,num,arr.length);
	}

}
