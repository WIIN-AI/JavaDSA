package com.aitestflow.src.com.questions;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letter={'a','c','d','k','l'};
        char target = 'k' ;
        char answer = findSmallestLetterGreaterThenTarget(letter,target);
        System.out.println(answer);
    }
    static char findSmallestLetterGreaterThenTarget(char[] letters,char target){
        int start = 0;
        int end = letters.length -1;
        while (start<end){
            int mid =start + (end-start)/2;
            if (target > letters[mid]){
                start = mid+1 ;
            }else {
                end =  mid-1;
            }
        }

        return letters[start %letters.length];
    }
}
