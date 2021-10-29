package com.coding.dailycodingproblem.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day57 {
    public static void main(String[] args){
        String sentence = "the quick brown fox jumps over the lazy dog";
        String[] sentenceArr = {"the quick", "brown fox","jumps over", "the lazy", "dog"};
        String[] result = {"the quick", "brown fox","jumps over", "the lazy", "dog"};

        System.out.println(Arrays.equals(sentenceArr, result));
        result = breakStringCase2(sentence, 10);
        System.out.println("Assert:: " + Arrays.equals(sentenceArr, result));

    }

    private static String[] breakString(String sentence, int kLen){
        String[] splitd = sentence.split(" ", kLen);
        String[] result = new String[splitd.length];
        for(int i = 0; i < splitd.length-1; i++){
            String temp = splitd[i]+" "+splitd[i+1];
            if(temp.length() <= kLen){
                result[i] = temp;
            }
        }
        if(result.length > 1){
            return result;
        }
        return null;
    }

    private static String[] breakStringCase2(String sentence, int kLen){
        char[] chars = sentence.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        int tempIdx = 0;
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < sentence.length(); i++){
            // 123456789
            // the quick
            String left = sentence.substring(i, sentence.length());
            if (temp.length() >= kLen-2
                    && temp.length() <= kLen
                    && chars[i] == ' '){
                list.add(temp.toString());
                temp.setLength(0); ;
            }else if(temp.length() <= kLen ) {
                temp.append(chars[i]);
            }
            if (left.trim().length() <= 3){
                list.add(left.trim());
                break;
            }
        }

        if(list.size() > 0){
            return list.toArray(String[]::new);
        }

        return null;
    }
}
