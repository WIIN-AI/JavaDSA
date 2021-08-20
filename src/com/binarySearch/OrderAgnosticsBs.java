package com.aitestflow.src.com.binarySearch;

public class OrderAgnosticsBs {
    public static void main(String[] args) {
        int [] arr ={-10,2,6,8,9,10,15,25,36,56,70};
        int target = 70 ;
        System.out.println(orderAgnosticsBS(arr,target));
        System.out.println(arr[orderAgnosticsBS(arr,target)]);
    }
    static int orderAgnosticsBS(int[] arr, int target){
        int start =0 ;
        int end = arr.length -1;

        boolean isOrder = arr[start] < arr[end] ;

        while (start <= end) { //Condition -->
            int mid = start + (end-start)/2 ;
            if (arr[mid] == target){
                return  mid ;
            }

            if (isOrder){
                if (target < arr[mid]){
                    end  = mid -1;
                }else{
                    start = mid + 1; //start point is adding
                }
            }
            else{
                if (target > arr[mid]){
                    end  = mid -1;
                }else{
                    start = mid + 1;
                }

            }
        }
        return  start;
    }
}
