package com.aj.patterns;

import java.util.Scanner;

public class IOUPOP {
    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8 };
        // printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        // updating array elements
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        // operations on array
        arr[0] = arr[0] * 10;
        int avg = (arr[0] + arr[1] + arr[2] + arr[3]) / 4;
        System.out.println(avg);

    }

}
