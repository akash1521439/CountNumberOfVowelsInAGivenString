package com.example.countVowel;

public class Recursive2 {
    public static int isVowel(char c){
        if(c =='a' || c == 'e' ||
                c =='i' || c == 'o' || c == 'u'){
            return 1;
        }else return 0;
    }
    public static int countVowel(String str, int length){
        if(length == 1){
            return isVowel(str.charAt(length-1));
        }
        return countVowel(str,length-1) + isVowel(str.charAt(length-1));
    }

    public static void main(String [] args){
        String string = "Java Programming";
        string = string.toLowerCase();

        System.out.println("Total number of vowels is: "+countVowel(string,string.length()));

    }
}
