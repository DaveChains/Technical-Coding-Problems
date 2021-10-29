package com.coding.dailycodingproblem.facebook;

import java.util.Arrays;
import java.util.Collections;

public class Day47 {

    public static void main(String[] args){
//        assertStockPriceUsingStreams();
//        assertStockPriceUsingSorting();
        assertStockPriceIterating();
    }

    private static void assertStockPriceUsingStreams(){
        int[] stockPrices = new int[]{9, 10, 8, 5, 7, 10};
        int maximumProfit = getMaximumProfit(stockPrices);
        System.out.println("Using Java Streams - Maximum Profit = " + maximumProfit);
    }
    private static int getMaximumProfit(int[] intArray){
        int min = Arrays.stream(intArray).min().getAsInt();
        int max = Arrays.stream(intArray).max().getAsInt();

        return max - min;
    }

    private static void assertStockPriceUsingSorting(){
        int[] stockPrices = new int[]{9, 10, 8, 5, 7, 10};
        int maximumProfit = getMaximumProfitSorting(stockPrices);

        System.out.println("Using Java Arrays.sort - Maximum Profit = " + maximumProfit);
    }

    private static int getMaximumProfitSorting(int[] intArray){
        Arrays.sort(intArray); // O(n log(n) Dual Pivot Quick sort
        return intArray[intArray.length-1] - intArray[0];
    }

    private static void assertStockPriceIterating(){
        Integer[] stockPrices = new Integer[]{9, 10, 8, 5, 7, 10};
        Integer[] reverseArr = reverse(stockPrices);
        int currentMax = 0;
        int maxProfit = 0;
        for(int price: reverseArr){
            currentMax = Math.max(currentMax, price);
            int potentialProfit = currentMax - price;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        System.out.println("max price = " + maxProfit);
    }

    private static Integer[] reverse(Integer[] arr){
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
