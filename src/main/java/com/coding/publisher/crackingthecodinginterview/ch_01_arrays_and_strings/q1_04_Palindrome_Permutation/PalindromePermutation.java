package com.coding.publisher.crackingthecodinginterview.ch_01_arrays_and_strings.q1_04_Palindrome_Permutation;

public class PalindromePermutation {

    private static boolean checkMacOneOdd(int[] table){
        boolean foundOdd = false;
        for(int count : table){
            if(count % 2 == 1){
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private static boolean isPermutationOfPalindrome(String palindrome){
        int[] table = Common.buildChartFrequencyTable(palindrome);
        return checkMacOneOdd(table);
    }

    public static void main (String[] args){
        String pali = "Rats live on no evil star";
        System.out.println(isPermutationOfPalindrome(pali));

    }
}
