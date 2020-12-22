package com.algorithm.easy.warmup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;

        Collections.sort(candles);



        for(int i=0; i<candles.size(); i++){
            if(candles.get(i).equals(candles.get(candles.size()-1))){ //== 사용하면 에러!!
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int candlesCount = 4;
        List<Integer> candles = new ArrayList<>();

        candles.add(1000);
        candles.add(1000);
        candles.add(1000);
        candles.add(1000);


        System.out.println(birthdayCakeCandles(candles));
    }

}

