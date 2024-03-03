package com.aj.array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,6};
		
		int expected_no_of_elements = ar.length+1;
		int total_sum = expected_no_of_elements*(expected_no_of_elements + 1)/2;
		System.out.println(total_sum);
		
		int sum = 0;
		for(int i= 0; i<ar.length; i++) {
			sum = sum + ar[i];
	
		}
		int missingNum=total_sum -sum;
		System.out.println("Missing element in given array is "+missingNum);
		
		
		// trough xor method 
		int missElement = XORMissing(ar);
		System.out.println("Missing Element througho xor is "+missElement);
	}
	
	
	private static int XORMissing(int[] ar){
		int xor1 = ar[0];
		for(int i = 1; i<ar.length; i++) {
			xor1=xor1^ar[i];
		}
		int xor2 = 1; 
		for(int i = 2; i<=(ar.length + 1); i++) {
			xor2 = xor2^i;
		}
		return (xor1^xor2);
	}

}
