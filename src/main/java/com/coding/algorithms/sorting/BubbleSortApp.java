package com.coding.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortApp {
    public static void main(String[] args) {
        int[] intArray = new int[]{2,4,6,3,5,7,9,1,8};
        printArray(intArray);
        bubbleSort(intArray,intArray.length);
        printArray(intArray);
    }

    private static void printArray(int[] intArray) {
        Arrays.stream(intArray).forEach(e -> System.out.print(e+" "));
        System.out.println();
    }

    private static void bubbleSort(int[] intArray, int length) {

        //Traverse through all array elements
        for (int i=0; i<length; i++){
            // Last i elements are already in place
            for (int j = 0; j<length-i-1;j++){
                //Traverse the array from 0 to size of array[i-1]
                //Swap if the element found is greater than the next element
                if(intArray[j] > intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
    }
}
