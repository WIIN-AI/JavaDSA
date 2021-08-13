package com.aitestflow.src.com.aitestflow;

public class CountValue {
    public static void main(String[] args) {
        int n = 1347578447;
        // Convert to string the value
        // Or remainder

//        String val = (String)(n) ;
        int count = 0;

        while (n >0){
            int rem = n%10;
            if (rem == 5){
                count ++ ;
            }
            n = n/10;
        }

        System.out.println("No of Value "+count);
    }
}
