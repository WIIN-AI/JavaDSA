package com.aitestflow.src.com.LinerSearch;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {10,9,-5,11,39,59,-7} ;
        System.out.println(min(arr));

    }

    static int min(int[] arr){
        int min = arr[0] ;
        for (int i=1 ; i<arr.length ; i++){
            if (arr[i]< min){
                min = arr[i] ;
            }
        }
        return  min ;
    }
}
