package com.coding.patterns;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ReverseVowels {
    public static void main(String[] args) {

        System.out.println("Reverse String:"+reverseVowels("leetcode"));

    }

    public static String reverseVowels(String s) {

        int left = 0;
        int right = s.length()-1;

        char [] chr = s.toCharArray();
        Character[] vowvels = new Character[]{'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> charSet =  Arrays.stream(vowvels).collect(Collectors.toSet());

        //String chars = "aeiouAEIOU";
        //Set<Character> charSet = new HashSet<>((Character)chars.toCharArray());
        while(left < right){

           while(left < right && !charSet.contains(chr [left])){
                left++; //1
            }
            while(left < right && !charSet.contains(chr[right])){
                right--;
            }

            char temp = chr[left];
            chr[left]= chr[right];
            chr[right]= temp;
            left++;
            right--;

        }
        return new String(chr);

    }
}
