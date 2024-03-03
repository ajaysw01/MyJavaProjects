package com.aj.search;

public class LinearSearch {
	public static void main(String[] args) {

		int[] ar = { 12, 4, 56, 34, 56 };
		boolean res = lsUnsorted(ar, 5);
	}

	private static boolean lsUnsorted(int[] ar, int key) {
		for (int i = 0; i <= ar.length; i++) {
			if (ar[i]== key ) {
				return true;
			}
		}
		return false;
	}

}
