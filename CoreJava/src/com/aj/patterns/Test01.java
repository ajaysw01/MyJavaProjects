package com.aj.patterns;
class Test01{
 public static void main(String[] args) {
        //Array Terms
        //array variable, object, reference, location, index
        // syntax : datatype arrname ={v1,v2,...vn};

        int[] arr = {1,2,34,45,5};
        System.out.println(arr);            //[I@4617c264 type@ref
        System.out.println(arr[0]);
        System.out.println(arr[5]);         //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

    }
    
}
