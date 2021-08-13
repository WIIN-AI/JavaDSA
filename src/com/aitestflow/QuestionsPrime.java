package com.aitestflow.src.com.aitestflow;

import java.util.Scanner;

public class QuestionsPrime {
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in) ;
//        System.out.println("Enter the number");
//        int n = in.nextInt();
//        System.out.println(isPrime(n));
//        System.out.println(isArmsStrongNumber(n));
        for(int i=100;i<1000;i++){
            if (isArmsStrongNumber(i)){
                System.out.println(i);
            };
        }
    }

    static boolean isPrime(int n){
        System.out.println(n);
        if (n<=1){
            return false;
        }
        int c =2 ;
        while(c*c<n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c*c >n;
//        if (c*c>n){
//            return true;
//        }
//        return false;
    }

    //print the armstrong number
    static boolean isArmsStrongNumber(int n){
        int original = n;
        int sum = 0;

        while (n>0){
            int rem = n%10 ;
            sum = sum +rem*rem*rem ;
            n = n/10;
        }
        return sum==original;

    }
}
