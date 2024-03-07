package com.coding.algorithms.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int []values = { 10,20,21,24,25,30};
        System.out.println("Target value found at : "+binarySearching(values,24));
        System.out.println("Target value found at : "+binarySearching(values,10));
        System.out.println("Target value found at : "+binarySearching(values,30));
        System.out.println("Target value found at : "+binarySearching(values,20));
        System.out.println("Target value found at : "+binarySearching(values,27));
        System.out.println("Note : -1 means the given tarhet value not found");
    }

    /**
     * Our foundation is built on five simple points:
     *
     *    1. The left index points to 0 index.
     *    2. The right index points to the size of array.
     *    3. The while loop condition is left + 1 > right.
     *    4. We will move the left or right index to the mid index.
     *    5. We will check an element on the left index, outside of the loop.
     *
     * @param nums Array of Integers
     * @param target Integer
     * @return index value
     */
    public static int binarySearching(int []nums, int target){

        int left = 0;
        int right = nums.length;

        while (left+1 < right){
            if(nums==null || nums.length == 0){
                return -1;
            }
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if( target < nums[mid] ){
                right = mid;
            }else{
                left = mid;
            }
        }

        if(nums[left] == target){
            return left;
        }

        return -1;
    }
}
