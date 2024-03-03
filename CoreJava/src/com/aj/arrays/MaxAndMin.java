package com.aj.arrays;

public class MaxAndMin {
	public static void main(String[] args) {
		int[] arr= {23, 12, 123,5, 8,10};
		int max = arr[0];
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]<max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
