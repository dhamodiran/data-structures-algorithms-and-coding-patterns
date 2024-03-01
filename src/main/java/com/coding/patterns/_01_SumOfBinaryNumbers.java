package com.coding.patterns;

public class _01_SumOfBinaryNumbers {
    public static void main(String[] args) {

        String str1 = "1001";
        String str2 = "111";
        int v1 = Integer.parseInt(str1,2);
        int v2 = Integer.parseInt(str2,2);

        int total = v1+v2;

        String res = Integer.toBinaryString(total);
        System.out.println(res);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(addBinary(str1,str2));

    }

    public static String addBinary (String str1, String str2) {

        int ptr1 = str1.length() -1;
        int ptr2 = str2.length() -1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        for(;ptr1>=0 || ptr2 >=0;){
            int value1;
            int value2;

            if(ptr1 < 0){
                value1 = 0;
            }else{
                value1 = Character.getNumericValue(str1.charAt(ptr1));
            }

            if(ptr2 < 0){
                value2 = 0;
            }else{
                value2 = Character.getNumericValue(str2.charAt(ptr2));
            }

            int total = value1+value2+carry;
            int current = total % 2;
            carry = total/2;
            result.append(current);
            ptr1--;
            ptr2--;
        }
        if(carry==1){
            result.append(carry);
        }
        // Replace this placeholder return statement with your code
        return result.reverse().toString();
    }
}
