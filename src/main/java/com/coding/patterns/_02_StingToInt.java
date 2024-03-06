package com.coding.patterns;

public class _02_StingToInt {
    public static void main(String[] args) {
        System.out.println("Result:"+myAtoi("11.8"));
    }

    public static int myAtoi(String s) {

        String s1 = s.strip();
        StringBuilder result = new StringBuilder();

        int sign = 1;
        boolean flag = false;

        if(s1.charAt(0)== '-'){
            sign = -1;
            flag = true;
        }

        if(s1.charAt(0)== '+'){
            sign = 1;
            flag = true;
        }
        if(!flag && !Character.isDigit(s1.charAt(0))){
            return 0;
        }else if (flag && !Character.isDigit(s1.charAt(1))){
            return 0;
        }

        for(int i=0;i<s1.length();i++){

            if(flag){
                i=i+1;
                flag = false;
            }

            if(Character.isDigit(s1.charAt(i))){
                result.append(s1.charAt(i));
            }else{
                break;
                //return 0;
            }

        }

        long res1 = Long.parseLong(result.toString()) * sign;
        if(sign == 1){
            if(res1 > Integer.MAX_VALUE)
                return 0;
        }else{
            if(res1 < Integer.MIN_VALUE)
                return 0;
        }

        return (int)res1;

        // Replace this placeholder return statement with your code
        //return 0;
    }
}
