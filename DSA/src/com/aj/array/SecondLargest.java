package com.aj.array;

public class SecondLargest {
public static void main(String[] args) {
	int[] arr = {2,4,6,8,10};
	for(int i = 0; i< arr.length; i++) {
		for(int j = i ; j< arr.length; j++) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
		}
	}
	System.out.println(arr[1]);
	way2(arr);
}


static void way2(int[] arr) {
	int largest = Integer.MIN_VALUE;
	int second_largest = Integer.MIN_VALUE;
	
	for(int i = 0; i< arr.length; i++) {
		if(arr[i]> largest) {
			second_largest = largest;
			largest = arr[i];
		}else if(arr[i] > second_largest && arr[i]!=largest) {
			second_largest = arr[i];
		}
	}
	
	System.out.println(second_largest);
}
}
