package com.aitestflow.src.com.LinerSearch;

public class LinearSearchCase {
    public static void main(String[] args) {
        int[] arr = {1,6,9,36,59,79};
        int target = 10;
        int index = linearSearch(arr,target) ;
        System.out.println("Index "+index);

    } 

    //search the array -->  return the founded item if not -1
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1 ;
        }

        for (int index = 0; index <arr.length; index++) {
            int element = arr[index] ;
            if (element== target){
                return index;
            }
        }
        return -1; // if none of the statement executed .. return !
    }
    
    static int linearSearch2(int[] arr, int target){
        for (int element:arr){
            if (element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target){
        for (int element:arr){
            if (element==target){
                return true;
            }
        }
        return false;
    }
}

// Linear search  -- > For  i in length --> if arr[i] == search_val --> true or false (  1 or -1 )
// Refactor -->