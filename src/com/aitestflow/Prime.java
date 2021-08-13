package com.aitestflow.src.com.aitestflow;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the number:............");
        int numVal = input.nextInt();

        if (numVal <=1) { // - values
            System.out.print("Neither prime nor composite number ");
            return;
        }
        if (numVal == 4){
            System.out.println("Not a  prime number ");
            return;
        }
        int c=2 ;
        while(c*c<numVal){
            if (numVal%c == 0){
                System.out.println("Not a Prime number ");
                return;//break;
            }
            c++ ; // c  =c+1;
        }
        if (c*c > numVal){
            System.out.println("Prime Number");
            return;
        }
    }
}
