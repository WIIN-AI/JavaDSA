package com.aitestflow.src.com.LinerSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name ="Wiinaikkumar";
        char target = 'W';
        System.out.println(searchString(name,target));
        System.out.println(name.toCharArray());
    }

    static boolean searchString(String str,char target){
        if (str.length()==0){return false;}

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==target){
                    return true ;
            }
        }
        return false;
    }

    static boolean searchStringForEachString(String str,char target){
        if (str.length()==0){return false;}

        for (char ch:str.toCharArray()){
            if (ch ==target){
                return true ;
            }
        }
        return false;
    }

}
