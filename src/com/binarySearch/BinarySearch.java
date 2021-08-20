package com.aitestflow.src.com.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={-10,2,6,8,9,10,15,25,36,56,70};
        int target = 36 ;
        System.out.println(binarSearch(arr,target));

    }

    static int binarSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1 ;
        // middle value -- >start +end / 2
        //better way  -- > start+ (end-start)/2;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

