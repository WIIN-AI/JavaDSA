package com.aitestflow.src.com.sample;

public class Reverse {
    public static void main(String[] args) {
        int n =123456 ;
        int reversNum =0 ;

        while(n>0){
            int rem = n%10;
            reversNum = reversNum*10+ rem;
            n = n/10;
        }
        System.out.println(reversNum);
    }
}
