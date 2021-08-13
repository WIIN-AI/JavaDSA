package com.aitestflow.src.com.ArrayCheck;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
//        int[] arr = new int[5];
//        System.out.println("arr.length"+arr.length);
//        for (int i =0;i<arr.length;i++){
//            System.out.println("enter the index " + i);
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int num : arr){ // for each loop
//            System.out.println(num);
//        }


        String[] str = new String[4]; // string
        for (int i =0;i<str.length;i++){
            System.out.println("enter the index " + i);
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
