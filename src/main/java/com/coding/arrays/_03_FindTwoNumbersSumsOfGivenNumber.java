package com.coding.arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Problem Statement:
 * In this problem, you have to implement the int[] findSum(int[] arr, int n) method,
 * which will take a number n, and an array arr as input and returns an array of two integers that add up to n in an array.
 * In case there is more than one pair in the array containing numbers that add up to n, you are required to return only one such pair.
 * If no such pair is found then return an empty array.
 */
public class _03_FindTwoNumbersSumsOfGivenNumber {
    public static void main(String[] args) {

        //Solution 1
        int[] values = { 1,2,3,4,5,6,7,8,9};
        int n = 15;
        Arrays.stream(findSum(values,n)).boxed().forEach(e-> System.out.print(e+" "));
        System.out.println();

        //Solution 2
        Arrays.stream(findSumUsingHashSet(values,n)).boxed().forEach(e-> System.out.print(e+" "));
        System.out.println();

        //Solution 3
        int[] values1 = { 1,4,3,2,5,9,8,7,6};
        Arrays.stream(findSumUsingSortAndTwoPointers(values1,n)).boxed().forEach(e-> System.out.print(e+" "));
        System.out.println();

    }

    // Solution 1: Brute Force method (Time Complexity - O(n^2))
    public static int[] findSum(int[] arr, int n){

        int[] result = new int[2]; // to store the pair of values.
        int size = arr.length;

        for (int i = 0; i < size; i++ ){ //traverse arr
            for (int j = i+1; j < size; j++){  // //traverse arr again and i+1 is to skip summing the same number eg [-10,-20,-30] ans : [] otherwise u will get ans[-60]
                if(arr[i] + arr[j] == n){ //find where sum is equal to n

                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result; // return the pair of numbers
                }
            }
        }

        return new int[0];
    }

    //Solution 2: Using HashSet (optimal solution - Time Complexity - O(n))
    public static int[] findSumUsingHashSet(int[] arr, int n){

        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for (int v: arr) {

            if(set.contains(n-v)){
                result[0] = v;
                result[1] = n-v;
                return result;
            }
            set.add(v);

        }
        return new int[0];
    }

    //Solution 3: sort and use two pointers ( O(nlogn))
    //Since the sorting function used in this code takes O(nlogn) (quick sort) and
    // the algorithm to find two numbers takes O(n) time, the overall time complexity of this code is O(nlogn).
    public static int[] findSumUsingSortAndTwoPointers(int[] arr, int n){

        Arrays.sort(arr);  // time being using utility to sort
        System.out.println("After sorting:");
        Arrays.stream(arr).forEach(e-> System.out.print(e+" "));
        System.out.println();

        int[] result = new int[2];
        int sum = 0;
        int ptr1 = 0;
        int ptr2 = arr.length-1;
        while(ptr1< ptr2){
            sum = arr[ptr1]+arr[ptr2];
            if(sum < n){
                ptr1++;
            }else if(sum > n){
                ptr2--;
            }else{
                result[0]= arr[ptr1];
                result[1]= arr[ptr2];
                return result;
            }
        }
        return new int[0];
    }
}
