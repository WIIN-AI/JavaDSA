package com.aitestflow.src.com.ArrayCheck;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr ={1,5,6,8,9,10};

        System.out.println(Arrays.toString(arr));
        forReverse(arr); // reverse
        System.out.println(Arrays.toString(arr));
        reverse(arr); //re reverse
        System.out.println(Arrays.toString(arr));


    }
    static void forReverse(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            swap(arr,i,arr.length-1-i); // Swap method called
            if (i == arr.length/2){
                break;
            }
        }
    }
   static  void reverse(int[] arr){
        int start = 0 ;
        int end =arr.length-1;

        while(start<=end){
            swap(arr, start,end);  // Swap method called
            start ++ ;
            end--;
        }
    }
    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1] ;
        arr[index1] = arr[index2] ;
        arr[index2] = temp ;
    }
}
