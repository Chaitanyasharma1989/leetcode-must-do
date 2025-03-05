package com.csharma.java.concepts.mustdo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static List<Integer[]> threeSum(int[] nums) {
        int left = 0;
        int middle = left + 1;
        int right = middle + 1;

        List<Integer[]> listWithZeroSum = new ArrayList<>();

        while (right < nums.length - 1) {
            int sum = nums[left] + nums[middle];
            if (nums[right] + sum == 0) {
                listWithZeroSum.add(new Integer[]{nums[left], nums[middle], nums[right]});
            } else {
                right = right + 1;
            }
            left = left + 1;
            middle = middle + 1;
        }
        return listWithZeroSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<Integer[]> ints = ThreeSum.threeSum(nums);
        ints.forEach(arr -> System.out.println(Arrays.deepToString(arr)));
    }
}
