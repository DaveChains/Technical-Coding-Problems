package com.coding.fundamentals.algorithms;


/**
 * Created by davidchains on 10/15/16.
 */
public class BinarySearh {

    public int binarySearch(int[] input, int value) {
        int low = 0;
        int high = input.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (input[middle] == value) {
                return middle;
            }
            if (input[middle] < value) {
                low = middle + 1;
            }
            if (input[middle] > value) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
