package com.example.countVowel;

import java.util.Arrays;
import java.util.List;

public class UsingArrayListContains {
    public static void main(String [] args){
        String string = "Java Programming";
        string = string.toLowerCase();
        int count = 0;
        List<Character> vList = Arrays.asList('a','e','i','o','u');
        for (int i = 0; i<string.length();i++){
            if (vList.contains(string.charAt(i))){
                count++;
            }
        }
        System.out.println("Total number of vowels is: "+ count);
    }
}
