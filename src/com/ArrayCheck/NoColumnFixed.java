package com.aitestflow.src.com.ArrayCheck;

public class NoColumnFixed {
    public static void main(String[] args) {
        int[][] arr ={
                {1,3,4,5},
                {1,3,4},
        };

        for(int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }
    }
}
