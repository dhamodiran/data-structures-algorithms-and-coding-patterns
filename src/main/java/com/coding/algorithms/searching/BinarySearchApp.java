package com.coding.algorithms.searching;

import java.util.Arrays;

public class BinarySearchApp {
    public static void main(String[] args) {
        // the array should be in sorted order
        int[] intArray = new int[]{10,30,20,50,70,40,60};
        Arrays.sort(intArray);
        Arrays.stream(intArray).forEach(e-> System.out.print(e+" "));
        System.out.println("\nINDEX:(70)"+binarySearch(intArray,70, intArray.length));
        System.out.println("\nINDEX:(30)"+binarySearch(intArray,30, intArray.length));
        System.out.println("\nINDEX:(100)"+binarySearch(intArray,100, intArray.length));
        System.out.println("\nINDEX:(10)"+binarySearch(intArray,10, intArray.length));

        System.out.println("Solution using Recurssion");
        System.out.println("\nINDEX:"+binarySearchRecurrsion(intArray,70,0, intArray.length-1));
        System.out.println("\nINDEX:"+binarySearchRecurrsion(intArray,100,0, intArray.length-1));
        System.out.println("\nINDEX:"+binarySearchRecurrsion(intArray,50,0, intArray.length-1));


    }

    public static int binarySearch(int[] intArr, int searchItem, int size){
        int max = size-1;
        int min = 0;
        while(max >= min) {
            int index = (max + min) / 2;
            System.out.print("\nmiddle index: "+index);
            if (intArr[index] == searchItem) {
                return index;
            } else if (searchItem > intArr[index]) {
                min = index + 1;
            }else {
                max = index - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecurrsion(int[] intArr, int searchItem, int min, int max) {

            int index = (max + min) / 2;
           System.out.print("\n Recurssion middle index: " + index);
            if (intArr[index] == searchItem) {
                return index;
            } else if(index == max){
                return -1;
            }

            if (searchItem > intArr[index]) {
                min = index + 1;
               return binarySearchRecurrsion(intArr, searchItem, min, max);
            } else {
                max = index - 1;
                return binarySearchRecurrsion(intArr, searchItem, min, max);
            }
    }

}
