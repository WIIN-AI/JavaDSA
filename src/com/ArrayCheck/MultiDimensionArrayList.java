package com.aitestflow.src.com.ArrayCheck;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialize -- add 
        
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()) ; // {obj},{obj},{obj}

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                list.get(i).add(in.nextInt()) ;
                
            }
            
        }

        System.out.println(list);

    }
}
