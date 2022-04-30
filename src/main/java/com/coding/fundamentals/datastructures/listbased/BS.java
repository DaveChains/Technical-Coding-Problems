package com.coding.fundamentals.datastructures.listbased;

/**
 * Created by davidchains on 10/16/16.
 */
public class BS {


    public static int bs (int[] array, int value){
        int low = 0;
        int higth = array.length - 1;
        //      8    >   0
        while (higth >= low){
            //   4  =  0  +   8   / 2
            //   13/2   =  5  +   8   / 2
            int mid = low + higth / 2;
            //         3   ==  10
            //         5   ==  10
            if (array[mid] == value){
                return mid;

            //               3 <  10
            //               5 <  10
            }else if (array[mid] < value){

            //   5  =   4 + 1
            //   7   =    6 + 1
                low = mid + 1;
            }else if (array[mid] > value){
                higth = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9}; // 8
        int value = 10;
        System.out.println(bs(array, value));
    }
}
