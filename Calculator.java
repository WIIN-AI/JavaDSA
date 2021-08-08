package com.aitestflow;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // for the input from user
        float answ = 0 ;

        while (true){
            //take the operator as input
            System.out.println("Enter the operator ");
            char op = in.next().strip().charAt(0);
            if (op =='+' || op =='-' || op =='/' || op =='*' || op =='%') {
                // Enter the first input
                System.out.print("Enter two numbers: ....");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    answ = num1 + num2;
                }
                if (op == '-') {
                    answ = num1 - num2;
                }
                if (op == '/' && num2 != 0) {
                    answ = num1 / num2;
                }
                if (op == '*') {
                    answ = num1 * num2;
                }
                if (op == '%') {
                    answ = num1 % num2;
                }
            }
            else if (op =='X' || op =='x'){
                System.out.println("Closing ....");
                break;
            }
            else {
                System.out.println("Invalid Operation !! ");
            }
            System.out.println("Answer: " +answ);
        }
    }
}
