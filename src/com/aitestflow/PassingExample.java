package com.aitestflow.src.com.aitestflow;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Wiinaikkumar";
        greet(name);
    }

    static void greet(String input_name) { // scope of the function is input
        System.out.println("Greet Function...called");
        System.out.println(input_name);
    }
}


//pass by value only -- copy of the reference variable - which is pointing to same object\
// no pass by reference value !!
// Scope of the function
