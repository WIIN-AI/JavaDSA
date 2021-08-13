package com.aitestflow.src.com.aitestflow;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FunctionCheck {
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
        int i =1;
        while (i<=10){
//            sum();
            System.out.println(greetingInfo()); // value of message as string

            int sumNumber = sumOfTwoNumberByInput(10,29) ; // pass by arguments
            System.out.println("sumOfTwoNumberByInput --> " + sumNumber); // print the numbers

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

    static String greetingInfo(){
        String greetingMessage = "hello Deepika...";
        return greetingMessage;
    }

    static int sumOfTwoNumberByInput(int a,int b){
        int sum = a+b;
        return sum;
    }
}

//method --> as function call

/* return_type  name(arguments){
    //body
    return return_type
    }
 */

