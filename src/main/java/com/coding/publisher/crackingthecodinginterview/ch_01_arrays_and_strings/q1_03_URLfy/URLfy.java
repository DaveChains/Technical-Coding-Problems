package com.coding.publisher.crackingthecodinginterview.ch_01_arrays_and_strings.q1_03_URLfy;

public class URLfy {

    private static int findLastCharacter(char[] str){
        System.out.println("Length " + str.length);
        //str.length - 1 as length returns a count e.x
        // From 1 to...16, however to avoid array out of bound :
        // str.length - 1 as our arr is from 0 to 15.
        for(int i = str.length - 1 ; i >= 0; --i){
            System.out.println("Reverse count :: " + i + "  Character Arr 0-15 :: " + str[i]);

            if(str[i] != ' '){
                return i;
            }
        }
        return -1;
    }

    private static void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, index, i = 0;

        // count spaces in the char array
        for(i = 0; i < trueLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        //        13       + spaceCount * 2 =
        index = trueLength + spaceCount * 2;
        if(trueLength < str.length) str[trueLength] = '\0';
        for(i = trueLength - 1 ; i >= 0 ; i--){
            if(str[i] == ' '){
                // if an space is found insert '02%'
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else{
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static void main(String[] args){
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);
        System.out.println(" Result :: " + new String(arr) );
    }
}
