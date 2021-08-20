package com.aitestflow.src.com.LinerSearch;

import java.util.Arrays;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {10,21,6,235,59};
        //System.out.println(findNumbers(arr));
        System.out.println(digits(-56999));
        System.out.println(digit2(-5666669));

    }
    static int findNumbers(int[] arr){
        int evenNoOfDigits = 0;
        // int[] arr = Arrays.toString(arr);
        for (int i = 0; i < arr.length; i++) {
           if (even(arr[i])){
               evenNoOfDigits++;
            }
        }
        return evenNoOfDigits;


    }

    static boolean even(int num){
        int noOfDigit= digits(num);
        if (noOfDigit%2==0){ // remainder
            return true;
        }
        return false;
    }
    //count the no of digits in a number
    static int digits(int num){
        if (num<0){
            num = num*-1;
        }
        if (num ==0){
            return 1;
        }
        int count= 0;
        while (num >0) {
            count ++;
            num = num/10;
        }
        return count;
    }

    static int digit2(int num){
        if (num <0){
            num = num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
}
