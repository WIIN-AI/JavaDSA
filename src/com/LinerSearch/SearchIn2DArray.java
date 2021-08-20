package com.aitestflow.src.com.LinerSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr ={
                {23,10,15},
                {26,10,23,9,10,99}
        };
        int target  = 9;
        int[] ans = searchIn2DArray(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] searchIn2DArray(int[][] arr, int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE ; // Minimum val

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
