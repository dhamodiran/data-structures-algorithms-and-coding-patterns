package com.coding.algorithms.searching;

import java.util.Arrays;
import java.util.List;

public class LinearSearchApp {

    public static void main(String[] args) {

        List<Integer> list = List.of(10,30,20,50,70,40,60);
        System.out.println("LIST:"+list);
        linearSearchList(list,70);
        linearSearchList(list,100);

        int[] intArray = new int[]{10,30,20,50,70,40,60};
        System.out.print("ARRAY:");
        Arrays.stream(intArray).map(e ->Integer.valueOf(e)).boxed().forEach(e ->System.out.print(e+" "));
        System.out.println("\nElement index:"+linearSearchArray(intArray,20));
        System.out.println("Element index:"+linearSearchArray(intArray,101));

    }

    public static void linearSearchList(List<Integer> intList, Integer searchItem){
        Boolean found = false;
        for (Integer value: intList) {
            if(searchItem == value){
                found =true;
            }
        }
        if (found){
            System.out.println("Element Found :"+ searchItem);
        }else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearchArray(int[] intArr, Integer searchItem){
        for(int i=0;i<intArr.length;i++){
            if(searchItem == intArr[i]){
                return i;
            }
        }
        return -1;
    }

}
