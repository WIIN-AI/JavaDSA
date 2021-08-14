package com.aitestflow.src.com.ArrayCheck;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,10,28};
        System.out.println(maxvalue(arr));
        System.out.println(maxRange(arr,2,5));


    }

    static int maxvalue(int[] arr){

        if (arr.length == 0 || arr == null){
            return 0;
        }
        int maxVal = arr[0] ;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i] ;
            }
        }
        return  maxVal;
    }

    static int maxRange(int[] arr,int start, int end ){
        if (end < start) {return  -1;}
        int maxVal = arr[0] ;

        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i] ;
            }
        }
        return  maxVal;
    }

}
