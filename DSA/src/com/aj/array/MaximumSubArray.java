package com.aj.array;

public class MaximumSubArray {
	public static void main(String[] args) {
		 int ar[] = { 2,-3,6,-5,4,2};
		int n = ar.length;
		maxArr(ar, n);
	}
	static void maxArr(int[] ar , int n ) {
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i< n-1; i++) {
			for(int j = i; j<n-1; j++) {
				int currSum = 0;
				for(int k =i; k<=j; k++) {
					currSum += ar[k];
				}
				maxSum = Math.max(maxSum, currSum);
			}
		}
		System.out.println(maxSum);
	}
}
