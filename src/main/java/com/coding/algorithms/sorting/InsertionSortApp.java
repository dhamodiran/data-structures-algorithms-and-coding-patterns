package com.coding.algorithms.sorting;

import java.util.Arrays;

public class InsertionSortApp {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,3,5,7,9,1,8};
        printArray(array);
        insertionSort1(array,array.length);
        printArray(array);

    }

    private static void insertionSort(int[] array, int length) {

        for (int i = 1; i<length; i++){ //1,2,3
            int insElement = array[i];  //4,6,3
            int j = i-1;
            while(j>=0 && insElement < array[j] ){
                array[j+1] = array[j];  //3:6
                j = j-1;
            }
                array[j+1] = insElement;
        }
    }

    private static void insertionSort1(int[] array, int length) {

        for (int i = 1; i<length; i++){
            int insElement = array[i];
            int j =i-1;
            for (;j>=0 && insElement < array[j];) {
                if (insElement < array[j]) {
                    array[j + 1] = array[j];
                    j = j-1;
                }
            }
             array[j+1] = insElement;
        }
    }

    private static void printArray(int[] intArray) {
        Arrays.stream(intArray).forEach(e -> System.out.print(e+" "));
        System.out.println();
    }
}
