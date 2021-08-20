package com.aitestflow.src.com.questions;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,2,7,7,7,7,8,8,9} ;
        int target = 7 ;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchRange(int[]  nums, int target){
        int[] ans ={-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
       ans[0] = start;
       ans[1] = end ;
       return ans ;
    }

    static int search(int[] nums, int target,boolean findStartIndex){
        int ans= -1;
        int start =0;
        int end = nums.length -1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                //return mid ;
                ans = mid ; // 3
                if(findStartIndex){
                    end = mid -1 ; // left right check
                }else {
                    start = mid +1 ; // right side  check
                }
            }
        }
        return ans;
    }
}
