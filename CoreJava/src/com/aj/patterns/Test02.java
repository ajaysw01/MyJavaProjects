package com.aj.patterns;

public class Test02 {
    public static void main(String[] args) {
        int[] ia ={1,2,5,7,8};
        
        //static accesing of array
        for(int i =0;i<5;i++){
            System.out.println(ia[i]);
        }
        System.out.println("break");

        //dynamic nature code for reading values from array
        for(int i=0;i<ia.length;i++){
            System.out.println(ia[i]);
        }
                
    }
    
}
