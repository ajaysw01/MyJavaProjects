package com.aj.array;

public class Demo {
	public static void main(String[] args) {
		 int arr[] = { 2,-3,6,-5,4,2};
		 int n = arr.length;
		 maxArr(arr, n);
		 kth(arr, n);
		 
	}

	private static void kth(int[] arr, int n) {
		for(int i =0; i<n; i++) {
			for(int j =i; j<n;j++) {
				
			}
		}
	}

	public static void maxArr(int[] arr, int n) {
		int maxSum = Integer.MIN_VALUE;
		for(int i =0; i<n-1; i++) {
			for(int j =i; j<n-1;j++) {
				int currSum = 0;

				for(int k =i; k<=j; k++) {
					currSum+= arr[k];
				}
				maxSum = Math.max(maxSum, currSum);
			}
		}
		System.out.println(maxSum);
	}
	
	
	
	
	 

}
