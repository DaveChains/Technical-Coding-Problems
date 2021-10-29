package com.coding.dailycodingproblem.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Da69 {

    public static void main(String[] args){
        int[] a = {-10, -10, -11, -13, 5, 2, 1};
        int[] b = {-10, -10, 5, 2, 1};

//        List<Integer> integers = getIntegerList(a);

        System.out.println(maximumProductOfThree(a));
        System.out.println(maximumProductOfThree(b));
    }

    private static List<Integer> getIntegerList(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int v : arr){
            list.add(v);
        }
        return list;
    }

    private static int maximumProductOfThree(int[] arr){
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int thirdLargest = sortedArr[arr.length-3];
        int secondLargest = sortedArr[arr.length-2];
        int firstLargest = sortedArr[arr.length-1];
        int firstSmallest = sortedArr[0];
        int secondSmallest = sortedArr[1];

        return Integer.max(
                (thirdLargest * secondLargest * firstLargest),
                (firstLargest *firstSmallest * secondSmallest)
        );
    }

    private static int getLargestProduct(List<Integer> arr){
        for(int i = 0; i < arr.size()-1; i++){
            arr.subList(i, arr.size()-1);
            if(true){

            }
        }
        return -1;
    }
}
