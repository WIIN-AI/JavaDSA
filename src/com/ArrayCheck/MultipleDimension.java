package com.aitestflow.src.com.ArrayCheck;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleDimension {
    public static void main(String[] args) {

        // int[][] arr = new int[3][3];

        /* {
            {2,3,4}, // 0th index ..
            {4,4},  //1st index ...
            {6,7,8,8,9}, //2nd index row -- > arr[2]
        }
         */

       //input


        Scanner in  =new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        // Input
        for (int row=0; row<arr.length;row++){
            //for each col in every row
            for (int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt(); //row - constant /column is dynamic
            }
        }

//        // output
//        for (int row=0; row<arr.length;row++){
//            //for each col in every row
//            // System.out.println(Arrays.toString(arr[row]));
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");  //row - constant /column is dynamic
//            }
//            System.out.println();
//        }
        for(int [] row:arr){
            System.out.println(Arrays.toString(row));
        }

    }
}
