package com.coding.patterns.blind75.twopointers;
/**
 * Problem statement:
 *
 * You’re given an integer array height of length n, and there are n vertical lines drawn
 * such that the two endpoints of the i th line are (i,0) and (i, height[i]).
 *
 * Find two lines from the input array that, together with the x-axis, form a container
 * that holds as much water as possible. Return the maximum amount of water a container can store.
 *
 * Constraints:
 *
 *     n= height.length
 *     2 <= n <= 10^3
 *     0 <= height[i] <= 10^3
 */
public class _02_ContainerWithMostWater {


    public static void main(String[] args) {
        int[] intValue = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area:"+ solution(intValue));
    }

    /**
     * Optimized approach using two pointers
     *
     * An optimized approach to solve this problem is using two pointers, start and end,
     * initialized at the beginning and end of the array, respectively. We also create a variable to store the maximum area and set it to zero.
     *
     * While iterating through the array, height, the algorithm proceeds through the following steps:
     *
     *     Calculate the distance, width, between the two vertical lines pointed by start and end pointer as width == end −− start.
     *
     *     The height of the container is determined by the shorter of the two vertical lines pointed by the start and end pointers.
     *     Then, multiply this height by the width to calculate the area of the container.
     *
     *     If the calculated area is greater than the current value of the maximum area, update the maximum area.
     *     Move the pointer pointing to the shorter vertical line inward by one step.
     *
     *     This is because if we try to move the pointer at the longer vertical line, we won’t gain any increase in area,
     *     since the shorter line limits it.
     *
     *     Keep iterating through the array until the pointers meet.
     *
     * After iterating through the array, return the maximum area.
     *
     */
    public static int solution(int[] heights){

        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;
        while(left < right){
            int temp = Math.min(heights[left],heights[right])*(right-left);

            if(temp>maxArea){
                maxArea = temp;
            }
            if(left<=right){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;
    }
}
