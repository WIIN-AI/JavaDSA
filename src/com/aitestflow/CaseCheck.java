package com.aitestflow.src.com.aitestflow;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the text value");
        char ch = in.next().trim().charAt(0);
        //char ch = 'j';
        if (ch >='a' && ch <='z') {
            System.out.println("This is Lowercase...");
        }
        System.out.println(ch);
//        System.out.println(in.next()); //print space after the word


    }
}
