package com.aitestflow;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first value");
        int num1 = in.nextInt();
        System.out.println("Enter the Second value");
        int num2 = in.nextInt();
        System.out.println("Enter the Third value");
        int num3 = in.nextInt();
        int max = num1;
        if (num2> max ){
            max = num2 ;
        }
        if (num3 > max){
             max = num3 ;
        }
        System.out.println("max-->"+ max);
        int mathMax = Math.max(num3,Math.max(num1,num2));
        System.out.println("Math max" +mathMax);
    }
}
