package com.coding.dailycodingproblem.facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cafeteria {

    public static void main(String[] args){
        long[] taken1 = {2, 6 };
        long[] taken2 = {11, 6, 14 };
        System.out.println(getMaxAdditionalDinnersCount(10, 1, 2, taken1));
        System.out.println(getMaxAdditionalDinnersCount(15, 2, 3, taken2));
    }

    private static long getMaxAdditionalDinnersCount(long N, long K, int M, long[] S){
        Arrays.sort(S);
        Map<Long, String> map = new HashMap();
        long available = 0;
        int takenIdx = 0;
        for(int i = 1;  i < N ; i++){
            if(S[takenIdx] == i){
                if(map.get(i) == null){
                    map.put(Long.valueOf(i), "taken");
                    for(int j=0; j < K ; j++){
                        if(i+j+1 <= N){
                            map.put(Long.valueOf(i+j+1), "Social-Distancing");
                        }
                        map.put(Long.valueOf(i-j-1), "Social-Distancing");
                        available--;
                    }
                    i+=K;
                }
                if(takenIdx < M-1){
                    takenIdx++;
                }
            }else{
                map.put(Long.valueOf(i), "not-taken");
                available++;
            }
        }

        return available;
    }

    private static long getMaxAdditionalDinnersCounter(long N, long K, int M, long[] S){
        Arrays.sort(S);
        Map<Long, String> map = new HashMap();
        long available = 0;
        int takenIdx = 0;
        for(int i = 1;  i < N ; i++){
            if(S[takenIdx] == i){
                if(map.get(i) == null){
                    map.put(Long.valueOf(i), "taken");
                    for(int j=0; j < K ; j++){
                        if(i+j+1 <= N){
                            map.put(Long.valueOf(i+j+1), "Social-Distancing");
                        }
                        map.put(Long.valueOf(i-j-1), "Social-Distancing");
                        available--;
                    }
                    i+=K;
                }
                if(takenIdx < M-1){
                    takenIdx++;
                }
            } else{
                map.put(Long.valueOf(i), "not-taken");
                available++;
            }
        }

        return available;
    }
}
