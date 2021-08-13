package com.aitestflow.src.com.aitestflow;

public class Armstrongnumber {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            if (isArmsStrongNumber(i)){
                System.out.println(i);
            };
        }
    }
    //print the armstrong number
    static boolean isArmsStrongNumber(int n){
        int original = n;
        int sum = 0;

        while (n>0){
            int rem = n%10 ;
            sum = sum +rem*rem*rem ;
            n = n/10;
        }
        return sum==original;

    }
}

// 1*3 5*3 3*3 -- >153
