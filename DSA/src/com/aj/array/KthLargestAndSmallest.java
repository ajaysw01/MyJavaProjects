package com.aj.array;

public class KthLargestAndSmallest {
	public static void main(String[] args) {
		int[] ar = {1,5,2,7,94,102};
		int k = 4;
		
		for(int i = 0; i<=ar.length; i++) {
			for(int j=i;j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					int temp = ar[i];
					ar[i]= ar[j];
					ar[j]=temp;
				}
			}
			if(i==k-1) {
			System.out.print(k + " largest element is "+ar[i]);
			break;
		}
		}
	}

}
