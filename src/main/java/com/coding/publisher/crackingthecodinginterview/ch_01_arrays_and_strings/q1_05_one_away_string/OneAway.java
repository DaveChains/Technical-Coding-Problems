package com.coding.publisher.crackingthecodinginterview.ch_01_arrays_and_strings.q1_05_one_away_string;

public class OneAway {

    private static boolean oneEditReplace(String s1, String s2){
        boolean foundDifference = false;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if (foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    private static boolean oneEditInsert(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        while(index2 < s2.length() && index1 < s1.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean oneEditAway(String a, String b){
        if(a.length() == b.length()){
            return oneEditReplace(a, b);
        } else if(a.length() + 1 == b.length()){
            return oneEditInsert(a, b);
        }else if(a.length() - 1 == b.length()){
            return oneEditInsert(a, b);
        }
        return false;
    }

    public static void main(String[] args){
        assertCase1();
        assertCase2();
        assertCase3();
        assertCase4();
    }

    private static void assertCase1(){
        String a = "pse";
        String b = "pase";

        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + " , " + b + ": " + isOneEdit);
    }

    private static void assertCase2(){
        String a = "pales";
        String b = "pale";

        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + " , " + b + ": " + isOneEdit);
    }

    private static void assertCase3(){
        String a = "pale";
        String b = "bale";

        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + " , " + b + ": " + isOneEdit);
    }

    private static void assertCase4(){
        String a = "pale";
        String b = "bake";

        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + " , " + b + ": " + isOneEdit);
    }
}
