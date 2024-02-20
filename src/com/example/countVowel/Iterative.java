package com.example.countVowel;
//Java Program to Count Number of Vowels in a String
public class Iterative {
    public static void main(String[] args){
        String string = "Java Programming";
        string = string.toLowerCase();
        int vowelCount = 0;

        for (int i = 0;i<string.length();i++){
            if(string.charAt(i)=='a' || string.charAt(i) == 'e' ||
            string.charAt(i)=='i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){
                vowelCount++;
            }
        }
        System.out.println("Total number of vowels is: "+ vowelCount);
    }
}
