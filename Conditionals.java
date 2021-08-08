package com.aitestflow;

public class Conditionals {
    public static void main(String[] args) {
                /*
            Syntax of if statements:
            if (boolean expression T of F) {
                // body
            }
            else{
                //body
            }
        */

        int salary = 9000;

        if (salary > 10000){
            salary = salary+2000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println("Salary " + salary);
    }
}
