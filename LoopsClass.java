package com.aitestflow;

import java.util.Scanner;

public class LoopsClass {
    public static void main(String[] args) {
        // repeat the things -
        /*
        for (initialization ; condition ; increment/decrement){
                //body
        }
         */

//        for(int i=1; i<=1; i+=1){
//            System.out.println("Hello Word");
//        }
//
//        System.out.println("Enter the number....");
//        Scanner in =new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <=n ; num++) {
//            System.out.println(num + " ");
//        }

        /*
        While loops

        syntax :
            while(condition){
                //body
            }
         */

        int num =1 ;
        while (num <= 5) {
            System.out.println(num);
            num +=1;
        }

        //do while
        int n= 1;
        do {
            System.out.println("hello world ");
        }while (n!=1);
    }
}

// Better --  > when you don't know - How many loops run
// keep  X - Till user enter the value
// loops will execute at least once --> DO !!