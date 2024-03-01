package com.coding.algorithms.searching;

public class LinearBruteForceSearch {
    public static void main(String[] args) {

        int[] intArray = new int[]{2,4,6,3,5,7,9,1,8};
        int maxIndex=linearBruteForceSearchMax(intArray);
        System.out.println("The MAX number " + intArray[maxIndex] + " is found at index " + maxIndex);

        int minIndex=linearBruteForceSearchMin(intArray);
        System.out.println("The MIN number " + intArray[minIndex] + " is found at index " + minIndex);



    }

    public static int linearBruteForceSearchMax(int[] arr){
        int maxIndex=0;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length ;i++){
            //int j = i+1;
            if(arr[i] > max ){
                maxIndex= i;
                max =arr[maxIndex];
            }
        }
        return maxIndex;
    }

    public static int linearBruteForceSearchMin(int[] arr){
        int minIndex=0;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length ;i++){
            if(arr[i] < min ){
                minIndex= i;
                min =arr[minIndex];
            }
        }

        return minIndex;
    }
}
