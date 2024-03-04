package com.coding.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {

        // declaration no memory allocated yet
        int[] numbers ;
        numbers = new int[10];
        System.out.println("number array length:"+numbers.length);

        //Array of objects
        String []strings = new String[10];
        System.out.println("Strings array length:"+strings.length);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of elements required?:");
        int n = input.nextInt();
        double sum=0.0,deviation=0.0,average = 0.0;
        double[] values = new double[n];
        for (int i =0; i<n; i++){
            System.out.print("Please enter element["+i+"]:");
            values[i] = input.nextDouble();
            sum = sum+ values[i];
        }

        average = sum/n;

        System.out.println("Average:"+average);
        System.out.println("Values\t Deviation ");
        for (int j=0;j<n;j++){
            deviation = average - values[j];
            System.out.println(values[j]+"\t\t "+deviation);

        }

        System.out.println( "index:"+Arrays.binarySearch(values,2.0));

        int []a = {1,2,3};
        int []b = {1,2,3};
        System.out.println(Arrays.compare(a,b));

        //Copies the specified range of the specified array into a new array.
        int[] c = Arrays.copyOfRange(a,0,3);
        Arrays.stream(c).forEach(e -> System.out.print(e+" "));

        System.out.println();
        Arrays.copyOf(a,3);

        //Finds and returns the index of the first mismatch between two int arrays, otherwise return -1 if no mismatch is found.
        Arrays.mismatch(a,b);
        var compare = Arrays.compare(a, b);

        //Returns true if the two specified arrays of ints are equal to one another.
        Arrays.equals(a,b);

        int c1[] = new int[10];
        //Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
        System.arraycopy(a,0,c1,0,a.length);
        Arrays.stream(c1).forEach(e -> System.out.print(e+" "));
        System.out.println();

        System.arraycopy(b,0,c1,3,b.length);
        Arrays.stream(c1).forEach(e -> System.out.print(e+" "));
    }
}
