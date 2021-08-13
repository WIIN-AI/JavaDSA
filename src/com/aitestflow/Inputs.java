package com.aitestflow.src.com.aitestflow;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input.next() --> First word
        //input.nextInt()
        //hasNext --> True


        System.out.println("Please enter the inputs:");
        int rollNo = input.nextInt();
        System.out.println("your ID is "+rollNo); // String + int


    }
}
