package com.coding.publisher.crackingthecodinginterview.ch_01_arrays_and_strings.q1_01_has_repeated_characters;

public class RepeatCharacter {


    // Q1 A
    private static boolean hasRepeatedCharacters(String str){

        char[] sentenceCharted = str.toCharArray();
        int sentenceChartedLength = str.toCharArray().length;
        for(int i = 0; i < sentenceChartedLength; i++){

            String subString = str.substring(i+1);

            if(subString.contains(String.valueOf(sentenceCharted[i]))){
                return true;
            }
        }

        return false;
    }

    private static void assertHasRepeatedCharacters(){
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words){
            System.out.println(word + " :: " + hasRepeatedCharacters(word));
        }
    }

    public static void main(String[] args){
        assertHasRepeatedCharacters();
    }
}
