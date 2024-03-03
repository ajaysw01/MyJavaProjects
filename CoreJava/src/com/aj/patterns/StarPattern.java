package com.aj.patterns;

public class StarPattern {
    public static void main(String[] args) {
        int n = 4;
        // line
        for(int i =1; i<=n;i++){
            // stars

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
