package com.aitestflow.src.com.sample;

import java.util.Scanner;

public class SwitchCaseCheck {
    public static void main(String[] args) {
//        String a = "Wiinai" ;
//        String c = "Wiinai" ;
//        String b = c ;
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit info...");
        String fruit=in.next() ;

        // Alt + Enter or Option +Enter
        switch (fruit) {
            case "Mango":
                System.out.println("This Mango and King of Fruits");
                break;
            case "Apple":
                System.out.println("This Doctor recommendation --> APPLE");
                break;
            default:
                System.out.println("Provide the valid Fruits....");
                break;
        }

    }
}

//Stack/Heap -- >
// String --> Compare -->
// .().equals("<>")
