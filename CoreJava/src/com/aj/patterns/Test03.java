package com.aj.patterns;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {3,4,5};
        m1(arr);

        
    }


    static void m1(int[] arr){

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            
        }

    }

    
}

