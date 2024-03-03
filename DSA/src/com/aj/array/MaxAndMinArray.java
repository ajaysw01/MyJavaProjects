package com.aj.array;

public class MaxAndMinArray {
	public static void main(String[] args) {
		int ar[] = {1,5,23,56,-3};
		int max = findMax(ar);
		System.out.println(max);
		int min = findMin(ar);
		System.out.println(min);

	}

	private static int findMax(int[] ar) {
		int max = ar[0];
		for(int i =0; i<ar.length; i++ ) {
			if(max<ar[i]) {
				max = ar[i];
			}
		}
		
		return max;
	}
	
	
	private static int findMin(int[] ar) {
		int min = ar[0];
		for(int i = 0; i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		return min;
	}
}
	
