package com.coding.publisher.crackingthecodinginterview.ch_01_arrays_and_strings.q1_02_check_permiutation;

import java.util.Arrays;

public class CheckPermutation {

    private static String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    private static boolean permutation(String s, String t){
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args){
        assertPermutation();
    }

    private static void assertPermutation(){
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for(String[] pair : pairs){
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + " : " + anagram);
        }
    }
}
