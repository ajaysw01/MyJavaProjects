package com.aj.streams;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		//find max and min from array
		int[] arr = {4,59,2,345,23,566,45,34,34};
		
		
		int maxNum = Arrays.stream(arr).max().getAsInt();
		
		int minNum = Arrays.stream(arr).min().getAsInt();
		
		System.out.println(maxNum);
		System.out.println(minNum);
		
		
	}

}
