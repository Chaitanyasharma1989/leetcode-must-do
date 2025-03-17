package com.csharma.java.concepts.mustdo;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        if (nums == null && nums.length == 0) {
            return 0;
        }

        final HashSet numHashSet = new HashSet();

        Arrays.stream(nums).forEach(value -> numHashSet.add(value));

        int maxCount = 0;
        int currentMaxCount = 0;

        for (int i = 0; i <= numHashSet.size() - 1; i++) {
            int currentNum = nums[i];
            // We have to handle the scenarios where we can have negative integers in array
            if (numHashSet.contains(nums[i] + 1)) {
                currentNum = nums[i + 1];
                currentMaxCount = currentMaxCount + 1;
            }

        }

        maxCount = Math.max(currentMaxCount, maxCount) + 1;

        System.out.println(maxCount);
        return maxCount;
    }

    public static int longestConsecutiveSequence1(int[] nums) {
        if (nums == null && nums.length == 0) {
            return 0;
        }
        final HashSet numHashSet = new HashSet();

        Arrays.stream(nums).forEach(value -> numHashSet.add(value));

        int maxCount = 0;

        for (int inte : nums) {
            if (!numHashSet.contains(inte - 1)) {
                int currentNumber = inte;
                int currentCount = 1;
                while (numHashSet.contains(currentNumber + 1)) {
                    currentNumber = currentNumber + 1;
                    currentCount = currentCount + 1;
                }
                maxCount = Math.max(maxCount, currentCount);
            }
        }
        return maxCount;
    }
}
