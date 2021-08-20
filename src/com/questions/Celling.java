package com.aitestflow.src.com.questions;

// Celling number finding Less than or greater then
// smallest number greater then equal to target value
public class Celling {
    public static void main(String[] args) {
        int[] arr ={2,6,8,9,10,25,26} ;
        int target = 1;
        System.out.println(cellingOfNumber(arr,target));
        System.out.println(arr[cellingOfNumber(arr,target)]);

    }

    static int cellingOfNumber(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1;

        while (start <=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target<arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid+1;
            }
        }
        return start;
    }
}
