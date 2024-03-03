package com.aj.array;

import java.util.Arrays;

public class kth {

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 4, 2, 2, 3, 4, 4};
        int k = 2;

        int kthLargest = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
        int m = smallest(nums, k);
        System.out.println(m);
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    public static int smallest(int [] nums , int k ) {
    	Arrays.sort(nums);
    	return nums[k-1];
    }
}