package com.coding.publisher.crackingthecodinginterview.ch_01_arrays_and_strings.q1_06_string_compression;

public class StringCompression {

    private static String compressBad(String str){
        String compressedString = "";
        int countConsecutive = 0;
        for(int i =0; i < str.length(); i++){
            countConsecutive++;

            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressedString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }

        }

        return compressedString.length() < str.length() ? compressedString : str;
    }

    public static void main(String[] args){
        String str = "aabbccddd";
        System.out.println(compressBad(str));

    }
}
