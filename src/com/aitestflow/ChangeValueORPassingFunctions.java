package com.aitestflow.src.com.aitestflow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValueORPassingFunctions {
    public static void main(String[] args) {
        // Create an array  - Collection of integer
        int[] arr ={1,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr) ;
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){ // copy of the value -- > call by value
        nums[0] = 99 ;
        /*
            if the make a change to the object via this reference variable ;
            same object will be changed
         */
    }
}
//String are the final class object - which means -  can't change !!
