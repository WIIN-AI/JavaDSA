package com.aitestflow.src.com.questions;


// Floor  is the greatest number of smaller of = t arget
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr ={2,6,8,9,10,25,26} ;
        int target = 8;
        System.out.println(Flooring(arr,target));
        System.out.println(arr[Flooring(arr,target)]);
    }
    static int Flooring(int[] arr, int target){
        int start = 0 ;
        int end = arr.length -1;

        while (start <end){
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
        return end;
    }

}
