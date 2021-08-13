package com.aitestflow.src.com.aitestflow;

public class Shadowing {
    static int x=90 ; // This will be shadowed at line 8

    public static void main(String[] args) {
        //Block scope
        System.out.println(x); // 90
        int x =40;
         // scope will begin when value is initialised ..
        System.out.println(x); // 40
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
