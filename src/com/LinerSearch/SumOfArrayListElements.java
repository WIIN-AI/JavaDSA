package com.aitestflow.src.com.LinerSearch;

public class SumOfArrayListElements {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,6},
                {2,10,6},
                {2,4,19}
        };
        System.out.println(maximumValOfArray(arr));
    }

    static int maximumValOfArray(int[][] arr){
        if (arr.length == 0){return 0;}
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            int rowSum = 0;
            for (int j = 0; j <arr[i].length; j++) {
                // rowSum = rowSum+ arr[i][j] ;
                rowSum +=arr[i][j];
            }

            // each row sum of values ...
            if (rowSum>max){
                max = rowSum ;
            }
        }
        return  max;
    }
}
