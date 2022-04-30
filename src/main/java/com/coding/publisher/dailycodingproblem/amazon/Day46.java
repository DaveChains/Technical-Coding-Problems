package com.coding.publisher.dailycodingproblem.amazon;

import java.util.*;

public class Day46 {

    public static void main(String[] args){
        System.out.println("longest Palim = " + assertLongestPalindromic("aabcdcb"));
        System.out.println("longest Palim = " + assertLongestPalindromic("bananas"));
    }

    private static String assertLongestPalindromic(String palindrome){
        HashMap<Integer, String> lenString = new HashMap<Integer, String>();
        int len = palindrome.length();
        int biggestPalimLen = 0;
        for(int i = 0; i < len; i++){
            String substring1 = palindrome.substring(i, len);

            for(int j = 0; j < substring1.length(); j++){
                String toValidateChunk = substring1.substring(0, j+1);
                System.out.println(i + " and " + j + " when len= " + palindrome.length() + " subS = " + toValidateChunk);
                if(isSubStringPalindromic(toValidateChunk)){
                    if(toValidateChunk.length() > 0 && toValidateChunk.length() >= biggestPalimLen){
                        biggestPalimLen = toValidateChunk.length();
                        lenString.put(toValidateChunk.length(), toValidateChunk);
                    }
                }
            }

        }

        System.out.println(lenString + " - " + biggestPalimLen);
        return lenString.get(biggestPalimLen);
    }

    private static boolean isSubStringPalindromic(String s){
        String toReverse = s;
        String reversed = reverse(toReverse);

        if(s.equals(reversed)){
            return true;
        }
        return false;
    }

    private static String reverse(String toReverse){
        return new StringBuilder(toReverse)
                .reverse()
                .toString();
    }
}
