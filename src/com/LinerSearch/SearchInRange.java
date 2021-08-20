package com.aitestflow.src.com.LinerSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,20,30,56,60,77, 69 } ;
        int target =  60 ;

        System.out.println(searchInRange(arr,target,1,7));


    }
    static int searchInRange(int[] arr,int target, int start, int end ){
        if (arr.length == 0){
            return  -1;
        }
        for (int index= start; index<=end; index ++){
            if (arr[index]==target) {
                return index ;
            }
        }
        return -1;
    }
}
