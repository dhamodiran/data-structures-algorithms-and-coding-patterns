package com.coding.arrays;

class _02_CheckMergeArray
{
    public static void main(String []args){
        int[] a = {1,5,10};
        int[] b = {6,12,14};

        int[] c = mergeArrays(a,b);
        System.out.print("Result: ");
        for (int v: c ) {
            System.out.print(v+" ");
        }
        System.out.println();
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) 
    {
       // int size = 0;
        int index = 0;
        int sizeA = arr1.length;
        int sizeB = arr2.length;
        int[] result = new int[sizeA + sizeB];
        int i=0,j=0;
        while(i<sizeA && j<sizeB){

            if(arr1[i] < arr2[j]){
                result[index++] = arr1[i];
                i++;
            }else{
                result[index++] = arr2[j];
                j++;
            }

        }

        if(i < sizeA){
            for(int k = i; k<sizeA ;k++){
                result[index++]= arr1[k];
            }
        }
        if(j< sizeB) {
            for(int k = j;k<sizeB;k++){
                result[index++]= arr2[k];
            }
        }
       
        return result;
    }
}