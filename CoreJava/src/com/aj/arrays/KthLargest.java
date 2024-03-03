package com.aj.arrays;
public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {10,8,12, 14, 9};
        int k = 3; 
        for( int i = 0; i<arr.length; i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
            if(arr[i]==k-1){
                System.out.println(k + "largesth element is "+arr[i]);
            }
        }
    }
    
}
