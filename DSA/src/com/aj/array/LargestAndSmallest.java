package com.aj.array;

public class LargestAndSmallest {
	public static void main(String[] args) throws Exception {
		int[] ar = {2,9,4,3,1,10,15,16};
		System.out.println("Largest Value is "+func(ar));
	}
	
	private static int func(int[] ar) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i<ar.length; i++) {
			if(largest< ar[i]) {
				largest = ar[i];
			}
			if(smallest > ar[i]) {
				smallest = ar[i];
			}
		}
		System.out.println("Smallest is  "+ smallest);
		return largest;
	}
	

}
