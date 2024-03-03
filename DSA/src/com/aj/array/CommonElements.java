package com.aj.array;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
	public static void main(String[] args) {
		  int[] arr1
          = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };

      // create Array 2
      int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };
	
      FindCommonElements(arr1, arr2);
	}

	public static void FindCommonElements(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int i : arr1) {
			set1.add(i);
		}
		for(int i : arr2) {
			set2.add(i);
		}
		
		set1.retainAll(set2);
		System.out.println(set1);
		
	}

}
