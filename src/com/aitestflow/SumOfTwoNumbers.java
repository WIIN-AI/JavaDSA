package com.aitestflow.src.com.aitestflow;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Q: take input of 2 number and print the sum
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the Number 1");
//        int num1 = in.nextInt();
//        System.out.println("Enter the number 2");
//        int num2 = in.nextInt();
//        int sum = num1 +num2;
//        System.out.println("The sum of number is "+ sum);
//        for(int i=0;i<=10;i++){
//            sum();
//        }
        int i =0;

        while (i<=10){
            sum();
            int ans= sumOfTwoNumber();
            if (ans == 10) {
                System.out.println("answer matched with 10- Hence break");
                System.out.println("i Vale"+i);
                break;
            }
            i++;
        }
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum of number is "+ sum);
    }

    static void greetings(){
        System.out.println("Hello this greeting method");
    }

    static int sumOfTwoNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum of number is "+ sum);
        return sum;
    }
}

 //method --> as function call

