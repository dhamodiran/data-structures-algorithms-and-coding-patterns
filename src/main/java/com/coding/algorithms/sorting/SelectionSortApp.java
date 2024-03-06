package com.coding.algorithms.sorting;

import java.util.Arrays;

public class SelectionSortApp {
    public static void main(String[] args) {

        int[] intArray = new int[]{2,4,6,3,5,7,9,1,8};
        printArray(intArray);
        selectionSort(intArray);
        printArray(intArray);
    }

    private static void printArray(int[] intArray) {
        Arrays.stream(intArray).forEach(e->System.out.print(e+" "));
        System.out.println();
    }

    private static void selectionSort(int[] intArray) {
        int minIndex =0;
        for (int i=0; i<intArray.length;i++){
            for (int j=i+1; j<intArray.length;j++){
                if(intArray[minIndex]>intArray[j]){
                    minIndex = j;
                }
            }
            int temp = intArray[i];
            intArray[i] = intArray[minIndex];
            intArray[minIndex] = temp;
        }

    }

}
