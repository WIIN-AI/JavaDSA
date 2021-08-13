package com.aitestflow.src.com.aitestflow;

import java.util.Scanner;
import java.util.SortedMap;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Employee ID");
        int empId = in.nextInt();
        System.out.println("Enter the Department");
        String department = in.next();

        switch (empId){
            case 1 -> System.out.println("WiinaiKkumar") ;
            case 2 -> System.out.println("Deepika") ;
            case 3-> {
                System.out.println("Employee Number 3");
                switch (department){
                    case "IT" -> System.out.println("IT Department.. ");
                    case "Management" -> System.out.println("IT Management.. ");
                    case "Financial " -> System.out.println("IT Financial.. ");
                }
            }
        }

    }
}
