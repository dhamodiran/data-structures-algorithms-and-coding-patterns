package com.coding.patterns.blind75.twopointers;

public class _01_TwoPointers {
    public static void main(String[] args) {

        System.out.println("is vlaid palindrome:"+isPalindrome("abba"));
        System.out.println("is vlaid palindrome:"+isPalindrome("abba1"));

    }

    /**
     * check given string is palindrome or not using two pointers
     * @param str String input
     * @return Boolean
     */
    public static Boolean isPalindrome(String str){

        int size = str.length();
        int left = 0; // start index
        int right = size -1; // end index

        for(left = 0, right=size-1; left<right;left++,right--){

            //if both values not matching return false
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
        }

        return true;
    }
}
