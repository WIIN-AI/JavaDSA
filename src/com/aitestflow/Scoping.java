package com.aitestflow.src.com.aitestflow;

public class Scoping {
    public static void main(String[] args) {
        int a = 10 ; //
        int b = 20 ;
        String name = "Wiinaikkumar" ;
        //blocked scope 
        {

            // initial the value again is not value
            // Value initialized in this block, will remain in the block
            // int a = 90 ; --> alredy initialized the value  but
            a =100 ;  //reasign the original reference variable to some other value
        }
    }

    static void random(){ //scope the inside the function
        int num = 67 ;
        System.out.println(num) ;
        // this change will only be valid in this function scope only
    }
}

// non preemptive s