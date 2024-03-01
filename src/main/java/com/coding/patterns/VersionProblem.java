package com.coding.patterns;

import java.util.Arrays;
import java.util.stream.Collectors;

public class VersionProblem {
    public static void main(String[] args) {

        String str = "1.7.2.2";
        String str2 = "2";
        String res = null;
        int size = 0;

        str = str.replace(".", "").trim();
        str2 = str2.replace(".","").trim();
        System.out.println("Str:"+str +" Str2:"+str2);


        if(str.length() < str2.length()){
            size = str.length();
            res = str2;
        }else{
            size = str2.length();
            res = str;
        }

        for(int i =0; i<size; i++){
            int v1 = Integer.valueOf(str.charAt(i));
            int v2 = Integer.valueOf(str2.charAt(i));
            if(v1 != v2 ){
                if(v1>v2){
                    res = str;
                    break;
                }else{
                    res = str2;
                    break;
                }

            }
        }
        System.out.println("RES:"+res);

        solution2(str,str2);
    }

    public static void solution2(String s1, String s2){

        String res = null;
        int size = 0;
       String [] str1 =  s1.split("\\.");
       String [] str2 =  s1.split("\\.");

       String ss1 =  Arrays.stream(str1).collect(Collectors.joining());
       String ss2 =  Arrays.stream(str2).collect(Collectors.joining());

       if(s1.length() < s2.length()){
           size = s1.length();
           res = ss2;
       }else{
           size = s2.length();
           res = ss1;
       }

       for (int i =0; i<size;i++) {
           int v1 = Integer.valueOf(ss1.charAt(i));
           int v2 = Integer.valueOf(ss2.charAt(i));
           if (v1 != v2) {
               if (v1 > v2) {
                   res = ss1;
                   break;
               } else {
                   res = ss2;
                   break;
               }
           }
       }

        System.out.println("Result:"+ res);
    }
}
