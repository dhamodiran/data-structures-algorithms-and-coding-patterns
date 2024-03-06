package com.coding.arrays;

import java.util.Arrays;

public class OneD_TwoDArrays {
    public static void main(String[] args) {
        //one dimensional array
        int []numbers = new int[10]; // default assigns 0
        // 1D array using literal
        int[] values = {1,2,3,4,5};
        for (int n: numbers ) {
            System.out.print(n+" ");
        }

        System.out.println("\n"+"-".repeat(10));
        Arrays.stream(values).forEach(e-> System.out.print(e+" "));
        System.out.println("\n"+"-".repeat(10));

        //Two Dimensional arrays
        int[][] num = new int[3][4]; //3 rows and 4 columns
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4 ;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n"+"-".repeat(10));
        int [][]val = new int[3][]; // throws null pointer exception due to missing column so memory not alloted
        for(int i = 0; i < 3; i++){
            val[i]= new int[4]; // allocated memory for columns
            for(int j = 0; j < 4 ;j++){
                System.out.print(val[i][j]+" ");
            }
            System.out.println();
        }


    }
}
