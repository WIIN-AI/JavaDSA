package com.aitestflow.src.com.aitestflow;

import java.util.Arrays;

public class VariableMethodLengthArgumens {
    public static void main(String[] args) {
        fun(1,2,3,4,5,5);
        fun();

        fun(1);
        fun("wiinaikkumar");

    }

    static void fun(int ...v){ //variable length arguments....
        int ans = 0;
        System.out.println(Arrays.toString(v));
        for(int i=0;i<v.length;i++){
            ans=ans+v[i];
        }
        System.out.println("sum "+ans);
    }
    //key word arguments

    static void multiple(int a,int b,String ...v){ // variable length arguments are at the end ...

    }

    static  void fun(int a){
        System.out.println(a);
    }

    static  void fun(String name){
        System.out.println(name);
    }
}

//loading
// overriding
