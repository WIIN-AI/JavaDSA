package com.aitestflow.src.com.questions;

import java.lang.annotation.Target;

public class InfiniteArray {
    public static void main(String[] args) {
        // start with 2
        int[] arr = {9,10,16,18,19,33,56,61,63,67,69,72,78,79,91,97,99};
        int target = 19;
        System.out.println(infiniteAnswer(arr,target));

    }

    static int infiniteAnswer(int[] arr, int target){
        // first find the range
        // first start with box of size 2
        int start = 0 ;
        int end = 1;
        while (target > arr[end]){
            int newStart = end+1 ; // This is new start
            //double box
            end = end+(end-start+1)*2;
            start = newStart ;
        }
       return binarSearch(arr,target,start,end);
    }

    static int binarSearch(int[] arr, int target,int start, int end){
//        int start = 0;
//        int end = arr.length-1 ;
        // middle value -- >start +end / 2
        //better way  -- > start+ (end-start)/2;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

}
