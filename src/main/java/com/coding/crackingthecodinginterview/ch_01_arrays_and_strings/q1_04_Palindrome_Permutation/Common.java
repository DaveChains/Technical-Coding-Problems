package com.coding.crackingthecodinginterview.ch_01_arrays_and_strings.q1_04_Palindrome_Permutation;

public class Common {
    public static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }
    public static int[] buildChartFrequencyTable(String phrase){
        int[] table =
                new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for(char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
            }
        }
        return table;
    }
}
