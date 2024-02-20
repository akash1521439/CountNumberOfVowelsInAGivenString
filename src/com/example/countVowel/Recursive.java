package com.example.countVowel;

public class Recursive {
    static int count = 0;
    public static void countVowel(String string, int length){
        if(length<=0) {
            return;
        }
        if(string.charAt(length-1)=='a' || string.charAt(length-1) == 'e' ||
                string.charAt(length-1)=='i' || string.charAt(length-1) == 'o' || string.charAt(length-1) == 'u'){
            count++;
        }
        countVowel(string,length-1);
    }
    public static void main(String [] args){
        String string = "Java Programming";
        string = string.toLowerCase();
        countVowel(string,string.length());
        System.out.println("Total number of vowels is: "+count);

    }
}
