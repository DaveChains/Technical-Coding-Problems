package com.coding.letcode;

public class ReverseString {
    public static void main(String[] args){
        char[] a = {'h','e','l','l','o'};
        reverseString(a);
    }

    private static void reverseString(char[] s){
        StringBuffer sb= new StringBuffer();
        for(int i = s.length-1; i >= 0 ; i--){
            sb.append(s[i]);
        }
        System.out.println(s);
        System.out.println(sb.toString().toCharArray());
    }
}
