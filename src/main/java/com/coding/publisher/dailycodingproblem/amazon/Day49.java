package com.coding.publisher.dailycodingproblem.amazon;

import java.util.ArrayList;
import java.util.Arrays;

//
//This problem was asked by Amazon.
//
//  Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
//  For example, given the array [34, -50, 42, 14, -5, 86],
//  the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.
//
//   Given the array [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.
//
//        Do this in O(N) time.
public class Day49 {

    public static void main(String[] args){
        int[] case1 = new int[]{34,-50, 42, 14, -5, 86};
        int[] case2 = new int[]{-5, -1, -8, -9};
        assertNumSum(case1);
        assertNumSum(case2);
    }

    private static void assertNumSum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length ; i++){
            int[] subArray = Arrays.copyOfRange(nums, i, nums.length);
            int subArrSum = Arrays.stream(subArray).sum();
            if(subArrSum > sum){
                sum = subArrSum;
            }
        }
        System.out.println("The SUM:: " + sum);
    }
}
