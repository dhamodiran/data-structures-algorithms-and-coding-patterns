package com.coding.algorithms.searching;

class BinarySearchSolution {
  int binarySearch(int[] nums, int target){
    if (nums == null || nums.length == 0) {
      return -1;
    }

    // the initial value for left index is 0
    int left = 0;
    // the initial value for right index is the number of elements in the array
    int right = nums.length;
    // left + 1 >= right will finish while loop
    while (left + 1 < right) {
      int mid = (right + left) / 2;

      if (nums[mid] == target) {
        // mid is the index of the target
        return mid;
      } else if (nums[mid] < target) {
        // there is no sense to search in the left half of the array
        left = mid;
      } else {
        // there is no sense to search in the right half of the array
        right = mid;
      }
    }
    // left can be the index of the target
    if (nums[left] == target) {
      return left;
    }
    // the target doesn't exist in the array
    return -1;
  }

  public static void main(String[] args) {
    BinarySearchSolution sol = new BinarySearchSolution();
    int[] nums = new int[] {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};

    System.out.println("Index of 37 is ---> " + sol.binarySearch(nums, 37));
    System.out.println("Index of 1 is ---> " + sol.binarySearch(nums, 1));
    System.out.println("Index of 59 is ---> " + sol.binarySearch(nums, 59));
    System.out.println("Index of 25 is ---> " + sol.binarySearch(nums, 25));
  }
}