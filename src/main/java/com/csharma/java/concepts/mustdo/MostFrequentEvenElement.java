package com.csharma.java.concepts.mustdo;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {

    public int mostFrequentEvenElement(int [] nums){

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : nums){
            if(num % 2 == 0){
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        if(frequencyMap.isEmpty()){
            return -1;
        }

        int maxCount = 0;
        int mostFrequent = -1;

        for(Map.Entry<Integer, Integer>  entry : frequencyMap.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();

            if(count > maxCount || (count == maxCount && num < mostFrequent)){
                mostFrequent = num;
                maxCount = count;
            }

            return mostFrequent;
        }

    }


}
