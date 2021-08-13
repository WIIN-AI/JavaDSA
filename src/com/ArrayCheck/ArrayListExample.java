package com.aitestflow.src.com.ArrayCheck;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Rapper class --> only
        ArrayList<Integer> list = new ArrayList<>(5); //constructor
        //type of data in
        list.add(67);
        list.add(79);
        list.add(99);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        for (int i = 0; i < 5 ; i++) {
            list.add(1);

        }
        System.out.println(list);

        //get item -- > list.get(i)
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));

        }
    }
}

//Object -inherit